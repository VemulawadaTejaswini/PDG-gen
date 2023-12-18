import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
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
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        ArrayList<Edge>[] g;
        ArrayList<Edge> edges = new ArrayList<>();
        boolean[] vis;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int nverts = in.nextInt();
            int nedges = in.nextInt();
            g = new ArrayList[nverts];
            for (int i = 0; i < nverts; i++) {
                g[i] = new ArrayList<>();
            }

            for (int i = 0; i < nedges; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                Edge e1 = new Edge(b, true);
                g[a].add(e1);
                Edge e2 = new Edge(a, true);
                g[b].add(e2);
                e1.reversed = e2;
                e2.reversed = e1;

                edges.add(e1);
            }

            int nbridges = 0;
            vis = new boolean[nverts];
            nextEdge:
            for (Edge e : edges) {
                Arrays.fill(vis, false);
                e.enabled = e.reversed.enabled = false;
                dfs(e.to);
                e.enabled = e.reversed.enabled = true;
                for (boolean f : vis) {
                    if (!f) {
                        nbridges++;
                        continue nextEdge;
                    }
                }
            }

            out.println(nbridges);
        }

        private void dfs(int v) {
            vis[v] = true;
            for (Edge e : g[v]) {
                if (e.enabled && !vis[e.to]) {
                    dfs(e.to);
                }
            }
        }

        class Edge {
            public int to;
            public boolean enabled;
            public Edge reversed;

            public Edge(int to, boolean enabled) {
                this.to = to;
                this.enabled = enabled;
            }

        }

    }

    static class InputReader {
        final InputStream is;
        final byte[] buffer = new byte[1024];
        int curCharIdx;
        int nChars;

        public InputReader(InputStream is) {
            this.is = is;
        }

        public int read() {
            if (curCharIdx >= nChars) {
                try {
                    curCharIdx = 0;
                    nChars = is.read(buffer);
                    if (nChars == -1) {
                        return -1;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return buffer[curCharIdx++];
        }

        public int nextInt() {
            int sign = 1;
            int c = skipDelims();
            if (c == '-') {
                sign = -1;
                c = read();
                if (isDelim(c)) {
                    throw new RuntimeException("Incorrect format");
                }
            }
            int val = 0;
            while (c != -1 && !isDelim(c)) {
                if (!isDigit(c)) {
                    throw new RuntimeException("Incorrect format");
                }
                val = 10 * val + (c - '0');
                c = read();
            }
            return val * sign;
        }

        private final int skipDelims() {
            int c = read();
            while (isDelim(c)) {
                c = read();
            }
            return c;
        }

        private static boolean isDelim(final int c) {
            return c == ' ' ||
                   c == '\n' ||
                   c == '\t' ||
                   c == '\r' ||
                   c == '\f';
        }

        private static boolean isDigit(final int c) {
            return '0' <= c && c <= '9';
        }

    }
}

