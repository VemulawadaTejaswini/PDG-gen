import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            long x = in.nextLong();
            Edge[] edges = new Edge[m];
            for (int i = 0; i < m; i++) {
                edges[i] = new Edge();
                edges[i].a = in.nextInt() - 1;
                edges[i].b = in.nextInt() - 1;
                edges[i].c = in.nextInt();
            }

            final int MOD = (int) (1e9 + 7);
            int[] p2 = new int[m + 1];
            p2[0] = 1;
            for (int i = 1; i < p2.length; i++) {
                p2[i] = 2 * p2[i - 1] % MOD;
            }

            Arrays.sort(edges, (u, v) -> (u.c - v.c));
            DSU dsu = new DSU(n);
            long mstCost = 0;
            long heaviest = 0;
            for (Edge e : edges) {
                if (dsu.sameComp(e.a, e.b)) {
                    continue;
                }
                mstCost += e.c;
                heaviest = e.c;
                e.inMst = true;
                dsu.unite(e.a, e.b);
            }
            long ans = 0;
            if (mstCost == x) {
                ans = p2[m];
                ans -= p2[n - m + 1];
                ans %= MOD;
                ans -= p2[n - m + 1];
                ans %= MOD;
            }
            int t = m - n + 1;
            for (int i = 0; i < m; i++) {
                if (edges[i].inMst) {
                    continue;
                }
                --t;
                if (mstCost - heaviest + edges[i].c == x) {
                    ans += p2[t];
                    ans %= MOD;
                    ans += p2[t];
                    ans %= MOD;
                }
            }

            ans %= MOD;
            if (ans < 0) {
                ans += MOD;
            }
            out.println(ans);
        }

        class DSU {
            int[] p;
            int[] r;
            int numComps;

            DSU(int n) {
                p = new int[n];
                r = new int[n];
                for (int i = 0; i < n; i++) {
                    p[i] = i;
                }
                numComps = n;
            }

            int findComp(int x) {
                if (x == p[x]) {
                    return x;
                }
                return p[x] = findComp(p[x]);
            }

            boolean sameComp(int a, int b) {
                return findComp(a) == findComp(b);
            }

            void unite(int a, int b) {
                a = findComp(a);
                b = findComp(b);
                if (a == b) {
                    return;
                }
                --numComps;
                if (r[a] < r[b]) {
                    p[a] = b;
                } else {
                    p[b] = a;
                    if (r[a] == r[b]) {
                        ++r[a];
                    }
                }
            }

        }

        class Edge {
            int a;
            int b;
            int c;
            boolean inMst;

        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(in.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

