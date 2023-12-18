import java.util.Arrays;
import java.util.Scanner;

public class Main{
    private static int h[] = new int[(int) (1e5 + 1)];
    private static int dp[] = new int[(int) (1e5 + 1)];
    private static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0;i < n;i++)
            h[i] = sc.nextInt();
        Arrays.fill(dp,0,n,-1);
        System.out.println(dp(0));
    }

    private static int dp(int idx) {
        if(idx == n - 1)
            return 0;
        if(dp[idx] != -1)
            return dp[idx];
        if(idx + 1 < n)
            dp[idx] = Math.abs(h[idx] - h[idx + 1]) + dp(idx + 1);
        if(idx + 2 < n){
            dp[idx] = Math.min(dp[idx],Math.abs(h[idx] - h[idx + 2]) + dp(idx + 2));
        }
        return dp[idx];
    }
}