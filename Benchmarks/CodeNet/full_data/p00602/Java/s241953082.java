import java.util.Scanner;
import java.util.Arrays;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        final int n = 1001;

        while (scanner.hasNextInt()) {
            int v = scanner.nextInt();
            int d = scanner.nextInt();

            int a = 1;
            int b = 1;
            int[] fib = new int[v];
            for (int i  = 0; i < v; i++) {
                fib[i] = (a + b) % n;
                b = a;
                a = fib[i];
            }
            Arrays.sort(fib);

            int counter = 0;
            int previous = fib[0];
            for (int i = 0; i < v; i++) {
                int current = fib[i];
                if (current - previous >= d) {
                    counter++;
                }
                previous = current;
            }

            System.out.println(counter + 1);
        }
    }

    public static void main(String... args) {
        solve();
    }
}