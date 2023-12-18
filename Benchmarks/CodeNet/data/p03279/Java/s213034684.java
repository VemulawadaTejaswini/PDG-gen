import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.TreeSet;
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
        static final int mod = (int) 1e9 + 7;

        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] x = in.nextIntArray(n);
            int[] y = in.nextIntArray(m);

            int posLen = 0;
            int lrLen = 0;
            int[] pos = new int[2 * n + 1];
            int[][] lr = new int[n][2];
            pos[posLen++] = 0;
            for (int i = 0; i < n; i++) {
                int idx = Arrays.binarySearch(y, x[i]);
                idx = -idx - 2;
                if (idx < 0 || idx + 1 >= m) continue;
                lr[lrLen][0] = x[i] - y[idx];
                lr[lrLen][1] = y[idx + 1] - x[i];
                pos[posLen++] = lr[lrLen][0];
                pos[posLen++] = lr[lrLen][1];
                lrLen++;
            }
            pos = Arrays.copyOf(pos, posLen);
            lr = Arrays.copyOf(lr, lrLen);
            Arrays.sort(pos);
            for (int[] p : lr) {
                p[0] = Arrays.binarySearch(pos, p[0]);
                p[1] = Arrays.binarySearch(pos, p[1]);
            }
            Arrays.sort(lr, (a, b) -> {
                if (a[1] != b[1]) return a[1] - b[1];
                return -(a[0] - b[0]);
            });

            TreeSet<Long> use = new TreeSet<>();
            BIT bit = new BIT(posLen + 1);
            bit.add(0, 1);
            for (int[] p : lr) {
                if (!use.add((long) p[0] << 32 | p[1])) continue;
                bit.add(p[0], bit.sum(p[0]));
            }
            out.println(bit.sum(posLen + 1));
        }

        class BIT {
            final int n;
            final long[] bit;

            public BIT(int size) {
                n = size;
                bit = new long[n + 1];
            }

            public long sum(int i) {
                long res = 0;
                for (; i > 0; i -= i & -i) {
                    res += bit[i];
                    while (res >= mod) res -= mod;
                }
                return res;
            }

            public void add(int i, long x) {
                i++;
                for (; i <= n; i += i & -i) {
                    bit[i] += x;
                    while (bit[i] >= mod) bit[i] -= mod;
                }
            }

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

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

