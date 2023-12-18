import java.util.*;
public class Main {
	public static void main(String args[]){
    	Scanner s = new Scanner(System.in);
    	int N = s.nextInt();
      	int W = s.nextInt();
      	int wt[] = new int[N];
      	int ct[] = new int[N];
      	for(int i=0;i<N;i++){
        	wt[i] = s.nextInt();
          	ct[i] = s.nextInt();
        }
      	long ans = ans(wt,ct,W,N);
      	System.out.println(ans);
    }
  	public static long ans(int[] wt, int[] ct, int W, int N){
      	if(N<=0)
          	return 0;
      	long dp[] = new long[W+1];
        for(int i=1;i<=N;i++){
      		for(int w=W;w>=wt[i-1];w--){
            	dp[w] = Math.max(dp[w-wt[i-1]]+ct[i-1], dp[w]);
            }
        }
        return dp[W];
    }
}