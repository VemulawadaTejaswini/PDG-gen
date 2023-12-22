import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        long[][] masu = new long[R][C];
        for (int i = 0; i < K; i++) {
            int r, c;
            long v;
            r = sc.nextInt() - 1;
            c = sc.nextInt() - 1;
            v = sc.nextLong();
            masu[r][c] = v;
        }
        long[][][] maxVal = new long[R][C][4];
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                for (int k = 0; k < 4; k++) {
                    maxVal[r][c][k] = 0;
                }
            }
        }
        for (int c = 0; c < C; c++) {
            maxVal[0][c][0] = 0;
        }
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (c + 1 < C) {
                    for (int k = 0; k < 3; k++) {
                        maxVal[r][c + 1][k + 1] = Math.max(maxVal[r][c + 1][k + 1], Math.max(maxVal[r][c][k] + masu[r][c], maxVal[r][c][k + 1]));
                    }
                }
                if (r + 1 < R) {
                    for (int k = 0; k < 4; k++) {
                        maxVal[r + 1][c][0] = calculateMax(masu[r][c], maxVal[r][c]);
                    }
                }
            }
        }
        System.out.println(calculateMax(masu[R-1][C-1], maxVal[R-1][C-1]));
    }

    private static long calculateMax(long masuVal, long[] longs) {
        return Math.max(Math.max(longs[0]+ masuVal, longs[1]+ masuVal), Math.max(longs[2]+ masuVal, longs[3]));
    }
}
