public class Main {
    public static void main(String[] args) throws Exception {
        var sc = new FastScanner();
        var pw = new FastPrintStream();
        solve(sc, pw);
        sc.close();
        pw.flush();
        pw.close();
    }

    public static void solve(FastScanner sc, FastPrintStream pw) {
        int n = sc.nextInt();
        int q = sc.nextInt();
        var a = new long[n];
        java.util.Arrays.setAll(a, i -> sc.nextLong());
        var t = new RangeAffineRangeSum(a);
        while (q --> 0) {
            if (sc.nextInt() == 0) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                t.affine(l, r, b, c);
            } else {
                int l = sc.nextInt();
                int r = sc.nextInt();
                pw.println(t.sum(l, r));
            }
        }
    }
}

class RangeAffineRangeSum {

    private final long[] dat, lzA, lzB;
    private final int n;
    private final int log;
    private static final int mod = 998244353;

    public RangeAffineRangeSum(int n) {
        int k = 1; while (k < n) k <<= 1;
        this.dat = new long[k << 1];
        this.lzA = new long[k];
        this.lzB = new long[k];
        this.n = k;
        this.log = Integer.numberOfTrailingZeros(k);
        java.util.Arrays.fill(lzA, 1);
    }

    public RangeAffineRangeSum(long[] dat) {
        this(dat.length);
        build(dat);
    }

    private void build(long[] a) {
        System.arraycopy(a, 0, dat, n, a.length);
        for (int i = n - 1; i > 0; i--) {
            dat[i] = dat[i << 1 | 0] + dat[i << 1 | 1];
            if (dat[i] >= mod) dat[i] -= mod;
        }
    }

    private void push(int k, int h) {
        if (lzA[k] == 1 && lzB[k] == 0) return;
        int lk = k << 1 | 0, rk = k << 1 | 1;
        dat[lk] = (lzA[k] * dat[lk] + (lzB[k] << h - 1)) % mod;
        dat[rk] = (lzA[k] * dat[rk] + (lzB[k] << h - 1)) % mod;
        if (lk < n) {
            lzA[lk] = (lzA[k] * lzA[lk]) % mod;
            lzB[lk] = (lzA[k] * lzB[lk] + lzB[k]) % mod;
        }
        if (rk < n) {
            lzA[rk] = (lzA[k] * lzA[rk]) % mod;
            lzB[rk] = (lzA[k] * lzB[rk] + lzB[k]) % mod;
        }
        lzA[k] = 1;
        lzB[k] = 0;
    }

    private void pushTo(int k) {
        for (int i = log; i > 0; i--) push(k >> i, i);
    }

    private void pushTo(int lk, int rk) {
        for (int i = log; i > 0; i--) {
            if (((lk >> i) << i) != lk) push(lk >> i, i);
            if (((rk >> i) << i) != rk) push(rk >> i, i);
        }
    }

    private void updateFrom(int k) {
        k >>= 1;
        while (k > 0) {
            dat[k] = dat[k << 1 | 0] + dat[k << 1 | 1];
            if (dat[k] >= mod) dat[k] -= mod;
            k >>= 1;
        }
    }

    private void updateFrom(int lk, int rk) {
        for (int i = 1; i <= log; i++) {
            if (((lk >> i) << i) != lk) {
                int lki = lk >> i;
                dat[lki] = dat[lki << 1 | 0] + dat[lki << 1 | 1];
                if (dat[lki] >= mod) dat[lki] -= mod;
            }
            if (((rk >> i) << i) != rk) {
                int rki = (rk - 1) >> i;
                dat[rki] = dat[rki << 1 | 0] + dat[rki << 1 | 1];
                if (dat[rki] >= mod) dat[rki] -= mod;
            }
        }
    }

    public long get(int i) {
        pushTo(i + n);
        return dat[i + n];
    }

    public long sum(int l, int r) {
        if (l == r) return 0;
        l += n; r += n;
        pushTo(l, r);
        long sum = 0;
        while (l < r) {
            if ((l & 1) == 1) sum += dat[l++];
            if ((r & 1) == 1) sum += dat[--r];
            l >>= 1; r >>= 1;
        }
        return sum % mod;
    }

    public long sum() {
        return dat[1];
    }

