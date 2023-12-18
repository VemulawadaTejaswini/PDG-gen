import java.util.Scanner;

/**
 * Disjoint Set of Common Divisors
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            long A = sc.nextLong();
            long B = sc.nextLong();

            long gcd = gcd(A, B);

            long ans = 0;

            for (long d = 1; d * d <= gcd; d++) {
                if (gcd % d != 0) {
                    continue;
                }

                if (isPrime(d)) {
                    ans++;
                }

                if (gcd / d != d && isPrime(gcd / d)) {
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }

    static long gcd(long M, long N) {
        if (M < N) {
            return gcd(N, M);
        }
        return N > 0 ? gcd(N, M % N) : M;
    }

    static boolean isPrime(long N) {
        for (long i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }

}
