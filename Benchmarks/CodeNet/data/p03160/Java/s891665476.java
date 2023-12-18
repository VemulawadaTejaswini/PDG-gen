import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int INF=1000000;
        int h[]=new int[n];
        for(int i=0;i<n;i++){
            h[i]=sc.nextInt();
        }
        int dp[]=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=INF;
        }
        for(int i=0;i<n;i++){
            if(i==0) dp[i]=0;
            if(i>=1) dp[i]=Math.min(dp[i],dp[i-1]+Math.abs(h[i]-h[i-1]));
            if(i>=2) dp[i]=Math.min(dp[i],dp[i-2]+Math.abs(h[i]-h[i-2]));
        }
        System.out.println(dp[n-1]);
    }
}