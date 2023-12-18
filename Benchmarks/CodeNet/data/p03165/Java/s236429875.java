import java.util.*;
public class Main {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       String t=sc.next();
       int dp[][]=new int[s.length()+1][t.length()+1];
       for(int i=1;i<=s.length();i++)
       {
           for(int j=1;j<=t.length();j++)
           {
               if(s.charAt(i-1)==t.charAt(j-1))
               dp[i][j]=1+dp[i-1][j-1];
               else
               dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
           }
       }
       int m=s.length(),n=t.length();
       StringBuilder sb=new StringBuilder();
       while(m>0 && n>0)
       {
           if(s.charAt(m-1)==t.charAt(n-1))
           {
               sb.append(s.charAt(m-1));
               m--;
               n--;
           }
           else
           {
               if(dp[m-1][n]>dp[m][n-1])
               {
                   m=m-1;
                   n=n;
               }
               else
               {
                   m=m;
                   n=n-1;
               }
           }
       }
       System.out.println(sb.reverse().toString());
    }
}