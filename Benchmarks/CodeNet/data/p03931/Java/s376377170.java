import java.util.*;

public class Main {
    static final int MOD = 1000000007;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int kk = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int[][][] dp = new int[n + 1][n + 1][256];
        dp[0][0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i - 1; j++) {
                for (int k = 0; k < 255; k++) {
                    dp[i][j][k] += dp[i - 1][j][k];
                    if (dp[i][j][k] > 0) {
                        //System.out.println(i + ":" + j + ":" + k + ":count:" + dp[i][j][k]);
                    }
                    dp[i][j + 1][k ^ arr[i]] += dp[i - 1][j][k];
                    if (dp[i][j + 1][k ^ arr[i]]  > 0) {
                       // System.out.println(i + ":" + (j + 1) + ":" + (k ^ arr[i]) + ":count:" + dp[i][j + 1][k ^ arr[i]]);
                    }
                }
            }
        }
        long total = 0;
        for (int i = 0; i <= n; i++) {
            if (dp[n][i][kk] != 0) {
                total += dp[n][i][kk] * kaijo(i) % MOD;
                total %= MOD;
            }
            //System.out.println(dp[n][i][kk]);
       }
       //System.out.println(dp[n][n][7]);
        System.out.println(total);
    }
    
    static long kaijo(long x) {
        if (x == 0) {
            return 1;
        } else {
            return x * kaijo(x - 1) % MOD;
        }
    }
}

