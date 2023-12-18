import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.StringJoiner;
import java.util.function.LongBinaryOperator;

public class Main {
    private static final Mod mod = new Mod(2019);

    static void solve(MyScanner in, MyWriter out) {
        String s = in.next();
        var a = new long[s.length()];
        Mod.Value mul = mod.value(1);
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int d = c - '0';
            a[i] = mod.value(d).multiply(mul).longValue();
            mul.multiply(10);
        }
        var cum = new Cumulation(a, 0, mod::add, mod::subtract);
        var map = new HashMap<Long, Long>();
        long answer = 0;
        for (int i = s.length(); i >= 0; i--) {
            long k = cum.range(i);
            long c = map.getOrDefault(k, 0L);
            answer += c;
            map.put(k, c + 1);
        }
        out.println(answer);
    }
    static final class Cumulation {
        private final long[] cumulated;
        private final LongBinaryOperator inverse;

        Cumulation(long[] a,
                   long identityElement,
                   LongBinaryOperator op,
                   LongBinaryOperator inverse) {
            if (inverse == null) {
                throw new NullPointerException();
            }
            this.inverse = inverse;

            cumulated = new long[a.length + 1];
            cumulated[0] = identityElement;
            for (int i = 0; i < a.length; i++) {
                cumulated[i + 1] = op.applyAsLong(cumulated[i], a[i]);
            }
        }
        long range(int fromIndex) {
            return range(fromIndex, cumulated.length - 1);
        }
        long range(int fromIndex, int toIndex) {
            if (fromIndex > toIndex) {
                throw new IndexOutOfBoundsException();
            }
            return inverse.applyAsLong(cumulated[toIndex],
                                       cumulated[fromIndex]);
        }
        static Cumulation cumulateByAdd(long[] a) {
            return new Cumulation(a, 0, Math::addExact, Math::subtractExact);
        }
        static Cumulation cumulateByMultiply(long[] a) {
            return new Cumulation(a, 1, Math::multiplyExact, Math::floorDiv);
        }
        static Cumulation cumulateByXor(long[] a) {
            LongBinaryOperator op = (left, right) -> left ^ right;
            return new Cumulation(a, 0, op, op);
        }
    }
    static final class Mod {
        final int divisor;

        Mod(int divisor) {
            if (divisor <= 0) {
                throw new IllegalArgumentException();
            }
            this.divisor = divisor;
        }
        long mod(long dividend) {
            return Math.floorMod(dividend, divisor);
        }
        long add(long a, long b) {
            return mod(mod(a) + mod(b));
        }
        long subtract(long a, long b) {
            return mod(mod(a) - mod(b));
        }
        long multiply(long a, long b) {
            return mod(mod(a) * mod(b));
        }
        long pow(long a, long b) {
            if (b < 0) {
                throw new IllegalArgumentException();
            }
            long r = 1;
            while (b > 0) {
                if ((b & 1) == 1) {
                    r = multiply(r, a);
                }
                a = multiply(a, a);
                b >>= 1;
            }
            return r;
        }
        long inverse(long a) {
            // assert isCoprime(a, divisor);
            if (a == 0) {
                throw new IllegalArgumentException();
            }
            a = mod(a);
            long b = divisor;
            long u = 1;
            long v = 0;
            while (b != 0) {
                long q = a / b;
                a -= q * b;
                u -= q * v;

                long tmp = a;
                a = b;
                b = tmp;

                tmp = u;
                u = v;
                v = tmp;
            }
            return mod(u);
        }
        long div(long a, long b) {
            return multiply(a, inverse(b));
        }
        Value value(long initialValue) {
            return new Value(this, initialValue);
        }

        static final class Value {
            private final Mod mod;
            private long value;

            private Value(Mod mod, long initialValue) {
                this.mod = mod;
                value = mod.mod(initialValue);
            }
            long longValue() {
                return value;
            }
            Value add(long a) {
                value = mod.add(value, a);
                return this;
            }
            Value add(Value a) {
                return add(a.value);
            }
            Value subtract(long a) {
                value = mod.subtract(value, a);
                return this;
            }
            Value subtract(Value a) {
                return subtract(a.value);
            }
            Value multiply(long a) {
                value = mod.multiply(value, a);
                return this;
            }
            Value multiply(Value a) {
                return multiply(a.value);
            }
            Value pow(long a) {
                value = mod.pow(value, a);
                return this;
            }
            Value inverse() {
                value = mod.inverse(value);
                return this;
            }
            Value div(long a) {
                value = mod.div(value, a);
                return this;
            }
            Value div(Value a) {
                return div(a.value);
            }
            @Override
            public String toString() {
                return Long.toString(value);
            }
        }
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
        public char nextChar() {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            return (char)c;
        }
        public String next() {
            return next(16);
        }
        public String next(int n) {
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
        public long nextLong() {
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
        public int nextInt() {
            long n = nextLong();
            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE) {
                throw new InputMismatchException();
            }
            return (int)n;
        }
        public double nextDouble() {
            return Double.parseDouble(next());
        }
        public int[] nextIntArray(int n) {
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextInt();
            }
            return result;
        }
        public long[] nextLongArray(int n) {
            long[] result = new long[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextLong();
            }
            return result;
        }
        public char[] nextCharArray(int n) {
            char[] result = new char[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextChar();
            }
            return result;
        }
        public char[][] next2dCharArray(int n, int m) {
            char[][] result = new char[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    result[i][j] = nextChar();
                }
            }
            return result;
        }
        public int[][] nextVerticalIntArrays(int arrayCount, int arrayLength) {
            int[][] result = new int[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextInt();
                }
            }
            return result;
        }
        public long[][] nextVerticalLongArrays(int arrayCount,
                                               int arrayLength) {
            long[][] result = new long[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextLong();
                }
            }
            return result;
        }
        public char[][] nextVerticalCharArrays(int arrayCount,
                                               int arrayLength) {
            char[][] result = new char[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextChar();
                }
            }
            return result;
        }
    }
    static final class MyWriter extends PrintWriter {
        MyWriter(OutputStream out) {
            super(out);
        }
        public void joinAndPrintln(int[] x) {
            joinAndPrintln(x, " ");
        }
        public void joinAndPrintln(int[] x, String delimiter) {
            StringJoiner j = new StringJoiner(delimiter);
            for (int e : x) {
                j.add(Integer.toString(e));
            }
            println(j.toString());
        }
        public void joinAndPrintln(long[] x) {
            joinAndPrintln(x, " ");
        }
        public void joinAndPrintln(long[] x, String delimiter) {
            StringJoiner j = new StringJoiner(delimiter);
            for (long e : x) {
                j.add(Long.toString(e));
            }
            println(j.toString());
        }
        public void joinAndPrintln(Iterable<?> iterable) {
            joinAndPrintln(iterable, " ");
        }
        public void joinAndPrintln(Iterable<?> iterable, String delimiter) {
            StringJoiner j = new StringJoiner(delimiter);
            for (Object e : iterable) {
                j.add(e.toString());
            }
            println(j.toString());
        }
    }
}
