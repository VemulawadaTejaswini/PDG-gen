import java.util.*;

public class Main{

    Scanner sc = new Scanner(System.in);

    long MOD = 998244353;

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        long ans = 0;
        long col = m;

        Combi cb = new Combi(n-1, MOD);


        for (int x=n-1; 0<=x; x--) {
            long now = col % MOD;
//            System.out.println(now);
            now *= cb.nck(n-1, x);
            now %= MOD;
//            System.out.println(now);
            if (x <= k) {
                ans += now;
                ans %= MOD;
            }
            col *= (m - 1);
            col %= MOD;
        }

        System.out.println(ans);

//        System.out.println(new Combi(n, MOD).facts[n]);


    }

    public class Combi {
        int n;   //　要素数
        long MOD;
        long[] facts;

        public Combi(int n, long MOD){
            this.n = n;
            this.MOD = MOD;
            facts = new long[n+1];
            facts[0] = 1;
            for (int i=1; i<n+1; i++){
                facts[i] = facts[i-1]*i%MOD;
            }
        }

        public long modpow(long a, long b){  // 計算量はlog(MOD);
            if (b==0) return 1;
            else if (b==1) return a;
            long x = modpow(a, b/2);
            return b%2==0 ? x*x%MOD : x*(x*a%MOD)%MOD;
        }
        public long inv(long n){ // 逆元。x^(-1)≡x^(p-2) (MOD p)
            return modpow(n, MOD-2);
        }
        public long nck(int n, int k){
            return n<k ? 0: facts[n]*(inv(facts[n-k])*inv(facts[k])%MOD)%MOD;
        }
    }

}
