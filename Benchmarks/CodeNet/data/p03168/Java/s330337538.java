import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner s = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
       int n=s.nextInt();
       double[] arr=new double[n+1];
       for(int i=1;i<=n;i++){arr[i]=s.nextDouble();}
        double[][] dp=new double[n+1][n+1];
      dp[0][0]=1;
      for(int i=1;i<=n;i++){
        dp[0][i]=dp[0][i-1]*(1-arr[i]);
      }
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
          if(i<=j){
            dp[i][j]=dp[i][j-1]*(1-arr[j])+dp[i-1][j-1]*arr[j];
          }
        }
      }
       double res=0;
       for(int i=n/2 +1;i<=n;i++){
        res+=dp[i][n];
       }
       System.out.println(res);
        }
    }
