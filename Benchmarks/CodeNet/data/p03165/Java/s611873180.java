import java.util.Scanner;

/**
 * LCS
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            char[] S = sc.next().toCharArray();
            char[] T = sc.next().toCharArray();

            int[][] dp = new int[S.length + 1][T.length + 1];
            String[][] lcs = new String[S.length + 1][T.length + 1];

            for (int i = 0; i <= S.length; i++) {
                lcs[i][0] = "";
            }
            for (int j = 0; j <= T.length; j++) {
                lcs[0][j] = "";
            }

            for (int i = 1; i <= S.length; i++) {
                for (int j = 1; j <= T.length; j++) {
                    if (dp[i - 1][j] > dp[i][j - 1]) {
                        dp[i][j] = dp[i - 1][j];
                        lcs[i][j] = lcs[i - 1][j];
                    } else {
                        dp[i][j] = dp[i][j - 1];
                        lcs[i][j] = lcs[i][j - 1];
                    }

                    if (S[i - 1] == T[j - 1] && dp[i - 1][j - 1] + 1 > dp[i][j]) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                        lcs[i][j] = lcs[i - 1][j - 1] + S[i - 1];
                    }
                }
            }

            System.out.println(lcs[S.length][T.length]);
        }
    }

}
