import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;
public class MyClass {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        int n=sc.nextInt(),
            m=sc.nextInt();
        char[][] c=new char[n][m];
        for(int i=0;i<n;i++) {
            String s=sc.next();
            for(int j=0;j<m;j++)
                c[i][j]=(char)s.charAt(j);
        }
        long[][] dp=new long[n][m];
        for(int i=0;i<n;i++) {
            if(c[i][0]=='#')
                break;
            dp[i][0]=1L;
        }
        for(int i=0;i<m;i++) {
            if(c[0][i]=='#')
                break;
            dp[0][i]=1L;
        }
        long mod=1000000007;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if((c[i][j]=='#') || (i==0) || (j==0))
                    continue;
                else
                    dp[i][j]=(dp[i-1][j]+dp[i][j-1])%mod;
            }
        }
        pw.print(dp[n-1][m-1]);
        pw.close();
    }
}