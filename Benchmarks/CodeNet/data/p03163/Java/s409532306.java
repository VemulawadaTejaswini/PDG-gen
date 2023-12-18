import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        int N,W;
        Scanner in=new Scanner(System.in);
        N=in.nextInt();
        W=in.nextInt();
        int[] w=new int[N];
        int[] v=new int[N];
        for(int i=0;i<N;i++){
            w[i]=in.nextInt();
            v[i]=in.nextInt();
        }
        long[][] dp=new long[N+1][W+1];
        for(int i=0;i<N;i++){
            for(int j=1;j<=W;j++){
                if(j<w[i])dp[i+1][j]=dp[i][j];
                else dp[i+1][j]=Math.max(dp[i][j],dp[i][j-w[i]]+v[i]);
            }
        }
        System.out.println(dp[N][W]);
    }
}