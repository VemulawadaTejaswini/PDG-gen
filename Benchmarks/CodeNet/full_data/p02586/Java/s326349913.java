import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        int[][] V = new int[R][C];
        for (int i = 0; i < K; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            int v = sc.nextInt();
            V[--r][--c] = v;
        }

        long[][][] dp = new long[R][C][4];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                for (int k = 0; k <= 3; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        dp[0][0][3] = 0;
        if (V[0][0] > 0) dp[0][0][2] = V[0][0];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                for (int k = 0; k <= 3; k++) {
                    if (dp[i][j][k] == -1) continue;
                    if (i+1 < R) {
                        // i+1
                        long max = 0;
                        for (int kk = 0; kk <= 3; kk++) {
                            max = Math.max(max,dp[i][j][kk]);
                        }
                        if (V[i+1][j] > 0) {
                            dp[i+1][j][2] = Math.max(dp[i+1][j][2],max+V[i+1][j]);
                        }
                        dp[i+1][j][3] = Math.max(dp[i+1][j][3],max);
                    }
                    if (j+1 < C) {
                        // j+1
                        if (V[i][j+1] > 0 && k > 0) {
                            dp[i][j+1][k-1] = Math.max(dp[i][j+1][k-1],dp[i][j][k]+V[i][j+1]);
                        }
                        dp[i][j+1][k] = Math.max(dp[i][j+1][k],dp[i][j][k]);
                    }
                }
            }
        }

        long ans = 0;
        for (int k = 0; k <= 3; k++) {
            ans = Math.max(ans,dp[R-1][C-1][k]);
        }
        System.out.println(ans);
    }
}
