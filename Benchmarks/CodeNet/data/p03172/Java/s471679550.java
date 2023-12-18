import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Main
{
    long dp[][];
    int max[];
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int child=sc.nextInt();
        int candles=sc.nextInt();
        sc.nextLine();
        Main object=new Main();
        object.dp=new long[child+1][candles+1];
        object.max=new int[child];
        object.dp[0][0]=1;
        for(int i=1;i<=child;i++)
        {
          object.max[i-1]=sc.nextInt();
          for(int j=0;j<=candles;j++)
          {
              if(j-object.max[i-1]<=0)
                 object.dp[i][j]=object.dp[i-1][j]%1000000007;
              else
                 object.dp[i][j]=(object.dp[i-1][j]-object.dp[i-1][j-object.max[i-1]-1])%1000000007;
              if(j!=0)
                object.dp[i][j]=(object.dp[i][j]+object.dp[i][j-1]+1000000007)%1000000007;
          }
        }
        System.out.println(object.dp[child][candles]);
        sc.close();
     }
}