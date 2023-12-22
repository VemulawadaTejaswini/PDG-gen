import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long[] fact = new long[2000005];
    public static void main(String[] args) {
        long mod = 1000000007;
        calFact(mod);
        FastScanner fs = new FastScanner();
        int k = fs.nextInt();
        String s = fs.next();
        long n = s.length();
        long ans = 0;
        for(long i=n; i<=n+k; i++) {
            ans += calc(n+k, i, mod)*binpow(25, n+k-i, mod);
            ans %= mod;
        }
        System.out.println(ans);
    }

    private static long calc(long n, long i, long mod) {
        long res = fact[(int)n];
        long div = fact[(int)(n-i)]*fact[(int)i];
        div %= mod;
        div = binpow(div, mod-2, mod);
        return (res*div)%mod;
    }

    private static long binpow(long val, long deg, long mod) {
        if(deg == 0)
            return 1 % mod;
        if(deg%2 == 1) {
            return binpow(val, deg-1, mod) * val % mod; 
        }
        long res = binpow(val, deg >> 1, mod);
        return (res*res) % mod;
    }

    private static void calFact(long mod) {
        fact[0] = 1;
        for(int i=1; i<2000005; i++) {
            fact[i] = i * fact[i-1];
            fact[i] %= mod;
        }
    }

    static class FastScanner {
        BufferedReader br = null;
        StringTokenizer st;
    
        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
    
        String next() {
            while(st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
    
        int nextInt() {
            return Integer.parseInt(next());
        }
    
        long nextLong() {
            return Long.parseLong(next());
        }
    
        double nextDouble() {
            return Double.parseDouble(next());
        }
    
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}