    public void affine(int i, long a, long b) {
        if ((a %= mod) < 0) a += mod;
        if ((b %= mod) < 0) b += mod;
        pushTo(i + n);
        dat[i + n] = (a * dat[i + n] + b) % mod;
        updateFrom(i + n);
    }

    public void affine(int l, int r, long a, long b) {
        if (l == r) return;
        if ((a %= mod) < 0) a += mod;
        if ((b %= mod) < 0) b += mod;
        l += n; r += n;
        pushTo(l, r);
        for (int l2 = l, r2 = r, w = 1; l2 < r2; w <<= 1) {
            if ((l2 & 1) == 1) {
                dat[l2] = (a * dat[l2] + b * w) % mod;
                if (l2 < n) {
                    lzA[l2] = (a * lzA[l2]) % mod;
                    lzB[l2] = (a * lzB[l2] + b) % mod;
                }
                l2++;
            }
            if ((r2 & 1) == 1) {
                r2--;
                dat[r2] = (a * dat[r2] + b * w) % mod;
                if (r2 < n) {
                    lzA[r2] = (a * lzA[r2]) % mod;
                    lzB[r2] = (a * lzB[r2] + b) % mod;
                }
            }
            l2 >>= 1; r2 >>= 1;
        }
        updateFrom(l, r);
    }
}

class FastPrintStream implements AutoCloseable {
    private static final int BUF_SIZE = 1 << 15;
    private final byte[] buf = new byte[BUF_SIZE];
    private int ptr = 0;
    private final java.lang.reflect.Field strField;
    private final java.nio.charset.CharsetEncoder encoder;

    private java.io.OutputStream out;

    public FastPrintStream(java.io.OutputStream out) {
        this.out = out;
        java.lang.reflect.Field f;
        try {
            f = java.lang.String.class.getDeclaredField("value");
            f.setAccessible(true);
        } catch (NoSuchFieldException | SecurityException e) {
            f = null;
        }
        this.strField = f;
        this.encoder = java.nio.charset.StandardCharsets.US_ASCII.newEncoder();
    }

    public FastPrintStream(java.io.File file) throws java.io.IOException {
        this(new java.io.FileOutputStream(file));
    }

    public FastPrintStream(java.lang.String filename) throws java.io.IOException {
        this(new java.io.File(filename));
    }

    public FastPrintStream() {
        this(System.out);
        try {
            java.lang.reflect.Field f = java.io.PrintStream.class.getDeclaredField("autoFlush");
            f.setAccessible(true);
            f.set(System.out, false);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException e) {
            // ignore
        }
    }

    public FastPrintStream println() {
        if (ptr == BUF_SIZE) internalFlush();
        buf[ptr++] = (byte) '\n';
        return this;
    }

    public FastPrintStream println(java.lang.Object o) {
        return print(o).println();
    }

    public FastPrintStream println(java.lang.String s) {
        return print(s).println();
    }

    public FastPrintStream println(char[] s) {
        return print(s).println();
    }

    public FastPrintStream println(char c) {
        return print(c).println();
    }

    public FastPrintStream println(int x) {
        return print(x).println();
    }

    public FastPrintStream println(long x) {
        return print(x).println();
    }

    public FastPrintStream println(double d, int precision) {
        return print(d, precision).println();
    }

    private FastPrintStream print(byte[] bytes) {
        int n = bytes.length;
        if (ptr + n > BUF_SIZE) {
            internalFlush();
            try {
                out.write(bytes);
            } catch (java.io.IOException e) {
                throw new RuntimeException();
            }
        } else {
            System.arraycopy(bytes, 0, buf, ptr, n);
            ptr += n;
        }
        return this;
    }

    public FastPrintStream print(java.lang.Object o) {
        return print(o.toString());
    }

    public FastPrintStream print(java.lang.String s) {
        if (strField == null) {
            return print(s.getBytes());
        } else {
            try {
                return print((byte[]) strField.get(s));
            } catch (IllegalAccessException e) {
                return print(s.getBytes());
            }
        }
    }

    public FastPrintStream print(char[] s) {
        try {
            return print(encoder.encode(java.nio.CharBuffer.wrap(s)).array());
        } catch (java.nio.charset.CharacterCodingException e) {
            byte[] bytes = new byte[s.length];
            for (int i = 0; i < s.length; i++) {
                bytes[i] = (byte) s[i];
            }
            return print(bytes);
        }
    }

