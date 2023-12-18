
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] x = new long[n];
        long[] y = new long[n];
        long[] z = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            z[i] = sc.nextLong();
        }

        long[][][] dp = new long[n + 1][m + 1][8];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < 8; k++) {
                    long add = 0;
                    if ((k & 4) != 0) {
                        add += x[i];
                    } else {
                        add -= x[i];
                    }
                    if ((k & 2) != 0) {
                        add += y[i];
                    } else {
                        add -= y[i];
                    }
                    if ((k & 1) != 0) {
                        add += z[i];
                    } else {
                        add -= z[i];
                    }

                    dp[i + 1][j + 1][k] = Math.max(dp[i + 1][j + 1][k], dp[i][j][k] + add);
                    dp[i + 1][j][k] = Math.max(dp[i + 1][j][k], dp[i][j][k]);
                }
            }
            for (int j = 0; j < 8; j++) {
                dp[i + 1][m][j] = Math.max(dp[i + 1][m][j], dp[i][m][j]);
            }
        }
        long ans = dp[n][m][0];
        for (int i = 1; i < 8; i++) {
            ans = Math.max(dp[n][m][i], ans);
        }
        System.out.println(ans);

    }

}
