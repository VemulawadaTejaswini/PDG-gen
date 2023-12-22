import java.util.*;
import java.io.*;
import java.text.*;

class Main{
    //SOLUTION BEGIN
    //Into the Hardware Mode
    final long MOD = 998244353;
    int GEN = 3;
    long[] fact, ifact, pow2;
    int mx = (int)1e5+2;
    void pre() throws Exception{
        fact = new long[mx];
        ifact = new long[mx];
        pow2 = new long[mx];
        fact[0] = ifact[0] = pow2[0] = 1;
        long inv2 = (MOD+1)/2;
        for(int i = 1; i< mx; i++){
            fact[i] = fact[i-1] * i %MOD;
            pow2[i] = pow2[i-1] * inv2 %MOD;
        }
        ifact[mx-1] = pow(fact[mx-1], MOD-2);
        for(int i = mx-2; i > 0; i--)ifact[i] = ifact[i+1] * (i+1) %MOD;
    }
    long pow(long x, long p){
        long o = 1;
        for(; p> 0; p>>=1){
            if((p&1)==1)o = o*x%MOD;
            x = x*x%MOD;
        }
        return o;
    }
    void solve(int TC) throws Exception{
        int N = ni();
        int[] h = new int[mx];
        for(int i = 0; i< 2*N; i++)h[ni()]++;

        int c = 0;
        for(int i = 0; i< mx; i++)if(h[i] > 0){
            h[c++] = h[i];
        }
        h = Arrays.copyOf(h, c);

        PriorityQueue<long[]> pq = new PriorityQueue<>((long[] l1, long[] l2) -> Integer.compare(l1.length, l2.length));
        for(int i:h)pq.add(getP(i));
        while(pq.size() > 1)pq.add(Convolution.convolution(pq.poll(), pq.poll(), (int)MOD));


        long[] ways = Arrays.copyOf(pq.poll(), 1+N);

        for(int i = 0; i<= N; i++){
            ways[i] = ways[i] * numPairs(2*(N-i), (N-i)) %MOD;
        }
        long total = 0;
        for(int i = 0; i<= N; i++){
            if(i%2 == 0)total += ways[i];
            else total += MOD-ways[i];
            if(total >= MOD)total -= MOD;
        }
        pn(total);

    }
    long[] getP(int x){
        long[] P = new long[1+x];
        for(int i = 0; i<= x; i++)P[i] = numPairs(x, i);
        return P;
    }
    long numPairs(int N, int K){
        if(N < 2*K)return 0;
        return fact[N] * ifact[N-2*K] %MOD * ifact[K] %MOD * pow2[K] %MOD;
    }

    //https://raw.githubusercontent.com/NASU41/AtCoderLibraryForJava/master/Convolution/Convolution.java
    /**
     * Convolution.
     *
     * @verified https://atcoder.jp/contests/practice2/tasks/practice2_f
     * @verified https://judge.yosupo.jp/problem/convolution_mod_1000000007
     */
    static class Convolution {
        /**
         * Find a primitive root.
         *
         * @param m A prime number.
         * @return Primitive root.
         */
        private static int primitiveRoot(int m) {
            if (m == 2) return 1;
            if (m == 167772161) return 3;
            if (m == 469762049) return 3;
            if (m == 754974721) return 11;
            if (m == 998244353) return 3;

            int[] divs = new int[20];
            divs[0] = 2;
            int cnt = 1;
            int x = (m - 1) / 2;
            while (x % 2 == 0) x /= 2;
            for (int i = 3; (long) (i) * i <= x; i += 2) {
                if (x % i == 0) {
                    divs[cnt++] = i;
                    while (x % i == 0) {
                        x /= i;
                    }
                }
            }
            if (x > 1) {
                divs[cnt++] = x;
            }
            for (int g = 2; ; g++) {
                boolean ok = true;
                for (int i = 0; i < cnt; i++) {
                    if (pow(g, (m - 1) / divs[i], m) == 1) {
                        ok = false;
                        break;
                    }
                }
                if (ok) return g;
            }
        }

