import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]),k=Integer.parseInt(s[1]);
        int i,j,m=0; boolean d[]=new boolean[n+1];
        for(i=0;i<k;i++)
        {
            s=bu.readLine().split(" ");
            int l=Integer.parseInt(s[0]),r=Integer.parseInt(s[1]);
            for(j=l;j<=r;j++) d[j]=true;
            m+=r-l+1;
        }
        int c[]=new int[m]; j=0;
        for(i=0;i<=n;i++)
        if(d[i]) c[j++]=i;

        long dp[]=new long[n+1],M=998244353;
        dp[1]=1;
        for(i=2;i<=n;i++)
        for(j=0;j<m;j++)
        if(c[j]<=i) dp[i]=(dp[i]+dp[i-c[j]])%M;
        else break;
        System.out.print(dp[n]);
    }
}
