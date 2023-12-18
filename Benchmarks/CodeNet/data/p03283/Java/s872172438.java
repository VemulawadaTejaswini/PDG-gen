import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();
            int Q = in.nextInt();

            int[] L = new int[M];
            int[] R = new int[M];
            int[][] count = new int[N][N];
            for (int i = 0; i < M; i++) {
                L[i] = in.nextInt() - 1;
                R[i] = in.nextInt() - 1;
                count[L[i]][R[i]]++;
            }

            TwoDimensionalCumulativeSum cumsum = new TwoDimensionalCumulativeSum(count);

            int[] p = new int[Q];
            int[] q = new int[Q];
            for (int i = 0; i < Q; i++) {
                p[i] = in.nextInt() - 1;
                q[i] = in.nextInt() - 1;
                System.out.println(cumsum.cumulativeSum(p[i], p[i], q[i] + 1, q[i] + 1));
            }

        }
    }

}

class TwoDimensionalCumulativeSum {
    private int[][] sum;

    public TwoDimensionalCumulativeSum(int[][] values) {
        int R = values.length;
        int C = values[0].length;
        sum = new int[R + 1][C + 1];
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                sum[r + 1][c + 1] = sum[r + 1][c] + sum[r][c + 1] - sum[r][c] + values[r][c];
            }
        }
    }

    public int cumulativeSum(int startRInclusive, int startCInclusive, int endRExclusive, int endCExclusive) {
        return sum[startRInclusive][startCInclusive] - sum[endRExclusive][startCInclusive] - sum[startRInclusive][endCExclusive] + sum[endRExclusive][endCExclusive];
    }
}
