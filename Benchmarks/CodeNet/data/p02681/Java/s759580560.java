import java.util.Scanner;

/**
 * Registration.
 */
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var s = scanner.next();
        var t = scanner.next();

        if (t.startsWith(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
