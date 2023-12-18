import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[][] a = new int[n+1][2];
        for (int i = 1; i <= n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        int b = a[1][0];
        for (int i = 1; i <= n; i++) {
            a[i][0] -= b;
        }
        long[][][] dp = new long[n+1][n+1][301];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                for (int k = 0; k <= 300; k++) {
                    if(k < a[i][0]) dp[i][j][k] = dp[i-1][j][k];
                    else dp[i][j][k] = Math.max(dp[i-1][j-1][k-a[i][0]] + a[i][1], dp[i-1][j][k]);
                }
            }
        }
        long ans = 0L;
        for (int i = 1; i <= n; i++) {
            if(w < b*i) break;
            int r = Math.min(w - (b * i), 300);
            long t = 0L;
            for (int j = 0; j <= r; j++) {
                t = Math.max(t, dp[n][i][j]);
            }
            ans = Math.max(ans, t);
        }
        System.out.println(ans);
        sc.close();

    }

}
