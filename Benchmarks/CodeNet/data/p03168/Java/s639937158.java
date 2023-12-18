import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        int N;
        double res=0;
        Scanner in=new Scanner(System.in);
        N=in.nextInt();
        double[]p=new double[N+1];
        double[][] dp=new double[N+1][N+1];//前i个中有j个硬币朝上
        for(int i=1;i<=N;i++)p[i]=in.nextDouble();
        dp[0][0]=1;
        for(int i=1;i<=N;i++){
          dp[i][0]=dp[i-1][0]*(1-p[i]);
          for(int j=1;j<=i;j++){
            dp[i][j]=dp[i-1][j-1]*p[i]+dp[i-1][j]*(1-p[i]);
          }
        }
        for(int i=N/2+1;i<=N;i++){
          res+=dp[N][i];
        }
        System.out.println(res);
    }
}