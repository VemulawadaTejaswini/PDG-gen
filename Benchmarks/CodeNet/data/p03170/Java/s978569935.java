import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()), k = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        boolean[] dp = new boolean[k + 1];

        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < n; j++) {
                if (i - a[j] >= 0) {
                    dp[i] |= !dp[i - a[j]];
                    if (dp[i]) {
                        break;
                    }
                }
            }
        }

        System.out.println(dp[k] ? "First" : "Second");

    }
}
