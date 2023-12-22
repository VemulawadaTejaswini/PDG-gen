import java.util.*;

public class Main {

    private static final long MOD = 1_000_000_007L;

    private static long fact[];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        fact = new long[N+1];
        fact[0] = 1;
        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i-1]*i)%MOD;
        }

        long all = pow(10,N);
        long no09 = pow(8,N);

        long only0 = 0;
        for (int i = 1; i <= N; i++) {
            long tmp = comb(N,i)*pow(8,N-i);
            tmp %= MOD;
            only0 += tmp;
            only0 %= MOD;
        }

        long only9 = only0;

        long sub = no09+only0;
        sub %= MOD;
        sub += only9;
        sub %= MOD;

        long ans = all - sub;
        if (ans < 0) ans += MOD;
        ans %= MOD;
 
        System.out.println(ans);
    }

    private static long pow(long a, long n) {
        if (n == 0) return 1;
        if (n == 1) return a;

        if (n%2 == 1) {
            return (pow(a, n-1)*a)%MOD;
        } else {
            long half = pow(a, n/2);
            return (half*half)%MOD;
        }
    }

    private static long comb(int a, int b) {
        long lower = (fact[a-b]*fact[b])%MOD;
        return (fact[a]*pow(lower,MOD-2))%MOD;
    }
}
