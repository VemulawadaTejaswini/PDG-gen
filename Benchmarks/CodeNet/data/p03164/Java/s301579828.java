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
      	int ans = ans(wt,ct,W,N);
      	System.out.println(ans);
    }
  	public static int ans(int[] wt, int[] ct, int W, int N){
      	if(N<=0)
          	return 0;
      	int sum_value = 0;
      	for(int i=0;i<N;i++)
        	sum_value+=ct[i];
      	
      	long dp[] = new long[sum_value+1];
     	Arrays.fill(dp,Integer.MAX_VALUE);
      	dp[0] = 0;
        for(int i=0;i<N;i++){
      		for(int v=sum_value;v>=ct[i];v--){
              	
            	dp[v] = Math.min(dp[v], dp[v-ct[i]]+wt[i]);
            }
        }
        int max = 0;
      	for(int i=1;i<=sum_value;i++){
        	if(dp[i]<=W){
            	max = Math.max(max, i);
            }
        }
      	return max;
    }
}