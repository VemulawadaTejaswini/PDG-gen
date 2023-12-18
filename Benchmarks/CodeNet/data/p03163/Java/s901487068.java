import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int w = s.nextInt();
        int[] weights = new int[n];
        long[] values = new long[n];

        for (int i = 0; i < n; i++) {
            weights[i] = s.nextInt();
            values[i] = s.nextInt();

        }
        long res = knapsack(weights, values, 0, w, new long[n + 1][w + 1]);
        System.out.println(res);
    }

    private static long knapsack(int[] weights, long[] values, int si, int w, long[][] dp) {
        if (si == weights.length) {
            return 0;
        }
        if (dp[si][w] != 0) {
            return dp[si][w];
        }
        long rr = knapsack(weights, values, si + 1, w, dp);

        if (weights[si] <= w) {
            long cr = knapsack(weights, values, si + 1, w - weights[si], dp) + values[si];
            rr = Math.max(rr, cr);
        }

        dp[si][w] = rr;
        return rr;

    }
}
