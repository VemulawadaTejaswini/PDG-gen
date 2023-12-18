import java.io.*;
import java.util.*;

public class Main {
    private static String solve(int n, int k, int[] arr) {
        // dp[i] = true if player who play wins;
        // e.g. we have arr = [2,3] k = 4
        // dp[2] = true because we have element 2 in a;
        // dp[3] = true because we have element 3 in a
        // for dp[4] we can choose either 2 or 3
        // if we choose 2 than other play choose 2 in next move and we loose
        // for that if we take 2 than look at dp[4-2] = dp[2] == true(for second player
        // so we loosing)
        // if we choose 3 than dp[4-3] = dp[1] == false(for second player and we win
        // because 2nd player can't make move)
        // dp[i-arr[j]] == false than dp[i] = true and than we break because we are
        // playing
        // optimally. we are looking for false value for dp[i-arr[j]] to win.
        Boolean[] dp = new Boolean[k + 1];
        Arrays.fill(dp, false);
        for (int i = 0; i <= k; i++) {
            for (int j = 0; j < n; j++) {
                if (i - arr[j] < 0) {
                    dp[i] = false;
                    break;
                }

                if (dp[i - arr[j]] == false) {
                    dp[i] = true;
                    break;
                }
            }
        }

        if (dp[k] == true) {
            return "First";
        }
        return "Second";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solve(n, k, arr));
        sc.close();
    }
}