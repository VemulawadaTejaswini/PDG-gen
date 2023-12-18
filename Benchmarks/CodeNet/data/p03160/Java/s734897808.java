import java.util.*;
public class FrogA{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i = 0;i<n;i++)
            ar[i] = sc.nextInt();
        System.out.println(solve(ar));
    }
    public static int solve(int ar[]){
        int n = ar.length;
        if(n<=2)
            return 0;
        int dp[] = new int[n];
        dp[1] = Math.abs(ar[0] - ar[1]);
        for(int i=2;i<n;i++){
            dp[i] = dp[i-1]+(Math.abs(ar[i]-ar[i-1]));
            dp[i] = Math.min(dp[i],dp[i-2]+Math.abs(ar[i]-ar[i-2]));
        }
        return dp[n-1];
    }
}