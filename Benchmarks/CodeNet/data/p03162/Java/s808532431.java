import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] gains = new int[n][3];
        for (int i = 0; i < n; ++i) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            gains[i][0] = a;
            gains[i][1] = b;
            gains[i][2] = c;
        }
        System.out.println(solve(gains));
    }

    private static int solve(int[][] gains) {
        int[][] dp = new int[gains.length][3];
        for (int i = 0; i < gains.length; ++i) {
            Arrays.fill(dp[i], -1);
        }
        return Math.max(
                Math.max(
                        findMax(0, 0, gains, dp),
                        findMax(1, 0, gains, dp)),
                findMax(2, 0, gains, dp));
    }

    private static int findMax(int cur, int ind, int[][] gains, int[][] dp) {
        if (ind == gains.length) {
            return 0;
        }
        if (dp[ind][cur] > 0)
            return dp[ind][cur];
        int res;
        if (cur == 0) {
            res = gains[ind][cur] + Math.max(findMax(1, ind + 1, gains, dp), findMax(2, ind + 1, gains, dp));
        } else if (cur == 1) {
            res = gains[ind][cur] + Math.max(findMax(0, ind + 1, gains, dp), findMax(2, ind + 1, gains, dp));
        } else {
            res = gains[ind][cur] + Math.max(findMax(0, ind + 1, gains, dp), findMax(1, ind + 1, gains, dp));
        }
        dp[ind][cur] = res;
        return res;
    }
}
