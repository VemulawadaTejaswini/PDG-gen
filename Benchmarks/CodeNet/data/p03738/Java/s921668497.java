import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        String a = sc.nextLine();
        String b = sc.nextLine();
        if (a.equals(b)) {
            System.out.println("EQUAL");
        } else if (a.length() < b.length()) {
            System.out.println("LESS");
        } else if (a.length() > b.length()) {
            System.out.println("GREATER");
        } else if (a.compareTo(b) > 0) {
            System.out.println("GREATER");
        } else {
            System.out.println("LESS");
        }
    }
}