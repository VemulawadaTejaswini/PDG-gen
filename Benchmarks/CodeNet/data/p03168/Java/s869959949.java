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
    double dp[][];
    double prob[];
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int coins=sc.nextInt();
        sc.nextLine();
        Main object=new Main();
        object.prob=new double[coins];
        for(int i=0;i<coins;i++)
        {
          object.prob[i]=sc.nextDouble();
        }
        object.dp=new double[coins+1][coins+1];
        object.dp[0][0]=1;
        for(int i=1;i<=coins;i++)
        {
          for(int j=0;j<=i;j++)
          {
            if(j==0)
              object.dp[i][j]=object.dp[i-1][j]*(1-object.prob[i-1]);
            else
              object.dp[i][j]=object.dp[i-1][j-1]*object.prob[i-1]+object.dp[i-1][j]*(1-object.prob[i-1]);
          }
        }
        double res=0;
        for(int i=coins/2+1;i<=coins;i++)
        {
               res=res+object.dp[coins][i];
        }
        System.out.println(res);
        sc.close();
     }
}