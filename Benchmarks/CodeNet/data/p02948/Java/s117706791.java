import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
   int M = sc.nextInt();
   
   int[] a = new int[N];
   int[] b = new int[N];
   for(int i=0;i<N;i++)
   {
     a[i]=sc.nextInt();
     b[i]=sc.nextInt();
   }
   //i個目までの労働について、合計M日以内に得られる報酬
   int[][] dp = new int[N+1][M+1];
   dp[0][0]=0;
   
   for(int i=0;i<N;i++)
   {
     for(int k=0;k<M;k++)
     {
       if(M-k+1-a[i]>=0&&dp[i-1][M-k+1-a[i]]+b[i]>dp[i-1][k]) dp[i][k] = dp[i-1][M-k+1-a[i]]+b[i];
       else dp[i][k] = dp[i-1][k];
     }     
   }
   
   System.out.println(dp[N][M]);
 }
}