
import java.util.*;
class knapsack2
{
    public static void main(String args[])
    {int n;long W;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int v[]=new int[n];
        int w[]=new int[n];
        W=sc.nextLong();int sum=0;
       
        for(int i=0;i<n;i++)
        {
           
            w[i]=sc.nextInt();
            v[i]=sc.nextInt();
            sum=sum+v[i];
        }
         long dp[]=new long[sum+1];
         for(int j=0;j<=sum;j++) dp[j]=1000000000000L;
        dp[0]=0;
        for(int i=0;i<n;i++)
        {
            for(int j=sum;j>=v[i];j--)
            {
                
       
                dp[j]=(long)Math.min(dp[j],dp[j-v[i]]+w[i]);
   
            
        }
    }
    for(int k=sum;k>=0;k--)
    {
        if(dp[k]<=W)
        {
        System.out.print(k);
        break;
    }
        
}
}
}