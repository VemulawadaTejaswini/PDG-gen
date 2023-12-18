import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int INF = (int) 1e9 + 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        solve(scanner, writer);
        scanner.close();
        writer.close();
    }

    public static void solve(Scanner scanner, PrintWriter writer) {
        String s = scanner.next();
        String t = scanner.next();

        // dp[i][j] denote length of longest common subsequence of s[0:i-1] and t[0:j-1]
        int n1 = s.length();
        int n2 = t.length();
        int[][] dp = new int[n1 + 1][];
        //Arrays.fill(dp, new int[n2+1]);
        for (int i = 0; i <= n1; i++) {
            dp[i] = new int[n2+1];
        }

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        //for (int i = 0 ; i <= n1; i++){
        //    writer.println(Arrays.toString(dp[i]));
        //}

        StringBuilder str = new StringBuilder();
        int row = n1;
        int col = n2;
        while (row >= 1 && col >= 1) {
            int cur = dp[row][col];
            int topLeft = dp[row - 1][col - 1];
            int left = dp[row][col - 1];
            int top = dp[row - 1][col];
            if (cur == 0) {
                break;
            } else if (cur - 1 == top && cur - 1 == topLeft && cur - 1 == left) {
                str.append(s.charAt(row - 1));
                --row;
                --col;
            } else if (cur == left) {
                --col;
            } else if (cur == top) {
                --row;
            }
        }

        writer.println(str.reverse().toString());

        //int ans = dp[n1][n2];
        //
        //writer.println(ans);
    }
}
