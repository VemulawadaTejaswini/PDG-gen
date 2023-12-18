import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      long[] dp = new long[n+1];
      long count = 0;
      for(int i = 1;i <= n;i++){
        for(int j = 1;j <= i;j++){
        	if(i%j==0)count++;
        }
      	dp[i] = (dp[i-1]+count)%1000000007;
      }
      System.out.println(dp[n]);
    }
}