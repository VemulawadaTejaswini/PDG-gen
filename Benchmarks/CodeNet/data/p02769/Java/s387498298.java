import java.util.*;

class Main{
    public static final int MOD = 1000000007;

    long[] fac,finv,inv;

    Main(){
        int N, K;
        Scanner SC = new Scanner(System.in);
        N = SC.nextInt();
        K = SC.nextInt();

        init(N+1);

        long R = 0;
        int L;
        if(N-1 <= K)
            L = N-1;
        else{
            L = K;
        }
        
        for(int i=0;i<=L;i++){
            R = (R + COM(N,i) * COM(N-1,N-i-1) % MOD) % MOD;
        }

        System.out.println(R);
    }

    public static void main(String[] args){
        Main main = new Main();
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
