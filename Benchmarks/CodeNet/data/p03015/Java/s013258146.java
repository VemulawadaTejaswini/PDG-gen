import java.util.*;

/**
 *
 */
public class Main {
    public static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String L = sc.next();

        System.out.println(solveEditorial(L));
    }

    /**
     * 解説のDPによる解法
     * @param L
     * @return
     */
    private static int solveEditorial(String L) {
        int N = L.length();

        // dp[i][j]: i桁まで確認, j=0: i桁が一致 / j=1: 未満であることが既に確定
        int[][] dp = new int[100005][2];
        dp[0][0] = 1;

        for (int i=0; i<N; i++) {
            // if a+b == 0
            if (L.charAt(i) == '0') {
                dp[i+1][0] = dp[i][0];
                dp[i+1][1] = dp[i][1];
            } else {
                dp[i+1][1] = (dp[i][0] + dp[i][1])%MOD;
            }

            // if a+b == 1
            if (L.charAt(i) == '0') {
                dp[i+1][i] += dp[i][1]*2 % MOD;
                dp[i+1][i] = dp[i+1][i] %MOD;
            } else {
                dp[i+1][0] += dp[i][0]*2 % MOD;
                dp[i+1][0] = dp[i+1][0] %MOD;
                dp[i+1][1] += dp[i][1]*2 % MOD;
                dp[i+1][1] = dp[i+1][1] %MOD;
            }
        }

        return (dp[N][0] + dp[N][1])%MOD;
    }
}
