import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
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
        OutputWriter out = new OutputWriter(outputStream);
        DColoringEdgesOnTree solver = new DColoringEdgesOnTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class DColoringEdgesOnTree {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            int[] a = new int[n - 1];
            int[] b = new int[n - 1];
            in.readIntArrays(a, b);
            MiscUtils.decreaseByOne(a, b);

            List<List<Edge>> g = new ArrayList<>();
            for (int i = 0; i < n; i++) g.add(new ArrayList<>());
            int[] cnt = new int[n];
            for (int i = 0; i < n - 1; i++) {
                g.get(a[i]).add(new Edge(b[i], i));
                g.get(b[i]).add(new Edge(a[i], i));
                cnt[a[i]]++;
                cnt[b[i]]++;
            }
            int m = 0;
            for (int i = 0; i < n; i++) m = Math.max(m, cnt[i]);

            int[] color = new int[n - 1];
            dfs(0, -1, -1, color, g);

            out.printLine(m);
            for (int i = 0; i < n - 1; i++) {
                out.printLine(color[i] + 1);
            }
        }

        void dfs(int x, int p, int c, int[] color, List<List<Edge>> g) {
            int idx = 0;
            for (Edge e : g.get(x)) {
                if (e.to == p) continue;
                if (idx == c) idx++;
                color[e.i] = idx;
                dfs(e.to, x, idx, color, g);
                idx++;
            }
        }

        class Edge {
            int to;
            int i;

            public Edge(int to, int i) {
                this.to = to;
                this.i = i;
            }

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

        public void readIntArrays(int[]... arrays) {
            for (int i = 0; i < arrays[0].length; i++) {
                for (int j = 0; j < arrays.length; j++) {
                    arrays[j][i] = readInt();
                }
            }
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

        public int readInt() {
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

    static class MiscUtils {
        public static void decreaseByOne(int[]... arrays) {
            for (int[] array : arrays) {
                for (int i = 0; i < array.length; i++) {
                    array[i]--;
                }
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

        public void close() {
            writer.close();
        }

        public void printLine(int i) {
            writer.println(i);
        }

    }
}

