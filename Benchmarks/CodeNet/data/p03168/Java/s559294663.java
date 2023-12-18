
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] p = new double[n + 1];
        for (int i = 1; i <= n; i++) {
            p[i] = sc.nextDouble();
        }
        double[][] dp = new double[n + 1][n + 1];
        // dp[i][j] = with i coins probablilty of getting j heads.

        /*
         * dp[3][2] means 3 coins and getting probablity of 2 heads. hht hth thh so
         * dp[3][2] = p[3] * dp[2][1] (ht or th) + (1-p[3])*dp[2][2] (hh); --------
         * dp[i][j] = p[i]*dp[i-1][j-1] + (1-p[i])*dp[i-1][j];
         */

        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == 0) {
                    dp[i][j] = (1.0 - p[i]) * dp[i - 1][j];
                } else {
                    dp[i][j] = p[i] * dp[i - 1][j - 1] + (1 - p[i]) * dp[i - 1][j];
                }
            }
        }
        // System.out.println(Arrays.deepToString(dp));
        double ans = 0;
        for (int i = (n + 1) / 2; i <= n; i++) {
            ans = ans + dp[n][i];
        }

        System.out.println(ans);

    }

}