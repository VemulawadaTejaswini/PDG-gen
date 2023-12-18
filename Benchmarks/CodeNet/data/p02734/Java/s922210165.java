
import java.util.Scanner;

public class Main {
    private static final long MOD = 998_244_353;

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int s = scanner.nextInt();

        final int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        final long[][] dpTable = new long[n][s];
        long count = 0;
        if (a[0] < s) {
            dpTable[0][a[0]] = 1;
        } else if (a[0] == s) {
            count = n;
        }
        for (int i = 1; i < n; i++) {
            System.arraycopy(dpTable[i - 1], 0, dpTable[i], 0, s);
            if (a[i] > s) {
                continue;
            } else if (a[i] == s) {
                count = (count + (i + 1) * (n - i)) % MOD;
                continue;
            }

            if (dpTable[i][s - a[i]] != 0) {
                count = (count + dpTable[i][s - a[i]] * (n - i)) % MOD;
            }

            for (int j = 1; j < s - a[i]; j++) {
                if (dpTable[i - 1][j] == 0) {
                    continue;
                }
                dpTable[i][j + a[i]] = (dpTable[i][j] + dpTable[i - 1][j]) % MOD;
            }
            dpTable[i][a[i]] = (dpTable[i][a[i]] + i + 1) % MOD;
        }

        System.out.println(count);
    }
}
