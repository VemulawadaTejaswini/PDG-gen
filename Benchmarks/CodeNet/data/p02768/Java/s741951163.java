import java.util.*;

public class Main {
    private static final int MOD = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        long tmp = pow(2, n);
        tmp -= 1;
        if (tmp < 0) tmp += MOD;
        tmp -= comb(n,a);
        if (tmp < 0) tmp += MOD;
        tmp -= comb(n,b);
        if (tmp < 0) tmp += MOD;

        System.out.println(tmp);
    }

    private static final long pow(long a, int n) {
        if (n == 0) {
            return 1;
        }
        if (n%2 == 1) {
            return a*pow(a,n-1)%MOD;
        }
        long half = pow(a,n/2);
        return half*half%MOD;
    }

    private static final long comb(int n, int k) {
        long a = 1;
        for (int i = 0; i < k; i++) {
            a *= n-i;
            a %= MOD;
        }
        long b = 1;
        for (int i = 0; i < k; i++) {
            b *= k-i;
            b %= MOD;
        }

        return a*pow(b, MOD-2)%MOD;
    }
}

