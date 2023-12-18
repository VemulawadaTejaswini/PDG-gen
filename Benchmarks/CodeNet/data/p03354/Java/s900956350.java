import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DEquals solver = new DEquals();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEquals {
        int[] g;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();
            int[] p = new int[n];
            g = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = in.nextInt() - 1;
                g[i] = i;
            }
            for (int i = 0; i < m; i++) {
                g[group(in.nextInt() - 1)] = g[in.nextInt() - 1];
            }
            int c = 0;
            for (int i = 0; i < n; i++) {
                int q = p[i];
                if (group(i) == group(q)) {
                    c++;
                }
            }
            out.println(c);
        }

        int group(int i) {
            int j = g[i];
            return i == j ? j : (g[i] = group(j));
        }

    }
}

