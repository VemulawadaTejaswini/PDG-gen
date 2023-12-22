import java.util.Scanner;

public class Main {

    public static int minDistance(String word1, String word2) {
        int[][] dp;
        dp = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i <= word1.length(); i++) {
            dp[i] = new int[word2.length() + 1];
        }

        for (int w1Idx = word1.length(); w1Idx >= 0; w1Idx--) {
            for (int w2Idx = word2.length(); w2Idx >= 0; w2Idx--) {
                if (w1Idx == word1.length() || w2Idx == word2.length()) {
                    dp[w1Idx][w2Idx] = Math.max(word1.length() - w1Idx, word2.length() - w2Idx);
                    continue;
                }
                int replaceCost = dp[w1Idx + 1][w2Idx + 1]
                        + (word1.charAt(w1Idx) == word2.charAt(w2Idx) ? 0 : 1);
                int insert1Cost = dp[w1Idx + 1][w2Idx] + 1;
                int insert2Cost = dp[w1Idx][w2Idx + 1] + 1;
                dp[w1Idx][w2Idx] = Math.min(insert1Cost, insert2Cost);
                dp[w1Idx][w2Idx] = Math.min(dp[w1Idx][w2Idx], replaceCost);
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String w1 = in.nextLine();
        String w2 = in.nextLine();
        System.out.println(minDistance(w1, w2));
    }
}