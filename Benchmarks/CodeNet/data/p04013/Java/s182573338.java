

import java.math.BigDecimal;
        import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        
        long[][][] dp = new long[n+1][n+1][3010];
        
        dp[0][0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k <= 2500; k++) {
                    dp[i + 1][j][k] += dp[i][j][k];
                    if (k>=x[i]) dp[i + 1][j + 1][k] += dp[i][j][k-x[i]];
                }
            }

        }

        long ans = 0;
        for (int k = 1; k <= n; k++) {
            ans += dp[n][k][k * a];
        }
        System.out.println(ans);

    }

}