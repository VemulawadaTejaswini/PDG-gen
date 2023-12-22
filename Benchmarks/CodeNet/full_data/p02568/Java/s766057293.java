public class Main {
    static ModIntFactory fac = new ModIntFactory(998244353);
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
        var t = new RangeAffineRangeSum(a, fac);
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
                pw.println(t.sum(l, r).value());
            }
        }
    }
}

class RangeAffineRangeSum {

    private final ModIntFactory.ModInt[] dat, lzA, lzB;
    private final int n;
    private final int log;
    private final ModIntFactory fac;
    private final ModIntFactory.ModInt ONE, ZERO;

    public RangeAffineRangeSum(int n, ModIntFactory fac) {
        int k = 1; while (k < n) k <<= 1;
        this.dat = new ModIntFactory.ModInt[k << 1];
        this.lzA = new ModIntFactory.ModInt[k];
        this.lzB = new ModIntFactory.ModInt[k];
        this.fac = fac;
        this.ONE = fac.create(1);
        this.ZERO = fac.create(0);
        this.n = k;
        this.log = Integer.numberOfTrailingZeros(k);
        java.util.Arrays.fill(dat, ZERO);
        java.util.Arrays.fill(lzA, ONE);
        java.util.Arrays.fill(lzB, ZERO);
    }

    public RangeAffineRangeSum(long[] dat, ModIntFactory fac) {
        this(dat.length, fac);
        build(dat);
    }

    private void build(long[] a) {
        for (int i = 0; i < a.length; i++) {
            dat[i + n] = fac.create(a[i]);
        }
        for (int i = n - 1; i > 0; i--) {
            dat[i] = dat[i << 1 | 0].add(dat[i << 1 | 1]);
        }
    }

    private void push(int k, int h) {
        if (lzA[k].equals(ONE) && lzB[k].equals(ZERO)) return;
        int lk = k << 1 | 0, rk = k << 1 | 1;
        dat[lk] = dat[lk].mul(lzA[k]).add(lzB[k].mul(1 << h - 1));
        dat[rk] = dat[rk].mul(lzA[k]).add(lzB[k].mul(1 << h - 1));
        if (lk < n) {
            lzA[lk] = lzA[lk].mul(lzA[k]);
            lzB[lk] = lzA[lk].mul(lzA[k]).add(lzB[k]);
        }
        if (rk < n) {
            lzA[rk] = lzA[rk].mul(lzA[k]);
            lzB[rk] = lzA[rk].mul(lzA[k]).add(lzB[k]);
        }
        lzA[k] = ONE;
        lzB[k] = ZERO;
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
            dat[k] = dat[k << 1 | 0].add(dat[k << 1 | 1]);
            k >>= 1;
        }
    }

    private void updateFrom(int lk, int rk) {
        for (int i = 1; i <= log; i++) {
            if (((lk >> i) << i) != lk) {
                int lki = lk >> i;
                dat[lki] = dat[lki << 1 | 0].add(dat[lki << 1 | 1]);
            }
            if (((rk >> i) << i) != rk) {
                int rki = (rk - 1) >> i;
                dat[rki] = dat[rki << 1 | 0].add(dat[rki << 1 | 1]);
            }
        }
    }

    public ModIntFactory.ModInt get(int i) {
        pushTo(i + n);
        return dat[i + n];
    }

    public ModIntFactory.ModInt sum(int l, int r) {
        if (l == r) return fac.create(0);
        l += n; r += n;
        pushTo(l, r);
        ModIntFactory.ModInt sum = fac.create(0);
        while (l < r) {
            if ((l & 1) == 1) sum = sum.add(dat[l++]);
            if ((r & 1) == 1) sum = sum.add(dat[--r]);
            l >>= 1; r >>= 1;
        }
        return sum;
    }

    public ModIntFactory.ModInt sum() {
        return fac.create(dat[1].value());
    }

    public void affine(int i, long a, long b) {
        pushTo(i + n);
        dat[i + n] = dat[i + n].mul(a).add(b);
        updateFrom(i + n);
    }

    public void affine(int l, int r, long a, long b) {
        if (l == r) return;
        l += n; r += n;
        pushTo(l, r);
        for (int l2 = l, r2 = r, w = 1; l2 < r2; w <<= 1) {
            if ((l2 & 1) == 1) {
                dat[l2] = dat[l2].mul(a).add(b * w);
                if (l2 < n) {
                    lzA[l2] = lzA[l2].mul(a);
                    lzB[l2] = lzB[l2].mul(a).add(b);
                }
                l2++;
            }
            if ((r2 & 1) == 1) {
                r2--;
                dat[r2] = dat[r2].mul(a).add(b * w);
                if (r2 < n) {
                    lzA[r2] = lzA[r2].mul(a);
                    lzB[r2] = lzB[r2].mul(a).add(b);
                }
            }
            l2 >>= 1; r2 >>= 1;
        }
        updateFrom(l, r);
    }
}

