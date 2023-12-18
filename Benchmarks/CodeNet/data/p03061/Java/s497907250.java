import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.NoSuchElementException;

public class Main {

    private static int gcd_(int a, int b) {
        return b == 0 ? a : gcd_(b, a % b);
    }
    static int gcd(int a, int b) {
        if (a <= 0) {
            throw new IllegalArgumentException("" + a);
        }
        if (b <= 0) {
            throw new IllegalArgumentException("" + b);
        }
        return gcd_(a, b);
    }
    static int l(int[] a, int i, Map<Integer, Integer> memo) {
        if (i == 0) {
            return a[0];
        }
        return memo.computeIfAbsent(i, k -> gcd(l(a, i - 1, memo), a[i]));
    }
    static int r(int[] a, int i, Map<Integer, Integer> memo) {
        if (i == a.length - 1) {
            return a[a.length - 1];
        }
        return memo.computeIfAbsent(i, k -> gcd(r(a, i + 1, memo), a[i]));
    }
    static void exec(MyScanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = in.nextIntArray(n);
        int max = Integer.MIN_VALUE;
        Map<Integer, Integer> leftMemo = new HashMap<>();
        Map<Integer, Integer> rightMemo = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int c;
            if (i == 0) {
                c = r(a, i + 1, rightMemo);
            } else if (i == a.length - 1) {
                c = l(a, i - 1, leftMemo);
            } else {
                c = gcd(l(a, i - 1, leftMemo), r(a, i + 1, rightMemo));
            }
            max = Math.max(max, c);
        }
        out.println(max);
    }

    public static void main(String[] args) {
        PrintWriter w = new PrintWriter(System.out);
        exec(new MyScanner(System.in), w);
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
            if (c == -1) {
                throw new NoSuchElementException();
            }
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
            if (c == -1) {
                throw new NoSuchElementException();
            }
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = readByte();
            }
            long result = 0L;
            do {
                if (!('0' <= c && c <= '9')) {
                    throw new InputMismatchException();
                }
                result = result * 10L + (c - '0');
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return minus ? -result : result;
        }
        int nextInt() {
            long n = nextLong();
            if (Integer.MIN_VALUE <= n && n <= Integer.MAX_VALUE) {
                return (int)n;
            }
            throw new InputMismatchException();
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
        void nextVerticalIntArrays(int[] a, int[] b, int[]... c) {
            if (a.length != b.length) {
                throw new IllegalArgumentException();
            }
            for (int[] d : c) {
                if (d.length != a.length) {
                    throw new IllegalArgumentException();
                }
            }
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
            if (c == -1) {
                throw new NoSuchElementException();
            }
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
            if (a.length != b.length) {
                throw new IllegalArgumentException();
            }
            for (char[] d : c) {
                if (d.length != a.length) {
                    throw new IllegalArgumentException();
                }
            }
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
