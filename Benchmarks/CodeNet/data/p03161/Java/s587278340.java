import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static int getMinCost(int[] height, int k, int[] memo) {
        return getMinCostHelper(0, height,k, memo);
    }

    private static int getMinCostHelper(int i, int[] height, int k, int[] memo) {
        if(i == height.length - 1) {
            return 0;
        }

        if(memo[i] != -1) {
            return memo[i];
        }

        int costIncurred = Integer.MAX_VALUE;
        for(int index = i + 1; index <= i + k; index++) {
            if(index < height.length) {
                costIncurred = Math.min(costIncurred, Math.abs(height[index]-height[i]) + getMinCostHelper(index, height, k, memo));
            }
        }
        return memo[i] = costIncurred;
    }

    private static int getMinCostHelperDP(int[] height, int K) {
        int N = height.length;

        int[] dp = new int[N];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for(int i=1; i<N; i++) {
            for(int steps = 1; steps <= K; steps++) {
                if(i - steps >= 0 && dp[i-steps] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i-steps] + Math.abs(height[i] - height[i-steps]));
                }
            }
        }
        return dp[N-1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStones = scanner.nextInt();
        int[] height = new int[numberOfStones];
        int k = scanner.nextInt();
        int[] memo = new int[numberOfStones];
        Arrays.fill(memo, -1);
        for(int i=0; i<numberOfStones; i++)
            height[i] = scanner.nextInt();
//      System.out.println(getMinCost(height, k, memo));
        System.out.println(getMinCostHelperDP(height, k));
    }

}
