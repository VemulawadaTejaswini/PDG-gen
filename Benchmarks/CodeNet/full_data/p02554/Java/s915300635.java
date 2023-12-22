import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long ans = modPow(10, n) - modPow(9, n) - modPow(9, n) + modPow(8, n);
        System.out.println(ans % MOD);
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
}