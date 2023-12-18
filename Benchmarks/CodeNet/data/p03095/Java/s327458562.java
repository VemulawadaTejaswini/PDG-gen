
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
        int che[] = new int[30];
        Arrays.fill(check, false);
        for (int i = 1; i < n + 1; i++) {
            int a = (int) (s.charAt(i - 1)) - 97;
            if (che[a] == 0) {
                che[a]++;
                dp[i] = dp[i - 1] * 2 % mod + 1;

            } else {
                che[a]++;
                dp[i] = (dp[i - 1] - 1) / che[a] * (che[a] + 1) % mod + che[a];
            }
        }
        System.out.println(dp[n]);

        sc.close();
    }
}