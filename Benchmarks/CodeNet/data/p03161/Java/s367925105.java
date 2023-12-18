import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] h = new int[n];
        for(int i=0; i<n; i++) {
            h[i] = in.nextInt();
        }
        int[] dp = new int[n];
        dp[n-1] = 0;
        for(int i=n-2; i>=0; i--) {
            int min = Integer.MAX_VALUE;
            for(int j=1; j<=Math.min(k, n-1-i); j++) {
                int val = Math.abs(h[i+j]-h[i])+dp[i+j];
                min = Math.min(min, val);
            }
            dp[i] = min;
        }
        System.out.println(dp[0]);
    }
}
