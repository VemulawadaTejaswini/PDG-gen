import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        System.out.println(a.codePointAt(0) + b.codePointAt(0) + c.codePointAt(0));
    }
}