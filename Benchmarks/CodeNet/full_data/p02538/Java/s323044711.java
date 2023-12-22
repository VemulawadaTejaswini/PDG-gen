import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

public final class Main {
    private static final Mod mod = new Mod(998_244_353);
    private static final int[] pow10 = mod.preprocessPow(10, 200_000);
    private static final int[][] sameNums;
    static {
        sameNums = new int[200_001][10];
        for (int i = 1, v = 1; i < sameNums.length; i++) {
            sameNums[i][1] = v;
            for (int j = 2; j < 10; j++) {
                sameNums[i][j] = mod.multiply(v, j);
            }
            v = mod.add(mod.multiply(v, 10), 1);
        }
    }
    void solve(MyScanner in, MyWriter out) {
        int n = in.nextInt();
        int q = in.nextInt();
        var dat = new Elem[n];
        Arrays.fill(dat, new Elem(1, 1));
        var s = new LazySegTree<>(dat,
                                  Elem::add,
                                  Elem.id,
                                  Func::map,
                                  Func::compose,
                                  Func.id);
        for (int i = 0; i < q; i++) {
            int l = in.nextInt() - 1;
            int r = in.nextInt();
            int d = in.nextInt();
            s.apply(l, r, Func.of(d));
            out.println(s.allProd().value);
        }
    }
    static final class Elem {
        static final Elem id = new Elem(0, 0);
        final int value;
        final int digitCount;
        Elem(int value, int digitCount) {
            this.value = value;
            this.digitCount = digitCount;
        }
        Elem add(Elem e) {
            if (this == id)
                return e;
            int a = mod.multiply(value, pow10[e.digitCount]);
            int b = mod.add(a, e.value);
            return new Elem(b, digitCount + e.digitCount);
        }
    }
    static final class Func {
        static final Func id = new Func(0);
        final int digit;
        Func(int digit) {
            this.digit = digit;
        }
        Elem map(Elem e) {
            if (this == id)
                return e;
            return new Elem(sameNums[e.digitCount][digit], e.digitCount);
        }
        Func compose(Func g) {
            return this == id ? g : this;
        }
        static final Func[] objs;
        static {
            objs = new Func[10];
            for (int i = 1; i < 10; i++) {
                objs[i] = new Func(i);
            }
        }
        static Func of(int digit) {
            return objs[digit];
        }
    }
    static class LazySegTree<S, F> {
        final int MAX;

        final int N;
        final int Log;
        final java.util.function.BinaryOperator<S> Op;
        final S E;
        final java.util.function.BiFunction<F, S, S> Mapping;
        final java.util.function.BinaryOperator<F> Composition;
        final F Id;

        final S[] Dat;
        final F[] Laz;

        @SuppressWarnings("unchecked")
        public LazySegTree(int n,
                           java.util.function.BinaryOperator<S> op,
                           S e,
                           java.util.function.BiFunction<F, S, S> mapping,
                           java.util.function.BinaryOperator<F> composition,
                           F id) {
            this.MAX = n;
            int k = 1;
            while (k < n)
                k <<= 1;
            this.N = k;
            this.Log = Integer.numberOfTrailingZeros(N);
            this.Op = op;
            this.E = e;
            this.Mapping = mapping;
            this.Composition = composition;
            this.Id = id;
            this.Dat = (S[])new Object[N << 1];
            this.Laz = (F[])new Object[N];
            java.util.Arrays.fill(Dat, E);
            java.util.Arrays.fill(Laz, Id);
        }

        public LazySegTree(S[] dat,
                           java.util.function.BinaryOperator<S> op,
                           S e,
                           java.util.function.BiFunction<F, S, S> mapping,
                           java.util.function.BinaryOperator<F> composition,
                           F id) {
            this(dat.length, op, e, mapping, composition, id);
            build(dat);
        }

        private void build(S[] dat) {
            int l = dat.length;
            System.arraycopy(dat, 0, Dat, N, l);
            for (int i = N - 1; i > 0; i--) {
                Dat[i] = Op.apply(Dat[i << 1 | 0], Dat[i << 1 | 1]);
            }
        }

