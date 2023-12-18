import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BalancedPath solver = new BalancedPath();
        solver.solve(1, in, out);
        out.close();
    }

    static class BalancedPath {
        int h;
        int w;
        int[][] a;
        int[][] b;
        long result = Long.MAX_VALUE;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            h = in.nextInt();
            w = in.nextInt();
            a = new int[h + 1][w + 1];
            b = new int[h + 1][w + 1];

            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= w; j++) {
                    a[i][j] = Integer.parseInt(in.next());
                }
            }
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= w; j++) {
                    b[i][j] = Integer.parseInt(in.next());
                }
            }

            // aを何色にするか
            recursive(1, 1, BalancedPath.Color.RED, 0, 0);
            recursive(1, 1, BalancedPath.Color.BLUE, 0, 0);
            out.println(result);

        }

        public void recursive(int x, int y, BalancedPath.Color color, long red, long blue) {
            if (x > w || y > h) {
                return;
            }
            if (color == BalancedPath.Color.RED) {
                red += a[y][x];
                blue += b[y][x];
            } else {
                red += b[y][x];
                blue += a[y][x];
            }
            if (x == w && y == h) {
                result = Math.min(Math.abs(red - blue), result);
            } else {
                recursive(x + 1, y, BalancedPath.Color.RED, red, blue);
                recursive(x + 1, y, BalancedPath.Color.BLUE, red, blue);
                recursive(x, y + 1, BalancedPath.Color.RED, red, blue);
                recursive(x, y + 1, BalancedPath.Color.BLUE, red, blue);
            }
        }

        public enum Color {
            RED,
            BLUE,
            ;
        }

    }
}

