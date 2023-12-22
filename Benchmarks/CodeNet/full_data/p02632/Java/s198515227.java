import java.util.Scanner;

public class Main {
    int MAX = 2000000;
    long MOD = 1000000007L;
    long[] fac,finv,inv;

    Main(){
        init();

        Scanner scanner = new Scanner(System.in);
        long K = scanner.nextLong();
        long S = scanner.next().length();

        long R = 0;
        for (long i = 0L; i <= K; i++) {
            R = ( R +
                ( ( (modPow(26, i) * modPow(25,K-i)) % MOD)
                * COM((int)(S+K-i-1),(int)(S-1)))%MOD ) % MOD;
        }

        System.out.println(R);
    }

    void init(){
        fac  = new long[MAX];
        finv = new long[MAX];
        inv  = new long[MAX];

        fac[0]  = fac[1]  = 1;
        finv[0] = finv[1] = 1;
        inv[1]  = 1;
        for(int i =2 ; i < MAX; i++){
            fac[i]  = fac[i-1] * i % MOD;
            inv[i]  = MOD - inv[(int)(MOD%i)] * (MOD/i) % MOD;
            finv[i] = finv[i-1] * inv[i] % MOD;
        }
    }

    long COM(int n, int k){
        if(n < k)return 0;
        if(n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n-k] % MOD) % MOD;
    }

    long modPow(long a, long b){
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

    public static void main(String[] args) {
        new Main();
    }
}
