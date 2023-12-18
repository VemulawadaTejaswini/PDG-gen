import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve();
    }

    static void solve() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        Arrays.sort(values);

        int sum = values[0];
        for (int i = 1; i < n - 1; i++) {
            sum = Math.min(sum - values[i], values[i] - sum);
        }
        System.out.println(Math.max(values[n - 1] - sum, sum - values[n - 1]));

        sum = values[0];
        for (int i = 1; i < n - 1; i++) {
            if (sum - values[i] > values[i] - sum) {
                System.out.println(values[i] + " " + sum);
            } else {
                System.out.println(sum + " " + values[i]);
            }
            sum = Math.min(sum - values[i], values[i] - sum);
        }
        if (values[n - 1] - sum > sum - values[n - 1]) {
            System.out.println(values[n  - 1] + " " + sum);
        } else {
            System.out.println(sum + " " + values[n - 1]);
        }
    }

}