    public FastPrintStream print(char c) {
        if (ptr == BUF_SIZE) internalFlush();
        buf[ptr++] = (byte) c;
        return this;
    }

    public FastPrintStream print(int x) {
        if (x == 0) {
            if (ptr == BUF_SIZE) internalFlush();
            buf[ptr++] = '0';
            return this;
        }
        int d = len(x);
        if (ptr + d > BUF_SIZE) internalFlush();
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr += d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        return this;
    }

    public FastPrintStream print(long x) {
        if (x == 0) {
            if (ptr == BUF_SIZE) internalFlush();
            buf[ptr++] = '0';
            return this;
        }
        int d = len(x);
        if (ptr + d > BUF_SIZE) internalFlush();
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr += d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        return this;
    }

    public FastPrintStream print(double d, int precision) {
        if (d < 0) {
            print('-');
            d = -d;
        }
        d += Math.pow(10, -d) / 2;
        print((long) d).print('.');
        d -= (long) d;
        for(int i = 0; i < precision; i++){
            d *= 10;
            print((int) d);
            d -= (int) d;
        }
        return this;
    }

    private void internalFlush() {
        try {
            out.write(buf, 0, ptr);
            ptr = 0;
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void flush() {
        try {
            out.write(buf, 0, ptr);
            out.flush();
            ptr = 0;
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {
        try {
            out.close();
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int len(int x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        int p = -10;
        for (int i = 1; i < 10; i++, p *= 10) if (x > p) return i + d;
        return 10 + d;
    }

    private static int len(long x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        long p = -10;
        for (int i = 1; i < 19; i++, p *= 10) if (x > p) return i + d;
        return 19 + d;
    }
}

class FastScanner implements AutoCloseable {
    private final java.io.InputStream in;
    private final byte[] buf = new byte[2048];
    private int ptr = 0;
    private int buflen = 0;

    public FastScanner(java.io.InputStream in) {
        this.in = in;
    }

    public FastScanner() {
        this(System.in);
    }

    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try {
            buflen = in.read(buf);
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
        return buflen > 0;
    }

    private int readByte() {
        return hasNextByte() ? buf[ptr++] : -1;
    }

    public boolean hasNext() {
        while (hasNextByte() && !(32 < buf[ptr] && buf[ptr] < 127)) ptr++;
        return hasNextByte();
    }

    private StringBuilder nextSequence() {
        if (!hasNext()) throw new java.util.NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        for (int b = readByte(); 32 < b && b < 127; b = readByte()) {
            sb.appendCodePoint(b);
        }
        return sb;
    }

    public String next() {
        return nextSequence().toString();
    }

    public String next(int len) {
        return new String(nextChars(len));
    }

    public char nextChar() {
        if (!hasNextByte()) throw new java.util.NoSuchElementException();
        return (char) readByte();
    }

    public char[] nextChars() {
        StringBuilder sb = nextSequence();
        int l = sb.length();
        char[] dst = new char[l];
        sb.getChars(0, l, dst, 0);
        return dst;
    }
    public char[] nextChars(int len) {
        if (!hasNext()) throw new java.util.NoSuchElementException();
        char[] s = new char[len];
        int i = 0;
        int b = readByte();
        while (32 < b && b < 127 && i < len) {
            s[i++] = (char) b; b = readByte();
        }
        if (i != len) {
            throw new java.util.NoSuchElementException(
                String.format("Next token has smaller length than expected.", len)
            );
        }
        return s;
    }
    public long nextLong() {
        if (!hasNext()) throw new java.util.NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) throw new NumberFormatException();
        while (true) {
            if ('0' <= b && b <= '9') {
                n = n * 10 + b - '0';
            } else if (b == -1 || !(32 < b && b < 127)) {
                return minus ? -n : n;
            } else throw new NumberFormatException();
            b = readByte();
        }
    }
    public int nextInt() {
        return Math.toIntExact(nextLong());
    }
    public double nextDouble() {
        return Double.parseDouble(next());
    }
    public void close() {
        try {
            in.close();
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }
}