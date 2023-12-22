package atcoder;

import java.util.*;

public class Main {

    //private static final int MAX = 1000000; // Wa want a solution with time O(Sqrt(N)) = O(Sqrt(10^12)) = 10^6.

    private static final int[] lp = new int[1000000 + 1];
    private static final List<Integer> pr = new ArrayList<>();

    static {    // fast Eratosthenes sieve
        for (int i = 2; i <= 1000000; ++i) {
            if (lp[i] == 0) {
                lp[i] = i;
                pr.add(i);
            }
            for (int j = 0; j < pr.size() && pr.get(j) <= lp[i] && i*pr.get(j) <= 1000000; ++j) {
                lp[(i * pr.get(j))] = pr.get(j);
            }
        }
    }

    public static void main (String[] args) {

        final Scanner in = new Scanner(System.in);
        long N = in.nextLong();

        final long B = (long)Math.sqrt(N) + 1;
        long count = 0;

        final Set<Integer> usedPrimes = new HashSet<>();

        for (int prime = 2; prime <= Math.min(B, 1000000); ++prime) {
            if (lp[prime] == prime && (N > 0) && (N % prime == 0)) {
                long z = prime;
                usedPrimes.add(prime);  // record prime
                while ((N > 0) && (N % z == 0)) { // try all z = prime, prime^2, prime^3, ...
                    count++;
                    N = N/z;
                    z = z*prime;
                }

                while ( (N > 0) && (N % prime == 0) ) {  // exhaust prime as a factor of N
                    N = N/prime;
                }
            }
        }

        if (N > 1 && test(N, usedPrimes)) { // N > 1 ==> some part of the initial value of N is still left;
            count++;                        // test == true ==> the remaining part N is having a prime factor P
                                            // (possibly being a prime itself, that is P = N) that is not among the recorded primes
                                            // This means that this P contributes with 1 more case: z = P^1.
        }

        System.out.println(count);
    }

    // checks if N is not divided evenly by any prime number in usedPrimes
    private static boolean test(final long N, final Set<Integer> usedPrimes) {
        for (int usedPrime : usedPrimes) {
            if (N % usedPrime == 0) {
                return false;
            }
        }
        return true;
    }
}
