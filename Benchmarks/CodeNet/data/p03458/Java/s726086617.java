import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int K = in.nextInt();
            int[] x = new int[N];
            int[] y = new int[N];
            for (int i = 0; i < N; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
                if (in.next().charAt(0) == 'B') {
                    y[i] += K;
                }
            }

            int K2 = 2 * K;

            int[][] w = new int[K2][K2];
            for (int i = 0; i < N; i++) {
                x[i] %= K2;
                y[i] %= K2;
                w[y[i]][x[i]]++;
            }

            TwoDimensionalCumulativeSum cumsum = new TwoDimensionalCumulativeSum(w);

            int max = 0;
            for (int r = 0; r < K2; r++) {
                for (int c = 0; c < K2; c++) {
                    int r0 = 0;
                    int r1 = Math.max(r - K, 0);
                    int r2 = r;
                    int r3 = Math.min(r + K, K2);
                    int r4 = K2;

                    int c0 = 0;
                    int c1 = Math.max(c - K, 0);
                    int c2 = c;
                    int c3 = Math.min(c + K, K2);
                    int c4 = K2;

                    int num = +cumsum.cumulativeSum(r0, c1, r1, c2) + cumsum.cumulativeSum(r0, c3, r1, c4) + cumsum.cumulativeSum(r1, c0, r2, c1) + cumsum.cumulativeSum(r1, c2, r2, c3) + cumsum.cumulativeSum(r2, c1, r3, c2) + cumsum.cumulativeSum(r2, c3, r3, c4) + cumsum.cumulativeSum(r3, c0, r4, c1) + cumsum.cumulativeSum(r3, c2, r4, c3);

                    max = Math.max(max, num);
                }
            }

            System.out.println(max);
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
