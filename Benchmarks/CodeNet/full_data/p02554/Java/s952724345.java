import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long MOD = 1000000007;
        sc.close();
        long ans = modpow(10, n) - modpow(9, n) - modpow(9, n) + modpow(8, n);
        ans %= MOD;
        ans = (ans + MOD) % MOD;
        System.out.println(ans);
    }

    public static long modpow(long a, long n) {
        long res = 1;
        long MOD = 1000000007;
        while (n > 0) {
            if ((n & 1) != 0) res = res * a % MOD;
            a = a * a % MOD;
            n >>= 1;
        }
        return res;
    }
}
