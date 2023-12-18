import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
    public static void main(String []args){
        Scanner in = new Scanner (System.in);
        int n;
        long k;
        n = in.nextInt();
        k = in.nextLong();
        int []arr = new int[n+5];
        arr[0] = 0;
        for(int i=1;i<=n;i++)
            arr[i] = in.nextInt();
        long []dp = new long[n+5];
        for(int i=0;i<n+5;i++)
            dp[i] = 1000000007;
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = Math.abs(arr[2] - arr[1]);
        for(int i=3;i<=n;i++){
            for(int j=1;j<=k;j++){
                if(i-j >= 1)
                dp[i] = Math.min(dp[i-j]+Math.abs(arr[i] - arr[i-j]), dp[i]);
            }

            //System.out.println("Final value --> " + dp[i] + " ");
        }
        //System.out.println();
        System.out.println(dp[n]);
    }
}