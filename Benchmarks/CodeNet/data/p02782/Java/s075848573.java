import java.util.*;

class Main{
    public static final int MOD = 1000000007;

    long[] fac, finv, inv;

    void init(int MAX){
        fac  = new long[MAX];
        finv = new long[MAX];
        inv  = new long[MAX];

        fac[0]  = fac[1]  = 1;
        finv[0] = finv[1] = 1;
        inv[1]  = 1;
        for(int i=2; i<MAX; i++){
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

    public Main(){

        Scanner scanner = new Scanner(System.in);
        int X1, X2, Y1, Y2;
        X1 = scanner.nextInt();
        Y1 = scanner.nextInt();
        X2 = scanner.nextInt();
        Y2 = scanner.nextInt();

        init(X2+Y2+3);

        long R = COM(X2+Y2+2, X2+1);
        R = (R - COM(X1+Y2+1, X1)%MOD) % MOD;
        if(R<0) R += MOD;
        R = (R - COM(X2+Y1+1, Y1)%MOD) % MOD;
        if(R<0) R += MOD;
        R = (R + COM(X1+Y1, X1)) % MOD;

        System.out.println(COM(X2+Y2+2, X2+1)+","+COM(X1+Y2+1, X1)+","+COM(X2+Y1+1, Y1)+","+COM(X1+Y1, X1));

        System.out.println(R);
    }

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }
}
