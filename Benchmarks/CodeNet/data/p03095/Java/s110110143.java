
//AGC031 A

import java.util.Arrays;
import java.util.Scanner;

class Main {
    static final int mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        // dp[i] : i 番目まで
        int dp[] = new int[n + 1];
        boolean check[] = new boolean[26];
        Arrays.fill(check, false);
        for (int i = 1; i < n + 1; i++) {
            int a = (int) (s.charAt(i - 1)) - 97;
            if (check[a]) {
                dp[i] = (dp[i - 1] - 1) / 2 * 3 % mod + 2;
            } else {
                dp[i] = dp[i - 1] * 2 % mod + 1;
                check[a] = true;
            }
        }
        System.out.println(dp[n]);

        sc.close();
    }
}