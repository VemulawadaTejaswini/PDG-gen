import java.util.*;
public class Main {
    public static int drip(char a[],char b[],int n,int m)
    {
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(a[i-1]==b[j-1])
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int k=dp[n][m];
        char g[]=new char[k];
        int i=n,j=m;
        while(k!=0)
        {
            if(a[i-1]==b[j-1])
            {
                g[k-1]=a[i-1];
                k--;
            }
            int u=dp[i-1][j-1];
            if(dp[i-1][j]==u && dp[i][j-1]==u)
            {
                i--;
                j--;
            }
            else
            {
                int f=Math.max(dp[i-1][j],Math.max(u,dp[i][j-1]));
                if(f==u)
                {
                    i--;
                    j--;
                }
                else if(f==dp[i-1][j])
                {
                    i--;
                }
                else{
                    j--;
                }
            }
        }
        System.out.println(g);
        // for(int w=0;w<=n;w++)
        // {
        //     for(int q=0;q<=m;q++)
        //     {
        //         System.out.print(dp[w][q]+" ");
        //     }
        //     System.out.println();
        // }
        return dp[n][m];
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String x=s.next();
        String y=s.next();
        int n=x.length();
        int m=y.length();
        char a[]=x.toCharArray();
        char b[]=y.toCharArray();
        drip(a,b,n,m);
    }
}