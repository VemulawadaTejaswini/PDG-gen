import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
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
        DMatchMatching solver = new DMatchMatching();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMatchMatching {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();

            int m = in.nextInt();

            int[] a = in.nextIntArray(m);

            boolean[] p = new boolean[10];

            for (int i = 0; i < m; i++) {
                p[a[i]] = true;
            }

            int[] match = {0, 2
                    ,
                    5
                    ,
                    5
                    ,
                    4
                    ,
                    5
                    ,
                    6
                    ,
                    3
                    ,
                    7
                    ,
                    6};

            state[] dp = new state[n + 1];

            dp[0] = new state();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j < 10; j++) {
                    if (p[j] && i >= match[j] && dp[i - match[j]] != null) {
                        dp[i] = max(dp[i - match[j]].add(new state(j)), dp[i]);
                    }
                }
            }

            StringBuilder ans = new StringBuilder();
            for (int j = 9; j >= 1; j--) {
                char ch = (char) (j + '0');
                for (int i = 0; i < dp[n].val[j]; i++) {
                    ans.append(ch);
                }
            }

            out.println(ans);
        }

        state max(state s1, state s2) {
            if (s1 == null)
                return s2;

            if (s2 == null)
                return s1;
            int[] v1 = s1.val;
            int[] v2 = s2.val;

            int sum1 = 0;
            int sum2 = 0;

            for (int val : v1) {
                sum1 += val;
            }

            for (int val : v2) {
                sum2 += val;
            }

            if (sum1 > sum2) {
                return s1;
            } else if (sum2 > sum1) {
                return s2;
            } else {
                for (int j = 9; j > 0; j--) {
                    if (v1[j] > v2[j]) {
                        return s1;
                    } else if (v2[j] > v1[j]) {
                        return s2;
                    }
                }
                return s1;
            }
        }

        class state {
            int[] val = new int[10];

            public state(int num) {
                val[num] = 1;
            }

            public state(int[] val) {
                this.val = val;
            }

            public state() {
            }

            state add(state state) {
                state ns = new state(state.val);

                for (int j = 1; j < 10; j++) {
                    ns.val[j] += val[j];
                }

                return ns;
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

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; ++i) array[i] = nextInt();
            return array;
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
}

