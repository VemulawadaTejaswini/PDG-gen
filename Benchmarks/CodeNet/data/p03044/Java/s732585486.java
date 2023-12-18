import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.Set;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author gaidash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        EvenRelation solver = new EvenRelation();
        solver.solve(1, in, out);
        out.close();
    }

    static class EvenRelation {
        private ArrayList<ArrayList<Integer>> edges;
        private HashMap<Set<Integer>, Integer> length = new HashMap<>();
        private int[] color;

        private void dfs(int par, int v) {
            for (int child : edges.get(v)) {
                if (child != par) {
                    int l = length.get(new HashSet<>(Arrays.asList(v, child)));
                    if ((l & 1) == 0) {
                        color[child] = color[v];
                    } else {
                        color[child] = color[v] ^ 1;
                    }
                    dfs(v, child);
                }
            }
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int nVertices = in.nextInt();
            edges = new ArrayList<>(nVertices + 1);
            for (int i = 0; i <= nVertices; i++) {
                edges.add(new ArrayList<>());
            }
            for (int i = 0; i < nVertices - 1; i++) {
                int u = in.nextInt();
                int v = in.nextInt();
                int l = in.nextInt();
                edges.get(u).add(v);
                edges.get(v).add(u);
                length.put(new HashSet<>(Arrays.asList(u, v)), l);
            }
            color = new int[nVertices + 1];
            color[1] = 0;
            dfs(0, 1);
            for (int i = 1; i <= nVertices; i++) {
                out.println(color[i]);
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

        public void println(int i) {
            writer.println(i);
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

