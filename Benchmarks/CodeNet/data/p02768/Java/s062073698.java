import java.util.Scanner;

public class Main {
    static long inv[];
    static int mod = 1_000_000_007;

    static long pow(long a, int n) {
        long res = 1;
        while (n > 0) {
            if ((n - n / 2 * 2) == 1) {
                res = res * a % mod;
            }
            a = a * a % mod;
            n >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        inv = new long[b + 1];
        inv[1] = 1;
        for (int i = 2; i <= b; i++) {
            inv[i] = inv[mod % i] * (mod - mod / i) % mod;
        }

        long comb[] = new long[b + 1];
        comb[0] = 1;

        for (int i = 1; i <= b; i++) {
            comb[i] = comb[i - 1] * ((n - i + 1) % mod);
            comb[i] %= mod;
            comb[i] *= inv[i];
            comb[i] %= mod;
        }

        long ans = pow(2, n);
        ans -= 1;
        ans %= mod;
        ans -= comb[a];
        if(ans < 0) {
            ans += mod;
        }
        ans %= mod;
        ans -= comb[b];
        if(ans < 0) {
            ans += mod;
        }
        ans %= mod;

        System.out.println(ans);

    }
}
