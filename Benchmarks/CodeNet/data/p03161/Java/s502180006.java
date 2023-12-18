import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        //long start = System.nanoTime();
        System.out.println(solve(n, k, h));
        //long end = System.nanoTime();
        //System.err.println("execution time: " + ((end-start)/1_000_000) + "ms");
    }
    private static int solve(int n, int k, int[] h) {
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(h[1]-h[0]);
        for (int i = 2; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 1; j <= Math.min(i, k); j++) {
                dp[i] = Math.min(dp[i], dp[i-j]+Math.abs(h[i]-h[i-j]));
            }
        }
        return dp[n-1];
    }
}
