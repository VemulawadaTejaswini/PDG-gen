import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.LinkedList;
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
        G solver = new G();
        solver.solve(1, in, out);
        out.close();
    }

    static class G {
        int[] dp;
        boolean[] used;
        List<GraphUtil.Edge>[] g;

        void dfs(int v) {
            for (GraphUtil.Edge e : g[v]) {
                int u = e.to;
                if (!used[u]) {
                    used[u] = true;
                    dfs(u);
                }
                dp[v] = Math.max(dp[v], dp[u] + 1);
            }
        }

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.ni(), m = in.ni();

            g = in.readEdgesGraph(n, m, false);
            dp = new int[n];
            used = new boolean[n];
            for (int i = 0; i < n; i++) {
                if (!used[i]) {
                    used[i] = true;
                    dfs(i);
                }
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                ans = Math.max(ans, dp[i]);
            }
            out.println(ans);
        }

    }

    static class GraphUtil {
        public static class Edge {
            public int from;
            public int to;
            public int id;
            public long w;

            public Edge(int from, int to) {
                this.from = from;
                this.to = to;
            }

            public Edge(int from, int to, int id) {
                this.from = from;
                this.to = to;
                this.id = id;
            }

            public Edge(int from, int to, int id, long w) {
                this.from = from;
                this.to = to;
                this.id = id;
                this.w = w;
            }

        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String ns() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int ni() {
            return Integer.parseInt(ns());
        }

        public List<GraphUtil.Edge>[] readEdgesGraph(int n, int m, boolean bidirected) {
            List<GraphUtil.Edge>[] g = new List[n];
            for (int i = 0; i < n; i++) {
                g[i] = new LinkedList<>();
            }
            for (int i = 0; i < m; i++) {
                int u = ni() - 1;
                int v = ni() - 1;
                g[u].add(new GraphUtil.Edge(u, v, i));
                if (bidirected)
                    g[v].add(new GraphUtil.Edge(v, u, i));
            }

            return g;
        }

    }
}

