import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.LongBinaryOperator;

public class Main {
    static void solve(MyScanner in, MyWriter out) {
        int n = in.nextInt();
        int p = in.nextInt();
        char[] s = in.nextCharArray(n);

        if (p == 2 || p == 5) {
            long ans = 0;
            for (int i = 0; i < s.length; i++) {
                if ((s[i] - '0') % p == 0) {
                    ans += i + 1;
                }
            }
            out.println(ans);
            return;
        }
        Mod mod = new Mod(p);
        long[] rem = new long[s.length];
        long powTen = 1;
        for (int i = s.length - 1; i >= 0; i--) {
            rem[i] = mod.multiply(s[i] - '0', powTen);
            powTen = mod.multiply(powTen, 10);
        }
        Cumulation cumulation = new Cumulation(rem, 0, mod::add, mod::subtract);
        Map<Long, Long> count = new HashMap<>();
        long ans = 0;
        for (int i = rem.length; i >= 0; i--) {
            long k = cumulation.valueOfRange(i);
            long c = count.getOrDefault(k, 0L);
            ans += c;
            count.put(k, c + 1);
        }
        out.println(ans);
    }
    static final class Cumulation {
        private final long[] cumulated;
        private final LongBinaryOperator inverse;

        private Cumulation(long[] a,
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
        long valueOfRange(int fromIndex) {
            return valueOfRange(fromIndex, cumulated.length - 1);
        }
        long valueOfRange(int fromIndex, int toIndex) {
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
        private byte readByte() {
            if (point < readLength) {
                byte result = buffer[point];
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
        private static boolean isPrintableCharExceptSpace(byte c) {
            return 33 <= c && c <= 126;
        }
        public char nextChar() {
            byte c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
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
            byte c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            StringBuilder b = new StringBuilder(n);
            do {
                b.append((char)c);
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return b.toString();
        }
        public long nextLong() {
            byte c = readByte();
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
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                result = result * 10L + (c - '0');
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return minus ? -result : result;
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
            StringBuilder b = new StringBuilder();
            if (x.length > 0) {
                b.append(x[0]);
                for (int i = 1; i < x.length; i++) {
                    b.append(delimiter).append(x[i]);
                }
            }
            println(b.toString());
        }
        public void joinAndPrintln(long[] x) {
            joinAndPrintln(x, " ");
        }
        public void joinAndPrintln(long[] x, String delimiter) {
            StringBuilder b = new StringBuilder();
            if (x.length > 0) {
                b.append(x[0]);
                for (int i = 1; i < x.length; i++) {
                    b.append(delimiter).append(x[i]);
                }
            }
            println(b.toString());
        }
        public void joinAndPrintln(Iterable<?> iterable) {
            joinAndPrintln(iterable, " ");
        }
        public void joinAndPrintln(Iterable<?> iterable, String delimiter) {
            StringBuilder b = new StringBuilder();
            for (Iterator<?> i = iterable.iterator(); i.hasNext();) {
                b.append(i.next());
                while (i.hasNext()) {
                    b.append(delimiter).append(i.next());
                }
            }
            println(b.toString());
        }
    }
}