/**
 * @verified 
 * <ul>
 * <li> https://atcoder.jp/contests/arc050/tasks/arc050_c
 * <li> https://atcoder.jp/contests/abc129/tasks/abc129_f
 * </ul>
 */
class ModIntFactory {
    private final ModArithmetic ma;
    private final int mod;

    public ModIntFactory(int mod) {
        this.ma = ModArithmetic.of(mod);
        this.mod = mod;
    }

    public ModInt create(long value) {
        if ((value %= mod) < 0) value += mod;
        if (ma instanceof ModArithmetic.ModArithmeticMontgomery) {
            return new ModInt(((ModArithmetic.ModArithmeticMontgomery) ma).generate(value));
        }
        return new ModInt((int) value);
    }

    class ModInt {
        private int value;
        private ModInt(int value) {
            this.value = value;
        }
        public int mod() {
            return mod;
        }
        public int value() {
            if (ma instanceof ModArithmetic.ModArithmeticMontgomery) {
                return ((ModArithmetic.ModArithmeticMontgomery) ma).reduce(value);
            }
            return value;
        }
        public ModInt add(ModInt mi) {
            return new ModInt(ma.add(value, mi.value));
        }
        public ModInt add(ModInt mi1, ModInt mi2) {
            return new ModInt(ma.add(value, mi1.value)).addAsg(mi2);
        }
        public ModInt add(ModInt mi1, ModInt mi2, ModInt mi3) {
            return new ModInt(ma.add(value, mi1.value)).addAsg(mi2).addAsg(mi3);
        }
        public ModInt add(ModInt mi1, ModInt mi2, ModInt mi3, ModInt mi4) {
            return new ModInt(ma.add(value, mi1.value)).addAsg(mi2).addAsg(mi3).addAsg(mi4);
        }
        public ModInt add(ModInt mi1, ModInt... mis) {
            ModInt mi = add(mi1);
            for (ModInt m : mis) mi.addAsg(m);
            return mi;
        }
        public ModInt add(long mi) {
            return new ModInt(ma.add(value, ma.remainder(mi)));
        }
        public ModInt sub(ModInt mi) {
            return new ModInt(ma.sub(value, mi.value));
        }
        public ModInt sub(long mi) {
            return new ModInt(ma.sub(value, ma.remainder(mi)));
        }
        public ModInt mul(ModInt mi) {
            return new ModInt(ma.mul(value, mi.value));
        }
        public ModInt mul(ModInt mi1, ModInt mi2) {
            return new ModInt(ma.mul(value, mi1.value)).mulAsg(mi2);
        }
        public ModInt mul(ModInt mi1, ModInt mi2, ModInt mi3) {
            return new ModInt(ma.mul(value, mi1.value)).mulAsg(mi2).mulAsg(mi3);
        }
        public ModInt mul(ModInt mi1, ModInt mi2, ModInt mi3, ModInt mi4) {
            return new ModInt(ma.mul(value, mi1.value)).mulAsg(mi2).mulAsg(mi3).mulAsg(mi4);
        }
        public ModInt mul(ModInt mi1, ModInt... mis) {
            ModInt mi = mul(mi1);
            for (ModInt m : mis) mi.mulAsg(m);
            return mi;
        }
        public ModInt mul(long mi) {
            return new ModInt(ma.mul(value, ma.remainder(mi)));
        }
        public ModInt div(ModInt mi) {
            return new ModInt(ma.div(value, mi.value));
        }
        public ModInt div(long mi) {
            return new ModInt(ma.div(value, ma.remainder(mi)));
        }
        public ModInt inv() {
            return new ModInt(ma.inv(value));
        }
        public ModInt pow(long b) {
            return new ModInt(ma.pow(value, b));
        }
        public ModInt addAsg(ModInt mi) {
            this.value = ma.add(value, mi.value);
            return this;
        }
        public ModInt addAsg(ModInt mi1, ModInt mi2) {
            return addAsg(mi1).addAsg(mi2);
        }
        public ModInt addAsg(ModInt mi1, ModInt mi2, ModInt mi3) {
            return addAsg(mi1).addAsg(mi2).addAsg(mi3);
        }
        public ModInt addAsg(ModInt mi1, ModInt mi2, ModInt mi3, ModInt mi4) {
            return addAsg(mi1).addAsg(mi2).addAsg(mi3).addAsg(mi4);
        }
        public ModInt addAsg(ModInt... mis) {
            for (ModInt m : mis) addAsg(m);
            return this;
        }
        public ModInt addAsg(long mi) {
            this.value = ma.add(value, ma.remainder(mi));
            return this;
        }
        public ModInt subAsg(ModInt mi) {
            this.value = ma.sub(value, mi.value);
            return this;
        }
        public ModInt subAsg(long mi) {
            this.value = ma.sub(value, ma.remainder(mi));
            return this;
        }
        public ModInt mulAsg(ModInt mi) {
            this.value = ma.mul(value, mi.value);
            return this;
        }
        public ModInt mulAsg(ModInt mi1, ModInt mi2) {
            return mulAsg(mi1).mulAsg(mi2);
        }
        public ModInt mulAsg(ModInt mi1, ModInt mi2, ModInt mi3) {
            return mulAsg(mi1).mulAsg(mi2).mulAsg(mi3);
        }
        public ModInt mulAsg(ModInt mi1, ModInt mi2, ModInt mi3, ModInt mi4) {
            return mulAsg(mi1).mulAsg(mi2).mulAsg(mi3).mulAsg(mi4);
        }
        public ModInt mulAsg(ModInt... mis) {
            for (ModInt m : mis) mulAsg(m);
            return this;
        }
        public ModInt mulAsg(long mi) {
            this.value = ma.mul(value, ma.remainder(mi));
            return this;
        }
        public ModInt divAsg(ModInt mi) {
            this.value = ma.div(value, mi.value);
            return this;
        }
        public ModInt divAsg(long mi) {
            this.value = ma.div(value, ma.remainder(mi));
            return this;
        }
        @Override
        public String toString() {
            return String.valueOf(value());
        }
        @Override
        public boolean equals(Object o) {
            if (o instanceof ModInt) {
                ModInt mi = (ModInt) o;
                return mod() == mi.mod() && value() == mi.value();
            }
            return false;
        }
        @Override
        public int hashCode() {
            return (1 * 37 + mod()) * 37 + value();
        }
    }

