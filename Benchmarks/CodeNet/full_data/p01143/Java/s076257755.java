import java.util.Scanner;

class Main {
    private static void solve() {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            final int n = scanner.nextInt();
            final int m = scanner.nextInt();
            final int p = scanner.nextInt();
            if (n == 0 && m == 0 && p == 0) {
                break;
            }
            int sum = 0;
            int winner = 0;
            for (int i = 0; i < n; i++) {
                final int x = scanner.nextInt();
                sum += x;
                if (i == m - 1) {
                    winner = x;
                }
            }
            if (winner == 0) {
                System.out.println(0);
            } else {
                System.out.println((int) ((double) sum * (100 - p) / winner));
            }
        }
    }

    public static void main(String... args) {
        solve();
    }
}