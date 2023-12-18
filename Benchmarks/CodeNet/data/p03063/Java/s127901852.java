
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int [][]dp = new int[n][2];
        // 0 - '#', 1 -'.'
        dp[0][0] = s.charAt(0) == '#' ? 0 : 1;
        dp[0][1] = s.charAt(0) == '.' ? 0 : 1;
        for (int i = 1; i < n; ++i) {
            char current = s.charAt(i);
            if (current == '#') {
                dp[i][0] = Math.min(dp[i - 1][0], dp[i - 1][1]);
                dp[i][1] = 1 + dp[i - 1][1];
            } else {
                dp[i][0] = 1 + Math.min(dp[i - 1][0], dp[i - 1][1]);
                dp[i][1] = dp[i - 1][1];
            }
        }

        System.out.println(Math.min(dp[n - 1][0], dp[n - 1][1]));

    }
}
