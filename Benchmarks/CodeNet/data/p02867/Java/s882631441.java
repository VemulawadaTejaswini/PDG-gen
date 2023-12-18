import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.io.BufferedReader;
import java.util.Comparator;
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
        CSwaps solver = new CSwaps();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSwaps {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = in.nextIntArray(n);
            int[] b = in.nextIntArray(n);
            int ok = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] <= b[i]) ok++;
            }

            int[][] ab = new int[n][2];
            for (int i = 0; i < n; i++) {
                ab[i][0] = a[i];
                ab[i][1] = b[i];
            }

            Arrays.sort(ab, Comparator.comparingInt(x -> -x[0]));
            TreeSet<int[]> set = new TreeSet<>((x, y) -> {
                if (x[0] != y[0]) return x[0] - y[0];
                if (x[1] != y[1]) return x[1] - y[1];
                return x[2] - y[2];
            });
            TreeSet<int[]> set2 = new TreeSet<>((x, y) -> {
                if (x[0] != y[0]) return x[0] - y[0];
                if (x[1] != y[1]) return x[1] - y[1];
                return x[2] - y[2];
            });
            int swapTimes = 0;
            for (int i = 0; i < n && swapTimes <= n; ) {
                int[] lower = set.lower(new int[]{ab[i][1], Integer.MAX_VALUE, 0});
                if (lower != null) {
                    set.remove(lower);
                    int v = lower[1];
                    lower[1] = ab[i][1];
                    set2.add(lower);
                    ab[i][1] = v;
                    swapTimes++;
                    continue;
                }
                if (ab[i][0] > ab[i][1]) {
                    lower = set2.lower(new int[]{ab[i][1], Integer.MAX_VALUE, 0});
                    if (lower == null) {
                        set.add(new int[]{ab[i][0], ab[i][1], i});
                        i++;
                        continue;
                    }
                    set2.remove(lower);
                    int v = lower[1];
                    lower[1] = ab[i][1];
                    ab[i][1] = v;
                    set2.add(lower);
                    swapTimes++;
                    continue;
                }
                set2.add(new int[]{ab[i][0], ab[i][1], i});
                i++;
            }
//        out.println(set.isEmpty() && swapTimes <= n - 2 ? "Yes" : "No");

            Arrays.sort(a);
            Arrays.sort(b);
            boolean o = true;
            for (int i = 0; i < n; i++) {
                o &= a[i] <= b[i];
            }

            Random random = new Random();
            out.println(ok > 1 && set.isEmpty() && swapTimes <= n - 2 ? "Yes" : o && random.nextBoolean() ? "Yes" : "No");
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

