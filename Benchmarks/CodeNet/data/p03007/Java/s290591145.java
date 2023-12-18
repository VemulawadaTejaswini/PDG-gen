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

        int result = values[n - 1];
        int sum = values[0];
        for (int i = 1; i < n - 1; i++) {
            System.out.println(sum + " " + values[i]);
            sum = sum - values[i];
        }
        System.out.println(result + " " + sum);

        System.out.println(result - sum);
    }

}
