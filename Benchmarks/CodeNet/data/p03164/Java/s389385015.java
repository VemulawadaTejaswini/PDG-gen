import java.util.Scanner;
import java.util.*;
public class Main {
	
	
	
	public static long KnapsackM(long weight[] , long value[] ,long mw,long n) {
		long dp[][] = new long[n+1][mw+1];
		
		for(long i=0;i<=n;i++) {
			for(long w=0;w<=mw;w++) {
				if(i==0 || w==0) {
					dp[i][w] = 0;
				}else if(weight[i-1] <= w) {
					dp[i][w] = Math.max(value[i-1] + dp[i-1][w-weight[i-1]],  dp[i-1][w]);
				}else {
					dp[i][w] = dp[i-1][w];
				}
			}
		}
		
		return dp[n][mw];
		
	}
	
	
	  
	
	
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long mw = s.nextLong();
        long weight[] = new long[n];
        long value[] = new long[n];
        for(long i=0;i<n;i++) {
        	long wi = s.nextLong();
        	long vi = s.nextLong();
        	weight[i] = wi;
        	value[i] = vi;
        }
        System.out.println(KnapsackM(weight,value,mw,n));
//        System.out.println(knapSack(mw,weight,value,n));
    }
}