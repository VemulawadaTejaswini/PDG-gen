import java.util.Scanner;
import java.util.Arrays;

class Main {
    private static void solve() {
        final Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            final int n = scanner.nextInt();
            int[] minutes = new int[n];
            for (int i = 0; i < n; i++) {
                minutes[i] = scanner.nextInt();
            }
            Arrays.sort(minutes);
            int result = 0;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                result += sum + minutes[i];
                sum += minutes[i];
            }
            System.out.println(result);
        }
    }

    public static void main(String... args) {
        solve();
    }
}