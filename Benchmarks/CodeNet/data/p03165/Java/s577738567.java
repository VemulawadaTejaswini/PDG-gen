import java.util.Arrays;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        char[] s = scanner.next().toCharArray(), t = scanner.next().toCharArray();
        String[][] dp = new String[s.length + 1][t.length + 1];
        Arrays.stream(dp).forEach(array -> Arrays.fill(array, ""));
        for (int i = 1; i <= s.length; i++)
            for (int j = 1; j <= t.length; j++)
                dp[i][j] = s[i - 1] == t[j - 1] ? dp[i - 1][j - 1] + s[i - 1] : (dp[i - 1][j].length() >= dp[i][j - 1].length()) ? dp[i - 1][j] : dp[i][j - 1];
        System.out.println(dp[s.length][t.length]);
    }
}