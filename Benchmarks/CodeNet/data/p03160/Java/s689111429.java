import java.util.*;

class Frog1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = s.nextInt();
        int dp[] = new int[n];
        for(int i=1;i<n;i++)
            dp[i] = Integer.MAX_VALUE;
        // dp[0] = 0;
        for(int i=1;i<n;i++){
            dp[i] = Math.min(dp[i],dp[i-1]+Math.abs(arr[i]-arr[i-1]));
            if(i<n-1){
                dp[i+1] = Math.min(dp[i+1],dp[i-1]+Math.abs(arr[i+1]-arr[i-1]));
            }
        }
        System.out.println(dp[n-1]);
    }
}