    private interface ModArithmetic {
        public int mod();
        public int remainder(long value);
        public int add(int a, int b);
        public int sub(int a, int b);
        public int mul(int a, int b);
        public default int div(int a, int b) {
            return mul(a, inv(b));
        }
        public int inv(int a);
        public int pow(int a, long b);
    
        public static ModArithmetic of(int mod) {
            if (mod <= 0) {
                throw new IllegalArgumentException();
            } else if (mod == 1) {
                return new ModArithmetic1();
            } else if (mod == 2) {
                return new ModArithmetic2();
            } else if (mod == 998244353) {
                return new ModArithmetic998244353();
            } else if (mod == 1000000007) {
                return new ModArithmetic1000000007();
            } else if ((mod & 1) == 1) {
                return new ModArithmeticMontgomery(mod);
            } else {
                return new ModArithmeticBarrett(mod);
            }
        }
    
        static final class ModArithmetic1 implements ModArithmetic {
            public int mod() {return 1;}
            public int remainder(long value) {return 0;}
            public int add(int a, int b) {return 0;}
            public int sub(int a, int b) {return 0;}
            public int mul(int a, int b) {return 0;}
            public int inv(int a) {throw new ArithmeticException("divide by zero");}
            public int pow(int a, long b) {return 0;}
        }
        static final class ModArithmetic2 implements ModArithmetic {
            public int mod() {return 2;}
            public int remainder(long value) {return (int) (value & 1);}
            public int add(int a, int b) {return a ^ b;}
            public int sub(int a, int b) {return a ^ b;}
            public int mul(int a, int b) {return a & b;}
            public int inv(int a) {
                if (a == 0) throw new ArithmeticException("divide by zero");
                return a;
            }
            public int pow(int a, long b) {
                if (b == 0) return 1;
                return a;
            }
        }
        static final class ModArithmetic998244353 implements ModArithmetic {
            private final int mod = 998244353;
            public int mod() {
                return mod;
            }
            public int remainder(long value) {
                return (int) ((value %= mod) < 0 ? value + mod : value);
            }
            public int add(int a, int b) {
                int res = a + b;
                return res >= mod ? res - mod : res;
            }
            public int sub(int a, int b) {
                int res = a - b;
                return res < 0 ? res + mod : res;
            }
            public int mul(int a, int b) {
                return (int) (((long) a * b) % mod);
            }
            public int inv(int a) {
                int b = mod;
                long u = 1, v = 0;
                while (b >= 1) {
                    long t = a / b;
                    a -= t * b;
                    int tmp1 = a; a = b; b = tmp1;
                    u -= t * v;
                    long tmp2 = u; u = v; v = tmp2;
                }
                u %= mod;
                if (a != 1) {
                    throw new ArithmeticException("divide by zero");
                }
                return (int) (u < 0 ? u + mod : u);
            }
            public int pow(int a, long b) {
                if (b < 0) throw new ArithmeticException("negative power");
                long res = 1;
                long pow2 = a;
                long idx = 1;
                while (b > 0) {
                    long lsb = b & -b;
                    for (; lsb != idx; idx <<= 1) {
                        pow2 = (pow2 * pow2) % mod;
                    }
                    res = (res * pow2) % mod;
                    b ^= lsb;
                }
                return (int) res;
            }
        }
        static final class ModArithmetic1000000007 implements ModArithmetic {
            private final int mod = 1000000007;
            public int mod() {
                return mod;
            }
            public int remainder(long value) {
                return (int) ((value %= mod) < 0 ? value + mod : value);
            }
            public int add(int a, int b) {
                int res = a + b;
                return res >= mod ? res - mod : res;
            }
            public int sub(int a, int b) {
                int res = a - b;
                return res < 0 ? res + mod : res;
            }
            public int mul(int a, int b) {
                return (int) (((long) a * b) % mod);
            }
            public int div(int a, int b) {
                return mul(a, inv(b));
            }
            public int inv(int a) {
                int b = mod;
                long u = 1, v = 0;
                while (b >= 1) {
                    long t = a / b;
                    a -= t * b;
                    int tmp1 = a; a = b; b = tmp1;
                    u -= t * v;
                    long tmp2 = u; u = v; v = tmp2;
                }
                u %= mod;
                if (a != 1) {
                    throw new ArithmeticException("divide by zero");
                }
                return (int) (u < 0 ? u + mod : u);
            }
            public int pow(int a, long b) {
                if (b < 0) throw new ArithmeticException("negative power");
                long res = 1;
                long pow2 = a;
                long idx = 1;
                while (b > 0) {
                    long lsb = b & -b;
                    for (; lsb != idx; idx <<= 1) {
                        pow2 = (pow2 * pow2) % mod;
                    }
                    res = (res * pow2) % mod;
                    b ^= lsb;
                }
                return (int) res;
            }
        }
        static final class ModArithmeticMontgomery extends ModArithmeticDynamic {
            private final long negInv;
            private final long r2, r3;
    
