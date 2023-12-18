public class Solutino {

    public static int solution(int[] stones) {
        int n = stones.length;
        if (n == 0) return 0;
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(stones[1] - stones[0]);
        for (int i = 2; i < stones.length; i++) {
            dp[i] = Math.min(dp[i - 1] + Math.abs(stones[i] - stones[i - 1]), dp[i - 2] + Math.abs(stones[i] - stones[i - 2]));
        }
        return dp[n - 1];
    }

}
