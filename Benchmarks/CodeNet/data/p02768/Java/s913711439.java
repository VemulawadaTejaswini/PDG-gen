import java.util.*;

class Main{
    public static final int MOD = 1000000007;

    long[] fac,finv,inv;

    Main(){
        int N, A, B;

        Scanner SC = new Scanner(System.in);
        N = SC.nextInt();
        init(N+1);
        A = SC.nextInt();
        B = SC.nextInt();

        long R = modpow(2, N)-1;
        if(R < 0) R+=MOD;
        R = (R - COM(N, A))%MOD;
        if(R < 0) R+=MOD;
        R = (R - COM(N, B))%MOD;
        if(R < 0) R+=MOD;

        System.out.println(R);
    }

    public static void main(String[] args){
        Main main = new Main();
    }

    long modpow(long a, long b){
        long R = 1L;

        a %= MOD;
        while(b > 0){
            if( (b & 1) == 1)
                R = (R * a) % MOD;
            a = (a * a) % MOD;
            b = b >> 1;
        }
        return R;
    }

    void init(int max){
        fac  = new long[max];
        finv = new long[max];
        inv  = new long[max];

        fac[0]  = fac[1]  = 1;
        finv[0] = finv[1] = 1;
        inv[1]  = 1;
        for(int i=2; i<max; i++){
            fac[i]  = fac[i-1] * i % MOD;
            inv[i]  = MOD - inv[MOD%i] * (MOD/i) % MOD;
            finv[i] = finv[i-1] * inv[i] % MOD;
        }
    }

    long COM(int n, int k){
        if(n < k)return 0;
        if(n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n-k] % MOD) % MOD;
    }
}