        private void push(int k) {
            if (Laz[k] == Id)
                return;
            int lk = k << 1 | 0, rk = k << 1 | 1;
            Dat[lk] = Mapping.apply(Laz[k], Dat[lk]);
            Dat[rk] = Mapping.apply(Laz[k], Dat[rk]);
            if (lk < N)
                Laz[lk] = Composition.apply(Laz[k], Laz[lk]);
            if (rk < N)
                Laz[rk] = Composition.apply(Laz[k], Laz[rk]);
            Laz[k] = Id;
        }

        private void pushTo(int k) {
            for (int i = Log; i > 0; i--)
                push(k >> i);
        }

        private void pushTo(int lk, int rk) {
            for (int i = Log; i > 0; i--) {
                if (((lk >> i) << i) != lk)
                    push(lk >> i);
                if (((rk >> i) << i) != rk)
                    push(rk >> i);
            }
        }

        private void updateFrom(int k) {
            k >>= 1;
            while (k > 0) {
                Dat[k] = Op.apply(Dat[k << 1 | 0], Dat[k << 1 | 1]);
                k >>= 1;
            }
        }

        private void updateFrom(int lk, int rk) {
            for (int i = 1; i <= Log; i++) {
                if (((lk >> i) << i) != lk) {
                    int lki = lk >> i;
                    Dat[lki] = Op.apply(Dat[lki << 1 | 0], Dat[lki << 1 | 1]);
                }
                if (((rk >> i) << i) != rk) {
                    int rki = (rk - 1) >> i;
                    Dat[rki] = Op.apply(Dat[rki << 1 | 0], Dat[rki << 1 | 1]);
                }
            }
        }

        public void set(int p, S x) {
            exclusiveRangeCheck(p);
            p += N;
            pushTo(p);
            Dat[p] = x;
            updateFrom(p);
        }

        public S get(int p) {
            exclusiveRangeCheck(p);
            p += N;
            pushTo(p);
            return Dat[p];
        }

        public S prod(int l, int r) {
            if (l > r) {
                throw new IllegalArgumentException(String.format("Invalid range: [%d, %d)",
                                                                 l,
                                                                 r));
            }
            inclusiveRangeCheck(l);
            inclusiveRangeCheck(r);
            if (l == r)
                return E;
            l += N;
            r += N;
            pushTo(l, r);
            S sumLeft = E, sumRight = E;
            while (l < r) {
                if ((l & 1) == 1)
                    sumLeft = Op.apply(sumLeft, Dat[l++]);
                if ((r & 1) == 1)
                    sumRight = Op.apply(Dat[--r], sumRight);
                l >>= 1;
                r >>= 1;
            }
            return Op.apply(sumLeft, sumRight);
        }

        public S allProd() {
            return Dat[1];
        }

        public void apply(int p, F f) {
            exclusiveRangeCheck(p);
            p += N;
            pushTo(p);
            Dat[p] = Mapping.apply(f, Dat[p]);
            updateFrom(p);
        }

        public void apply(int l, int r, F f) {
            if (l > r) {
                throw new IllegalArgumentException(String.format("Invalid range: [%d, %d)",
                                                                 l,
                                                                 r));
            }
            inclusiveRangeCheck(l);
            inclusiveRangeCheck(r);
            if (l == r)
                return;
            l += N;
            r += N;
            pushTo(l, r);
            for (int l2 = l, r2 = r; l2 < r2;) {
                if ((l2 & 1) == 1) {
                    Dat[l2] = Mapping.apply(f, Dat[l2]);
                    if (l2 < N)
                        Laz[l2] = Composition.apply(f, Laz[l2]);
                    l2++;
                }
                if ((r2 & 1) == 1) {
                    r2--;
                    Dat[r2] = Mapping.apply(f, Dat[r2]);
                    if (r2 < N)
                        Laz[r2] = Composition.apply(f, Laz[r2]);
                }
                l2 >>= 1;
                r2 >>= 1;
            }
            updateFrom(l, r);
        }

