
import java.util.Scanner;

// TODO solve
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

        final long[][][] dp = new long[n + 1][s + 1][3];
        dp[0][0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= s; j++) {
                dp[i + 1][j][0] = dp[i][j][0];
                dp[i + 1][j][1] = (dp[i + 1][j][1] + dp[i][j][0] + dp[i][j][1]) % MOD;
                dp[i + 1][j][2] = (dp[i + 1][j][2] + dp[i][j][0] + dp[i][j][1] + dp[i][j][2]) % MOD;
                if (j + a[i] <= s) {
                    dp[i + 1][j + a[i]][1] = (dp[i][j][0] + dp[i][j][1]) % MOD;
                    dp[i + 1][j + a[i]][2] = (dp[i][j][0] + dp[i][j][1]) % MOD;
                }
            }
        }

        System.out.println(dp[n][s][2]);
    }
}
