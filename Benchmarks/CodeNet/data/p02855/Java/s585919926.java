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
        CStrawberryCakes solver = new CStrawberryCakes();
        solver.solve(1, in, out);
        out.close();
    }

    static class CStrawberryCakes {
        int h;
        int w;
        int k;
        int[][] res;
        int[][] sum;

        public void solve(int testNumber, MyInput in, PrintWriter out) {
            h = in.nextInt();
            w = in.nextInt();
            k = in.nextInt();
            sum = new int[h + 1][w + 1];
            res = new int[h][w];
            for (int y = 0; y < h; y++) {
                char[] cs = in.nextChars();
                for (int x = 0; x < w; x++) {
                    sum[y + 1][x + 1] += cs[x] == '#' ? 1 : 0;
//                sum[y + 1][x + 1] += sum[y][x + 1];
//                sum[y + 1][x + 1] += sum[y + 1][x];
                }
            }
            for (int x = 0; x < w; x++) {
                for (int y = 0; y <= h; y++) {
                    sum[y][x + 1] += sum[y][x];
                }
            }
            for (int y = 0; y < h; y++) {
                for (int x = 0; x <= w; x++) {
                    sum[y + 1][x] += sum[y][x];
                }
            }
            dfs(0, w, 0, h);
            for (int y = 0; y < h; y++) {
                printList(out, res[y]);
            }
        }

        int cnt(int x0, int x1, int y0, int y1) {
            return sum[y1][x1] - sum[y0][x1] - sum[y1][x0] + sum[y0][x0];
        }

        void dfs(int x0, int x1, int y0, int y1) {
//        dump(x0, x1, y0, y1, cnt(x0, x1, y0, y1));
            if (cnt(x0, x1, y0, y1) == 1) {
                for (int y = y0; y < y1; y++) {
                    for (int x = x0; x < x1; x++) {
                        res[y][x] = k;
                    }
                }
                k--;
                return;
            }
            for (int x = x0 + 1; x < x1; x++) {
                if (cnt(x0, x, y0, y1) > 0 && cnt(x, x1, y0, y1) > 0) {
                    dfs(x0, x, y0, y1);
                    dfs(x, x1, y0, y1);
                    return;
                }
            }
            for (int y = y0 + 1; y < y1; y++) {
                if (cnt(x0, x1, y0, y) > 0 && cnt(x0, x1, y, y1) > 0) {
                    dfs(x0, x1, y0, y);
                    dfs(x0, x1, y, y1);
                    return;
                }
            }
        }

        static void printList(PrintWriter out, int[] p) {
            for (int i = 0; i < p.length; i++) {
                out.print(p[i] + (i == p.length - 1 ? "\n" : " "));
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

