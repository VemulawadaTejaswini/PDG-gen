import java.util.Scanner;

class Main {
    // D - Knapsack 1
    public static long knapsack1(int[] weights, long[] values, int W) {
        return knapsack1(weights, values, W, 0);
    }

    public static long knapsack1(int[] weights, long[] values, int W, int index) {
        if (W <= 0 || index >= weights.length) return 0;

        if (W >= weights[index]) {
            long tmp1 = knapsack1(weights, values, W, index+1);
            long tmp2 = knapsack1(weights, values, W-weights[index], index+1) + values[index];
            return Math.max(tmp1, tmp2);
        } else {
            return knapsack1(weights, values, W, index+1);
        }
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