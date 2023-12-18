
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();

        final int[] array = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            array[i] = -1;
        }

        for (int i = 0; i < m; i++) {
            final int s = scanner.nextInt();
            final int c = scanner.nextInt();

            if (array[s] != -1 && array[s] != c) {
                System.out.println(-1);
                return;
            }

            array[s] = c;
        }

        if (array[1] == 0) {
            System.out.println(-1);
            return;
        }

        System.out.print(array[1] == -1 ? 1 : array[1]);

        for (int i = 2; i <= n; i++) {
            System.out.print(array[i] == -1 ? 0 : array[i]);
        }
    }
}
