import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        ArrayList<Integer> g[];
        boolean[] u;

        P dfs(int x) {
            P r = new P(1, 0);
            u[x] = true;
            for (int y : g[x]) {
                r.e++;
                if (!u[y]) {
                    P q = dfs(y);
                    r.v += q.v;
                    r.e += q.e;
                }
            }
            return r;
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            g = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                g[i] = new ArrayList<>();
            }

            int[] deg = new int[n];
            for (int i = 0; i < m; i++) {
                int x = in.nextInt() - 1;
                int y = in.nextInt() - 1;
                g[x].add(y);
                g[y].add(x);
                deg[x]++;
                deg[y]++;
            }

            for (int i = 0; i < n; i++) {
                if (deg[i] % 2 != 0) {
                    out.println("No");
                    return;
                }
            }

            int nc = 0;
            int gc = 0;
            int bc = 0;
            u = new boolean[n];
            for (int i = 0; i < n; i++) {
                if (!u[i] && deg[i] != 0) {
                    P p = dfs(i);
                    nc++;
                    if (p.e > 2 * p.v) {
                        gc++;
                    }
                    if (p.e > 2 * p.v + 2) {
                        bc++;
                    }
                }
            }
            if (nc > 3 || nc == 2 && gc == 0 || nc == 1 && bc == 0) {
                out.println("No");
                return;
            }

            out.println("Yes");
        }

        class P {
            int v;
            int e;

            public P(int v, int e) {
                this.v = v;
                this.e = e;
            }

        }

    }
}

