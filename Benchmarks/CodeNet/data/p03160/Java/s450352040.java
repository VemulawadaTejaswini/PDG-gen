import java.util.*;

public class Main {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int dp[] = new int[n];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=0;i<n;i++){
            if((i+1) <n)
            dp[i+1] = Math.min(dp[i+1],dp[i]+Math.abs(arr[i+1]-arr[i]));
            if((i+2)<n)
            dp[i+2] = Math.min(dp[i+2],dp[i]+Math.abs(arr[i+2]-arr[i]));
        }
        System.out.println(dp[n-1]);
    }

}