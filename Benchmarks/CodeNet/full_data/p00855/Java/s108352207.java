import java.util.Scanner;

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
        int[] primes = calcPrimes(1299709);

        while (true) {
            int k = scanner.nextInt();
            if (k == 0) {
                break;
            }
            int gap = 0;
            for (int i = 0; i < primes.length; i++) {
                if (primes[i] == k) {
                    gap = 0;
                    break;
                } else if (primes[i] > k) {
                    gap = primes[i] - primes[i - 1];
                    break;
                }
            }
            System.out.println(gap);
        }
    }

    public static void main(String... args) {
        solve();
    }
}