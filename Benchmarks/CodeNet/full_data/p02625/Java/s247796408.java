import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
    static FastScanner sc = new FastScanner(System.in);
    static StringBuilder sb = new StringBuilder();
    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {
        var fac = new ModIntFactory(1000000007);
        var sc = new FastScanner(System.in);
        var pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int m = sc.nextInt();
        var f = new ModIntFactory.ModInt[m + 1];
        f[0] = fac.create(1);
        for (int i = 1; i <= m; i++) {
            f[i] = f[i - 1].mul(i);
        }
        var finv = new ModIntFactory.ModInt[m + 1];
        finv[m] = f[m].inv();
        for (int i = m; i > 0; i--) {
            finv[i - 1] = finv[i].mul(i);
        }
        var ans = fac.create(0);
        for (int k = 0; k <= n; k++) {
            var s = f[m - n + k].mul(finv[n - k], finv[k]);
            if (((n - k) & 1) == 0) {
                ans = ans.add(s);
            } else {
                ans = ans.sub(s);
            }
        }
        ans = ans.mul(f[n], f[m], finv[m - n], finv[m - n]);
        pw.println(ans.value());
        pw.flush();
        pw.close();
    }
 
    public static long bs(long l, long a, long b, long val) {
        long lft = -1, rgt = l;
        while (rgt - lft > 1) {
            long mid = (lft + rgt) >> 1;
            if (a + b * mid < val) {
                lft = mid;
            } else {
                rgt = mid;
            }
        }
        return rgt;
    }

    /**
     * @verified 
     * <ul>
     * <li> https://atcoder.jp/contests/arc050/tasks/arc050_c
     * <li> https://atcoder.jp/contests/abc129/tasks/abc129_f
     * </ul>
     */
    static class ModIntFactory {
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
            public ModInt sub(ModInt mi) {
                return new ModInt(ma.sub(value, mi.value));
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
            public ModInt div(ModInt mi) {
                return new ModInt(ma.div(value, mi.value));
            }
            public ModInt add(long mi) {
                return new ModInt(ma.add(value, ma.remainder(mi)));
            }
            public ModInt sub(long mi) {
                return new ModInt(ma.sub(value, ma.remainder(mi)));
            }
            public ModInt mul(long mi) {
                return new ModInt(ma.mul(value, ma.remainder(mi)));
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
            public ModInt subAsg(ModInt mi) {
                this.value = ma.sub(value, mi.value);
                return this;
            }
            public ModInt mulAsg(ModInt mi) {
                this.value = ma.mul(value, mi.value);
                return this;
            }
            public ModInt divAsg(ModInt mi) {
                this.value = ma.div(value, mi.value);
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
    
    static class FastScanner {
        private final InputStream in;
        private final byte[] buf = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        public FastScanner(InputStream in) {this.in = in;}
        private boolean hasNextByte() {
            if (ptr < buflen) return true;
            ptr = 0;
            try {buflen = in.read(buf);}
            catch (final IOException e) {e.printStackTrace();}
            return buflen > 0;
        }
        private int readByte() {return hasNextByte() ? buf[ptr++] : -1;}
        public boolean hasNext() {
            while (hasNextByte() && !(33 <= buf[ptr] && buf[ptr] <= 126)) ptr++;
            return hasNextByte();
        }
        private StringBuilder nextSequence() {
            if (!hasNext()) throw new NoSuchElementException();
            final StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (33 <= b && b <= 126) {sb.appendCodePoint(b); b = readByte();}
            return sb;
        }
        public String next() {
            return nextSequence().toString();
        }
        public String next(int len) {
            return new String(nextChars(len));
        }
        public char[] nextChars() {
            final StringBuilder sb = nextSequence();
            int l = sb.length();
            char[] dst = new char[l];
            sb.getChars(0, l, dst, 0);
            return dst;
        }
        public char[] nextChars(int len) {
            if (!hasNext()) throw new NoSuchElementException();
            char[] s = new char[len];
            int i = 0;
            int b = readByte();
            while (33 <= b && b <= 126 && i < len) {s[i++] = (char) b; b = readByte();}
            if (i != len) throw new NoSuchElementException(String.format("length %d is longer than the sequence.", len));
            return s;
        }
        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {minus = true; b = readByte();}
            if (b < '0' || '9' < b) throw new NumberFormatException();
            while (true) {
                if ('0' <= b && b <= '9') n = n * 10 + b - '0';
                else if (b == -1 || !(33 <= b && b <= 126)) return minus ? -n : n;
                else throw new NumberFormatException();
                b = readByte();
            }
        }
        public int nextInt() {return Math.toIntExact(nextLong());}
        public double nextDouble() {return Double.parseDouble(next());}
    }

    static int[] nextInts(int n) {
        var dat = new int[n];
        Arrays.setAll(dat, i -> sc.nextInt());
        return dat;
    }

    static long[] nextLongs(int n) {
        var dat = new long[n];
        Arrays.setAll(dat, i -> sc.nextLong());
        return dat;
    }
}
