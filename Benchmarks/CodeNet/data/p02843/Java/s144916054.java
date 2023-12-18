
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int x = scanner.nextInt();
        final boolean[][] table = new boolean[6][x + 1];

        for (int i = 0; i < 6; i++) {
            if (x % (100 + i) == 0) {
                System.out.println(1);
                return;
            }

            for (int j = 0; j < x + 1; j += 100 + i) {
                table[i][j] = true;
            }

            if (i > 0) {
                for (int j = 100 + i; j < x + 1; j++) {
                    if (table[i - 1][j - (100 + i)]) {
                        table[i][j] = true;
                    }
                }
            }

            if (table[i][x]) {
                System.out.println(1);
                return;
            }
        }

        System.out.println(0);
    }
}
