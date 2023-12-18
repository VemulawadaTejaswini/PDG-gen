import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);

        long ans = 0;
        for (int i = 0; i < n / 2; i++) {
            if (n % 2 == 0) {
                ans += a[n - i - 1] - a[n / 2 - i - 1] + (i == n / 2 - 1 ? 0 : a[n - i - 1] - a[n / 2 - i - 2]);
            } else if (a[n / 2 + 1] - a[n / 2] == a[n / 2] - a[n / 2 - 1]) {
                ans += 2 * a[n - i - 1] - a[i] - a[i + 1];
            } else if (a[n / 2 + 1] - a[n / 2] > a[n / 2] - a[n / 2 - 1]) {
                ans += 2 * a[n - i - 1] - (i == 0 ? a[n / 2] : a[i - 1]) - a[i];
            } else {
                Utils.println(a[i], (i == 0 ? a[n - 1] : a[n / 2 + i - 1]), a[n / 2 + i]);
                ans += -2 * a[i] + (i == 0 ? a[n - 1] : a[n / 2 + i - 1]) + a[n / 2 + i];
            }
        }
        System.out.println(ans);
    }
}