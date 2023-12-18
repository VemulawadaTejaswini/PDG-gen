import java.util.Scanner;

public class Main {
    private static final int B = 1;
    private static final int W = 2;

    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int K = in.nextInt();
            int[] x = new int[N];
            int[] y = new int[N];
            int[] c = new int[N];

            for (int i = 0; i < N; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
                c[i] = in.next().charAt(0) == 'B' ? B : W;
            }

            int[][] Bs = new int[2 * K][2 * K];
            int[][] Ws = new int[2 * K][2 * K];
            for (int i = 0; i < N; i++) {
                x[i] %= 2 * K;
                y[i] %= 2 * K;
                if (c[i] == B) {
                    Bs[y[i]][x[i]]++;
                } else {
                    Ws[y[i]][x[i]]++;
                }
            }

            int[][] sumB = new int[2 * K + 1][2 * K + 1];
            int[][] sumW = new int[2 * K + 1][2 * K + 1];
            for (int r = 0; r < 2 * K; r++) {
                for (int c2 = 0; c2 < 2 * K; c2++) {
                    sumB[r + 1][c2 + 1] = sumB[r + 1][c2] + sumB[r][c2 + 1] - sumB[r][c2] + Bs[r][c2];
                    sumW[r + 1][c2 + 1] = sumW[r + 1][c2] + sumW[r][c2 + 1] - sumW[r][c2] + Ws[r][c2];
                }
            }

            int max = 0;
            for (int r = 0; r < 2 * K; r++) {
                for (int c2 = 0; c2 < 2 * K; c2++) {
                    int r3 = Math.min(r + K, 2 * K);
                    int c3 = Math.min(c2 + K, 2 * K);
                    int num = sum(sumB, 0, 0, r, c2) //
                            + sum(sumW, 0, c2, r, c3)//
                            + sum(sumB, 0, c3, r, 2 * K)//
                            + sum(sumW, r, 0, r3, c2) //
                            + sum(sumB, r, c2, r3, c3) //
                            + sum(sumW, r, c3, r3, 2 * K) //
                            + sum(sumB, r3, 0, 2 * K, c2) //
                            + sum(sumW, r3, c2, 2 * K, c3) //
                            + sum(sumB, r3, c3, 2 * K, 2 * K);
                    max = Math.max(max, num);
                }
            }

            System.out.println(max);
        }
    }

    private static int sum(int[][] sum, int r, int c, int r2, int c2) {
        return sum[r][c] - sum[r2][c] - sum[r][c2] + sum[r2][c2];
    }
}
