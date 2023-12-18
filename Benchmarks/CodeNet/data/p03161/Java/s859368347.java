import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ar[] = new int[n];
        for(int i = 0;i<n;i++)
            ar[i] = sc.nextInt();
        System.out.println(solve(ar,k));
    }
    public static int solve(int ar[],int k){
        int n = ar.length;
        if(n<=k)
            return 0;
        int dp[] = new int[n];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=1;i<n;i++){
            for(int j=Math.max(0,i-k);j<i;j++){
                dp[i] = Math.min(dp[i],dp[j]+Math.abs(ar[i]-ar[j]));
            }
        }
        return dp[n-1];
    }
}