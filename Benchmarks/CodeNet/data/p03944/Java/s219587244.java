import java.io.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private boolean[][] b;

    private void solve(Scanner sc, PrintWriter out) {
        int W = sc.nextInt();
        int H = sc.nextInt();
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        int[] a = new int[N];
        for (int i = 0; i < N; ++i) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            a[i] = sc.nextInt();
        }

        b = new boolean[H][W];

        for (int i = 0; i < N; ++i) {
            switch (a[i]) {
            case 1:
                blackout(0, x[i] - 1, 0, H - 1);
                break;
            case 2:
                blackout(x[i], W - 1, 0, H - 1);
                break;
            case 3:
                blackout(0, W - 1, 0, y[i] - 1);
                break;
            case 4:
                blackout(0, W - 1, y[i], H - 1);
                break;
            }
        }

        int count = 0;
        for (int i = 0; i < H; ++i) {
            for (int j = 0; j < W; ++j) {
                if (!b[i][j]) {
                    ++count;
                }
            }
        }
        if (debug) {
            for (int i = b.length - 1; i >= 0; --i) {
                for (int j = 0; j < b[i].length; ++j) {
                    System.err.print(b[i][j] ? '#' : ' ');
                }
                System.err.println();
            }
        }

        out.println(count);
    }
    private void blackout(int x0, int x1, int y0, int y1) {
        for (int i = y0; i <= y1; ++i) {
            for (int j = x0; j <= x1; ++j) {
                b[i][j] = true;
            }
        }
    }
    /*
     * 10^10 > Integer.MAX_VALUE = 2147483647 > 10^9
     * 10^19 > Long.MAX_VALUE = 9223372036854775807L > 10^18
     */
    public static void main(String[] args) {
        long S = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        new Main().solve(sc, out);
        out.flush();

        long G = System.currentTimeMillis();
        if (elapsed) {
            System.err.println((G - S) + "ms");
        }
    }
}