        /**
         * Power.
         *
         * @param x Parameter x.
         * @param n Parameter n.
         * @param m Mod.
         * @return n-th power of x mod m.
         */
        private static long pow(long x, long n, int m) {
            if (m == 1) return 0;
            long r = 1;
            long y = x % m;
            while (n > 0) {
                if ((n & 1) != 0) r = (r * y) % m;
                y = (y * y) % m;
                n >>= 1;
            }
            return r;
        }

        /**
         * Ceil of power 2.
         *
         * @param n Value.
         * @return Ceil of power 2.
         */
        private static int ceilPow2(int n) {
            int x = 0;
            while ((1L << x) < n) x++;
            return x;
        }

        /**
         * Garner's algorithm.
         *
         * @param c    Mod convolution results.
         * @param mods Mods.
         * @return Result.
         */
        private static long garner(long[] c, int[] mods) {
            int n = c.length + 1;
            long[] cnst = new long[n];
            long[] coef = new long[n];
            java.util.Arrays.fill(coef, 1);
            for (int i = 0; i < n - 1; i++) {
                int m1 = mods[i];
                long v = (c[i] - cnst[i] + m1) % m1;
                v = v * pow(coef[i], m1 - 2, m1) % m1;

                for (int j = i + 1; j < n; j++) {
                    long m2 = mods[j];
                    cnst[j] = (cnst[j] + coef[j] * v) % m2;
                    coef[j] = (coef[j] * m1) % m2;
                }
            }
            return cnst[n - 1];
        }

        /**
         * Pre-calculation for NTT.
         *
         * @param mod NTT Prime.
         * @param g   Primitive root of mod.
         * @return Pre-calculation table.
         */
        private static long[] sumE(int mod, int g) {
            long[] sum_e = new long[30];
            long[] es = new long[30];
            long[] ies = new long[30];
            int cnt2 = Integer.numberOfTrailingZeros(mod - 1);
            long e = pow(g, (mod - 1) >> cnt2, mod);
            long ie = pow(e, mod - 2, mod);
            for (int i = cnt2; i >= 2; i--) {
                es[i - 2] = e;
                ies[i - 2] = ie;
                e = e * e % mod;
                ie = ie * ie % mod;
            }
            long now = 1;
            for (int i = 0; i < cnt2 - 2; i++) {
                sum_e[i] = es[i] * now % mod;
                now = now * ies[i] % mod;
            }
            return sum_e;
        }

        /**
         * Pre-calculation for inverse NTT.
         *
         * @param mod Mod.
         * @param g   Primitive root of mod.
         * @return Pre-calculation table.
         */
        private static long[] sumIE(int mod, int g) {
            long[] sum_ie = new long[30];
            long[] es = new long[30];
            long[] ies = new long[30];

            int cnt2 = Integer.numberOfTrailingZeros(mod - 1);
            long e = pow(g, (mod - 1) >> cnt2, mod);
            long ie = pow(e, mod - 2, mod);
            for (int i = cnt2; i >= 2; i--) {
                es[i - 2] = e;
                ies[i - 2] = ie;
                e = e * e % mod;
                ie = ie * ie % mod;
            }
            long now = 1;
            for (int i = 0; i < cnt2 - 2; i++) {
                sum_ie[i] = ies[i] * now % mod;
                now = now * es[i] % mod;
            }
            return sum_ie;
        }

        /**
         * Inverse NTT.
         *
         * @param a     Target array.
         * @param sumIE Pre-calculation table.
         * @param mod   NTT Prime.
         */
        private static void butterflyInv(long[] a, long[] sumIE, int mod) {
            int n = a.length;
            int h = ceilPow2(n);

            for (int ph = h; ph >= 1; ph--) {
                int w = 1 << (ph - 1), p = 1 << (h - ph);
                long inow = 1;
                for (int s = 0; s < w; s++) {
                    int offset = s << (h - ph + 1);
                    for (int i = 0; i < p; i++) {
                        long l = a[i + offset];
                        long r = a[i + offset + p];
                        a[i + offset] = (l + r) % mod;
                        a[i + offset + p] = (mod + l - r) * inow % mod;
                    }
                    int x = Integer.numberOfTrailingZeros(~s);
                    inow = inow * sumIE[x] % mod;
                }
            }
        }

