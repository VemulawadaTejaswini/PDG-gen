
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long n = scan.nextInt();
        long a = scan.nextInt();
        long b = scan.nextInt();
        

        long total = 0;
        total = pow(2, n) - 1;
        total = (total + 1000000007 - comb(n, a)) % 1000000007;
        total = (total + 1000000007 - comb(n, b)) % 1000000007;
        System.out.println(total);
    }

    static long comb(long n, long k) {
        long numerator = nume(n, k);
        long denominator = fac(k);
        return (numerator * pow(denominator, 1000000007 - 2)) % 1000000007;
    }

    static long nume(long n, long k) {
        // k--;
        long result = 1;
        while(k > 0) {
            result = result * n % 1000000007;
            k--;
            n--;
        }
        return result;
    }

    static long fac(long k) {
        long result = 1;
        while(k > 0) {
            result = result * k % 1000000007;
            k--;
        }
        return result;
    }

    static long pow(long n, long p) {
        long result = 1;
        long weight = n;
        while(p > 0) {
            if ((p & 1) == 1) {
                result *= weight;
                result %= 1000000007;
            }
            weight = weight * weight % 1000000007;
            p >>= 1;
        }
        return result;
    }
}