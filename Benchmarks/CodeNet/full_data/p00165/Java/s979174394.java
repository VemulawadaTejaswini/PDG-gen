import java.util.Arrays;
import java.util.Comparator;
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
        int[] primes = calcPrimes(999983);
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            int[][] range = new int[n][2];
            for (int i = 0; i < n; i++) {
                int p = scanner.nextInt();
                int m = scanner.nextInt();
                range[i][0] = Math.max(p - m, 2);
                range[i][1] = Math.min(p + m, 999983);
            }
            Arrays.sort(range, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return (o1[0] < o2[0]) ? -1 : ((o1[0] == o2[0]) ? 0 : 1);
                }
            });
            int counter = 0;
            int index = 0;
            for (int i = 0; i < n; i++) {
                int start = range[i][0];
                int end = range[i][1];
                for (; primes[index] < start; index++);
                for (int j = index; j < primes.length && primes[j] <= end; j++) {
                    counter++;
                }
            }
            System.out.println(counter - n);
        }
    }

    public static void main(String... args) {
        solve();
    }
}