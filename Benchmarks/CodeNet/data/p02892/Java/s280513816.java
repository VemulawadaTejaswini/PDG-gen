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
        BGraphPartition solver = new BGraphPartition();
        solver.solve(1, in, out);
        out.close();
    }

    static class BGraphPartition {
        int n;
        boolean[][] a;
        int[] ind;

        int bfs(int u) {
            ind[u] = 1;
            int[] q = new int[n];
            int h = 0, t = 1;
            q[h] = u;
            int ans = 1;
            while (h < t) {
                u = q[h++];
                for (int v = 0; v < n; v++) {
                    if (a[u][v]) {
                        if (ind[v] != 0 && ind[v] != ind[u] - 1 && ind[v] != ind[u] + 1) {
                            return -1;
                        }
                        if (ind[v] == 0) {
                            q[t++] = v;
                            ind[v] = ind[u] + 1;
                            ans = ind[v];
                        }
                    }
                }
            }
            return ans;
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            n = in.nextInt();
            a = new boolean[n][n];
            for (int i = 0; i < n; i++) {
                String s = in.next();
                for (int j = 0; j < n; j++) {
                    a[i][j] = s.charAt(j) == '1';
                }
            }

            int ans = -1;
            for (int i = 0; i < n; i++) {
                ind = new int[n];
                int k = bfs(i);
                if (k > ans) {
                    ans = k;
                }
            }
            out.println(ans);
        }

    }
}

