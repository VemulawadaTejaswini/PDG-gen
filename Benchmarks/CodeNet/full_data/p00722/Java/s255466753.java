import java.util.Scanner;

class Main {
    private static boolean[] calcPrimeTable(int n) {
        boolean[] table = new boolean[n + 1];
        table[0] = table[1] = true;
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
        Scanner scanner = new Scanner(System.in);
        boolean[] table = calcPrimeTable(1000000);

        while (true) {
            int a = scanner.nextInt();
            int d = scanner.nextInt();
            int n = scanner.nextInt();
            int result;

            if (a == 0 && d == 0 & n == 0) {
                break;
            }

            for (int i = 0; ; i++) {
                if (!table[a + d * i]) {
                    n--;
                }
                if (n == 0) {
                    result = a + d * i;
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