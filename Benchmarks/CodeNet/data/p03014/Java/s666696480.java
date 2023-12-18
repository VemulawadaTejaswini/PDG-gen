import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;
    public static void main(String[] args) {
        int H = ni();
        int W = ni();
        
        char[][] g = new char[H+2][W+2];
        for (int h = 1; h <= H; h++) {
            String s = ns();
            for (int w = 1; w <= W; w++) {
                g[h][w] = s.charAt(w-1);
            }
        }

        int[][] L = new int[H+2][W+2];
        int[][] R = new int[H+2][W+2];
        int[][] U = new int[H+2][W+2];
        int[][] D = new int[H+2][W+2];

        for (int h = 1; h <= H; h++) {
            for (int w = 1; w <= W; w++) {
                L[h][w] = g[h][w] == '#' ? 0 : L[h][w-1] + 1;
            }
            for (int w = W; w >= 1; w--) {
                R[h][w] = g[h][w] == '#' ? 0 : R[h][w+1] + 1;
            }
        }
        
        for (int w = 1; w <= W; w++) {
            for (int h = 1; h <= H; h++) {
                U[h][w] = g[h][w] == '#' ? 0 : U[h-1][w] + 1;
            }
            for (int h = H; h >= 1; h--) {
                D[h][w] = g[h][w] == '#' ? 0 : D[h+1][w] + 1;
            }
        }

        int maxCount = 0;
        for (int h = 0; h < H; h++) {
            for (int w = 0; w < W; w++) {
                if (g[h][w] == '#') continue;
                int temp = L[h][w] + R[h][w] + U[h][w] + D[h][w] - 3;
                maxCount = Math.max(maxCount, temp);
            }
        }
        so.println(maxCount);
    }

    private static long nl() {
        return sc.nextLong();
    }

    private static int ni() {
        return sc.nextInt();
    }

    private static String ns() {
        return sc.next();
    }

    private static char[] nsToChars() {
        return sc.next().toCharArray();
    }

    private static long[] nlongs(int n) {
        return nlongs(n, 0);
    }
    private static int[] nints(int n) {
        return nints(n, 0);
    }

    private static long[] nlongs(int n, int offset) {
        long[] a = new long[offset + n];
        for (int i = 0; i < n; i++)
            a[offset + i] = nl();
        return a;
    }

    private static int[] nints(int n, int offset) {
        int[] a = new int[offset + n];
        for (int i = 0; i < n; i++)
            a[offset + i] = ni();
        return a;
    }
}
