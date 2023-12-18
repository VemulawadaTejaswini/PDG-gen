import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] h = new int[N][3];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                h[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[N + 1][3];
        //for (int i = 0; i < N + 1; i++) {
        //    Arrays.fill(dp[i], Integer.MIN_VALUE);
        //}

        for (int i = 0; i < N; i++) {
            // j : from.
            // k : to.
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (j != k) {
                        dp[i + 1][k] = Math.max(dp[i + 1][k],  dp[i][j] + h[i][k]);
                    }
                }
            }
        }

        int max = Math.max(dp[N][0], dp[N][1]);
        max = Math.max(max, dp[N][2]);
        System.out.println(max);
    }
}
