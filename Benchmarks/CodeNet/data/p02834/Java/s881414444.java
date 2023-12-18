import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.Reader;
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
        MyInput in = new MyInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskAA solver = new TaskAA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskAA {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;

            SimpleAdjListGraph g = new SimpleAdjListGraph(n);
            for (int i = 0; i < n - 1; i++) {
                int s = in.nextInt() - 1;
                int t = in.nextInt() - 1;
                g.addEdge(s, t);
                g.addEdge(t, s);
            }

            int[] d0 = g.bfs(u)[0];
            int[] d1 = g.bfs(v)[0];

            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (d0[i] < d1[i]) {
                    ans = Math.max(ans, d1[i]);
                }
            }

            out.println(ans - 1);
        }

        class SimpleAdjListGraph {
            int m;
            int V;
            int E;
            int[] head;
            int[] next;
            int[] to;

            public SimpleAdjListGraph(int V) {
                this.V = V;
                this.E = V;
                head = new int[V];
                next = new int[E];
                to = new int[E];
                clear();
            }

            public void clear() {
                m = 0;
                Arrays.fill(head, -1);
            }

            public void addEdge(int s, int t) {
                if (m == next.length) {
                    int[] tmp = new int[Math.max(next.length + 5, next.length * 3 / 2)];
                    System.arraycopy(next, 0, tmp, 0, next.length);
                    next = tmp.clone();
                    System.arraycopy(to, 0, tmp, 0, to.length);
                    to = tmp;
                }

                next[m] = head[s];
                head[s] = m;
                to[m++] = t;
            }

            public int[][] bfs(final int src) {
                final int[] dist = new int[head.length];
                final int[] prev = new int[head.length];
                final int[] q = new int[2 * head.length + 10];
                int s = 0, t = 0;

                Arrays.fill(dist, -1);
                Arrays.fill(prev, -1);
                dist[src] = 0;
                q[t++] = src;
                while (s != t) {
                    final int v = q[s++];
                    for (int e = head[v]; e != -1; e = next[e]) {
                        final int u = to[e];
                        if (dist[u] == -1) {
                            dist[u] = dist[v] + 1;
                            prev[u] = v;
                            q[t++] = u;
                        }
                    }
                }
                return new int[][]{dist, prev};
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

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

