import java.util.*;

public class Main {
    static int INF = 20000000;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        
        int[][][] dp = new int[n+1][m][x+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < x+1; k++) {
                    dp[i][j][k] = INF;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n+1; j++) {
                dp[j][i][0] = 0;
            }
        }
        // for (int i = 0; i < x+1; i++) {
        //     dp[0][0][i] = 0;
        // }
        
        
        for (int i = 0; i < n; i++) {
            int cost = sc.nextInt();
            for (int k = 0; k < m; k++) {
                int up = sc.nextInt();
                for (int j = 0; j <= x; j++) {
                    dp[i+1][k][j] = dp[i][k][j];
                    if (j - up < 0) {
                        dp[i+1][k][j] = Math.min(dp[i][k][j], dp[i+1][k][0] + cost);
                        continue;
                    }
                    dp[i+1][k][j] = Math.min(dp[i][k][j], dp[i+1][k][j - up] + cost);
                }
            }
        }
        
        int min = dp[n][0][x];
        for (int i = 1; i < m; i++) {
            min = Math.max(min, dp[n][i][x]);
        }
        // System.out.println(dp[1][0][2]);
        System.out.println(min);
    }
}
