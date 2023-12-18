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
        DDigitsParade solver = new DDigitsParade();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDigitsParade {
        static long mod = 1000000007;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            String s = in.nextString();
            int n = s.length();
            long dp[][] = new long[n][13];
            char ar[] = s.toCharArray();
            if (ar[0] != '?') {
                dp[0][Integer.parseInt("" + ar[0])] = 1;
            } else {
                for (int i = 0; i <= 9; i++)
                    dp[0][i] = 1;
            }
            for (int i = 1; i < n; i++) {
                if (ar[i] != '?') {
                    int c = Integer.parseInt("" + ar[i]);
                    for (int j = 0; j <= 12; j++) {
                        long sum = (j * 10) + c;
                        long rem = sum % 13;
                        dp[i][(int) rem] += dp[i - 1][j] % mod;
                        dp[i][(int) rem] %= mod;
                    }
                } else {
                    for (int c = 0; c <= 9; c++) {
                        for (int j = 0; j <= 12; j++) {
                            long sum = (j * 10) + c;
                            long rem = sum % 13;
                            dp[i][(int) rem] += dp[i - 1][j] % mod;
                            dp[i][(int) rem] %= mod;
                        }
                    }
                }

            }
            out.println(dp[n - 1][5]);
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

        public String nextString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
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

