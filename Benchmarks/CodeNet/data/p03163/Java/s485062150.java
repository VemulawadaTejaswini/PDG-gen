import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int W = scanner.nextInt();
        int[] w = new int[n];
        int[] v = new int[n];
        for (int i = 0; i < n; ++i) {
            w[i] = scanner.nextInt();
            v[i] = scanner.nextInt();
        }
        System.out.println(knapsack(W, w, v));
    }

    private static long knapsack(int W, int[] w, int[] v) {
        long[][] dp = new long[w.length][W + 1];
        for (long[] dpRow : dp) {
            Arrays.fill(dpRow, -1);
        }
        return calcMaxValue(0, w, v, W, dp);
    }

    private static long calcMaxValue(int curInd, int[] w, int[] v, int W, long[][] dp) {
        if (curInd >= w.length || w[curInd] > W)
            return 0;
//        if (dp[curInd][W] != -1)
//            return dp[curInd][W];
        long maxValue = Math.max(
                calcMaxValue(curInd + 1, w, v, W, dp),
                v[curInd] + calcMaxValue(curInd + 1, w, v, W - w[curInd], dp));
//        dp[curInd][W] = maxValue;
        return maxValue;
    }
}
