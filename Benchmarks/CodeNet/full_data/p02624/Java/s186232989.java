import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();

        int[] numberOfFactors = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            numberOfFactors[i] = 1;
        }

        for (int p : primesIterable(N + 1)) {
            for (int j = p; j <= N; j += p) {
                int jc = j / p;
                int exp = 1;
                while (jc >= p && jc % p == 0) {
                    jc /= p;
                    exp++;
                }
                numberOfFactors[j] *= exp + 1;
            }
        }

        long answer = 0;
        for (int i = 1; i <= N; i++) {
            answer += (long) i * numberOfFactors[i];
        }

        System.out.println(answer);
    }

    static Iterable<Integer> primesIterable(final int LIMIT) {
        return () -> new Iterator<>() {
            final boolean[] isComposite = markComposites();
            int prime = 2;

            private boolean[] markComposites() {
                boolean[] isComposite = new boolean[LIMIT];
                for (int p = 2, squareRoot = (int) Math.sqrt(LIMIT - 1); p <= squareRoot; p++)
                    if (!isComposite[p])   // that is, p is a prime.
                        for (int j = p * p; j < LIMIT; j += p) isComposite[j] = true;
                return isComposite;
            }

            public boolean hasNext() {
                return prime < LIMIT;
            }

            public Integer next() {
                int nextPrime = prime;
                do {
                    prime++;
                } while (prime < LIMIT && isComposite[prime]);
                return nextPrime;
            }
        };
    }
}
