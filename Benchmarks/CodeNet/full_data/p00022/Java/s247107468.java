import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int maximum = Integer.MIN_VALUE;
            for (int i = 2; i <= n; i++) {
                for (int j = 0; j <= n - i; j++) {
                    int sum = 0;
                    for (int k = 0; k < i; k++) {
                        sum += a[j + k];
                    }
                    if (sum > maximum) {
                        maximum = sum;
                    }
                }
            }
            System.out.println(maximum);
        }
    }

    public static void main(String... args) {
        solve();
    }
}