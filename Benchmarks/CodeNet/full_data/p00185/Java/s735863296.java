import java.util.Scanner;

class Main {
    private static boolean[] calcPrimeTable(int n) {
        boolean[] table = new boolean[n + 1];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!table[i]) {
                for (int j = i + i; j <= n; j += i) {
                    table[j] = true;
                }
            }
        }
        return table;
    }

    private static void solve() {
        boolean[] table = calcPrimeTable(1000000);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            int counter = 0;
            if (n == 0) {
                break;
            }
            for (int i = 2; i <= n / 2; i++) {
                if (!table[i] && !table[n - i]) {
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }

    public static void main(String... args) {
        solve();
    }
}