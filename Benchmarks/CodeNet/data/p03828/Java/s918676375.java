import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static final long MOD = 1000_000_007;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int last = 0;
        int primes[] = new int[n];
        Arrays.fill(primes, 0);
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                primes[last] = i;
                last++;
            }
        }

        int counts[] = new int[n];
        Arrays.fill(counts, 0);
        for (int i = 1; i <= n; i++) {
            int ii = i;
            for (int j = 0; j < last; j++) {
                while (ii % primes[j] == 0) {
                    counts[j]++;
                    ii = ii / primes[j];
                }
            }
        }

        long ans = 1;
        for (int i = 0; i < last; i++) {
            ans = modmul(ans, counts[i] + 1, MOD);
        }

        System.out.println(ans);
    }

    static boolean isPrime(long n) {
        if (n == 1) return false;
        if (n == 2) return true;
        for (long i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static long modmul(long a, long b, long mod) {
        return (a * b) % mod;
    }
}