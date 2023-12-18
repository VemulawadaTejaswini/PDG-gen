import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final long MOD = 1000000007L;

    Main(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        init(N);

        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(scanner.next());
        }

        Arrays.sort(A);

        long totalMax = 0L, totalMin = 0L;

        for (int i = N-1; i >= K-1; i--) {
            totalMax = ( totalMax + ( A[i] * combination(i, K-1) ) % MOD ) % MOD;
        }

        for (int i = 0; i <= N-K; i++) {
            totalMin = (totalMin + ( A[i] * combination(N-i-1, K-1) % MOD)) % MOD;
        }

        long R = totalMax - totalMin;
        if (R < 0) R += MOD;
        System.out.println(R);
    }

    public static void main(String[] args){
        new Main();
    }

    long[] fac, finv, inv;

    void init(int max){
        max += 1;
        fac  = new long[max];
        finv = new long[max];
        inv  = new long[max];

        fac[0]  = fac[1]  = 1;
        finv[0] = finv[1] = 1;
        inv[1]  = 1;
        for(int i=2; i<max; i++){
            fac[i]  = fac[i-1] * i % MOD;
            inv[i]  = MOD - inv[(int)(MOD%i)] * (MOD/i) % MOD;
            finv[i] = finv[i-1] * inv[i] % MOD;
        }
    }

    long combination(int n, int k){
        if(n < k)return 0;
        if(n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n-k] % MOD) % MOD;
    }

    long modInv(long a){
        return modPow(a, MOD-2);
    }

    long modPow(long a, long b){
        long R = 1L;
        a %= MOD;
        while (b > 0){
            if ( (b&1) == 1){
                R = R * a % MOD;
            }
            a = a * a % MOD;
            b = b >> 1;
        }

        return R;
    }
}