        public int maxRight(int l, java.util.function.Predicate<S> g) {
            inclusiveRangeCheck(l);
            if (!g.test(E)) {
                throw new IllegalArgumentException("Identity element must satisfy the condition.");
            }
            if (l == MAX)
                return MAX;
            l += N;
            pushTo(l);
            S sum = E;
            do {
                l >>= Integer.numberOfTrailingZeros(l);
                if (!g.test(Op.apply(sum, Dat[l]))) {
                    while (l < N) {
                        push(l);
                        l = l << 1;
                        if (g.test(Op.apply(sum, Dat[l]))) {
                            sum = Op.apply(sum, Dat[l]);
                            l++;
                        }
                    }
                    return l - N;
                }
                sum = Op.apply(sum, Dat[l]);
                l++;
            } while ((l & -l) != l);
            return MAX;
        }

        public int minLeft(int r, java.util.function.Predicate<S> g) {
            inclusiveRangeCheck(r);
            if (!g.test(E)) {
                throw new IllegalArgumentException("Identity element must satisfy the condition.");
            }
            if (r == 0)
                return 0;
            r += N;
            pushTo(r - 1);
            S sum = E;
            do {
                r--;
                while (r > 1 && (r & 1) == 1)
                    r >>= 1;
                if (!g.test(Op.apply(Dat[r], sum))) {
                    while (r < N) {
                        push(r);
                        r = r << 1 | 1;
                        if (g.test(Op.apply(Dat[r], sum))) {
                            sum = Op.apply(Dat[r], sum);
                            r--;
                        }
                    }
                    return r + 1 - N;
                }
                sum = Op.apply(Dat[r], sum);
            } while ((r & -r) != r);
            return 0;
        }

        private void exclusiveRangeCheck(int p) {
            if (p < 0 || p >= MAX) {
                throw new IndexOutOfBoundsException(String.format("Index %d is not in [%d, %d).",
                                                                  p,
                                                                  0,
                                                                  MAX));
            }
        }

        private void inclusiveRangeCheck(int p) {
            if (p < 0 || p > MAX) {
                throw new IndexOutOfBoundsException(String.format("Index %d is not in [%d, %d].",
                                                                  p,
                                                                  0,
                                                                  MAX));
            }
        }

        // **************** DEBUG **************** //

        private int indent = 6;

        public void setIndent(int newIndent) {
            this.indent = newIndent;
        }

        @Override
        public String toString() {
            return toSimpleString();
        }

        private S[] simulatePushAll() {
            S[] simDat = java.util.Arrays.copyOf(Dat, 2 * N);
            F[] simLaz = java.util.Arrays.copyOf(Laz, 2 * N);
            for (int k = 1; k < N; k++) {
                if (simLaz[k] == Id)
                    continue;
                int lk = k << 1 | 0, rk = k << 1 | 1;
                simDat[lk] = Mapping.apply(simLaz[k], simDat[lk]);
                simDat[rk] = Mapping.apply(simLaz[k], simDat[rk]);
                if (lk < N)
                    simLaz[lk] = Composition.apply(simLaz[k], simLaz[lk]);
                if (rk < N)
                    simLaz[rk] = Composition.apply(simLaz[k], simLaz[rk]);
                simLaz[k] = Id;
            }
            return simDat;
        }

        public String toDetailedString() {
            return toDetailedString(1, 0, simulatePushAll());
        }

        private String toDetailedString(int k, int sp, S[] dat) {
            if (k >= N)
                return indent(sp) + dat[k];
            String s = "";
            s += toDetailedString(k << 1 | 1, sp + indent, dat);
            s += "\n";
            s += indent(sp) + dat[k];
            s += "\n";
            s += toDetailedString(k << 1 | 0, sp + indent, dat);
            return s;
        }

        private static String indent(int n) {
            StringBuilder sb = new StringBuilder();
            while (n-- > 0)
                sb.append(' ');
            return sb.toString();
        }

