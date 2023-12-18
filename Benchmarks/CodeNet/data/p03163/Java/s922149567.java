import java.util.Scanner;

class Main {
    // D - Knapsack 1
    public static long knapsack1(int[] weights, long[] values, int W) {
        // recursive with memo
        long[][] memo = new long[weights.length][W+1];
        return knapsack_recursive_memo(weights, values, W, 0, memo);
    }

    // recursive with memo
    public static long knapsack_recursive_memo(int[] weights, long[] values, int W, int index, long[][] memo) {
        if (W <= 0 || index >= weights.length) return 0;

        if (memo[index][W] != 0) return memo[index][W];

        long ret;
        if (W >= weights[index]) {
            long tmp1 = knapsack_recursive_memo(weights, values, W, index+1, memo);
            long tmp2 = knapsack_recursive_memo(weights, values, W-weights[index], index+1, memo) + values[index];
            ret = Math.max(tmp1, tmp2);
        } else {
            ret = knapsack_recursive_memo(weights, values, W, index+1, memo);
        }

        memo[index][W] = ret;
        return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int W = in.nextInt();

        int[] weights = new int[N];
        long[] values = new long[N];
        for (int i = 0; i < N; i++) {
            weights[i] = in.nextInt();
            values[i]  = in.nextLong();
        }
        in.close();

        // call function hear
        long ret = knapsack1(weights, values, W);
        System.out.println(ret);
    }
}