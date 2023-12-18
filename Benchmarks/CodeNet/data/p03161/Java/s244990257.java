import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int k = scanner.nextInt();
        int heights[] = new int[i];
        for (int j = 0; j < heights.length; j++) {
            heights[j] = scanner.nextInt();
        }
        long numOfWays = getNumOfWays(heights, k);
        System.out.println(numOfWays);
    }

    private static long getNumOfWays(int hei[], int k) {

        int dp[] = new int[hei.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[dp.length - 1] = 0;
        Deque<Integer> deque = new ArrayDeque<>(k);
        deque.add(dp.length - 1);
        for (int i = dp.length - 2; i >= 0; i--) {
            int minIndex = deque.peekFirst();
            int cost = Math.abs(hei[i] - hei[minIndex]) + dp[minIndex];
            dp[i] = cost;
            while (!deque.isEmpty() && dp[deque.peekLast()] > dp[i]) {
                deque.pollLast();
            }
            deque.addLast(i);
            while (!deque.isEmpty() && Math.abs(i - deque.peekFirst()) >= k) {
                deque.pollFirst();
            }
        }
        return dp[0];
    }


}
