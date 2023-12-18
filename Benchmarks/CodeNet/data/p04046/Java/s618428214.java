import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        long mod = (long)Math.pow(10,9)+7;
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        Combination c = new Combination(200001);
        long ans = 0;
        long prev = 0;
        for(int i = b; i < w; i++){
            //System.out.println((h-a-1) + " " + i + " " + (w-1-i));
            ans += c.comb(h-a-1+i,i)*c.comb(a-1+(w-1-i),a-1);
            ans %= mod;
        }
        System.out.println(ans);
    }
}


class Combination {
    final static long mod = (long)Math.pow(10,9)+ 7;
    private static long[] fact, ifact;
    public Combination(int n){
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
    
    public static long perm(int n, int k){
        return comb(n,k) * fact[k] % mod;
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
    
    public String[] nextArray(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = next();
        return a;
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
