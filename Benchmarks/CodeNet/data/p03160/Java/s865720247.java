import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] heights = new int[N];
        for (int i=0; i<N; i++) {
            heights[i] = sc.nextInt();
        }

        int[] dp = new int[N];
        dp[1] = Math.abs(heights[1] - heights[0]);
        int INF = 1<<29;
        for (int i=2; i<N; i++) {
            dp[i] = INF;
        }

        for (int i=2; i<N; i++) {
            dp[i] = Math.min(dp[i], dp[i-1] + Math.abs(heights[i] - heights[i-1]));
            dp[i] = Math.min(dp[i], dp[i-2] + Math.abs(heights[i] - heights[i-2]));
        }

        System.out.println(dp[N-1]);
    }
}

