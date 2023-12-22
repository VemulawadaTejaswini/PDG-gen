import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Combination {
    long[] fact;
    long[] ifact;
    long M;

    private long mpow(long x, long n) {
        long ans = 1;
        while (n != 0) {
            if ((n & 1) == 1) ans = ans * x % M;
            x = x * x % M;
            n = n >> 1;
        }
        return ans;
    }

    private long inv(long x) {
        return mpow(x, M - 2);
    }

    public Combination(int n, long M) {
        assert n < M;
        this.M = M;
        fact = new long[n + 1];
        ifact = new long[n + 1];

        fact[0] = 1;
        ifact[0] = 1;
        for (int i = 1; i <= n; ++i) fact[i] = (fact[i-1]*i) % M;
        ifact[n] = inv(fact[n]);
        for (int i = n; i >= 1; --i) ifact[i-1] = ifact[i]*i % M;
    }

    public long c(int n, int k) {
        if (k < 0 || k > n) return 0;
        return ((fact[n]*ifact[k] % M)*ifact[n-k] % M);
    }
}

class Solver {

    private long combi(long n, long r, long mod) {
        long ret = 1;
        for(int i = 1; i <= r; i++){
            ret = ret * (n - i + 1) / i;
            ret %= mod;
        }   
        return ret;
    }   

    public void run() {
        //Combination comb = new Combination(1000000, 998244353);
        //System.out.println(comb.c(1, 1));
        //System.out.println(comb.c(100, 1));
        //System.out.println(comb.c(100, 2));
        //System.out.println(comb.c(100, 3));
        //
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        long mod = 998244353;
        Combination comb = new Combination(200005, mod);

        long ans = 0;
        long col = M; 
        for (int x = N - 1; x >= 0; x--) {
            long now = col;
            now *= comb.c(N - 1, x);
            if (x <= K) {
                ans += now;
                ans %= mod;
            }
            col *= M-1;
            col %= mod;
        }
        System.out.println(ans % mod);
        
        return;
    }

}