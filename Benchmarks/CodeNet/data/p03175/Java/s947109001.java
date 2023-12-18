import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
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
        PIndependentSet solver = new PIndependentSet();
        solver.solve(1, in, out);
        out.close();
    }

    static class PIndependentSet {
        private final int MOD = (int) 1e9 + 7;
        private final int WHITE = 0;
        private final int BLACK = 1;
        private int[][] dp;

        private void addEdge(Vertex u, Vertex v) {
            v.outgo.add(new Edge(u));
            u.outgo.add(new Edge(v));
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            Vertex[] vs = new Vertex[n + 1];
            for (int i = 1; i <= n; i++) vs[i] = new Vertex(i);
            for (int i = 0; i < n - 1; i++) addEdge(vs[in.nextInt()], vs[in.nextInt()]);

            dp = new int[2][n + 1];
            for (int i = 1; i <= n; i++) dp[0][i] = dp[1][i] = 1;
            vs[1].dfs(0, vs[1]);

            out.println((dp[0][1] + dp[1][1]) % MOD);
        }

        private class Vertex {
            private int index;
            private ArrayList<Edge> outgo = new ArrayList<>();

            private Vertex(int index) {
                this.index = index;
            }

            private void dfs(int par, Vertex v) {
                for (Edge e : v.outgo) {
                    if (e.dest.index == par) continue;
                    dfs(v.index, e.dest);
                    dp[WHITE][v.index] = (int) ((long) dp[WHITE][v.index] * (dp[WHITE][e.dest.index] + dp[BLACK][e.dest.index])) % MOD;
                    dp[BLACK][v.index] = (int) ((long) dp[BLACK][v.index] * dp[WHITE][e.dest.index]) % MOD;
                }
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(index).append(" -> (");
                for (Edge e : outgo) sb.append(e.dest.index).append(" ");
                sb.deleteCharAt(sb.length() - 1);
                sb.append(')');
                return sb.toString();
            }

        }

        private class Edge {
            private Vertex dest;

            private Edge(Vertex dest) {
                this.dest = dest;
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

