import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
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
        FStringsOfEternity solver = new FStringsOfEternity();
        solver.solve(1, in, out);
        out.close();
    }

    static class FStringsOfEternity {
        String s;
        String t;
        int n;
        int m;
        int[] zf1;
        boolean[] rs;
        boolean[] tp;
        int[] dp;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            s = in.next();
            t = in.next();

            n = s.length();
            m = t.length();

            StringBuilder sb = new StringBuilder(s);

            StringBuilder sb2 = new StringBuilder(s);

            while (sb2.length() < m) {
                sb2.append(s);
            }

            s = sb2.toString();

            n = s.length();

            String s1 = t + "#" + s;
            String s2 = rev(t) + "#" + rev(s);

            ZFunction z1 = new ZFunction(s1);
            ZFunction z2 = new ZFunction(s2);

            zf1 = z1.calculate();
            int[] zf2 = z2.calculate();

            for (int i = m + n; i > m; i--) {
                if (i + zf1[i] <= m + n && zf1[i] == m) {
                    zf1[i] += zf1[i + zf1[i]];
                }
            }

            dp = new int[m + 1];

            Arrays.fill(dp, -2);

            tp = new boolean[m + 1];

            for (int i = m + 1; i <= m + n; i++) {
                if (i + zf2[i] > m + n) {
                    tp[m + n + 1 - i] = true;
                }
            }

            rs = new boolean[m + 1];

            long ans = 0;
            boolean inf = false;
            for (int i = 0; i < n; i++) {
                int ind = m + 1 + i;
                int val = ind + zf1[ind];

                if (val > m + n) {
                    int ex = i;
                    int q = (n - ex) / m;
                    int rem = n - ex - q * m;
                    int rem2 = m - rem;
                    long rv = cal(rem2);
                    if (rv == -1) {
                        inf = true;
                    } else {
                        ans = Math.max(ans, rv + q);
                    }
                } else {
                    ans = Math.max(ans, zf1[ind] / m);
                }
            }

            if (inf) {
                out.println(-1);
            } else {
                out.println(ans);
            }
        }

        long cal(int ex) {
            if (rs[ex]) {
                return -1;
            }
            if (dp[ex] != -2) {
                return dp[ex];
            }
            rs[ex] = true;

            if (tp[ex]) {
                dp[ex] = 1;

                int ind = m + 1 + ex;
                int val = m + 1 + ex + zf1[m + 1 + ex];

                if (val > m + n) {
                    int q = (n - ex) / m;
                    dp[ex] += q;
                    int rem = n - ex - q * m;
                    int rem2 = m - rem;
                    long rv = cal(rem2);
                    if (rv == -1) {
                        dp[ex] = -1;
                    } else {
                        dp[ex] += rv;
                    }
                } else {
                    dp[ex] += zf1[ind] / m;
                }
            } else {
                dp[ex] = 0;
            }

            rs[ex] = false;

            return dp[ex];
        }

        String rev(String s) {
            return new StringBuilder(s).reverse().toString();
        }

        class ZFunction {
            String s;
            int n;
            int[] z;

            public ZFunction(String s) {
                this.s = s;
                this.n = s.length();
                this.z = new int[n];
                calculate();
            }

            int[] calculate() {
                int leftMatch = 0;
                int rightMatch = 0;

                for (int i = 1; i < n; i++) {
                    if (rightMatch >= i) {
                        int z0 = z[i - leftMatch];
                        if (i + z0 - 1 >= rightMatch) {
                            int prevRightMatch = rightMatch;
                            for (int j = rightMatch + 1; j < n; j++) {
                                if (s.charAt(j) == s.charAt(j - i)) {
                                    rightMatch++;
                                } else {
                                    break;
                                }
                            }
                            if (rightMatch > prevRightMatch) {
                                leftMatch = i;
                            }
                            z[i] = rightMatch - i + 1;
                        } else {
                            z[i] = z0;
                        }
                    } else {
                        if (s.charAt(0) == s.charAt(i)) {
                            leftMatch = rightMatch = i;
                            for (int j = i + 1; j < n; j++) {
                                if (s.charAt(j) == s.charAt(j - i)) {
                                    rightMatch++;
                                } else {
                                    break;
                                }
                            }
                            z[i] = rightMatch - i + 1;
                        }
                    }
                }

                return z;
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

        public void println(long i) {
            writer.println(i);
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

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

