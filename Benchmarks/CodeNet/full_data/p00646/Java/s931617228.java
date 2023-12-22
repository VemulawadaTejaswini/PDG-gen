import java.util.Scanner;
import static java.lang.Math.sqrt;

class Main {
    private static int[] calcPrimes(int n) {
        boolean[] table = new boolean[n + 1];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!table[i]) {
                for (int j = i + i; j <= n; j += i) {
                    table[j] = true;
                }
            }
        }
        int counter = 0;
        for (int i = 2; i <= n; i++) {
            if (!table[i]) {
                counter++;
            }
        }
        int[] result = new int[counter];
        int index = 0;
        for (int i = 2; i <= n; i++) {
            if (!table[i]) {
                result[index++] = i;
            }
        }
        return result;
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int[] primes = calcPrimes(1000000);

        while (scanner.hasNextLong()) {
            long l = scanner.nextLong();
            if (l == 0) {
                break;
            }

            int result = 1;
            for (int i = 0; i < primes.length && primes[i] <= sqrt(l); i++) {
                if (l % primes[i] == 0) {
                    int counter = 0;
                    while (l % primes[i] == 0) {
                        l /= primes[i];
                        counter++;
                    }
                    result *= (2 * counter) + 1;
                }
            }
            if (l != 1) {
                result *= 3;
            }
            result = result / 2 + 1;
            System.out.println(result);
        }
    }

    public static void main(String... args) {
        solve();
    }
}