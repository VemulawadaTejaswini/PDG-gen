
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    final static long MOD = 1000000007;

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int k = scanner.nextInt();
        final long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLong();
        }

        if (k == 1) {
            System.out.println(0);
            return;
        }

        Arrays.sort(array);

        final CombinationCalculator combinationCalculator = new CombinationCalculator(n + 1, (int) MOD).init();
        final long[] accumulatedSum = new long[n - k + 1];
        for (int i = 0; i < accumulatedSum.length; i++) {
            if(i != 0) {
                accumulatedSum[i] = combinationCalculator.calc(k - 2 + i, k - 2) + accumulatedSum[i - 1];
            }else{
                accumulatedSum[i] = combinationCalculator.calc(k - 2 + i, k - 2) ;
            }
        }

        long f = 0;
        for (int i = 0; i <= n - k; i++) {
            f += (array[n - 1 - i] - array[i]) * accumulatedSum[k - i];
            f %= MOD;
            /*
            for (int j = i + k - 1; j < n; j++) {
                f += (array[j] - array[i]) * combinationCalculator.calc(j - i - 1, k - 2);
                f %= MOD;
            }
             */
        }

        System.out.println(f);
    }

    private static class CombinationCalculator {
        private final int size;
        private final int mod;
        private final long[] factorials;
        private final long[] invertedElements;
        private final long[] invertedFactorials;

        CombinationCalculator(final int size, final int mod) {
            this.size = size;
            this.mod = mod;
            this.factorials = new long[size];
            this.invertedElements = new long[size];
            this.invertedFactorials = new long[size];
        }

        CombinationCalculator init() {
            factorials[0] = 1;
            factorials[1] = 1;
            invertedFactorials[0] = 1;
            invertedFactorials[1] = 1;
            invertedElements[1] = 1;
            for (int i = 2; i < size; i++) {
                factorials[i] = factorials[i - 1] * i % mod;
                invertedElements[i] = mod - invertedElements[mod % i] * (mod / i) % mod;
                invertedFactorials[i] = invertedFactorials[i - 1] * invertedElements[i] % mod;
            }
            return this;
        }

        long calc(final int n, final int k) {
            return factorials[n] * (invertedFactorials[k] * invertedFactorials[n - k] % mod) % mod;
        }
    }
}
