import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        if((a.length() + 1 == b.length()) && b.startsWith(a)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}