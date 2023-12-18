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
            int[] bw = new int[N];

            for (int i = 0; i < N; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
                bw[i] = in.next().charAt(0) == 'B' ? B : W;
            }

            int[][] b = new int[2 * K][2 * K];
            int[][] w = new int[2 * K][2 * K];
            for (int i = 0; i < N; i++) {
                x[i] %= 2 * K;
                y[i] %= 2 * K;
                if (bw[i] == B) {
                    b[y[i]][x[i]]++;
                } else {
                    w[y[i]][x[i]]++;
                }
            }

            int[][] sumB = new int[2 * K + 1][2 * K + 1];
            int[][] sumW = new int[2 * K + 1][2 * K + 1];
            for (int r = 0; r < 2 * K; r++) {
                for (int c = 0; c < 2 * K; c++) {
                    sumB[r + 1][c + 1] = sumB[r + 1][c] + sumB[r][c + 1] - sumB[r][c] + b[r][c];
                    sumW[r + 1][c + 1] = sumW[r + 1][c] + sumW[r][c + 1] - sumW[r][c] + w[r][c];
                }
            }

            int max = 0;
            for (int r = 0; r < 2 * K; r++) {
                for (int c = 0; c < 2 * K; c++) {
                    int r0 = 0;
                    int r1 = Math.max(r - K, 0);
                    int r2 = r;
                    int r3 = Math.min(r + K, 2 * K);
                    int r4 = 2 * K;

                    int c0 = 0;
                    int c1 = Math.max(c - K, 0);
                    int c2 = c;
                    int c3 = Math.min(c + K, 2 * K);
                    int c4 = 2 * K;

                    int num = sum(sumB, r0, c0, r1, c1) //
                            + sum(sumW, r0, c1, r1, c2)//
                            + sum(sumB, r0, c2, r1, c3)//
                            + sum(sumW, r0, c3, r1, c4)//

                            + sum(sumW, r1, c0, r2, c1) //
                            + sum(sumB, r1, c1, r2, c2)//
                            + sum(sumW, r1, c2, r2, c3)//
                            + sum(sumB, r1, c3, r2, c4)//

                            + sum(sumB, r2, c0, r3, c1) //
                            + sum(sumW, r2, c1, r3, c2)//
                            + sum(sumB, r2, c2, r3, c3)//
                            + sum(sumW, r2, c3, r3, c4)//

                            + sum(sumW, r3, c0, r4, c1) //
                            + sum(sumB, r3, c1, r4, c2)//
                            + sum(sumW, r3, c2, r4, c3)//
                            + sum(sumB, r3, c3, r4, c4)//
                    ;

                    max = Math.max(max, num);

                    // int num2 = sum(sumW, r0, c0, r1, c1) //
                    // + sum(sumB, r0, c1, r1, c2)//
                    // + sum(sumW, r0, c2, r1, c3)//
                    // + sum(sumB, r1, c0, r2, c1) //
                    // + sum(sumW, r1, c1, r2, c2) //
                    // + sum(sumB, r1, c2, r2, c3) //
                    // + sum(sumW, r2, c0, r3, c1) //
                    // + sum(sumB, r2, c1, r3, c2) //
                    // + sum(sumW, r2, c2, r3, c3);
                    //
                    // max = Math.max(max, num2);
                }
            }

            System.out.println(max);
        }
    }

    private static int sum(int[][] sum, int r, int c, int r2, int c2) {
        return sum[r][c] - sum[r2][c] - sum[r][c2] + sum[r2][c2];
    }
}
