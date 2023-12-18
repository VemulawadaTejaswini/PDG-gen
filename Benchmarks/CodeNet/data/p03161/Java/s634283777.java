import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nk = sc.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        int[] heights = new int[n];

        String[] ss = sc.nextLine().split(" ");
        for(int i = 0; i < n; i++) {
            heights[i] = Integer.parseInt(ss[i]);
        }

        sc.close();
        System.out.println(frog(n, k, heights));
    }

    public static int frog(int n, int k, int[] heights) {
        if(n == 0 || n == 1)    return 0;

        int[] dp = new int[n];
        dp[0] = 0;
        for(int i = 1; i <= k && i < n; i++) {
            dp[i] = Math.abs(heights[i] - heights[0]);
        }

        for(int i = 2; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for(int j = 1; j <= k && j <= i; j++) {
                min = Math.min(Math.abs(heights[i] - heights[i - j]) + dp[i - j], min);
            }
            dp[i] = min;
        }
        return dp[n - 1];
    }
}

