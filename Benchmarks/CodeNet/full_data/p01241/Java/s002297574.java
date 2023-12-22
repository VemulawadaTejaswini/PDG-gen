import java.util.Scanner;

class Main {
    private static void solve() {
        final Scanner scanner = new Scanner(System.in);

        for (int i = 1; ; i++) {
            final int n = scanner.nextInt();
            final int m = scanner.nextInt();
            if (n == 0 && m == 0) {
                break;
            }
            int counter = 0;
            int[] current = new int[m + 2];
            current[0] = n;
            while (current[m] == 0) {
                final int[] next = new int[current.length];
                for (int j = 0; j < m; j++) {
                    next[j] += current[j] % 2;
                    next[j + 1] += current[j] / 2;
                    next[0] += current[j] / 2;
                }
                current = next;
                counter++;
            }
            System.out.println(String.format("Case %d: %d", i, counter));
        }
    }

    public static void main(String... args) {
        solve();
    }
}