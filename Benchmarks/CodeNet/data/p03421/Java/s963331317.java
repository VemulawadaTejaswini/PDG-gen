import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.InputStreamReader;
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
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();

            if (a * (long) b < n || a + b - 1 > n) {
                out.println(-1);
                return;
            }

            int len = 0;
            int[] ans = new int[n];
            for (int i = n; len < n; i -= a) {
                for (int j = 0; j < a && len < n; j++) {
                    if (i - (a - 1) + j > 0) {
                        ans[len++] = i - (a - 1) + j;
                    }
                }
            }

            int low = 0, high = n;
            while (high - low > 1) {
                int mid = (low + high) / 2;
                int[] aa = ans.clone();
                Arrays.sort(aa, mid, aa.length);
                for (int i = mid, j = aa.length - 1; i < j; i++, j--) swap(aa, i, j);
                int l = LIS(aa);
//            dump("bin", low, high, mid, l, aa);
                if (l > b) {
                    low = mid;
                } else if (l < b) {
                    high = mid;
                } else {
                    ans = aa;
//                dump("find", ans);
                    break;
                }
            }

            for (int i = 0; i < n; i++) {
                out.print(ans[i] + (i == n - 1 ? "\n" : " "));
            }
        }

        private static int LIS(int[] ys) {
            final int n = ys.length;
            final int[] res = new int[n];
            Arrays.fill(res, Integer.MAX_VALUE);
            for (int i = 0; i < n; i++) {
                res[lowerBound(res, -ys[i])] = -ys[i];
            }
            return lowerBound(res, Integer.MAX_VALUE);
        }

        private static int lowerBound(final int[] xs, final int x) {
            int low = 0, high = xs.length;
            while (low < high) {
                final int mid = (low + high) / 2;
                final int cmp = xs[mid] < x ? -1 : xs[mid] == x ? 0 : 1;
                if (cmp >= 0) high = mid;
                else low = mid + 1;
            }
            return low;
        }

        static void swap(int[] xs, int i, int j) {
            int t = xs[i];
            xs[i] = xs[j];
            xs[j] = t;
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

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

