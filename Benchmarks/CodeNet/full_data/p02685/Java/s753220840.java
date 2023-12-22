import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int MOD = (int)998244353;

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        long res = 0;

//        long pos = 1;
        long col = m;

        for (int i=0; i<n-k-2; i++) {
            col *= (m-1);
            col %= MOD;
        }

        Comb comb = new Comb(n-1, MOD);

        for (int i=k; 0<=i; i--) {
            long pat = comb.nCk1(n-1, i);
            col *= (m-1);
            col %= MOD;
            res += (pat * col) % MOD;
            res %= MOD;
        }

        System.out.println(res % MOD);

    }

    public class Comb {
        int n;   //　要素数
        int MOD;
        long[] facts;

        public Comb(int n, int MOD){
            this.n = n;
            this.MOD = MOD;
            facts = new long[n+1];
            facts[0] = 1;
            for (int i=1; i<n+1; i++){
                facts[i] = facts[i-1] * i % MOD;
            }
        }

        // O(log(MOD))
        public long modpow(long a, long b){
            if (b==0) return 1;
            else if (b==1) return a;
            long x = modpow(a, b/2);
            return b%2 == 0 ? x * x % MOD : x * (x*a%MOD) % MOD;
        }

        // 逆元。x^(-1)≡x^(p-2) (MOD p) xとpは互いに素。
        public long inv(long n){
            return modpow(n, MOD-2);
        }

        public long nCk1(int n, int k){
            return n < k ? 0 : facts[n] * (inv(facts[n-k]) * inv(facts[k]) % MOD) % MOD;
        }

        // O(k)
        public long nCk2(int n, int k) {
            long ret = 1;
            for (int i=0; i<k; i++) {
                ret = ret * (n - i) % MOD * inv(k - i);
                ret %= MOD;
            }
            return ret % MOD;
        }

    }

}

