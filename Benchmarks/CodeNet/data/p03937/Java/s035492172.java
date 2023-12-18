import java.io.*;
import java.util.*;
 
public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;
 
    private void solve(Scanner sc, PrintWriter out) {
        int H = sc.nextInt();
        int W = sc.nextInt();
        sc.nextLine();
        char[][] A = new char[H][W];
        for (int i = 0; i < H; ++i) {
            String s = sc.nextLine();
            for (int j = 0; j < W; ++j) {
                A[i][j] = s.charAt(j);
            }
        }
 
        int cx = 0;
        int cy = 0;
        if (A[cy][cx] != '#') {
            out.println("Impossible");
            return;
        }
        while (cx + 1 < W || cy + 1 < H) {
            if (cy + 1 < H && A[cy + 1][cx] == '#'
            && cx + 1 < W && A[cy][cx + 1] == '#') {
                out.println("Impossible");
                return;
            } else if (cy > 0 && A[cy - 1][cx] == '#'
                || cx > 0 && A[cy][cx - 1] == '#') {
                out.println("Impossible");
                return;
            } else if (cy + 1 < H && A[cy + 1][cx] == '#') {
                A[cy][cx] = '$';
                ++cy;
            } else if (cx + 1 < W && A[cy][cx + 1] == '#') {
                A[cy][cx] = '$';
                ++cx;
            } else {
                out.println("Impossible");
                return;
            }
        }
        A[cy][cx] = '$';
 
        if (debug) {
            for (int i = 0; i < H; ++i) {
                for (int j = 0; j < W; ++j) {
                    System.err.print(A[i][j]);
                }
                System.err.println();
            }
        }
        for (int i = 0; i < H; ++i) {
            for (int j = 0; j < W; ++j) {
                if (A[i][j] == '#') {
                    out.println("Impossible");
                    return;
                }
            }
        }
 
        out.println("Possible");
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