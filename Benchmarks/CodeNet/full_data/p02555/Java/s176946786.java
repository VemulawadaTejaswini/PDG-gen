import java.util.*;
    public class Main{
    	public static void main(String[] args){
        	Scanner s  = new Scanner(System.in);
          	int n = s.nextInt();
          	if(n<3){
            System.out.println(0);
            }
          		long[] dp = new long[n+1];
          		long mod = (long)1e9 + 7;
          		dp[3] = 1;
          		dp[0] =1;
          		for(int i = 4;i<=n;i++){
                	for(int k = 3;i-k>=0;k++){
                    	dp[i] = dp[i] + dp[i-k];
                      	if(dp[i]>=mod) dp[i]-=mod;
                    }
                }
          		System.out.println(dp[n]);
           }
    }