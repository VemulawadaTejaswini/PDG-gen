
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int k = scanner.nextInt();
        final int s = scanner.nextInt();

        if (n == k) {
            for (int i = 0; i < k; i++) {
                System.out.print(s + " ");
            }
            return;
        }

        if (s % 2 == 0) {
            for (int i = 0; i < n; i++) {
                if (i <= k) {
                    System.out.print(s / 2 + " ");
                } else {
                    System.out.println(1000000000 + " ");
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (i <= k) {
                    if (i % 2 == 0) {
                        System.out.print((s / 2 + 1) + " ");
                    } else {
                        System.out.print(s / 2 + " ");
                    }
                } else {
                    System.out.println(1000000000 + " ");
                }
            }
        }
    }
}