        public String toSimpleString() {
            S[] dat = simulatePushAll();
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i = 0; i < N; i++) {
                sb.append(dat[i + N]);
                if (i < N - 1)
                    sb.append(',').append(' ');
            }
            sb.append(']');
            return sb.toString();
        }
    }
    static final class Mod {
        final int divisor;

        Mod(int divisor) {
            if (divisor <= 0)
                throw new IllegalArgumentException();
            this.divisor = divisor;
        }
        int mod(long dividend) {
            return Math.floorMod(dividend, divisor);
        }
        int add(long a, long b) {
            return mod((long)mod(a) + mod(b));
        }
        int subtract(long a, long b) {
            return mod(mod(a) - mod(b));
        }
        int multiply(long a, long b) {
            return mod((long)mod(a) * mod(b));
        }
        int pow(long base, long exponent) {
            if (exponent < 0)
                throw new IllegalArgumentException();
            int result = 1;
            int b = mod(base);
            for (long e = exponent; e > 0; e >>= 1) {
                if ((e & 1) == 1)
                    result = multiply(result, b);
                b = multiply(b, b);
            }
            return result;
        }
        int[] preprocessPow(long base, int maxExponent) {
            var result = new int[maxExponent + 1];
            result[0] = 1;
            for (int i = 0; i < maxExponent; i++)
                result[i + 1] = multiply(result[i], base);
            return result;
        }
        int inverse(long a) {
            // assert isCoprime(a, divisor);
            if (a == 0)
                throw new IllegalArgumentException();
            return pow(a, divisor - 2);
        }
        int div(long dividend, long divisor) {
            return multiply(dividend, inverse(divisor));
        }
        int[] factorial(int maxN) {
            var a = new int[maxN + 1];
            a[0] = 1;
            for (int i = 1; i < a.length; i++)
                a[i] = multiply(a[i - 1], i);
            return a;
        }
        int[] inverseFactorial(int[] factorial) {
            int len = factorial.length;
            var a = new int[len];
            a[len - 1] = inverse(factorial[len - 1]);
            for (int i = len - 1; i > 0; i--)
                a[i - 1] = multiply(a[i], i);
            return a;
        }
        Int intOf(long initialValue) {
            return new Int(initialValue);
        }
        Combination combination(int maxN) {
            int[] fact = factorial(maxN);
            int[] invFact = inverseFactorial(fact);
            return new Combination(fact, invFact);
        }
        final class Int {
            int value;

            private Int(long initialValue) {
                value = mod(initialValue);
            }
            Int add(long a) {
                value = Mod.this.add(value, a);
                return this;
            }
            Int add(Int a) {
                return add(a.value);
            }
            Int subtract(long a) {
                value = Mod.this.subtract(value, a);
                return this;
            }
            Int subtract(Int a) {
                return subtract(a.value);
            }
            Int multiply(long a) {
                value = Mod.this.multiply(value, a);
                return this;
            }
            Int multiply(Int a) {
                return multiply(a.value);
            }
            Int pow(long a) {
                value = Mod.this.pow(value, a);
                return this;
            }
            Int inverse() {
                value = Mod.this.inverse(value);
                return this;
            }
            Int div(long a) {
                value = Mod.this.div(value, a);
                return this;
            }
            Int div(Int a) {
                return div(a.value);
            }
            @Override
            public String toString() {
                return Integer.toString(value);
            }
        }
        final class Combination {
            final int[] factorial;
            final int[] inverseFactorial;

            Combination(int[] factorial, int[] inverseFactorial) {
                this.factorial = factorial;
                this.inverseFactorial = inverseFactorial;
            }
            int of(int n, int k) {
                if (k > n)
                    return 0;
                return multiply(multiply(factorial[n], inverseFactorial[k]),
                                inverseFactorial[n - k]);
            }
            Permutation permutation() {
                return new Permutation(factorial, inverseFactorial);
            }
        }
        final class Permutation {
            final int[] factorial;
            final int[] inverseFactorial;

            Permutation(int[] factorial, int[] inverseFactorial) {
                this.factorial = factorial;
                this.inverseFactorial = inverseFactorial;
            }
            int of(int n, int k) {
                if (k > n)
                    return 0;
                return multiply(factorial[n], inverseFactorial[n - k]);
            }
        }
    }
    public static void main(String[] args) {
        MyWriter w = new MyWriter(System.out);
        new Main().solve(new MyScanner(System.in), w);
        w.flush();
    }
    static final class MyScanner {
        private static final int DEFAULT_BUFFER_SIZE = 8192;
        private final InputStream in;
        private final byte[] buffer;
        private int point;
        private int readLength;

        MyScanner(InputStream in) {
            this(in, DEFAULT_BUFFER_SIZE);
        }
        MyScanner(InputStream in, int bufferSize) {
            this.in = Objects.requireNonNull(in);
            buffer = new byte[bufferSize];
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
            if (readLength == -1)
                return -1;
            point = 1;
            return buffer[0];
        }
        private static boolean isVisibleChar(int c) {
            return 33 <= c && c <= 126;
        }
        char nextChar() {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c)))
                c = readByte();
            if (c == -1)
                throw new NoSuchElementException();
            return (char)c;
        }
        String next() {
            return next(16);
        }
        String next(int n) {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c)))
                c = readByte();
            if (c == -1)
                throw new NoSuchElementException();
            StringBuilder b = new StringBuilder(n);
            do {
                b.append((char)c);
                c = readByte();
            } while (c != -1 && isVisibleChar(c));
            return b.toString();
        }
        long nextLong() {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c)))
                c = readByte();
            if (c == -1)
                throw new NoSuchElementException();
            boolean minus = false;
            long limit = -Long.MAX_VALUE;
            if (c == '-') {
                minus = true;
                limit = Long.MIN_VALUE;
                c = readByte();
            }
            long n = 0L;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                if (n < limit / 10L)
                    throw new InputMismatchException();
                n *= 10L;
                int digit = c - '0';
                if (n < limit + digit)
                    throw new InputMismatchException();
                n -= digit;
                c = readByte();
            } while (c != -1 && isVisibleChar(c));
            return minus ? n : -n;
        }
        int nextInt() {
            long n = nextLong();
            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE)
                throw new InputMismatchException();
            return (int)n;
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        int[] nextIntArray(int n) {
            int[] result = new int[n];
            for (int i = 0; i < n; i++)
                result[i] = nextInt();
            return result;
        }
        long[] nextLongArray(int n) {
            long[] result = new long[n];
            for (int i = 0; i < n; i++)
                result[i] = nextLong();
            return result;
        }
        char[] nextCharArray(int n) {
            char[] result = new char[n];
            for (int i = 0; i < n; i++)
                result[i] = nextChar();
            return result;
        }
        int[][] next2dIntArray(int h, int w) {
            var result = new int[h][w];
            for (int i = 0; i < h; i++)
                for (int j = 0; j < w; j++)
                    result[i][j] = nextInt();
            return result;
        }
        long[][] next2dLongArray(int h, int w) {
            var result = new long[h][w];
            for (int i = 0; i < h; i++)
                for (int j = 0; j < w; j++)
                    result[i][j] = nextLong();
            return result;
        }
        char[][] next2dCharArray(int h, int w) {
            char[][] result = new char[h][w];
            for (int i = 0; i < h; i++)
                for (int j = 0; j < w; j++)
                    result[i][j] = nextChar();
            return result;
        }
        int[][] nextVerticalIntArrays(int arrayCount, int arrayLength) {
            int[][] result = new int[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++)
                for (int j = 0; j < arrayCount; j++)
                    result[j][i] = nextInt();
            return result;
        }
        long[][] nextVerticalLongArrays(int arrayCount, int arrayLength) {
            long[][] result = new long[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++)
                for (int j = 0; j < arrayCount; j++)
                    result[j][i] = nextLong();
            return result;
        }
        char[][] nextVerticalCharArrays(int arrayCount, int arrayLength) {
            char[][] result = new char[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++)
                for (int j = 0; j < arrayCount; j++)
                    result[j][i] = nextChar();
            return result;
        }
        List<String> nextStringList(int n) {
            var result = new ArrayList<String>(n);
            for (int i = 0; i < n; i++)
                result.add(next());
            return result;
        }
        List<Integer> nextIntList(int n) {
            var result = new ArrayList<Integer>(n);
            for (int i = 0; i < n; i++)
                result.add(nextInt());
            return result;
        }
        List<Long> nextLongList(int n) {
            var result = new ArrayList<Long>(n);
            for (int i = 0; i < n; i++)
                result.add(nextLong());
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
            Objects.requireNonNull(delimiter);
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
            Objects.requireNonNull(delimiter);
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
            Objects.requireNonNull(delimiter);
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
