import java.util.*;
public class Main {
    static int mod = 1000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        int[][] dp = new int[h + 1][w + 1];
        dp[0][1] = 1;
        for (int i = 0; i < h; i++) {
            for (int j = 1; j <= w; j++) {
                if (j != 1) dp[i + 1][j - 1] = (int) ((dp[i + 1][j - 1] + (long) dp[i][j] * func(j - 3) * func(w - j - 1)) % mod);
                dp[i + 1][j] = (int) ((dp[i + 1][j] + (long) dp[i][j] * func(j - 2) * func(w - j - 1)) % mod);
                if (j != w) dp[i + 1][j + 1] = (int) ((dp[i + 1][j + 1] + (long) dp[i][j] * func(j - 2) * func(w - j - 2)) % mod);
            }
        }
        System.out.println(dp[h][k]);
    }
    public static int func(int x) {
        if (x <= 0) return 1;
        int[][] dp = new int[x + 1][2];
        dp[0][0] = 1;
        for (int i = 0; i < x; i++) {
            dp[i + 1][0] = dp[i][0] + dp[i][1];
            dp[i + 1][1] = dp[i][0];
        }
        return dp[x][0] + dp[x][1];
    }
}