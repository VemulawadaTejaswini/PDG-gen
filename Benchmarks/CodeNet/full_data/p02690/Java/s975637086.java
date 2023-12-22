import java.util.Scanner;
import java.util.ArrayList;
import java.math.*;

public class Main {
    private static final int MAXN = 212;

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        var data = new Long[MAXN + 1];

        for (int i = -MAXN; i <= MAXN; ++i) {
            data[i + MAXN] = (long)Math.pow(i, 5);
        }

        for (int i = 0; i <= 2 * MAXN; ++i) {
            for (int j = 0; j <= 2 * MAXN; ++j) {
                if (data[i] - data[j] == x) {
                    System.out.printf("%d %d\n", i - MAXN, j - MAXN);
                    return;
                }
            }
        }
    }
}
