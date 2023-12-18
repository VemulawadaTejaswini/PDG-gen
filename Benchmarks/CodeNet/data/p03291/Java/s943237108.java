import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        String s = scanner.nextLine();
        // remaining combinations at i with num of picked chars j
        int[][] dp = new int[s.length() + 1][4];
        dp[s.length()][3] = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int cn = charToNum(c);
            int m = c == '?' ? 3 : 1;
            dp[i][0] = m * dp[i + 1][0];
            dp[i][1] = m * dp[i + 1][1];
            dp[i][2] = m * dp[i + 1][2];
            dp[i][3] = m * dp[i + 1][3];
            if (cn < 3) {
                dp[i][cn] += dp[i + 1][cn + 1];
            }
        }
        System.out.println(dp[0][0]);
    }

    static int charToNum(char c) {
        if (c == '?')
            return Integer.MAX_VALUE;
        return c - 'A';
    }

}