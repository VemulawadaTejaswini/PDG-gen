
import java.util.*;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static int n = 0, k = 0;
    public static int[] weight = new int[101];
    public static int[] benifit = new int[101];
    public static long[][] dp = new long[101][100001];

    public static long solve(int idx, int rem) {
        if (idx == n) {
            return 0;
        } else {
            if (dp[idx][rem] == -1) {
                long c1 = solve(idx + 1, rem);
                long c2 = 0;
                if (weight[idx] <= rem) {
                    c2 = (solve(idx + 1, rem - weight[idx]) + benifit[idx]);
                }
                return dp[idx][rem] = Math.max(c2, c1);
            } else {
                return dp[idx][rem];
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 100001; j++) {
                dp[i][j] = -1;
            }
        }
        n = in.nextInt();
        k = in.nextInt();;
        for (int i = 0; i < n; i++) {
            weight[i] = in.nextInt();
            benifit[i] = in.nextInt();
        }
        System.out.println(solve(0, k));
    }

}
