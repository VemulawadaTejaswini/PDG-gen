import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static long gcd(long a, long b) {
        if (a < b) {
            long t = a;
            a = b;
            b = t;
        }

        if (a % b == 0) {
            return b;
        }

        return gcd(a, a % b);
    }

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        long a = std.nextLong();
        long b = std.nextLong();

        long l = gcd(a, b);
        List<Long> primes = new ArrayList<>();
        for (long i = 1; i <= l; i++) {
            if (l % i == 0) {
                primes.add(i);
            }
        }

        long count = 0;
        for (int i = 0; i < primes.size(); i++) {
            long val = primes.get(i);
            boolean isPrime = true;
            for (int j = 2; j < val ; j++) {
                if (val % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
            }
        }

        System.out.println(count);
    }
}
