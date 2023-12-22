import java.util.*;
import java.io.*;
import java.text.*;

class Main{
    //SOLUTION BEGIN
    //Into the Hardware Mode
    final long MOD = 998244353;
    int GEN = 3;
    long[] fact, ifact, pow2;
    int mx = (int)50002;
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
        int[] h = new int[(int)1e5];
        for(int i = 0; i< 2*N; i++)h[ni()-1]++;

        int m = 1;
        while(m < 1e5)m<<=1;
        long[][] ans = new long[m<<1][];
        for(int i = 0; i< h.length; i++)if(h[i] > 0)ans[i+m] = getP(h[i]);
        for(int i = m-1; i> 0; i--){
            if(ans[i<<1] == null)ans[i] = ans[i<<1|1];
            else if(ans[i<<1|1] == null)ans[i] = ans[i<<1];
            else ans[i] = mul(ans[i<<1], ans[i<<1|1]);
        }

        long[] ways = new long[1+N];
        for(int i = 0; i<= N; i++)if(i < ans[1].length)ways[i] = ans[1][i];

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
        return fact[N] * ifact[N-2*K] %MOD * ifact[K] %MOD * pow2[K];
    }

    //uwi is great!
    long[] mul(long[] a, long[] b){
        return mul(a, b, (int)MOD, GEN);
    }
    private long[] mul(long[] a, long[] b, int P, int g){
        int m = Math.max(2, Integer.highestOneBit(Math.max(a.length, b.length)-1)<<2);
        long[] fa = nttmb(a, m, false, P, g);
        long[] fb = a == b ? fa : nttmb(b, m, false, P, g);
        for(int i = 0;i < m;i++)fa[i] = fa[i]*fb[i]%P;
        return nttmb(fa, m, true, P, g);
    }
    long[] nttmb(long[] src, int n, boolean inverse, int P, int g){
        long[] dst = new long[n];
        for(int i = 0; i< n; i++)if(i < src.length)dst[i] = src[i];
//        System.arraycopy(src, 0, dst, 0, n);
        int h = Integer.numberOfTrailingZeros(n);
        long K = Integer.highestOneBit(P)<<1;
        int H = Long.numberOfTrailingZeros(K)*2;
        long M = K*K/P;
        int[] wws = new int[1<<h-1];
        long dw = inverse ? pow(g, P-1-(P-1)/n, P) : pow(g, (P-1)/n, P);
        long w = (1L<<32)%P;
        for(int k = 0;k < 1<<h-1;k++, w = modh(w*dw, M, H, P))wws[k] = (int)w;
        long J = invl(P, 1L<<32);
        for(int i = 0;i < h;i++){
            for(int j = 0;j < 1<<i;j++){
                for(int k = 0, s = j<<h-i, t = s|1<<h-i-1;k < 1<<h-i-1;k++,s++,t++){
                    long u = (dst[s] - dst[t] + 2*P)*wws[k];
                    dst[s] += dst[t];
                    if(dst[s] >= 2*P)dst[s] -= 2*P;
                    long Q = (u<<32)*J>>>32;
                    dst[t] = (u>>>32)-(Q*P>>>32)+P;
                }
            }
            if(i < h-1)for(int k = 0;k < 1<<h-i-2;k++)wws[k] = wws[k*2];
        }
        for(int i = 0;i < n;i++)if(dst[i] >= P)dst[i] -= P;
        for(int i = 0;i < n;i++){
            int rev = Integer.reverse(i)>>>-h;
            if(i < rev){long d = dst[i]; dst[i] = dst[rev]; dst[rev] = d;}
        }
        long in = invl(n, P);
        if(inverse)for(int i = 0;i < n;i++)dst[i] = modh(dst[i]*in, M, H, P);
        return dst;
    }
    long invl(long a, long mod) {
        long b = mod;
        long p = 1, q = 0;
        while (b > 0) {
            long c = a / b, d = a;a = b;b = d % b;
            d = p;p = q;q = d - c * q;
        }
        return p < 0 ? p + mod : p;
    }
    long MASK = (1L<<31)-1;
    long modh(long a, long M, int h, int mod){
        long r = a-((M*(a&MASK)>>>31)+M*(a>>>31)>>>h-31)*mod;
        return r < mod ? r : r-mod;
    }
    long pow(long a, long n, long mod) {
        long ret = 1;
        int x = 63 - Long.numberOfLeadingZeros(n);
        for (; x >= 0; x--){
            ret = ret * ret % mod;
            if (n << 63 - x < 0)ret = ret * a % mod;
        }
        return ret;
    }
    long inv(long x){return pow(x, MOD-2, MOD);}
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