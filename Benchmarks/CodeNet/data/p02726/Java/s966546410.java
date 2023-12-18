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
        LinePlus solver = new LinePlus();
        solver.solve(1, in, out);
        out.close();
    }

    static class LinePlus {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();

            int[][] g = new int[n + 1][n + 1];

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    g[i][j] = (i == j) ? 0 : Integer.MAX_VALUE;
                }
            }
            for (int i = 1; i < n; i++) {
                g[i][i + 1] = 1;
                g[i + 1][i] = 1;
            }
            g[x][y] = 1;
            g[y][x] = 1;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (g[j][i] == Integer.MAX_VALUE) {
                        continue;
                    }
                    for (int k = 1; k <= n; k++) {
                        if (g[i][k] == Integer.MAX_VALUE) {
                            continue;
                        }
                        g[j][k] = Math.min(g[j][k], g[j][i] + g[i][k]);
                    }
                }
            }

            int[] result = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    result[g[i][j]]++;
                }
            }
            for (int i = 1; i < n; i++) {
                out.println(result[i]);
            }
        }

    }
}

