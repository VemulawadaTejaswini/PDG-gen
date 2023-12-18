import java.util.Arrays;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int heights[] = new int[i];
        for (int j = 0; j < heights.length; j++) {
            heights[j] = scanner.nextInt();
        }
        long numOfWays = getNumOfWays(heights);
        System.out.println(numOfWays);
    }

    private static long getNumOfWays(int hei[]) {
        int dp[] = new int[hei.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[dp.length - 1] = 0;
        for (int i = dp.length - 2; i >= 0; i--) {
            if (i + 1 < dp.length)
                dp[i] = Math.min(dp[i], Math.abs(hei[i] - hei[i + 1]) + dp[i + 1]);
            if (i + 2 < dp.length) {
                dp[i] = Math.min(dp[i], Math.abs(hei[i] - hei[i + 2]) + dp[i + 2]);
            }
        }
        return dp[0];
    }

    private static boolean canHorseReach(int horseRow, int horseCol, int x, int y) {
        for (int i = 0; i < dir.length; i++) {
            if (horseRow + dir[i][0] == x && horseCol + dir[i][1] == y) return true;
        }
        return false;
    }


}