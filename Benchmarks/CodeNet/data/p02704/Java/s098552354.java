import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Main {
    private static final int AND = 0;
    private static final int OR = 1;

    static void solve(MyScanner in, MyWriter out) {
        int n = in.nextInt();
        int[] s = in.nextIntArray(n);
        int[] t = in.nextIntArray(n);
        long[] u = in.nextUnsignedLongArray(n);
        long[] v = in.nextUnsignedLongArray(n);

        var answer = new long[n][n];
        var result = new long[n][n];
        for (long[] e : result) {
            Arrays.fill(e, -1);
        }
        for (int bitIndex = 0; bitIndex < Long.SIZE; bitIndex++) {
            if (!(fill_And1_Or0(result, s, t, u, v, bitIndex)
                  && fill_And0_Or1(result, s, t, u, v, bitIndex))) {
                out.println(-1);
                return;
            }
            fillUndecidedBits(result);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    answer[i][j] |= (result[i][j] << bitIndex);
                }
            }
            for (long[] e : result) {
                Arrays.fill(e, -1);
            }
        }
        for (long[] a : answer) {
            for (int i = 0; i < a.length; i++) {
                if (i > 0)
                    out.print(' ');
                out.print(Long.toUnsignedString(a[i]));
            }
            out.println();
        }
    }
    private static void fillUndecidedBits(long[][] result) {
        int n = result.length;
        for (int i = 0, a = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0, b = 0; j < n; j++) {
                if (result[i][j] != -1)
                    continue;
                found = true;
                result[i][j] = (a + b) % 2;
                b++;
            }
            if (found)
                a++;
        }
    }
    private static boolean fill_And0_Or1(long[][] result,
                                         int[] s,
                                         int[] t,
                                         long[] u,
                                         long[] v,
                                         int bitIndex) {
        int n = result.length;
        for (int counter = 0; counter < 2; counter++) {
            outer : for (int i = 0; i < n; i++) {
                long ubit = ((u[i] >>> bitIndex) & 1);
                if (s[i] == AND && ubit == 0) {
                    int k = -1;
                    for (int j = 0; j < n; j++) {
                        if (result[i][j] == 0)
                            continue outer;
                        if (result[i][j] == 1)
                            continue;
                        if (k != -1)
                            continue outer;
                        k = j;
                    }
                    if (k == -1)
                        return false;
                    result[i][k] = 0;
                } else if (s[i] == OR && ubit == 1) {
                    int k = -1;
                    for (int j = 0; j < n; j++) {
                        if (result[i][j] == 1)
                            continue outer;
                        if (result[i][j] == 0)
                            continue;
                        if (k != -1)
                            continue outer;
                        k = j;
                    }
                    if (k == -1)
                        return false;
                    result[i][k] = 1;
                }
            }
            outer : for (int i = 0; i < n; i++) {
                long vbit = ((v[i] >>> bitIndex) & 1);
                if (t[i] == AND && vbit == 0) {
                    int k = -1;
                    for (int j = 0; j < n; j++) {
                        if (result[j][i] == 0)
                            continue outer;
                        if (result[j][i] == 1)
                            continue;
                        if (k != -1)
                            continue outer;
                        k = j;
                    }
                    if (k == -1)
                        return false;
                    result[k][i] = 0;
                } else if (t[i] == OR && vbit == 1) {
                    int k = -1;
                    for (int j = 0; j < n; j++) {
                        if (result[j][i] == 1)
                            continue outer;
                        if (result[j][i] == 0)
                            continue;
                        if (k != -1)
                            continue outer;
                        k = j;
                    }
                    if (k == -1)
                        return false;
                    result[k][i] = 1;
                }
            }
        }
        return true;
    }
    private static boolean fill_And1_Or0(long[][] result,
                                         int[] s,
                                         int[] t,
                                         long[] u,
                                         long[] v,
                                         int bitIndex) {
        int n = result.length;
        for (int i = 0; i < n; i++) {
            long ubit = ((u[i] >>> bitIndex) & 1);
            long vbit = ((v[i] >>> bitIndex) & 1);
            for (int j = 0; j < n; j++) {
                if (s[i] == AND && ubit == 1) {
                    if (result[i][j] == 0)
                        return false;
                    result[i][j] = 1;
                } else if (s[i] == OR && ubit == 0) {
                    if (result[i][j] == 1)
                        return false;
                    result[i][j] = 0;
                }
                if (t[i] == AND && vbit == 1) {
                    if (result[j][i] == 0)
                        return false;
                    result[j][i] = 1;
                } else if (t[i] == OR && vbit == 0) {
                    if (result[j][i] == 1)
                        return false;
                    result[j][i] = 0;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        MyWriter w = new MyWriter(System.out);
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
        private static boolean isVisibleChar(int c) {
            return 33 <= c && c <= 126;
        }
        char nextChar() {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            return (char)c;
        }
        String next() {
            return next(16);
        }
        String next(int n) {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            StringBuilder b = new StringBuilder(n);
            do {
                b.append((char)c);
                c = readByte();
            } while (c != -1 && isVisibleChar(c));
            return b.toString();
        }
        long nextLong() {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            boolean minus = false;
            long limit = -Long.MAX_VALUE;
            if (c == '-') {
                minus = true;
                limit = Long.MIN_VALUE;
                c = readByte();
            }
            long n = 0L;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                if (n < limit / 10L) {
                    throw new InputMismatchException();
                }
                n *= 10L;
                int digit = c - '0';
                if (n < limit + digit) {
                    throw new InputMismatchException();
                }
                n -= digit;
                c = readByte();
            } while (c != -1 && isVisibleChar(c));
            return minus ? n : -n;
        }
        int nextInt() {
            long n = nextLong();
            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE) {
                throw new InputMismatchException();
            }
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
        long[] nextLongArray(int n) {
            long[] result = new long[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextLong();
            }
            return result;
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
        int[][] nextVerticalIntArrays(int arrayCount, int arrayLength) {
            int[][] result = new int[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextInt();
                }
            }
            return result;
        }
        long[][] nextVerticalLongArrays(int arrayCount, int arrayLength) {
            long[][] result = new long[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextLong();
                }
            }
            return result;
        }
        char[][] nextVerticalCharArrays(int arrayCount, int arrayLength) {
            char[][] result = new char[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextChar();
                }
            }
            return result;
        }
        long[] nextUnsignedLongArray(int n) {
            var result = new long[n];
            for (int i = 0; i < n; i++) {
                result[i] = Long.parseUnsignedLong(next());
            }
            return result;
        }
    }
    static final class MyWriter extends PrintWriter {
        MyWriter(OutputStream out) {
            super(out);
        }
        void println(int[] x) {
            println(x, " ");
        }
        void println(int[] x, String delimiter) {
            if (x.length > 0) {
                print(x[0]);
                for (int i = 1; i < x.length; i++) {
                    print(delimiter);
                    print(x[i]);
                }
            }
            println();
        }
        void println(long[] x) {
            println(x, " ");
        }
        void println(long[] x, String delimiter) {
            if (x.length > 0) {
                print(x[0]);
                for (int i = 1; i < x.length; i++) {
                    print(delimiter);
                    print(x[i]);
                }
            }
            println();
        }
        void println(Iterable<?> iterable) {
            println(iterable, " ");
        }
        void println(Iterable<?> iterable, String delimiter) {
            Iterator<?> i = iterable.iterator();
            if (i.hasNext()) {
                print(i.next());
                while (i.hasNext()) {
                    print(delimiter);
                    print(i.next());
                }
            }
            println();
        }
        void printLines(int[] x) {
            println(x, System.lineSeparator());
        }
        void printLines(long[] x) {
            println(x, System.lineSeparator());
        }
        void printLines(Iterable<?> iterable) {
            println(iterable, System.lineSeparator());
        }
    }
}
