import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        sc.close();

        long ans = 0;

        if (Math.abs(n - m) > 1) {
            System.out.println(ans);
            return;
        }

        long mod = 1000000007L;
        long tmp = fact(n, mod) * fact(m, mod);

        if (n == m) {
            tmp *= 2;
        }

        ans = tmp % mod;
        System.out.println(ans);

    }

    static long fact(long n, long mod) {
        long res = 1;
        while (n > 1) {
            res *= n;
            res %= mod;
            n--;
        }
        return res;
    }
}