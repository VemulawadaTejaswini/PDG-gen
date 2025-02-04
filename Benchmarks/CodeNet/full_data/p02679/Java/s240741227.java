import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

public class Main {
    private static final Mod mod = new Mod(1_000_000_007);

    void solve(MyScanner in, MyWriter out) {
        int n = in.nextInt();
        long[][] ab = in.nextVerticalLongArrays(2, n);
        long[] a = ab[0];
        long[] b = ab[1];

        var plus = new HashMap<Rate, Long>();
        var minus = new HashMap<Rate, Long>();
        long zeros = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0 && b[i] == 0) {
                zeros++;
            } else if (a[i] == 0) {
                plus.merge(new Rate(0, 1), 1L, Long::sum);
            } else if (b[i] == 0) {
                minus.merge(new Rate(0, 1), 1L, Long::sum);
            } else {
                long absA = Math.abs(a[i]);
                long absB = Math.abs(b[i]);
                long gcd = gcd(absA, absB);
                absA /= gcd;
                absB /= gcd;
                if ((a[i] >= 0 && b[i] >= 0) || (a[i] < 0 && b[i] < 0)) {
                    plus.merge(new Rate(absA, absB), 1L, Long::sum);
                } else {
                    minus.merge(new Rate(absB, absA), 1L, Long::sum);
                }
            }
        }
        Mod.Value answer = mod.value(1);
        for (Map.Entry<Rate, Long> e : plus.entrySet()) {
            if (minus.containsKey(e.getKey())) {
                Mod.Value v = mod.value(0);
                v.add(mod.pow(2, e.getValue()));
                v.add(mod.pow(2, minus.get(e.getKey())));
                v.subtract(1);
                answer.multiply(v);
                minus.remove(e.getKey());
            } else {
                answer.multiply(mod.pow(2, e.getValue()));
            }
        }
        for (Map.Entry<Rate, Long> e : minus.entrySet()) {
            answer.multiply(mod.pow(2, e.getValue()));
        }
        answer.add(zeros);
        answer.subtract(1);
        out.println(answer);
    }
    private static long gcd(long a, long b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException();
        }
        return b == 0 ? a : gcd(b, a % b);
    }
    static class Rate {
        final long a;
        final long b;
        Rate(long a, long b) {
            this.a = a;
            this.b = b;
        }
        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (!(obj instanceof Rate))
                return false;
            Rate other = (Rate)obj;
            return a == other.a && b == other.b;
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
        new Main().solve(new MyScanner(System.in), w);
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
