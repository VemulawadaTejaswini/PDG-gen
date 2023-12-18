
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();

        if (n % 2 == 1) {
            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    if (i + j != n) {
                        System.out.println(i + " " + j);
                    }
                }
            }
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    if (i + j != n + 1) {
                        System.out.println(i + " " + j);
                    }
                }
            }
        }
    }
}