        /**
         * Inverse NTT.
         *
         * @param a    Target array.
         * @param sumE Pre-calculation table.
         * @param mod  NTT Prime.
         */
        private static void butterfly(long[] a, long[] sumE, int mod) {
            int n = a.length;
            int h = ceilPow2(n);

            for (int ph = 1; ph <= h; ph++) {
                int w = 1 << (ph - 1), p = 1 << (h - ph);
                long now = 1;
                for (int s = 0; s < w; s++) {
                    int offset = s << (h - ph + 1);
                    for (int i = 0; i < p; i++) {
                        long l = a[i + offset];
                        long r = a[i + offset + p] * now % mod;
                        a[i + offset] = (l + r) % mod;
                        a[i + offset + p] = (l - r + mod) % mod;
                    }
                    int x = Integer.numberOfTrailingZeros(~s);
                    now = now * sumE[x] % mod;
                }
            }
        }

        /**
         * Convolution.
         *
         * @param a   Target array 1.
         * @param b   Target array 2.
         * @param mod NTT Prime.
         * @return Answer.
         */
        public static long[] convolution(long[] a, long[] b, int mod) {
            int n = a.length;
            int m = b.length;
            if (n == 0 || m == 0) return new long[0];

            int z = 1 << ceilPow2(n + m - 1);
            {
                long[] na = new long[z];
                long[] nb = new long[z];
                System.arraycopy(a, 0, na, 0, n);
                System.arraycopy(b, 0, nb, 0, m);
                a = na;
                b = nb;
            }

            int g = primitiveRoot(mod);
            long[] sume = sumE(mod, g);
            long[] sumie = sumIE(mod, g);

            butterfly(a, sume, mod);
            butterfly(b, sume, mod);
            for (int i = 0; i < z; i++) {
                a[i] = a[i] * b[i] % mod;
            }
            butterflyInv(a, sumie, mod);
            a = java.util.Arrays.copyOf(a, n + m - 1);

            long iz = pow(z, mod - 2, mod);
            for (int i = 0; i < n + m - 1; i++) a[i] = a[i] * iz % mod;
            return a;
        }

        /**
         * Convolution.
         *
         * @param a   Target array 1.
         * @param b   Target array 2.
         * @param mod Any mod.
         * @return Answer.
         */
        public static long[] convolutionLL(long[] a, long[] b, int mod) {
            int n = a.length;
            int m = b.length;
            if (n == 0 || m == 0) return new long[0];

            int mod1 = 754974721;
            int mod2 = 167772161;
            int mod3 = 469762049;

            long[] c1 = convolution(a, b, mod1);
            long[] c2 = convolution(a, b, mod2);
            long[] c3 = convolution(a, b, mod3);

            int retSize = c1.length;
            long[] ret = new long[retSize];
            int[] mods = {mod1, mod2, mod3, mod};
            for (int i = 0; i < retSize; ++i) {
                ret[i] = garner(new long[]{c1[i], c2[i], c3[i]}, mods);
            }
            return ret;
        }

        /**
         * Convolution by ModInt.
         *
         * @param a Target array 1.
         * @param b Target array 2.
         * @return Answer.
         */
        public static java.util.List<ModIntFactory.ModInt> convolution(
                java.util.List<ModIntFactory.ModInt> a,
                java.util.List<ModIntFactory.ModInt> b
        ) {
            int mod = a.get(0).mod();
            long[] va = a.stream().mapToLong(ModIntFactory.ModInt::value).toArray();
            long[] vb = b.stream().mapToLong(ModIntFactory.ModInt::value).toArray();
            long[] c = convolutionLL(va, vb, mod);

            ModIntFactory factory = new ModIntFactory(mod);
            return java.util.Arrays.stream(c).mapToObj(factory::create).collect(java.util.stream.Collectors.toList());
        }

