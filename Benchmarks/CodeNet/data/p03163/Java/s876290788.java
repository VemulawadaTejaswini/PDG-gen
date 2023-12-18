
import java.util.*;

 public  class Main {

    public static Scanner in = new Scanner(System.in);
    public static int n = 0, k = 0;
    public static int[] weight = new int[10001];
    public static int[] benifit = new int[10001];
    public static int[][] dp = new int[10001][10001];

    public static int solve(int idx, int rem) {
        if (idx == n) {
            return 0;
        } else {
            if (dp[idx][rem] == -1) {
                int c1 = solve(idx + 1, rem);
                int c2 = 0;
                if (weight[idx] <= rem) {
                    c2 = solve(idx + 1, rem - weight[idx]) + benifit[idx];
                }
                return dp[idx][rem] = Math.max(c2, c1);
            } else {
                return dp[idx][rem];
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10001; i++) {
            for (int j = 0; j < 10001; j++) {
                dp[i][j] = -1;
            }
        }
        n = in.nextInt();
        k = in.nextInt();
        for (int i = 0; i < n; i++) {
            weight[i] = in.nextInt();
            benifit[i] = in.nextInt();
        }
        System.out.println(solve(0, k));
    }

}
