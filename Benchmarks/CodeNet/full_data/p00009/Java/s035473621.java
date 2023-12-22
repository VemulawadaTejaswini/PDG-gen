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
        int[] primes = calcPrimes(100000);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int result = 0;
            for (int i = 0; ; i++) {
                if (primes[i] > n) {
                    result = i;
                    break;
                }
            }
            System.out.println(result);
        }
    }

    public static void main(String... args) {
        solve();
    }
}