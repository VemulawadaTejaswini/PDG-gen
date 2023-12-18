import java.util.*;

public class Main {

    private static final int MOD = 998244353;
    private static long[] fact;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        fact = new long[N];
        fact[0] = 1;
        for (int i = 1; i < N; i++) {
            fact[i] = i*fact[i-1];
            fact[i] %= MOD;
        }

        long ans = 0;
        long col = M;
        for (int x = N-1; x >= 0; x--) {
            if (x <= K) {
                long now = (col*comb(N-1,x))%MOD;
                ans += now;
                ans %= MOD;
            }
            col *= M-1;
            col %= MOD;
        }
        System.out.println(ans);
    }

    private static long comb(int n, int k) {
        return (fact[n]*pow(fact[k],MOD-2)%MOD)*pow(fact[n-k],MOD-2)%MOD;
    }

    private static long pow(long a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b%2 == 0) {
            long half = pow(a,b/2);
            return half*half%MOD;
        } else {
            return pow(a,b-1)*a%MOD;
        }
    }
}
