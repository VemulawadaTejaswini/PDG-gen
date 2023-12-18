import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static Scanner in;

    private static int n;
    private static int[] h;
    private static int[] dp;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        
        n = in.nextInt();
        h = new int[n];
        dp = new int[n-1];

        Arrays.fill(dp, -1);

        for(int i=0; i<n; i++) h[i] = in.nextInt();

        System.out.println(solve(0));


    }

    public static int solve(int i) {
        if (i==n-1) return 0;

        if (dp[i]!=-1) return dp[i];

        return dp[i]=Math.min(Math.abs(h[i+1]-h[i])+solve(i+1), i+2<n?Math.abs(h[i+2]-h[i])+solve(i+2):(int)1e9);

    }

}