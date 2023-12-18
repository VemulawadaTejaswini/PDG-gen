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
        ProblemE_Bichromization solver = new ProblemE_Bichromization();
        solver.solve(1, in, out);
        out.close();
    }

    static class ProblemE_Bichromization {
        Graph g;
        int[] d;
        char[] col;
        int[] edgeWeight;

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            d = new int[n];
            for (int i = 0; i < n; i++) {
                d[i] = in.nextInt();
            }
            g = new Graph(n);
            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                g.addEdge(a, b);
                g.addEdge(b, a);
            }

            int min = d[0];
            int max = d[0];
            for (int x : d) {
                min = Math.min(min, x);
                max = Math.max(max, x);
            }

            int v0 = -1;
            int v1 = -1;
            int e0 = -1;
            for (int i = 0; i < n; i++) {
                for (int e = g.firstEdge[i]; e >= 0; e = g.edgeNxt[e]) {
                    int j = g.edgeDst[e];
                    if (d[i] == min && d[j] == min) {
                        v0 = i;
                        v1 = j;
                        e0 = e;
                    }
                }
            }

            if (v0 < 0) {
                out.println(-1);
                return;
            }

            col = new char[n];
            Arrays.fill(col, 'X');
            edgeWeight = new int[m];
            Arrays.fill(edgeWeight, max);

            col[v0] = 'W';
            col[v1] = 'B';
            edgeWeight[e0 / 2] = d[v0];
            dfs(v0, d[v0]);
            dfs(v1, d[v0]);

            out.println(new String(col));
            for (int i = 0; i < m; i++) {
                out.println(edgeWeight[i]);
            }
        }

        private void dfs(int v, int x) {
            for (int e = g.firstEdge[v]; e >= 0; e = g.edgeNxt[e]) {
                int u = g.edgeDst[e];
                if (col[u] != 'X') {
                    continue;
                }
                int y = d[u];
                if (y > x) {
                    col[u] = col[v];
                    edgeWeight[e / 2] = y - x;
                    dfs(u, y);
                } else {
                    col[u] = (char) ('B' ^ 'W' ^ col[v]);
                    edgeWeight[e / 2] = y;
                    dfs(u, y);
                }
            }
        }

        class Graph {
            int[] firstEdge;
            int[] edgeNxt;
            int[] edgeDst;
            int numEdges;
            int n;

            Graph(int n) {
                this.n = n;
                firstEdge = new int[n];
                Arrays.fill(firstEdge, -1);
                final int initialCapacity = 10;
                edgeNxt = new int[initialCapacity];
                edgeDst = new int[initialCapacity];
                numEdges = 0;
            }

            void addEdge(int a, int b) {
                int e = numEdges++;
                if (e >= edgeNxt.length) {
                    reallocate();
                }
                edgeNxt[e] = firstEdge[a];
                edgeDst[e] = b;
                firstEdge[a] = e;
            }

            void reallocate() {
                int k = edgeNxt.length;
                k = 3 * k / 2;
                edgeNxt = Arrays.copyOf(edgeNxt, k);
                edgeDst = Arrays.copyOf(edgeDst, k);
            }

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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

