import java.util.Scanner;

class Main {
    static final long MOD = 1000000007;

    static long modPow(long x, long n, long mod) {
        long sum = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                sum = sum * x % mod;
            }
            x = x * x % mod;
            n >>= 1;
        }
        return sum;
    }

    static long modComb(long n, long r, long mod) {
        long ans = 1;
        long y = 1;
        for (int i = 1; i <= r; i++) {
            ans = ans * (n - i + 1) % mod;
            y = y * i % mod;
        }
        return ans = ans * modPow(y, mod - 2, mod) % mod;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long n = Long.parseLong(stdIn.next());
        long a = Long.parseLong(stdIn.next());
        long b = Long.parseLong(stdIn.next());

        long all = modPow(2, n, MOD) - 1;
        long nCa = modComb(n, a, MOD);
        long nCb = modComb(n, b, MOD);

        System.out.println((all - nCa - nCb + 3 * MOD) % MOD);
    }
}