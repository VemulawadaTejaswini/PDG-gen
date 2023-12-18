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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        EKnapsack2Recursive solver = new EKnapsack2Recursive();
        solver.solve(1, in, out);
        out.close();
    }

    static class EKnapsack2Recursive {
        long N;
        long maxValue;
        long ans = 0;
        long[][] items;
        long[][] memo;
        long W;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int ntc = 1;
//        ntc = in.nextInt();
            while ((ntc--) > 0) {
                N = in.nextInt();
                W = in.nextInt();
                maxValue = 1000L * N + 1;
                items = new long[(int) N + 1][2];
                memo = new long[(int) N + 1][(int) maxValue + 1];
                for (int i = 0; i < N + 1; i++) {
                    for (int j = 0; j < maxValue + 1; j++) {
                        memo[i][j] = -1;
                    }
                }
                for (int i = 1; i < N + 1; i++) {
                    for (int j = 0; j < 2; j++) {
                        items[i][j] = in.nextInt();
                    }
                }
                findMinWeightForValueV(0, 0, 0);
                out.println(ans);
            }
        }

        public long findMinWeightForValueV(long n, long v, long minWeight) {
            if (minWeight <= W) {
                ans = _F.max(ans, v);
            }
            if (n > N) return 0;
            if (memo[(int) n][(int) v] != -1) {
                return memo[(int) n][(int) v];
            }
            memo[(int) n][(int) v] = _F.min(findMinWeightForValueV(n + 1, v, minWeight), findMinWeightForValueV(n + 1, v + items[(int) n][1], minWeight + items[(int) n][0]));
            return memo[(int) n][(int) v];
        }

    }

    static class _F {
        public static <T extends Comparable<T>> T max(T... list) {
            T candidate = list[0];
            for (T i : list) {
                if (candidate.compareTo(i) < 0) {
                    candidate = i;
                }
            }
            return candidate;
        }

        public static <T extends Comparable<T>> T min(T... list) {
            T candidate = list[0];
            for (T i : list) {
                if (candidate.compareTo(i) > 0) {
                    candidate = i;
                }
            }
            return candidate;
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

        public void println(long i) {
            writer.println(i);
        }

    }
}

