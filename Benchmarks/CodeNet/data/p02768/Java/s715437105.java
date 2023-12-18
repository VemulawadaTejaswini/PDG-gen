import java.util.Scanner;

public class Main {
    static long mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), a = sc.nextInt(), b = sc.nextInt();
        long ans = pow(2, n) - comb(n, a) - comb(n, b) - 1;
        if(ans < 0) ans += (Math.abs(ans) / mod + 1) * mod;
        System.out.println(ans);
    }
    static long pow(long x, long n) {
        long a = 1;
        do {
            if((n & 1) == 1) a = (a * x) % mod;
            x = (x * x) % mod;
        } while((n >>= 1) > 0);
        return a;
    }
    static long comb(long n, long r) {
        r = Math.min(r, n - r);
        long mol = n, den = r;
        for(int i = 1; i < r; i++) {
            mol = (mol * (n - i)) % mod;
            den = (den * i) % mod;
        }
        return mol * pow(den, mod - 2) % mod;
    }
}