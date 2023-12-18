import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyInput in = new MyInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        int n;
        int m;
        int[][] es;
        long[][] val;
        int[][] sign;
        boolean ng;
        boolean[] vis;
        Graph g;
        static final long inf = Long.MAX_VALUE / 4;

        public void solve(int testNumber, MyInput in, PrintWriter out) {
            n = in.nextInt();
            m = in.nextInt();
            es = in.nextIntArray2D(m, 3);

            g = new Graph(n);
            g.fromEdges(es, true);

            vis = new boolean[n];
            sign = new int[n][2];
            val = new long[n][2];
            for (long[] v : val) Arrays.fill(v, inf);
            dfs(0, 0, 0);
            long min = -inf;
            long max = inf;
            for (int i = 0; i < n; i++) {
                if (sign[i][1] != 0) {
                    int ds = sign[i][1] - sign[i][0];
                    if ((val[i][1] - val[i][0]) % ds != 0) {
                        ng = true;
                    }
                    long v = -(val[i][1] - val[i][0]) / ds;
                    min = Math.max(min, v);
                    max = Math.min(max, v);
//                    dump("come", val[i][0], val[i][1], v);
                }
                if (sign[i][0] > 0) {
                    min = Math.max(min, -sign[i][0] * val[i][0] + 1);
                } else {
                    max = Math.min(max, -sign[i][0] * val[i][0] - 1);
                }
            }
//        dump(min, max);
//        for (int i = 0; i < n; i++) {
//            dump(i, val[i]);
//        }
            if (ng || max < min) {
                out.println(0);
            } else {
                out.println(max - min + 1);
            }
        }

        void dfs(int v, long s, int d) {
//        dump(v, p, sum);
            final int ss = 1 - d % 2 * 2;
            int idx = 0;
            if (sign[v][0] == ss || sign[v][0] == 0) {
                idx = 0;
            } else {
                idx = 1;
            }

            if (sign[v][idx] != 0 && val[v][idx] != s) {
                ng = true;
                return;
            }

            sign[v][idx] = ss;
            val[v][idx] = s;
            if (vis[v]) {
                return;
            }
            vis[v] = true;
            for (Edge e : g.vertex[v].edges) {
                dfs(e.to, e.cost - s, d + 1);
            }
//        dump(v, p, d, res.low, res.high);
        }

        class Edge {
            public final int edgeId;
            public final int to;
            public long cost;

            public Edge(int to, long cost, int edgeId) {
                this.to = to;
                this.cost = cost;
                this.edgeId = edgeId;
            }


            public String toString() {
                return String.format("[Edge id=%d, to=%d, cost=%d]", edgeId, to, cost);
            }

        }

        class Vertex {
            public final int id;
            public final List<Edge> edges = new ArrayList<>();

            public Vertex(final int id) {
                this.id = id;
            }

            public void addEdge(Edge e) {
                edges.add(e);
            }

        }

        class Graph {
            int V;
            int E;
            Vertex[] vertex;

            public Graph(int V) {
                this.V = V;
                this.E = 0;
                vertex = new Vertex[V];
                for (int i = 0; i < V; i++) vertex[i] = new Vertex(i);
            }

            public void fromEdges(int[][] edges, boolean bidirectional) {
                addEdges(bidirectional, edges);
            }

            public void addEdges(boolean bidirectional, int[]... edges) {
                for (int[] e : edges) {
                    int s = e[0] - 1, t = e[1] - 1;
                    long cost = e.length < 3 ? 0 : e[2];
                    final int eid = this.E++;
                    this.addEdge(s, t, cost, eid);
                    if (bidirectional) this.addEdge(t, s, cost, eid);
                }
            }

            public void addEdge(int s, int t, long c, int edgeId) {
                vertex[s].addEdge(new Edge(t, c, edgeId));
            }

        }

    }

    static class MyInput {
        private final BufferedReader in;
        private static int pos;
        private static int readLen;
        private static final char[] buffer = new char[1024 * 8];
        private static char[] str = new char[500 * 8 * 2];
        private static boolean[] isDigit = new boolean[256];
        private static boolean[] isSpace = new boolean[256];
        private static boolean[] isLineSep = new boolean[256];

        static {
            for (int i = 0; i < 10; i++) {
                isDigit['0' + i] = true;
            }
            isDigit['-'] = true;
            isSpace[' '] = isSpace['\r'] = isSpace['\n'] = isSpace['\t'] = true;
            isLineSep['\r'] = isLineSep['\n'] = true;
        }

        public MyInput(InputStream is) {
            in = new BufferedReader(new InputStreamReader(is));
        }

        public int read() {
            if (pos >= readLen) {
                pos = 0;
                try {
                    readLen = in.read(buffer);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (readLen <= 0) {
                    throw new MyInput.EndOfFileRuntimeException();
                }
            }
            return buffer[pos++];
        }

        public int nextInt() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            int ret = 0;
            if (str[0] == '-') {
                i = 1;
            }
            for (; i < len; i++) ret = ret * 10 + str[i] - '0';
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }

        public char nextChar() {
            while (true) {
                final int c = read();
                if (!isSpace[c]) {
                    return (char) c;
                }
            }
        }

        int reads(int len, boolean[] accept) {
            try {
                while (true) {
                    final int c = read();
                    if (accept[c]) {
                        break;
                    }
                    if (str.length == len) {
                        char[] rep = new char[str.length * 3 / 2];
                        System.arraycopy(str, 0, rep, 0, str.length);
                        str = rep;
                    }
                    str[len++] = (char) c;
                }
            } catch (MyInput.EndOfFileRuntimeException e) {
            }
            return len;
        }

        public int[] nextIntArray(final int n) {
            final int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        public int[][] nextIntArray2D(final int n, final int k) {
            final int[][] res = new int[n][];
            for (int i = 0; i < n; i++) {
                res[i] = nextIntArray(k);
            }
            return res;
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

