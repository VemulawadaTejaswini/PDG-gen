import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int R = scan.nextInt();
        int C = scan.nextInt();
        int K = scan.nextInt();
        long[][][] dp = new long[R+1][C+1][4];
        boolean[][] map = new boolean[R][C];
        int[][] cost = new int[R][C];
        for (int i = 0; i < K; i++) {
            int r = scan.nextInt()-1;
            int c = scan.nextInt()-1;
            int v = scan.nextInt();
            map[r][c] = true;
            cost[r][c] = v;
        }
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                long max = Math.max(dp[i-1][j][0], Math.max(dp[i-1][j][1], Math.max(dp[i-1][j][2], dp[i-1][j][3])));
                dp[i][j][0] = Math.max(dp[i][j-1][0],max);
                dp[i][j][1] = dp[i][j-1][1];
                dp[i][j][2] = dp[i][j-1][2];
                dp[i][j][3] = dp[i][j-1][3];
                if(map[i-1][j-1]) {
                    dp[i][j][1] = Math.max(dp[i][j][1],Math.max(dp[i][j-1][0] + cost[i-1][j-1], max + cost[i-1][j-1]));
                    dp[i][j][2] = Math.max(dp[i][j][2],dp[i][j-1][1] + cost[i-1][j-1]);
                    dp[i][j][3] = Math.max(dp[i][j][3],dp[i][j-1][2] + cost[i-1][j-1]);
                }
            }
        }
        long ans = Math.max(dp[R][C][0], Math.max(dp[R][C][1], Math.max(dp[R][C][2], dp[R][C][3])));
        System.out.println(ans);
    }
}
