import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h[]=new int[n+1];
        for(int i=1;i<=n;i++)
        h[i]=sc.nextInt();

        int dp[]=new int[n+1];
        dp[1]=0;
        for(int i=2;i<=n;i++)
        {
            int ans1=1000000000,ans2=1000000000;
            ans1=dp[i-1]+Math.abs(h[i]-h[i-1]);
            if(i-2>=1)
            ans2=dp[i-2]+Math.abs(h[i]-h[i-2]);

            dp[i]=Math.min(ans1,ans2);
        }
        System.out.println(dp[n]);

        
    }
}