import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        if ((x + y) % 3 != 0) {
            System.out.println(0);
            return;
        }
        int n = (x + y) / 3;
        long ans = comb(x - n + y - n, y - n);
        System.out.println(ans);

    }

    // 繰り返し２乗法
    private static long modPow(long n, int p) {
        long res = 1;
        long a = n;
        for (a %= MOD; p > 0; a = a * a % MOD, p >>= 1) {
            if ((p & 1) > 0) {
                res = res * a % MOD;
            }
        }
        return res;
    }

    // 逆元
    private static long modInv(long a) {
        return modPow(a, MOD - 2);
    }

    // 二項係数
    private static long comb(long n, long r) {
        long ret = 1;
        for (long i = 0; i < r; i++) {
            ret *= n - i;
            ret %= MOD;
            ret *= modInv(i + 1);
            ret %= MOD;
        }
        return ret;
    }
}