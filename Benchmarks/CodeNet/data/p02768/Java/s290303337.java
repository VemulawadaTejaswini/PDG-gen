import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int MOD = (int)1e9+7;
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        Comb cb = new Comb(n, MOD);

        long sum = cb.modpow(2, n);

        long comA = cb.nck(n, a);
        long comB = cb.nck(n, b);

        long ans = sum-comA-comB-1+MOD*2;

        System.out.println(ans%MOD);

    }

    public class Comb {
        int n;   //　要素数
        int MOD = (int)1e9+7;
        long[] facts;

        public Comb(int n, int MOD){
            this.n = n;
            this.MOD = MOD;
//            facts = new long[n+1];
//            facts[0] = 1;
//            for (int i=1; i<n+1; i++){
//                facts[i] = facts[i-1] * i % MOD;
//            }
        }

        public long modpow(long a, long b){  // 計算量はlog(MOD);
            if (b==0) return 1;
            else if (b==1) return a;
            long x = modpow(a, b/2);
            return b%2 == 0 ? x * x % MOD : x * (x*a%MOD) % MOD;
        }
        public long inv(long n){ // 逆元。x^(-1)≡x^(p-2) (MOD p)
            return modpow(n, MOD-2);
        }
        public long nck(int n, int k){
            long ret = 1;
            for (int i=0; i<k; i++) {
                ret = ret * (n - i) % MOD * inv(k - i);
                ret %= MOD;
            }
            return ret % MOD;
//            return n < k ? 0: facts[n] * (inv(facts[n-k]) * inv(facts[k]) % MOD) % MOD;
        }


    }
}

