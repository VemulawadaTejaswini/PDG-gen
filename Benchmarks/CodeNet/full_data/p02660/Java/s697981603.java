import java.util.*;

public class Main {

    private static final int[] lp = new int[1000000 + 1];
    private static final List<Integer> pr = new ArrayList<>();

    static  {
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
                usedPrimes.add(prime);
                while ((N > 0) && (N % z == 0)) {
                    count++;
                    N = N/z;
                    z = z*prime;
                }
            }
        }

        if (N > 1 && test(N, usedPrimes)) {
            count++;
        }
        System.out.println(count);
    }

    private static boolean test(final long N, final Set<Integer> usedPrimes) {
        for (int up : usedPrimes) {
            if (N % up == 0) {
                return false;
            }
        }

        return true;
    }
}