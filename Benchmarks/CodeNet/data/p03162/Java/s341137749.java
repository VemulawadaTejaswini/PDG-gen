import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner itr = new Scanner(System.in);
        int N = itr.nextInt();
        int[][] ac = new int[N][3];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                ac[i][j] = itr.nextInt();
            }
        }

        int[][] dp = new int[N][3];
        dp[0][0] = ac[0][0];
        dp[0][1] = ac[0][1];
        dp[0][2] = ac[0][2];

        for (int i = 1; i < N; i++) {
            dp[i][0] = Math.max(dp[i - 1][1] + ac[i][0], dp[i - 1][2] + ac[i][0]);
            dp[i][1] = Math.max(dp[i - 1][0] + ac[i][1], dp[i - 1][2] + ac[i][1]);
            dp[i][2] = Math.max(dp[i - 1][0] + ac[i][2], dp[i - 1][1] + ac[i][2]);
        }

        int res = dp[N - 1][0];
        for (int i = 1; i <= 2; i++) {
            res = Math.max(res, dp[N - 1][i]);
        }

        System.out.println(res);
    }
}