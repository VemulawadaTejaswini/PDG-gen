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
import java.util.ArrayDeque;
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
        GLongestPath solver = new GLongestPath();
        solver.solve(1, in, out);
        out.close();
    }

    static class GLongestPath {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            List[] to = new List[n];
            Set[] from = new Set[n];
            List[] from2 = new List[n];

            for (int i = 0; i < n; i++) {
                to[i] = new ArrayList();
                from[i] = new HashSet();
                from2[i] = new ArrayList();
            }

            for (int i = 0; i < m; i++) {
                int x = in.nextInt();
                int y = in.nextInt();

                x--;
                y--;

                from[y].add(x);
                from2[y].add(x);
                to[x].add(y);
            }

            ArrayDeque<Integer> q = new ArrayDeque<>();

            for (int i = 0; i < n; i++) {
                if (from[i].isEmpty()) {
                    q.addLast(i);
                }
            }

            int[] dp = new int[n];

            int ans = 0;

            while (!q.isEmpty()) {
                int pe = q.removeFirst();

                List<Integer> cl = to[pe];
                for (int i = 0; i < cl.size(); i++) {
                    int ce = cl.get(i);

                    from[ce].remove(pe);

                    if (from[ce].isEmpty()) {
                        List<Integer> fl = from2[ce];

                        for (int j = 0; j < fl.size(); j++) {
                            dp[ce] = Math.max(dp[ce], dp[fl.get(j)] + 1);
                        }
                        ans = Math.max(ans, dp[ce]);
                        q.addLast(ce);
                    }
                }
            }

            out.println(ans);
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
}

