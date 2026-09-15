import java.util.*;

class Book {
    int id;
    String title;
    boolean isIssued;

    Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.isIssued = false;
    }
}

public class Library {
    static List<Book> books = new ArrayList<>();

    public static void addBook(int id, String title) {
        books.add(new Book(id, title));
        System.out.println("Book added: " + title);
    }

    public static void issueBook(int id) {
        for (Book b : books) {
            if (b.id == id && !b.isIssued) {
                b.isIssued = true;
                System.out.println("Book issued: " + b.title);
                return;
            }
        }
        System.out.println("Book not available!");
    }

    public static void displayBooks() {
        for (Book b : books) {
            System.out.println("ID: " + b.id + ", Title: " + b.title + ", Issued: " + b.isIssued);
        }
    }

    public static void main(String[] args) {
        addBook(1, "Java Basics");
        addBook(2, "C++ Fundamentals");
        displayBooks();
        issueBook(1);
        displayBooks();
    }
}
