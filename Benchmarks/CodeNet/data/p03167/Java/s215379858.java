import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] board = new String[H];
        for (int i = 0; i < H; i++) {
            board[i] = sc.next();
            // System.out.println(board[i]);
        }
        long[][] dp = new long[H][W];
        int MOD = 1_000_000_007;
        dp[0][0] = 1;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (board[i].charAt(j) == '#') continue;
                if (i > 0) {
                    dp[i][j] += dp[i-1][j];
                    dp[i][j] %= MOD;
                }
                if (j > 0) {
                    dp[i][j] += dp[i][j-1];
                    dp[i][j] %= MOD;
                }
            }
        }
        long ans = dp[H-1][W-1];
        System.out.println(ans);
    }
}