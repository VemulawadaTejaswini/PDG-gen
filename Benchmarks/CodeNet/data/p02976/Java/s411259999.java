import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        B_EvenDegrees solver = new B_EvenDegrees();
        solver.solve(1, in, out);
        out.close();
    }

    static class B_EvenDegrees {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            List<Edge>[] adj = new List[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
            }
            Edge[] edges = new Edge[m];
            for (int i = 0; i < m; i++) {
                Edge e = new Edge();
                e.a = in.nextInt() - 1;
                e.b = in.nextInt() - 1;
                adj[e.a].add(e);
                adj[e.b].add(e);
                edges[i] = e;
            }

            for (int i = 0; i < n; i++) {
                for (int j = adj[i].size() % 2; j < adj[i].size(); j++) {
                    Edge e = adj[i].get(j);
                    e.flipUsed(i);
                }
            }

            for (int i = 0; i < n; i++) {
                List<Edge> usedFromBoth = new ArrayList<>();
                List<Edge> unused = new ArrayList<>();
                for (Edge e : adj[i]) {
                    if (e.usedFromA && e.usedFromB) {
                        usedFromBoth.add(e);
                    }
                    if (!e.usedFromA && !e.usedFromB) {
                        unused.add(e);
                    }
                }
                while (usedFromBoth.size() > 1) {
                    Edge e1 = usedFromBoth.get(usedFromBoth.size() - 1);
                    usedFromBoth.remove(usedFromBoth.size() - 1);
                    Edge e2 = usedFromBoth.get(usedFromBoth.size() - 1);
                    usedFromBoth.remove(usedFromBoth.size() - 1);
                    e1.flipUsed(i);
                    e2.flipUsed(i);
                }
                if (!usedFromBoth.isEmpty() && !unused.isEmpty()) {
                    usedFromBoth.get(0).flipUsed(i);
                    unused.get(0).flipUsed(i);
                }
            }
            for (Edge e : edges) {
                if (e.usedFromA == e.usedFromB) {
                    out.println(-1);
                    return;
                }
            }
            for (Edge e : edges) {
                out.println(e);
            }
        }

        class Edge {
            int a;
            int b;
            boolean usedFromA;
            boolean usedFromB;

            void flipUsed(int i) {
                if (i == a) {
                    usedFromA ^= true;
                } else {
                    usedFromB ^= true;
                }
            }

            public String toString() {
                if (usedFromA) {
                    return (a + 1) + " " + (b + 1);
                } else {
                    return (b + 1) + " " + (a + 1);
                }
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

