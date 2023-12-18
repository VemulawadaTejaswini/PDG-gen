import java.util.*;

public class Main {
    static int max=410000;	//nCr の n の最大値?
    static int MOD=1000000007;
    static long[] fac=new long[max];
    static long[] finv=new long[max];
    static long[] inv=new long[max];
    public static void main(String[] args) {
        COMinit();
        Scanner sc = new Scanner(System.in);
        long m=1000000007L;
        int N=sc.nextInt();
        int K=sc.nextInt();

        long ans=0;
        for(int i=0; i<=Math.min(N-1,K); i++){
            ans += COM(N,i) * COM(N-1 , N-i-1);
            ans %= m;
        }
        pl(ans);
    }
    public static void pl(Object o){
        System.out.println(o);
    }
    public static void p(Object o){
        System.out.println(o);
    }
    static void COMinit() {		//テーブルを作るみたい nCrの　または　階乗の？
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < max; i++){
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD%i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }
    }
    static long COM(int n, int k){			//二項係数の計算
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
    }
}
