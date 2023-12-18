

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long [] height = new long[n + 1];

        long [] cost = new long[n + 1];
        height[0] = 0;
        for (int i = 1; i <= n; ++i) {
            height[i] = scanner.nextLong();
        }
        cost[0] = 0;
        cost[1] = 0;
        for (int i = 2; i <= n; ++i) {
            cost[i] = Math.min(cost[i - 1] + Math.abs(height[i] - height[i - 1]),
                    cost[i - 2] + Math.abs(height[i] - height[i - 2])
                    );
        }
        System.out.println(cost[n]);

    }
}
