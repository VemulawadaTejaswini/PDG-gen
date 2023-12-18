import java.util.*;
import java.io.*;
 
public class Main {
    static boolean[][] used;
    static int[] ans;
    public static void main(String[] args) throws Exception {
        long mod = 998244353L;
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        combination c = new combination(m);
        long ans = 0;
        long now = m;
        for(int x = (int)n-1; x >= 0; x--){
            long tmp = now;
            tmp *= c.comb(n-1,x)%mod;
            tmp %= mod;
            if(x <= k){
                ans += tmp;
                ans %= mod;
            }
            now *= m-1;
            now %= mod;
        }
        System.out.println(ans);
    }
    
    public static long nCk(long n,long k,long M) {
        if(n < 0 || k < 0 || n < k){
            return 0;
        }
        long ret = 1;
        long min = Math.min(k, n-k);
        for(long i=1;i<=min;i++) {
            ret = (ret * pow(i,M-2,M)) % M;
        }
        for(long i=n-min+1;i<=n;i++) {
            ret = (ret * i) % M;
        }
        return ret;
    }

    public static long pow(long a,long b,long M) {
        long ret = 1;
        long tmp = a;
        while(b>0) {
            if((b&1)==1){
                ret = (ret * tmp) % M;
            }
            tmp = (tmp * tmp) % M;
            b = b>>1;
        }
        return ret;
    }
    
    private static long rep2(long b, long n, long mod){
        if(n == 0) return 1;
        if(n == 1) return b;
        long bn = rep2(b,n/2,mod)%mod;
        if(n % 2 == 0){
            return (long)(bn%mod*bn%mod)%mod;
        }else{
            return (long)(bn%mod*bn%mod)%mod*b%mod;
        }
    }
}

class combination {
    final static long mod = 998244353L;
    private static long[] fact, ifact;
    public combination(int n){
        fact = new long[n+1];
        ifact = new long[n+1];
        fact[0] = 1;
        long ln = n;
        for (long i = 1; i <= ln; ++i){
            int ii = (int)i;
            fact[ii] = fact[ii-1]%mod * i % mod;
        }
        ifact[n] = pow(fact[n],this.mod-2);
        for (int i = n; i >= 1; --i){
            int ii = (int)i;
            ifact[ii-1] = ifact[ii]%mod*i%mod;
        }
    }
    public static long comb(int n, int k){
        if (k < 0 || k > n) return 0;
        return fact[n] % mod * ifact[k] % mod * ifact[n-k] % mod;
    }
    public static long pow(long a,long b) {
        long ret = 1;
        long tmp = a;
        while(b>0) {
            if((b&1)==1){
                ret = (ret * tmp) % mod;
            }
            tmp = (tmp * tmp) % mod;
            b = b>>1;
        }
        return ret;
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    } 
}
