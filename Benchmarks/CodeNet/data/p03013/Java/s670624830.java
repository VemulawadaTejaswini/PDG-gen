import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
   int M = sc.nextInt();
   Integer[] a = new Integer[M];
   for(int i=0;i<M;i++) a[i] = sc.nextInt();
   long[] dp = new long[N+1];
   dp[1]=1;
   if(Arrays.asList(a).contains(1))dp[1]=0;
   dp[2]=1+dp[1];
   if(Arrays.asList(a).contains(2))dp[2]=0;
   for(int i=3;i<=N;i++)
   {
     if(Arrays.asList(a).contains(i)) dp[i]=0;
     else dp[i]=(dp[i-1]+dp[i-2])%1000000007;
   }
   System.out.println(dp[N]);
 }
}