        /**
         * Naive convolution. (Complexity is O(N^2)!!)
         *
         * @param a   Target array 1.
         * @param b   Target array 2.
         * @param mod Mod.
         * @return Answer.
         */
        public static long[] convolutionNaive(long[] a, long[] b, int mod) {
            int n = a.length;
            int m = b.length;
            int k = n + m - 1;
            long[] ret = new long[k];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    ret[i + j] += a[i] * b[j] % mod;
                    ret[i + j] %= mod;
                }
            }
            return ret;
        }
    }

    //SOLUTION END
    void hold(boolean b)throws Exception{if(!b)throw new Exception("Hold right there, Sparky!");}
    void exit(boolean b){if(!b)System.exit(0);}
    static void dbg(Object... o){System.err.println(Arrays.deepToString(o));}
    final long IINF = (long)1e17;
    final int INF = (int)1e9+2;
    DecimalFormat df = new DecimalFormat("0.00000000000");
    double PI = 3.141592653589793238462643383279502884197169399, eps = 1e-8;
    static boolean multipleTC = false, memory = false, fileIO = false;
    FastReader in;PrintWriter out;
    void run() throws Exception{
        long ct = System.currentTimeMillis();
        if (fileIO) {
            in = new FastReader("");
            out = new PrintWriter("");
        } else {
            in = new FastReader();
            out = new PrintWriter(System.out);
        }
        //Solution Credits: Taranpreet Singh
        int T = multipleTC? ni():1;
        pre();
        for (int t = 1; t <= T; t++) solve(t);
        out.flush();
        out.close();
        System.err.println(System.currentTimeMillis() - ct);
    }
    public static void main(String[] args) throws Exception{
        if(memory)new Thread(null, new Runnable() {public void run(){try{new Main().run();}catch(Exception e){e.printStackTrace();System.exit(1);}}}, "1", 1 << 28).start();
        else new Main().run();
    }
    int[][] make(int n, int e, int[] from, int[] to, boolean f){
        int[][] g = new int[n][];int[]cnt = new int[n];
        for(int i = 0; i< e; i++){
            cnt[from[i]]++;
            if(f)cnt[to[i]]++;
        }
        for(int i = 0; i< n; i++)g[i] = new int[cnt[i]];
        for(int i = 0; i< e; i++){
            g[from[i]][--cnt[from[i]]] = to[i];
            if(f)g[to[i]][--cnt[to[i]]] = from[i];
        }
        return g;
    }
    int[][][] makeS(int n, int e, int[] from, int[] to, boolean f){
        int[][][] g = new int[n][][];int[]cnt = new int[n];
        for(int i = 0; i< e; i++){
            cnt[from[i]]++;
            if(f)cnt[to[i]]++;
        }
        for(int i = 0; i< n; i++)g[i] = new int[cnt[i]][];
        for(int i = 0; i< e; i++){
            g[from[i]][--cnt[from[i]]] = new int[]{to[i], i, 0};
            if(f)g[to[i]][--cnt[to[i]]] = new int[]{from[i], i, 1};
        }
        return g;
    }
    int find(int[] set, int u){return set[u] = (set[u] == u?u:find(set, set[u]));}
    int digit(long s){int ans = 0;while(s>0){s/=10;ans++;}return ans;}
    long gcd(long a, long b){return (b==0)?a:gcd(b,a%b);}
    int gcd(int a, int b){return (b==0)?a:gcd(b,a%b);}
    int bit(long n){return (n==0)?0:(1+bit(n&(n-1)));}
    void p(Object... o){for(Object oo:o)out.print(oo+" ");}
    void pn(Object... o){for(Object oo:o)out.print(oo+" ");out.println();}
    void pni(Object... o){for(Object oo:o)out.print(oo+" ");out.println();out.flush();}
    String n()throws Exception{return in.next();}
    String nln()throws Exception{return in.nextLine();}
    int ni()throws Exception{return Integer.parseInt(in.next());}
    long nl()throws Exception{return Long.parseLong(in.next());}
    double nd()throws Exception{return Double.parseDouble(in.next());}

    class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws Exception{
            br = new BufferedReader(new FileReader(s));
        }

        String next() throws Exception{
            while (st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch (IOException  e){
                    throw new Exception(e.toString());
                }
            }
            return st.nextToken();
        }

        String nextLine() throws Exception{
            String str;
            try{
                str = br.readLine();
            }catch (IOException e){
                throw new Exception(e.toString());
            }
            return str;
        }
    }
}
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