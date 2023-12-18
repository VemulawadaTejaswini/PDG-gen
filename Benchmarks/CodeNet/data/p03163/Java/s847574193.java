import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int W = reader.nextInt();
        int[] w = new int[n];
        int[] v = new int[n];
        for (int i = 0; i < n; ++i) {
            w[i] = reader.nextInt();
            v[i] = reader.nextInt();
        }
        System.out.println(solve(w, v, W));
    }

    private static long solve(int[] w, int[] v, int W) {
        boolean[] taken = new boolean[w.length];
        long[][] dp = new long[w.length + 1][W + 1];
        for (int i = 0; i <= w.length; ++i)
            Arrays.fill(dp[i], -1);
//        long max = calcMax(-1, w, v, W, w.length, taken, dp);
//        System.out.println(Arrays.toString(dp));
//        return max;
//        return takeNext(w, v, W, w.length, taken, dp);
        return calcMax(0, w, v, W, dp);
    }

    private static long calcMax(int ind, int[] w, int[] v, int W, int n, boolean[] taken, long[][] dp) {
        if (ind >= 0 && dp[ind][W] >= 0)
            return dp[ind][W];
        long max = 0;
        for (int i = 0; i < taken.length; ++i) {
            if (!taken[i] && (W - w[i] >= 0)) {
                taken[i] = true;
                max = Math.max(calcMax(i, w, v, W - w[i], n - 1, taken, dp), max);
                dp[i][W] = max;
                taken[i] = false;
            }
        }
        long res = max;
        if (ind >= 0) {
            res += v[ind];
//            dp[ind] = res;
        }
        return res;
//        return res;
    }

    private static long takeNext(int[] w, int[] v, int W, int count, boolean[] taken, long [][] dp) {
        if (count == 0)
            return 0;
        long maxVal = 0;
        if (dp[count][W] >= 0)
            return dp[count][W];
        for (int i = 0; i < taken.length; ++i) {
            if (taken[i] || (W - w[i] < 0))
                continue;
            taken[i] = true;
            maxVal = Math.max(maxVal, v[i] + takeNext(w, v, W - w[i], count - 1, taken, dp));
            taken[i] = false;
        }
        System.out.println("count:" + count + " W:" + W + " " + maxVal);
        dp[count][W] = maxVal;
        return maxVal;
    }

    private static long calcMax(int curIndex, int[] w, int[] v, int W, long[][] dp) {
        if (curIndex >= w.length || W == 0) {
            return 0;
        }
        if (dp[curIndex][W] >= 0)
            return dp[curIndex][W];
        long profit1 = 0;
        if (w[curIndex] <= W)
            profit1 = v[curIndex] + calcMax(curIndex + 1, w, v, W - w[curIndex], dp);
        long profit2 = calcMax(curIndex + 1, w, v, W, dp);
        long res = Math.max(profit1, profit2);
        dp[curIndex][W] = res;
        return res;
    }
}
