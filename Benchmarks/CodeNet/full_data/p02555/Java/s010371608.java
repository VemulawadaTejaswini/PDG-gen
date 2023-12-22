import java.util.*;

public class Main {

    private static final long MOD = 1_000_000_007L;

    private static long fact[];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();

        fact = new long[S+1];
        fact[0] = 1;
        for (int i = 1; i <= S; i++) {
            fact[i] = (fact[i-1]*i)%MOD;
        }

        long ans = 0;
        for (int i = 1; i <= S/3; i++) {
            int remain = S - i*3;
            int separator = i-1;
            ans += comb(remain+separator, separator);
            ans %= MOD;
        }

 
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
