import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class Main {
    static void solve(MyScanner in, PrintWriter out) {
        int h = in.nextInt();
        int w = in.nextInt();
        char[][] s = in.next2dCharArray(h, w);

        int[][] left = new int[h][w];
        int[][] up = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (s[i][j] == '#')
                    continue;
                if (j == 0)
                    left[i][j] = 1;
                else
                    left[i][j] = left[i][j - 1] + 1;
                if (i == 0)
                    up[i][j] = 1;
                else
                    up[i][j] = up[i - 1][j] + 1;
            }
        }

        int[][] right = new int[h][w];
        int[][] down = new int[h][w];
        int ans = Integer.MIN_VALUE;
        for (int i = h - 1; i >= 0; i--) {
            for (int j = w - 1; j >= 0; j--) {
                if (s[i][j] == '.') {
                    if (j == w - 1)
                        right[i][j] = 1;
                    else
                        right[i][j] = right[i][j + 1] + 1;
                    if (i == h - 1)
                        down[i][j] = 1;
                    else
                        down[i][j] = down[i + 1][j] + 1;
                }
                ans = Math.max(ans,
                               left[i][j]
                                    + up[i][j]
                                    + right[i][j]
                                    + down[i][j]
                                    - 3);
            }
        }

        out.println(ans);
    }

    public static void main(String[] args) {
        PrintWriter w = new PrintWriter(System.out);
        solve(new MyScanner(System.in), w);
        w.flush();
    }

    static final class MyScanner {
        static final int BUFFER_SIZE = 8192;
        private final InputStream in;
        private final byte[] buffer = new byte[BUFFER_SIZE];
        private int point;
        private int readLength;
        MyScanner(InputStream in) {
            this.in = in;
        }
        private int readByte() {
            if (point < readLength) {
                int result = buffer[point];
                point += 1;
                return result;
            }
            try {
                readLength = in.read(buffer);
            } catch (IOException e) {
                throw new AssertionError(null, e);
            }
            if (readLength == -1) {
                return -1;
            }
            point = 1;
            return buffer[0];
        }
        private static boolean isPrintableCharExceptSpace(int c) {
            return 33 <= c && c <= 126;
        }
        String next() {
            int c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            assert c != -1;
            StringBuilder b = new StringBuilder();
            do {
                b.appendCodePoint(c);
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return b.toString();
        }
        long nextLong() {
            int c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            assert c != -1;
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = readByte();
            }
            long result = 0L;
            do {
                assert '0' <= c && c <= '9' : c;
                result = result * 10L + (c - '0');
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return minus ? -result : result;
        }
        int nextInt() {
            long n = nextLong();
            assert Integer.MIN_VALUE <= n && n <= Integer.MAX_VALUE : n;
            return (int)n;
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        int[] nextIntArray(int n) {
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextInt();
            }
            return result;
        }
        private static boolean allSameLength(int[] a, int[] b, int[]... c) {
            if (a.length != b.length) {
                return false;
            }
            for (int i = 0; i < c.length; i++) {
                if (a.length != c[i].length) {
                    return false;
                }
            }
            return true;
        }
        private static boolean allSameLength(char[] a, char[] b, char[]... c) {
            if (a.length != b.length) {
                return false;
            }
            for (int i = 0; i < c.length; i++) {
                if (a.length != c[i].length) {
                    return false;
                }
            }
            return true;
        }
        void nextVerticalIntArrays(int[] a, int[] b, int[]... c) {
            assert allSameLength(a, b, c);
            for (int i = 0; i < a.length; i++) {
                a[i] = nextInt();
                b[i] = nextInt();
                for (int[] d : c) {
                    d[i] = nextInt();
                }
            }
        }
        long[] nextLongArray(int n) {
            long[] result = new long[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextLong();
            }
            return result;
        }
        char nextChar() {
            int c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            assert c != -1;
            return (char)c;
        }
        char[] nextCharArray(int n) {
            char[] result = new char[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextChar();
            }
            return result;
        }
        char[][] next2dCharArray(int n, int m) {
            char[][] result = new char[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    result[i][j] = nextChar();
                }
            }
            return result;
        }
        void nextVerticalCharArrays(char[] a, char[] b, char[]... c) {
            assert allSameLength(a, b, c);
            for (int i = 0; i < a.length; i++) {
                a[i] = nextChar();
                b[i] = nextChar();
                for (char[] d : c) {
                    d[i] = nextChar();
                }
            }
        }
    }
}
