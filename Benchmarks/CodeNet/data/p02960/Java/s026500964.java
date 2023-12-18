import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author caoash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DDigitsParade solver = new DDigitsParade();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDigitsParade {
        public void solve(int testNumber, FastScanner br, PrintWriter pw) {
            long MOD = (long) 1e9 + 7;
            char[] in = br.nextString().toCharArray();
            long[][] cnt = new long[in.length][13];
            int place = 0;
            for (int i = in.length - 1; i >= 0; i--) {
                if (place == 0) {
                    if (in[i] == '?') {
                        for (int dig = 0; dig <= 9; dig++) {
                            cnt[place][(((int) (powM(10, place, 13)) * dig)) % 13]++;
                        }
                    } else {
                        cnt[place][((int) (powM(10, place, 13) * (in[i] - '0'))) % 13]++;
                    }
                } else {
                    if (in[i] == '?') {
                        for (int j = 0; j < 13; j++) {
                            for (int dig = 0; dig <= 9; dig++) {
                                cnt[place][(j + ((int) (powM(10, place, 13)) * dig)) % 13] += cnt[place - 1][j];
                                cnt[place][(j + ((int) (powM(10, place, 13)) * dig)) % 13] %= MOD;
                            }
                        }
                    } else {
                        for (int j = 0; j < 13; j++) {
                            cnt[place][(j + ((int) (powM(10, place, 13)) * (in[i] - '0'))) % 13] += cnt[place - 1][j];
                            cnt[place][(j + ((int) (powM(10, place, 13)) * (in[i] - '0'))) % 13] %= MOD;
                        }
                    }
                }
                ++place;
            }

            pw.println(cnt[in.length - 1][5] % MOD);
            pw.close();
        }

        public static long powM(int a, int b, int m) {
            a %= m;
            long res = 1;
            while (b > 0) {
                if ((b & 1) > 0)
                    res = (res * a) % m;
                a = a * a % m;
                b >>= 1;
            }
            return res;
        }

    }

    static class FastScanner {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastScanner.SpaceCharFilter filter;

        public FastScanner(InputStream stream) {
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
}

