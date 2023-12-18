import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int k = scanner.nextInt() - 1;

        int[] f = new int[Math.max(w + 2, 4)];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i <= w; i++) {
            f[i] = f[i - 2] + f[i - 1];
        }

        long[][] dp = new long[h + 1][w];
        dp[0][0] = 1;
        for (int i = 1; i <= h; i++) {
            for (int j = 0; j <= i && j < w; j++) {
                if (j > 0) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - 1] * f[w - j - 1] % 1000000007 * f[j - 1] % 1000000007) % 1000000007;
                }
                if (j < w - 1) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j + 1] * f[w - j - 2] % 1000000007 * f[j] % 1000000007) % 1000000007;
                }
                dp[i][j] = (dp[i][j] + dp[i - 1][j] * f[w - j - 1] % 1000000007 * f[j] % 1000000007) % 1000000007;
            }
        }
        System.out.println(dp[h][k]);
    }
}