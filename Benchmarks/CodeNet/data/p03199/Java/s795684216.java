import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        static final int mod = 998244353;

        public void solve(int testNumber, MyInput in, PrintWriter out) {
//        test();
            int n = in.nextInt();
            int m = in.nextInt();
            long x = n * (n + 1L) / 2;
//        dump(n, m, x, powmod(2, x - m, mod));

            int[][] es = in.nextIntArray2D(m, 3);
            Map<Integer, Integer> cnt = new HashMap<>();
            Map<Integer, Integer> mp = new HashMap<>();
            for (int[] e : es) {
                int a = e[0] - 1;
                int b = e[1] - 1;
                int c = e[2];
                mp.put(Math.max(a, b), mp.getOrDefault(Math.max(a, b), 0) ^ c);
                cnt.put(Math.max(a, b), cnt.getOrDefault(Math.max(a, b), 0) + 1);
            }

            for (int i = 2; i < n; i++) {
                if (cnt.getOrDefault(i, 0) == 2 * i + 1 && mp.get(i) == 1) {
                    out.println(0);
                    return;
                }
            }

            cnt = new HashMap<>();
            mp = new HashMap<>();
            for (int[] e : es) {
                int a = e[0] - 1;
                int b = e[1] - 1;
                int c = e[2];
                mp.put(Math.min(a, b), mp.getOrDefault(Math.min(a, b), 0) ^ c);
                cnt.put(Math.min(a, b), cnt.getOrDefault(Math.min(a, b), 0) + 1);
            }

            for (int i = 2; i < n; i++) {
                if (cnt.getOrDefault(i, 0) == 2 * i + 1 && mp.get(i) == 1) {
                    out.println(0);
                    return;
                }
            }

            Map<Long, Integer> mp2 = new HashMap<>();
            for (int[] e : es) {
                int a = e[0] - 1;
                int b = e[1] - 1;
                int c = e[2];
                mp2.put(key(a, b), c);
            }

            int c = 0;
            int s = 0;
            LOOP:
            for (int i = 0; i < n; i++) {
                for (int j = s; j < i; j++) {
                    long k = key(i, j);
                    if (!mp2.containsKey(k)) {
                        s = s == i ? i + 1 : i;
                        c = 0;
                        continue LOOP;
                    }
                    c ^= mp2.get(k);
                }
                for (int j = s; j <= i; j++) {
                    long k = key(j, i);
                    if (!mp2.containsKey(k)) {
                        s = s == i ? i + 1 : i;
                        c = 0;
                        continue LOOP;
                    }
                    c ^= mp2.get(k);
                }
                if (s != i && c != 0) {
                    out.println(0);
                    return;
                }
            }

            out.println(powmod(2, x - m, mod));
        }

        long key(long x, long y) {
            return x << 32 | y;
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

        public int[] nextIntArray(final int n) {
            final int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        public int[][] nextIntArray2D(final int n, final int k) {
            final int[][] res = new int[n][];
            for (int i = 0; i < n; i++) {
                res[i] = nextIntArray(k);
            }
            return res;
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

