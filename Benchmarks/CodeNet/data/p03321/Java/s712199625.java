import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.Set;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author prakharjain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        arc099_c solver = new arc099_c();
        solver.solve(1, in, out);
        out.close();
    }

    static class arc099_c {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();

            int m = in.nextInt();

            List[] g = new List[n];

            for (int i = 0; i < n; i++) {
                g[i] = new ArrayList();
            }

            int[] u = new int[m];
            int[] v = new int[m];

            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;

                u[i] = a;
                v[i] = b;

                g[a].add(b);
                g[b].add(a);
            }

            int midDver = -1;
            int midD = 100000;

            for (int i = 0; i < n; i++) {
                if (g[i].size() < midD) {
                    midD = g[i].size();
                    midDver = i;
                }
            }

            Set<Integer> s = new HashSet<>();

            s.add(midDver);

            for (int ver : (List<Integer>) g[midDver]) {
                s.add(ver);
            }

            while (s.size() > 0) {
                int crossEdge = 0;
                int sub1Edge = 0;
                int sub2Edge = 0;

                int sub1Size = s.size();
                int sub2Size = n - sub1Size;
                int[] sub1Edges = new int[n];
                for (int i = 0; i < m; i++) {
                    if (s.contains(u[i]) && s.contains(v[i])) {
                        sub1Edge++;
                        sub1Edges[u[i]]++;
                        sub1Edges[v[i]]++;
                    } else if (s.contains(u[i])) {
                        crossEdge++;
                    } else if (s.contains(v[i])) {
                        crossEdge++;
                    } else {
                        sub2Edge++;
                    }
                }


                int clique1 = (sub1Size * (sub1Size - 1)) / 2;
                int clique2 = (sub2Size * (sub2Size - 1)) / 2;

                if (clique1 == sub1Edge && clique2 == sub2Edge) {
                    out.println(clique1 + clique2);
                    return;
                }

                int minDver = -1;
                int minD = 10000;

                for (int i = 0; i < n; i++) {
                    if (s.contains(i) && sub1Edges[i] < minD &&
                            sub1Edges[i] + sub2Size == g[i].size()) {
                        minD = sub1Edges[i];
                        minDver = i;
                    }
                }

                if (minDver == -1) {
                    out.println(-1);
                    return;
                }

                s.remove(minDver);
            }

            out.println(-1);
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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
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

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

