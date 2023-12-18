

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int sum = 0;
            int[] count = new int[1002];

            for (int i = 2; i <= n; i++) {
                int x = i;
                for (int j = 2; j <= x; j++) {
                    while (x % j == 0) {
                        x /= j;
                        count[j]++;
                    }
                }
            }

            long ans = 1;
            long MOD = 1000000007;

            for (int i = 2; i <= n; i++) {
                ans *= count[i] + 1;
                ans %= MOD;
            }

            System.out.println(ans);
        }
    }
}
