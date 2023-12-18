import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int mod = 1000000007;

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] s = new int[n];
        Arrays.setAll(s, i -> scanner.nextInt());
        int[] t = new int[m];
        Arrays.setAll(t, i -> scanner.nextInt());
        int[][] dp = new int[n + 2][m + 2];
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = (dp[i][j] + dp[i][j - 1] + dp[i - 1][j] - dp[i - 1][j - 1]) % mod;
                if (s[i - 1] == t[j - 1]) {
                    ans = (ans + dp[i][j] + 1) % mod;
                    dp[i + 1][j + 1] = (dp[i][j] + 1) % mod;
                }
            }
        }
        System.out.println(ans + 1);
    }
}