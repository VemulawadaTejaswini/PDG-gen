

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] d = new int[n + 1];
        d[0] = 0;
        for (int i = 1; i <= n; ++i) {
            d[i] = scanner.nextInt();
        }
        Arrays.sort(d);
        int min1 = 24;
        for (int i = 0; i < n; ++i) {
            int diff = i % 2 == 0
                    ? Math.abs(24 - d[i + 1] - d[i])
                    : Math.abs(24 - d[i] - d[i + 1]);
            int current = Math.min(24 - diff, diff);
            min1 = Math.min(min1, current);
        }

        int min2 = 24;
        for (int i = 0; i < n; ++i) {
            int diff = i % 2 == 1
                    ? Math.abs(24 - d[i + 1] - d[i])
                    : Math.abs(24 - d[i] - d[i + 1]);
            int current = Math.min(24 - diff, diff);
            min2 = Math.min(min2, current);
        }

        System.out.println(Math.max(min1, min2));
    }
}
