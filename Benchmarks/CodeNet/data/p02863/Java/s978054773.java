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
import java.util.Comparator;
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
        EAllYouCanEat solver = new EAllYouCanEat();
        solver.solve(1, in, out);
        out.close();
    }

    static class EAllYouCanEat {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            // x
            int n = in.readInt();
            int t = in.readInt();
            List<Dish> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int a = in.readInt();
                int b = in.readInt();
                list.add(new Dish(a, b));
            }

            list.sort(Comparator.comparingInt(d -> d.a));

            long[] dp = new long[t];
            long sum = 0;
            long ans = 0;
            for (int i = 0; i < n; i++) {
                ans = Math.max(ans, sum + list.get(i).b);
                Dish d = list.get(i);
                for (int j = t - 1; j >= 0; j--) {
                    if (j + d.a < t) {
                        dp[j + d.a] = Math.max(dp[j + d.a], dp[j] + d.b);
                        sum = Math.max(sum, dp[j + d.a]);
                    }
                }
            }
            out.printLine(ans);
        }

        class Dish {
            int a;
            int b;

            public Dish(int a, int b) {
                this.a = a;
                this.b = b;
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

        public void printLine(long i) {
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
}

