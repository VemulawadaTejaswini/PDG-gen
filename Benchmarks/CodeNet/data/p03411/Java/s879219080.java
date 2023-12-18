import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Optional;
import java.io.BufferedReader;
import java.util.Comparator;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int[][] red = in.nextIntArray2D(n, 2);
            int[][] blue = in.nextIntArray2D(n, 2);

            int S = 2 * n, T = S + 1;
            PushRelabelBaseMaxFlow flow = new PushRelabelBaseMaxFlow(T + 1);
            for (int i = 0; i < n; i++) {
                flow.addEdge(S, i, 1);
                flow.addEdge(i + n, T, 1);
                for (int j = 0; j < n; j++) {
                    if (red[i][0] < blue[j][0] && red[i][1] < blue[j][1]) {
                        flow.addEdge(i, j + n, 1);
                    }
                }
            }

            out.println(flow.relabelToFront(S, T));
        }

        public class PushRelabelBaseMaxFlow {
            int V;
            Vertex[] vertices;

            public PushRelabelBaseMaxFlow(int V) {
                this.V = V;
                vertices = new Vertex[V];
                for (int i = 0; i < V; i++) vertices[i] = new Vertex(i);
            }

            public void addEdge(int s, int t, int cap) {
                Edge e1 = new Edge(vertices[s], vertices[t], cap);
                Edge e2 = new Edge(vertices[t], vertices[s], 0);
                e1.rev = e2;
                e2.rev = e1;
            }

            void initializePreflow(Vertex S) {
                for (Vertex v : vertices) {
                    v.clear();
                }
                S.height = V;
                for (Edge e : S.edges) {
                    e.v.excessFlow += e.capacity;
                    e.u.excessFlow -= e.capacity;
                    e.rev.capacity += e.capacity;
                    e.capacity = 0;
                }
            }

            long relabelToFront(int s, int t) {
                initializePreflow(vertices[s]);
                Vertex[] L = new Vertex[V - 1];
                for (int i = 0, j = 0; i < V; i++) {
                    if (i != s && i != t) L[j++] = vertices[i];
                }

                int i = 0;
                Vertex cur = L[i];
                while (cur != null) {
                    int h0 = cur.height;
                    cur.discharge();
                    if (cur.height > h0) {
                        L[i = 0] = cur;
                    }
                    Vertex tmp = L[++i];
                    L[i] = cur;
                    cur = tmp;
                }

                return vertices[t].excessFlow;
            }

            class Edge {
                Vertex u;
                Vertex v;
                Edge rev;
                long capacity;

                public Edge(Vertex s, Vertex t, long cap) {
                    u = s;
                    v = t;
                    capacity = cap;
                    s.edges.add(this);
                }

                boolean canPush() {
                    return capacity > 0 && u.height == v.height + 1 && u.isOverflow();
                }

                void push() {
                    final long f = Math.min(u.excessFlow, capacity);
                    capacity -= f;
                    rev.capacity += f;
                    u.excessFlow -= f;
                    v.excessFlow += f;
                }


                public String toString() {
                    return String.format("[Edge u=%d(%d), v=%d(%d), c=%d]", u.id, u.height, v.id, v.height, capacity);
                }

            }

            class Vertex {
                final int id;
                int height;
                long excessFlow;
                List<Edge> edges = new ArrayList<>();

                public Vertex(int id) {
                    this.id = id;
                }

                void clear() {
                    height = 0;
                    excessFlow = 0;
                }

                boolean isOverflow() {
                    return excessFlow > 0;
                }

                void relabel() {
                    final int h = edges.stream().filter(e -> e.capacity > 0)
                            .map(a -> a.v.height)
                            .min(Comparator.naturalOrder())
                            .get();
                    if (!isOverflow() || height > h) {
                        throw new RuntimeException();
                    }
                    height = h + 1;
                }

                void discharge() {
                    while (isOverflow()) {
                        for (Edge e : edges) {
                            while (e.canPush()) e.push();
                            if (!isOverflow()) return;
                        }
                        relabel();
                    }
                }


                public String toString() {
                    return String.format("[Vertex id=%d, h=%d, ex=%d, es=%s]", id, height, excessFlow, edges);
                }

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

