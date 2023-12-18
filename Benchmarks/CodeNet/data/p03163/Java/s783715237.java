import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int W=sc.nextInt();
        sc.nextLine();
        long value[][]=new long[n][2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                value[i][j]=sc.nextLong();
            }
            sc.nextLine();
        }
        long dp[]=new long[W+1];
        int visited[][]=new int[W+1][n];
        dp[0]=0;
        for(int i=1;i<=W;i++)
        {
             for(int j=0;j<n;j++)
             {
                 if((int)value[j][0]<=i&&((value[j][1]+dp[i-(int)value[j][0]])>dp[i])&&visited[i-(int)value[j][0]][j]==0)
                 {
                     dp[i]=value[j][1]+dp[i-(int)value[j][0]];
                     visited[i][j]=1;
                 }
             }
        }
        System.out.println(dp[W]);
        sc.close();
    }
}