import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.Map;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyInput in = new MyInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        long X;
        long invX;

        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            char[] cs = in.nextChars();

            final int mod = (int) 1e9 + 7;
            X = (int) 1e9 + 3;
            invX = powmod(X, mod - 2, mod);
            final long[] pow = new long[2 * n + 1];
            pow[0] = powmod(X, (mod - 2L) * n % (mod - 1), mod);
            for (int i = 1; i < pow.length; i++) pow[i] = pow[i - 1] * X % mod;

//        dump(pow);

            int[] xs = new int[n + 1];
            xs[n] = n;
            long c = 0;
            for (int i = n - 1; i >= 0; i--) {
                xs[i] = xs[i + 1];
                if (cs[i] == '+') {
                    c = (c + pow[xs[i]]) % mod;
                }
                if (cs[i] == '-') {
                    c = (c + mod - pow[xs[i]]) % mod;
                }
                if (cs[i] == '>') {
                    xs[i]++;
                }
                if (cs[i] == '<') {
                    xs[i]--;
                }
            }
        /*
        int[] ys = new int[n+1];
        ys[0] = n;
        long[] hash0 = new long[n+1];
        long[] hash1 = new long[n+1];
        hash1[0] = 0;
        for (int i = 0; i < n; i++) {
            ys[i+1] = ys[i];
            hash0[i+1] = hash0[i];
            hash1[i+1] = hash1[i];
            if (cs[i] == '-') { hash0[i+1] = (hash0[i] + pow[ys[i]]) % mod; }
            if (cs[i] == '+') { hash0[i+1] = (hash0[i] + mod - pow[ys[i]]) % mod; }
            if (cs[i] == '-') { hash1[i+1] = (hash1[i] + pow[ys[i]]) % mod; }
            if (cs[i] == '+') { hash1[i+1] = (hash1[i] + mod - pow[ys[i]]) % mod; }
            if (cs[i] == '<') { ys[i+1]++; }
            if (cs[i] == '>') { ys[i+1]--; }
        }
        */

//        dump(c);
//        dump(hash0);
//        dump(hash1);
            long[][] mat = new long[3][3];
            for (int i = 0; i < 3; i++) mat[i][i] = 1;
            long ans = 0;
            Map<Long, Integer> mp = new HashMap<>();
            long[][] v0 = transpose(new long[][]{new long[]{0, 0, 1}});
            long[][] vc = transpose(new long[][]{new long[]{c, 0, 1}});
            for (int i = 0; i <= n; i++) {
                long[][] m0 = mulmat(mat, v0, mod);
                long[][] mc = mulmat(mat, vc, mod);
                long h0 = ((m0[0][0] + m0[1][0]) % mod + mod) % mod;
                long hc = ((mc[0][0] + mc[1][0]) % mod + mod) % mod;
//            ans += mp.getOrDefault(hc, 0);
//            dump(i, h0, hc, mp.getOrDefault(hc, 0));
                mp.put(h0, mp.getOrDefault(h0, 0) + 1);
                if (i < n) mat = mulmat(mat, getMat(cs[i]), mod);
            }

            mat = new long[3][3];
            for (int i = 0; i < 3; i++) mat[i][i] = 1;
            for (int i = 0; i <= n; i++) {
                long[][] m0 = mulmat(mat, v0, mod);
                long[][] mc = mulmat(mat, vc, mod);
                long h0 = ((m0[0][0] + m0[1][0]) % mod + mod) % mod;
                long hc = ((mc[0][0] + mc[1][0]) % mod + mod) % mod;
                mp.put(h0, mp.getOrDefault(h0, 0) - 1);
                ans += mp.getOrDefault(hc, 0);
//            dump(i, h0, hc, mp.getOrDefault(hc, 0));
                if (i < n) mat = mulmat(mat, getMat(cs[i]), mod);
            }
            out.println(ans);
        }

        long[][] getMat(char c) {
            if (c == '+') {
                return new long[][]{
                        new long[]{1, 0, 0},
                        new long[]{0, 1, 1},
                        new long[]{0, 0, 1},
                };
            }
            if (c == '-') {
                return new long[][]{
                        new long[]{1, 0, 0},
                        new long[]{0, 1, -1},
                        new long[]{0, 0, 1},
                };
            }
            if (c == '<') {
                return new long[][]{
                        new long[]{X, X, 0},
                        new long[]{0, 0, 0},
                        new long[]{0, 0, 1},
                };
            }
            if (c == '>') {
                return new long[][]{
                        new long[]{invX, invX, 0},
                        new long[]{0, 0, 0},
                        new long[]{0, 0, 1},
                };
            }
            throw new RuntimeException();
        }

        static long[][] transpose(long[][] mat) {
            long[][] res = new long[mat[0].length][mat.length];
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    res[j][i] = mat[i][j];
                }
            }
            return res;
        }

        static long[][] mulmat(long[][] a, long[][] b, int mod) {
            final long BIG = (2L * mod) * (2L * mod);

            assert (a[0].length == b.length);

            final int n = a.length;
            final int v = b.length;
            final int m = b[0].length;

            long[][] res = new long[n][m];
            for (int i = 0; i < n; i++)
                for (int k = 0; k < v; k++) {
                    final long aa = a[i][k];
                    for (int j = 0; j < m; j++) {
                        res[i][j] += aa * b[k][j];
                        if (res[i][j] >= BIG) res[i][j] -= BIG;
                    }
                }
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    res[i][j] %= mod;

            return res;
        }

        static long powmod(long n, long r, int m) {
            long res = 1;
            for (; r != 0; r >>>= 1, n = n * n % m) {
                if ((r & 1) == 1) {
                    res = res * n;
                    if (res >= m) {
                        res %= m;
                    }
                }
            }
            return res;
        }

    }

    static class MyInput {
        private final BufferedReader in;
        private static int pos;
        private static int readLen;
        private static final char[] buffer = new char[1024 * 8];
        private static char[] str = new char[500 * 8 * 2];
        private static boolean[] isDigit = new boolean[256];
        private static boolean[] isSpace = new boolean[256];
        private static boolean[] isLineSep = new boolean[256];

        static {
            for (int i = 0; i < 10; i++) {
                isDigit['0' + i] = true;
            }
            isDigit['-'] = true;
            isSpace[' '] = isSpace['\r'] = isSpace['\n'] = isSpace['\t'] = true;
            isLineSep['\r'] = isLineSep['\n'] = true;
        }

        public MyInput(InputStream is) {
            in = new BufferedReader(new InputStreamReader(is));
        }

        public int read() {
            if (pos >= readLen) {
                pos = 0;
                try {
                    readLen = in.read(buffer);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (readLen <= 0) {
                    throw new MyInput.EndOfFileRuntimeException();
                }
            }
            return buffer[pos++];
        }

        public int nextInt() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            int ret = 0;
            if (str[0] == '-') {
                i = 1;
            }
            for (; i < len; i++) ret = ret * 10 + str[i] - '0';
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }

        public char nextChar() {
            while (true) {
                final int c = read();
                if (!isSpace[c]) {
                    return (char) c;
                }
            }
        }

        int reads(int len, boolean[] accept) {
            try {
                while (true) {
                    final int c = read();
                    if (accept[c]) {
                        break;
                    }
                    if (str.length == len) {
                        char[] rep = new char[str.length * 3 / 2];
                        System.arraycopy(str, 0, rep, 0, str.length);
                        str = rep;
                    }
                    str[len++] = (char) c;
                }
            } catch (MyInput.EndOfFileRuntimeException e) {
            }
            return len;
        }

        public char[] nextChars() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            return Arrays.copyOf(str, len);
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

