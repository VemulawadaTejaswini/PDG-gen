import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import java.io.OutputStream;
import java.nio.CharBuffer;
import java.util.Collection;
import java.io.IOException;
import java.nio.charset.CharsetDecoder;
import java.lang.reflect.Field;
import java.util.stream.Collectors;
import java.nio.charset.StandardCharsets;
import java.io.UncheckedIOException;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.List;
import java.util.stream.Stream;
import java.security.AccessControlException;
import java.io.Writer;
import java.io.InputStream;

/**
 * Built using CHelper reloaded plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner2 in = new LightScanner2(inputStream);
        LightWriter2 out = new LightWriter2(outputStream);
        CKThSubstring solver = new CKThSubstring();
        solver.solve(1, in, out);
        out.close();
    }

    static class CKThSubstring {
        public void solve(int testNumber, LightScanner2 in, LightWriter2 out) {
            char[] s = in.chars();
            int n = s.length;
            int k = in.ints();
            int[] sa = StringUtil.suffixArray(s);
            List<CKThSubstring.Substring> substrings = new ArrayList<>();
            for (int i = 0; i < n && i < k + 3; i++) {
                int l = sa[i];
                for (int r = l + 1; r <= n; r++) {
                    substrings.add(new CKThSubstring.Substring(s, l, r));
                }
                substrings = substrings.stream().sorted().distinct().limit(k).collect(Collectors.toList());
            }
            out.ans(substrings.get(k - 1)).ln();
        }

        private static class Substring implements Comparable<CKThSubstring.Substring> {
            final char[] s;
            final int l;
            final int r;

            Substring(char[] s, int l, int r) {
                this.s = s;
                this.l = l;
                this.r = r;
            }

            public int compareTo(CKThSubstring.Substring o) {
                int c0 = l, c1 = o.l;
                while (c0 < r && c1 < o.r) {
                    if (s[c0] == o.s[c1]) {
                        c0++;
                        c1++;
                    } else return s[c0] < o.s[c1] ? -1 : 1;
                }
                return Integer.compare(r - c0, o.r - c1);
            }

            public boolean equals(Object o) {
                return compareTo((CKThSubstring.Substring) o) == 0;
            }

            public int hashCode() {
                return 0;
            }

            public String toString() {
                char[] ns = new char[r - l];
                System.arraycopy(s, l, ns, 0, r - l);
                return String.valueOf(ns);
            }

        }

    }

    static class IntroSort {
        private static int INSERTIONSORT_THRESHOLD = 16;

        private IntroSort() {
        }

        static void sort(int[] a, int low, int high, int maxDepth, IntComparator comparator) {
            while (high - low > INSERTIONSORT_THRESHOLD) {
                if (maxDepth-- == 0) {
                    HeapSort.sort(a, low, high, comparator);
                    return;
                }
                int cut = QuickSort.step(a, low, high, comparator);
                sort(a, cut, high, maxDepth, comparator);
                high = cut;
            }
            InsertionSort.sort(a, low, high, comparator);
        }

        public static void sort(int[] a, IntComparator comparator) {
            if (a.length <= INSERTIONSORT_THRESHOLD) {
                InsertionSort.sort(a, 0, a.length, comparator);
            } else {
                sort(a, 0, a.length, 2 * BitMath.msb(a.length), comparator);
            }
        }

    }

    static class HeapSort {
        private HeapSort() {
        }

        private static void heapfy(int[] a, int low, int high, int i, int val, IntComparator comparator) {
            int child = 2 * i - low + 1;
            while (child < high) {
                if (child + 1 < high && comparator.compare(a[child], a[child + 1]) < 0) {
                    child++;
                }
                if (comparator.compare(val, a[child]) >= 0) {
                    break;
                }
                a[i] = a[child];
                i = child;
                child = 2 * i - low + 1;
            }
            a[i] = val;
        }

        static void sort(int[] a, int low, int high, IntComparator comparator) {
            for (int p = (high + low) / 2 - 1; p >= low; p--) {
                heapfy(a, low, high, p, a[p], comparator);
            }
            while (high > low) {
                high--;
                int pval = a[high];
                a[high] = a[low];
                heapfy(a, low, high, low, pval, comparator);
            }
        }

    }

    static class QuickSort {
        private QuickSort() {
        }

        private static void med(int[] a, int low, int x, int y, int z, IntComparator comparator) {
            if (comparator.compare(a[z], a[x]) < 0) {
                ArrayUtil.swap(a, low, x);
            } else if (comparator.compare(a[y], a[z]) < 0) {
                ArrayUtil.swap(a, low, y);
            } else {
                ArrayUtil.swap(a, low, z);
            }
        }

        static int step(int[] a, int low, int high, IntComparator comparator) {
            int x = low + 1, y = low + (high - low) / 2, z = high - 1;
            if (comparator.compare(a[x], a[y]) < 0) {
                med(a, low, x, y, z, comparator);
            } else {
                med(a, low, y, x, z, comparator);
            }

            int lb = low + 1, ub = high;
            while (true) {
                while (comparator.compare(a[lb], a[low]) < 0) {
                    lb++;
                }
                ub--;
                while (comparator.compare(a[low], a[ub]) < 0) {
                    ub--;
                }
                if (lb >= ub) {
                    return lb;
                }
                ArrayUtil.swap(a, lb, ub);
                lb++;
            }
        }

    }

    static abstract class LightScannerAdapter implements AutoCloseable {
        public abstract void close();

    }

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static void swap(int[] a, int x, int y) {
            int t = a[x];
            a[x] = a[y];
            a[y] = t;
        }

    }

    static interface IntComparator {
        int compare(int k1, int k2);

    }

    static class LightWriter2 implements AutoCloseable {
        private static final int BUF_SIZE = 1024 * 1024;
        private static final int BUF_THRESHOLD = 64 * 1024;
        private final OutputStream out;
        private final byte[] buf = new byte[BUF_SIZE];
        private int ptr;
        private final Field fastStringAccess;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter2(OutputStream out) {
            this.out = out;
            Field f;
            try {
                f = String.class.getDeclaredField("value");
                f.setAccessible(true);
                if (f.getType() != byte[].class) f = null;
            } catch (ReflectiveOperationException | AccessControlException ignored) {
                f = null;
            }
            this.fastStringAccess = f;
        }

        public LightWriter2(Writer out) {
            this.out = new LightWriter2.WriterOutputStream(out);
            this.fastStringAccess = null;
        }

        private void allocate(int n) {
            if (ptr + n <= BUF_SIZE) return;
            try {
                out.write(buf, 0, ptr);
                ptr = 0;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            if (BUF_SIZE < n) throw new IllegalArgumentException("Internal buffer exceeded");
        }

        public void close() {
            try {
                out.write(buf, 0, ptr);
                ptr = 0;
                out.flush();
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

        public LightWriter2 print(char c) {
            allocate(1);
            buf[ptr++] = (byte) c;
            breaked = false;
            return this;
        }

        public LightWriter2 print(String s) {
            byte[] bytes;
            if (this.fastStringAccess == null) bytes = s.getBytes();
            else {
                try {
                    bytes = (byte[]) fastStringAccess.get(s);
                } catch (IllegalAccessException ignored) {
                    bytes = s.getBytes();
                }
            }
            int n = bytes.length;
            if (n <= BUF_THRESHOLD) {
                allocate(n);
                System.arraycopy(bytes, 0, buf, ptr, n);
                ptr += n;
                return this;
            }
            try {
                out.write(buf, 0, ptr);
                ptr = 0;
                out.write(bytes);
                out.flush();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter2 ans(String s) {
            if (!breaked) {
                print(' ');
            }
            breaked = false;
            return print(s);
        }

        public LightWriter2 ans(Object obj) {
            return ans(Objects.toString(obj));
        }

        public LightWriter2 ln() {
            print(System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
                } catch (IOException ex) {
                    throw new UncheckedIOException(ex);
                }
            }
            return this;
        }

        private static class WriterOutputStream extends OutputStream {
            final Writer writer;
            final CharsetDecoder decoder;

            WriterOutputStream(Writer writer) {
                this.writer = writer;
                this.decoder = StandardCharsets.UTF_8.newDecoder();
            }

            public void write(int b) throws IOException {
                writer.write(b);
            }

            public void write(byte[] b) throws IOException {
                writer.write(decoder.decode(ByteBuffer.wrap(b)).array());
            }

            public void write(byte[] b, int off, int len) throws IOException {
                writer.write(decoder.decode(ByteBuffer.wrap(b, off, len)).array());
            }

            public void flush() throws IOException {
                writer.flush();
            }

            public void close() throws IOException {
                writer.close();
            }

        }

    }

    static class StringUtil {
        private static final int SA_THRESHOLD_NAIVE = 10;
        private static final int SA_THRESHOLD_DOUBLING = 40;

        private StringUtil() {
        }

        private static int[] saNaive(int[] s) {
            int n = s.length;
            int[] sa = new int[n];
            for (int i = 0; i < n; i++) sa[i] = i;
            IntroSort.sort(sa, (l, r) -> {
                while (l < n && r < n) {
                    if (s[l] != s[r]) return s[l] - s[r];
                    l++;
                    r++;
                }
                return r - l;
            });
            return sa;
        }

        private static int[] saDoubling(int[] s) {
            int n = s.length;
            int[] sa = new int[n];
            for (int i = 0; i < n; i++) sa[i] = i;
            int[] rnk = s.clone();
            int[] tmp = new int[n];

            for (int k = 1; k < n; k *= 2) {
                final int _k = k;
                final int[] _rnk = rnk;
                IntComparator cmp = (x, y) -> {
                    if (_rnk[x] != _rnk[y]) return _rnk[x] - _rnk[y];
                    int rx = x + _k < n ? _rnk[x + _k] : -1;
                    int ry = y + _k < n ? _rnk[y + _k] : -1;
                    return rx - ry;
                };
                IntroSort.sort(sa, cmp);
                tmp[sa[0]] = 0;
                for (int i = 1; i < n; i++) {
                    tmp[sa[i]] = tmp[sa[i - 1]] + (cmp.compare(sa[i - 1], sa[i]) < 0 ? 1 : 0);
                }
                int[] buf = tmp;
                tmp = rnk;
                rnk = buf;
            }
            return sa;
        }

        private static int[] sais(int[] s, int upper) {
            int n = s.length;
            if (n == 0) return new int[0];
            if (n == 1) return new int[]{0};
            if (n == 2) {
                return s[0] < s[1] ? new int[]{0, 1} : new int[]{1, 0};
            }
            if (n < SA_THRESHOLD_NAIVE) return saNaive(s);
            if (n < SA_THRESHOLD_DOUBLING) return saDoubling(s);

            int[] sa = new int[n];
            boolean[] ls = new boolean[n];
            for (int i = n - 2; i >= 0; i--) {
                ls[i] = s[i] < s[i + 1] || (s[i] == s[i + 1] && ls[i + 1]);
            }

            int[] sumL = new int[upper + 1];
            int[] sumS = new int[upper + 1];

            for (int i = 0; i < n; i++) {
                if (ls[i]) {
                    sumL[s[i] + 1]++;
                } else {
                    sumS[s[i]]++;
                }
            }

            for (int i = 0; i <= upper; i++) {
                sumS[i] += sumL[i];
                if (i < upper) sumL[i + 1] += sumS[i];
            }

            Consumer<int[]> induce = lms -> {
                Arrays.fill(sa, -1);
                int[] buf = new int[upper + 1];
                System.arraycopy(sumS, 0, buf, 0, upper + 1);
                for (int d : lms) {
                    if (d == n) continue;
                    sa[buf[s[d]]++] = d;
                }
                System.arraycopy(sumL, 0, buf, 0, upper + 1);
                sa[buf[s[n - 1]]++] = n - 1;
                for (int i = 0; i < n; i++) {
                    int v = sa[i];
                    if (v >= 1 && !ls[v - 1]) {
                        sa[buf[s[v - 1]]++] = v - 1;
                    }
                }
                System.arraycopy(sumL, 0, buf, 0, upper + 1);
                for (int i = n - 1; i >= 0; i--) {
                    int v = sa[i];
                    if (v >= 1 && ls[v - 1]) {
                        sa[--buf[s[v - 1] + 1]] = v - 1;
                    }
                }
            };

            int[] lmsMap = new int[n + 1];
            Arrays.fill(lmsMap, -1);
            int m = 0;
            for (int i = 1; i < n; i++) {
                if (!ls[i - 1] && ls[i]) lmsMap[i] = m++;
            }

            int[] lms = new int[m];
            {
                int p = 0;
                for (int i = 1; i < n; i++) {
                    if (!ls[i - 1] && ls[i]) lms[p++] = i;
                }
            }

            induce.accept(lms);

            if (m == 0) return sa;
            int[] sortedLms = new int[m];
            {
                int p = 0;
                for (int v : sa) {
                    if (lmsMap[v] != -1) sortedLms[p++] = v;
                }
            }
            int[] recS = new int[m];
            int recUpper = 0;
            recS[lmsMap[sortedLms[0]]] = 0;
            for (int i = 1; i < m; i++) {
                int l = sortedLms[i - 1], r = sortedLms[i];
                int endL = (lmsMap[l] + 1 < m) ? lms[lmsMap[l] + 1] : n;
                int endR = (lmsMap[r] + 1 < m) ? lms[lmsMap[r] + 1] : n;
                boolean same = true;
                if (endL - l != endR - r) {
                    same = false;
                } else {
                    while (l < endL && s[l] == s[r]) {
                        l++;
                        r++;
                    }
                    if (l == n || s[l] != s[r]) same = false;
                }
                if (!same) {
                    recUpper++;
                }
                recS[lmsMap[sortedLms[i]]] = recUpper;
            }

            int[] recSA = sais(recS, recUpper);
            for (int i = 0; i < m; i++) {
                sortedLms[i] = lms[recSA[i]];
            }
            induce.accept(sortedLms);
            return sa;
        }

        public static int[] suffixArray(char[] s) {
            int n = s.length;
            int[] s2 = new int[n];
            for (int i = 0; i < n; i++) s2[i] = s[i] - 32;
            return sais(s2, 96);
        }

    }

    static final class BitMath {
        private BitMath() {
        }

        public static int count(int v) {
            return Integer.bitCount(v);
        }

        public static int msb(int v) {
            if (v == 0) {
                throw new IllegalArgumentException("Bit not found");
            }
            v |= (v >> 1);
            v |= (v >> 2);
            v |= (v >> 4);
            v |= (v >> 8);
            v |= (v >> 16);
            return count(v) - 1;
        }

    }

    static class LightScanner2 extends LightScannerAdapter {
        private static final int BUF_SIZE = 1024 * 1024;
        private final InputStream stream;
        private final StringBuilder builder = new StringBuilder();
        private final byte[] buf = new byte[BUF_SIZE];
        private int ptr;
        private int len;

        public LightScanner2(InputStream stream) {
            this.stream = stream;
        }

        private int read() {
            if (ptr < len) return buf[ptr++];
            try {
                ptr = 0;
                len = stream.read(buf);
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            if (len == -1) return -1;
            return buf[ptr++];
        }

        private void skip() {
            int b;
            while (isTokenSeparator(b = read()) && b != -1) ;
            if (b == -1) throw new NoSuchElementException("EOF");
            ptr--;
        }

        private void loadToken() {
            builder.setLength(0);
            skip();
            for (int b = read(); !isTokenSeparator(b); b = read()) {
                builder.appendCodePoint(b);
            }
        }

        public char[] chars() {
            loadToken();
            char[] res = new char[builder.length()];
            builder.getChars(0, builder.length(), res, 0);
            return res;
        }

        public int ints() {
            long x = longs();
            if (x < Integer.MIN_VALUE || Integer.MAX_VALUE < x) throw new NumberFormatException("Overflow");
            return (int) x;
        }

        public long longs() {
            skip();
            int b = read();
            boolean negate;
            if (b == '-') {
                negate = true;
                b = read();
            } else negate = false;
            long x = 0;
            for (; !isTokenSeparator(b); b = read()) {
                if ('0' <= b && b <= '9') x = x * 10 + b - '0';
                else throw new NumberFormatException("Unexpected character '" + b + "'");
            }
            return negate ? -x : x;
        }

        public void close() {
            try {
                stream.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

        private static boolean isTokenSeparator(int b) {
            return b < 33 || 126 < b;
        }

    }

    static class InsertionSort {
        private InsertionSort() {
        }

        static void sort(int[] a, int low, int high, IntComparator comparator) {
            for (int i = low; i < high; i++) {
                for (int j = i; j > low && comparator.compare(a[j - 1], a[j]) > 0; j--) {
                    ArrayUtil.swap(a, j - 1, j);
                }
            }
        }

    }
}