            private ModArithmeticMontgomery(int mod) {
                super(mod);
                long inv = 0;
                long s = 1, t = 0;
                for (int i = 0; i < 32; i++) {
                    if ((t & 1) == 0) {
                        t += mod;
                        inv += s;
                    }
                    t >>= 1;
                    s <<= 1;
                }
                long r = (1l << 32) % mod;
                this.negInv = inv;
                this.r2 = (r * r) % mod;
                this.r3 = (r2 * r) % mod;
            }
            private int generate(long x) {
                return reduce(x * r2);
            }
            private int reduce(long x) {
                x = (x + ((x * negInv) & 0xffff_ffffl) * mod) >>> 32;
                return (int) (x < mod ? x : x - mod);
            }
            @Override
            public int remainder(long value) {
                return generate((value %= mod) < 0 ? value + mod : value);
            }
            @Override
            public int mul(int a, int b) {
                return reduce((long) a * b);
            }
            @Override
            public int inv(int a) {
                a = super.inv(a);
                return reduce(a * r3);
            }
            @Override
            public int pow(int a, long b) {
                return generate(super.pow(a, b));
            }
        }
        static final class ModArithmeticBarrett extends ModArithmeticDynamic {
            private static final long mask = 0xffff_ffffl;
            private final long mh;
            private final long ml;
            private ModArithmeticBarrett(int mod) {
                super(mod);
                /**
                 * m = floor(2^64/mod)
                 * 2^64 = p*mod + q, 2^32 = a*mod + b
                 * => (a*mod + b)^2 = p*mod + q
                 * => p = mod*a^2 + 2ab + floor(b^2/mod)
                 */
                long a = (1l << 32) / mod;
                long b = (1l << 32) % mod;
                long m = a * a * mod + 2 * a * b + (b * b) / mod;
                mh = m >>> 32;
                ml = m & mask;
            }
            private int reduce(long x) {
                long z = (x & mask) * ml;
                z = (x & mask) * mh + (x >>> 32) * ml + (z >>> 32);
                z = (x >>> 32) * mh + (z >>> 32);
                x -= z * mod;
                return (int) (x < mod ? x : x - mod);
            }
            @Override
            public int remainder(long value) {
                return (int) ((value %= mod) < 0 ? value + mod : value);
            }
            @Override
            public int mul(int a, int b) {
                return reduce((long) a * b);
            }
        }
        static class ModArithmeticDynamic implements ModArithmetic {
            final int mod;
            public ModArithmeticDynamic(int mod) {
                this.mod = mod;
            }
            public int mod() {
                return mod;
            }
            public int remainder(long value) {
                return (int) ((value %= mod) < 0 ? value + mod : value);
            }
            public int add(int a, int b) {
                int sum = a + b;
                return sum >= mod ? sum - mod : sum;
            }
            public int sub(int a, int b) {
                int sum = a - b;
                return sum < 0 ? sum + mod : sum;
            }
            public int mul(int a, int b) {
                return (int) (((long) a * b) % mod);
            }
            public int inv(int a) {
                int b = mod;
                long u = 1, v = 0;
                while (b >= 1) {
                    long t = a / b;
                    a -= t * b;
                    int tmp1 = a; a = b; b = tmp1;
                    u -= t * v;
                    long tmp2 = u; u = v; v = tmp2;
                }
                u %= mod;
                if (a != 1) {
                    throw new ArithmeticException("divide by zero");
                }
                return (int) (u < 0 ? u + mod : u);
            }
            public int pow(int a, long b) {
                if (b < 0) throw new ArithmeticException("negative power");
                int res = 1;
                int pow2 = a;
                long idx = 1;
                while (b > 0) {
                    long lsb = b & -b;
                    for (; lsb != idx; idx <<= 1) {
                        pow2 = mul(pow2, pow2);
                    }
                    res = mul(res, pow2);
                    b ^= lsb;
                }
                return res;
            }
        }
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