
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long n = scan.nextInt();
        long a = scan.nextInt();
        long b = scan.nextInt();
        

        long total = 0;
        total = pow(2, n) - 1;
        total -= comb(n, a);
        total -= comb(n, b);
        System.out.println(total);
    }

    static long comb(long n, long k) {
        long numerator = nume(n, k);
        long denominator = fac(k);
        return numerator / denominator;
    }

    static long nume(long n, long k) {
        if (k == 1) {
            return n;
        }
        return (n * nume(n - 1, k - 1)) % 1000000007;
    }

    static long fac(long k) {
        if (k == 1) {
            return 1;
        }
        return (k * fac(k - 1)) % 1000000007;
    }

    static long pow(long n, long p) {
        long result = 1;
        for (long i = 1; i <= p; i++) {
            result = (result * n) % 1000000007;
        }
        return result;
    }
}