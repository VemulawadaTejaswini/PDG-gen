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
        TPermutation solver = new TPermutation();
        solver.solve(1, in, out);
        out.close();
    }

    static class TPermutation {
        int mod = 1000000007;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();

            String s = in.next();

            long[][] dp = new long[n][n + 1];

            for (int i = 1; i <= n; i++) {
                dp[0][i] = 1;
            }

            for (int i = 1; i < n; i++) {
                int max = n - i + 1;

                long[] suf = in.calculateSuffixSum(dp[i - 1], mod);
                long[] pre = in.calculatePrefixSum(dp[i - 1], mod);

                for (int j = 1; j <= max; j++) {
                    if (s.charAt(i - 1) == '>') {
                        if (j < max)
                            dp[i][j] = suf[j + 1];
                    } else {
                        if (j > 1)
                            dp[i][j - 1] = pre[j - 1];
                    }
                }
            }

            out.println(dp[n - 1][1]);

//        List<ele> l = new ArrayList<>();
//
//        int cc = 0;
//        for (int i = 0; i < n - 1; i++) {
//            if (i > 0 && s.charAt(i - 1) != s.charAt(i)) {
//                l.add(new ele(s.charAt(i - 1), cc));
//                cc = 1;
//            } else {
//                cc++;
//            }
//        }
//
//        l.add(new ele(s.charAt(n - 2), cc));
//
//        long ans = 1;
//
//        ele ne = l.get(0);
//        ele ce = new ele('<', 1);
//
//        int[][] ncr = nCr(n, n, mod);
//
//        int dc = 0;
//        int nei = 0;
//        do {
//            int rc = n - dc;
//
//            long ca = 0;
//            if (ce.ch == '<') {
//                for (int i = 1; i <= rc; i++) {
//                    int lessc = i - 1;
//
//                    if (lessc >= ce.cn - 1 + ne.cn) {
//                        ca += ncr[lessc][ce.cn - 1];
//                        ca %= mod;
//                    }
//                }
//            } else {
//                for (int i = rc; i >= 1; i--) {
//                    int morec = rc - i;
//
//                    if (morec >= ce.cn - 1 + ne.cn) {
//                        ca += ncr[morec][ce.cn - 1];
//                        ca %= mod;
//                    }
//                }
//            }
//
//            dc += ce.cn;
//
//            ans *= ca;
//            ans %= mod;
//
//            ce = ne;
//            nei++;
//            if (nei < l.size()) {
//                ne = l.get(nei);
//            } else {
//                ne = null;
//            }
//
//        } while (ne != null);
//
//        out.println(ans);
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

        public String next() {
            return nextString();
        }

        public long[] calculatePrefixSum(long[] a, long mod) {
            int n = a.length;

            long[] prefixSum = new long[n];

            prefixSum[0] = a[0] % mod;

            for (int i = 1; i < n; i++) {
                prefixSum[i] = prefixSum[i - 1] + a[i];
                prefixSum[i] %= mod;
            }

            return prefixSum;
        }

        public long[] calculateSuffixSum(long[] a, int mod) {
            int n = a.length;

            long[] suffixSum = new long[n];

            suffixSum[n - 1] = a[n - 1];

            for (int i = n - 2; i >= 0; i--) {
                suffixSum[i] = suffixSum[i + 1] + a[i];
                suffixSum[i] %= mod;
            }

            return suffixSum;
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

