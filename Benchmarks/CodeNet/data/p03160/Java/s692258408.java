import java.util.*;
public class Main {
    public static long mini(long a[],long n,int j,long sum,long dp[])
    {
        if(j==n-1)
        {
            return sum;
        }
        // if(j>n)
        // {
        //     return Integer.MAX_VALUE;
        // }
        if(dp[j]!=0)
        {
            return dp[j];
        }
        long r=Long.MAX_VALUE;
        long s=Long.MAX_VALUE;
        if(j+2<=n-1)
        {
            r=mini(a,n,j+2,sum+(Math.abs(a[j+2]-a[j])),dp);
        }
        if(j+1<=n-1)
        {
             s=mini(a,n,j+1,sum+(Math.abs(a[j+1]-a[j])),dp);
        }
        dp[j]=Math.min(r,s);
        return dp[j];
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long a[]=new long[n];
        long dp[]=new long[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextLong();
        }
        System.out.println(mini(a,n,0,0,dp));
    }
}