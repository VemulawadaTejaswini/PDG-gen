
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();

        long base = Math.min(n, m / 2);
        if (n > m / 2) {
            base += (n - m / 2) / 2;
        } else {
            base += (m - n * 2) / 4;
        }

        System.out.println(base);
    }
}
