import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.util.HashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        OutputWriter out = new OutputWriter(outputStream);
        DKi solver = new DKi();
        solver.solve(1, in, out);
        out.close();
    }

    static class DKi {
        static int arr[];
        static int ans[];
        static boolean marked[];

        static void depth(DKi.Graph g, int n) {
            for (int i = 1; i <= n; i++) {
                if (!marked[i])
                    dfs(g, arr[i], i);
            }
        }

        static void dfs(DKi.Graph g, int val, int s) {
            marked[s] = true;
            ans[s] = val;
            for (int w : g.adj(s)) {
                if (!marked[w]) {
                    dfs(g, val + arr[w], w);
                }
            }
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            int q = in.nextInt();
            int nn = n - 1;
            arr = new int[n + 1];
            DKi.Graph g = new DKi.Graph(n);
            while (nn-- > 0) {
                g.addEdge(in.nextInt(), in.nextInt());
            }
            while (q-- > 0) {
                int p = in.nextInt();
                arr[p] += in.nextInt();
            }
            ans = new int[n + 1];
            marked = new boolean[n + 1];
            depth(g, n);
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; i++)
                sb.append(ans[i]).append(" ");
            out.println(sb.toString());
        }

        static class Graph {
            HashMap<Integer, List<Integer>> map;

            public Graph(int n) {
                map = new HashMap<>();
                for (int i = 1; i <= n; i++)
                    map.put(i, new ArrayList<>());
            }

            public void addEdge(int a, int b) {
                map.get(a).add(b);
                map.get(b).add(a);
            }

            public List<Integer> adj(int v) {
                return map.get(v);
            }

        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void println(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

