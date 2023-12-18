import java.util.*;

public class Main {

    private static final int INF = 2_000_000_000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] h = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = sc.nextInt();
        }
        // 0: i+1, 1: i+2
        int[][] dp = new int[N][2];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                dp[i][j] = INF;
            }
        }
        dp[0][0] = 0;
        dp[0][1] = 0;
        for (int i = 0; i < N; i++) {
            if (i >= 1) {
                dp[i][0] = Math.min(dp[i-1][0], dp[i-1][1]) + Math.abs(h[i]-h[i-1]);
            }
            if (i >= 2) {
                dp[i][1] = Math.min(dp[i-2][0], dp[i-2][1]) + Math.abs(h[i]-h[i-2]);
            }
        }
        System.out.println(Math.min(dp[N-1][0], dp[N-1][1]));
    }
}

