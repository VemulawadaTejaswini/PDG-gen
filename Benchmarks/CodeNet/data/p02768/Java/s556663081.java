import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int as = sc.nextInt();
        int bs = sc.nextInt();
        int mod = 1000000007;

        long ans = pow(2, n, mod);
        long a = 1;
        for (int i = 2; i <= as; i++) {
            a *= i;
            a %= mod;
        }
        a = pow(a, mod - 2, mod);
        long ax = 1;
        for (int i = n; i >= n - as + 1; i--) {
            ax *= i;
            ax %= mod;
        }
        long minus = ax * a % mod;
        long b = 1;
        for (int i = 2; i <= bs; i++) {
            b *= i;
            b %= mod;
        }
        b = pow(b, mod - 2, mod);
        long bx = 1;
        for (int i = n; i >= n - bs + 1; i--) {
            bx *= i;
            bx %= mod;
        }
        minus += bx * b % mod;
        minus %= mod;

        System.out.println(--ans - minus);
    }

    //return a^b mod M O(logB)
    private static long pow(long a, long b, int M) {
        long ret = 1;
        long tmp = a;
        while (b > 0) {
            if ((b & 1) == 1) ret = (ret * tmp) % M;
            tmp = (tmp * tmp) % M;
            b = b >> 1;
        }
        return ret;
    }
}
