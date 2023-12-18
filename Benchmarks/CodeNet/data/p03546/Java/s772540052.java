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
        Wall solver = new Wall();
        solver.solve(1, in, out);
        out.close();
    }

    static class Wall {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();

            int[][] c = new int[10][10];
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    c[i][j] = Integer.parseInt(in.next());
                }
            }
            warshallFloyd(c);

            long result = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    int v = Integer.parseInt(in.next());
                    if (v == -1 || v == 1) {
                        continue;
                    }
                    result += c[v][1];
                }
            }
            out.println(result);

        }

        static void warshallFloyd(int[][] g) {
            int n = g.length;
            for (int k = 0; k < n; k++) {
                for (int i = 0; i < n; i++) {
                    if (g[i][k] == Integer.MAX_VALUE) {
                        continue;
                    }
                    for (int j = 0; j < n; j++) {
                        if (g[k][j] == Integer.MAX_VALUE) {
                            continue;
                        }
                        g[i][j] = Math.min(g[i][j], g[i][k] + g[k][j]);
                    }
                }
            }
        }

    }
}

