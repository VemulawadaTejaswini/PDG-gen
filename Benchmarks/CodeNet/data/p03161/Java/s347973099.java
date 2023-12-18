import java.util.*;
import java.lang.*;
import java.io.*;


public class Main{
	public static void main (String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split("\\s");
		int N = Integer.parseInt(s[0]);
		int K = Integer.parseInt(s[1]);
		s = br.readLine().split("\\s");
		long[] arr = new long[N];
		for(int i=0;i<N;++i) arr[i] = Long.parseLong(s[i]);
		System.out.println(solve(arr,N,K));
	}
	
	private static long solve(long[] arr,int N,int K){
		long[] dp = new long[N];
		Arrays.fill(dp,-1);
		dp[N-1] = 0;
	    
	    for(int i=N-2;i>=0;--i){
	    	for(int j=i+1;j<N && j <= i+K;++j){
	    		long val = dp[j] + Math.abs(arr[i] - arr[j]);
	    		if(dp[i] == -1 || dp[i] > val){
	    			dp[i] = val;
	    		}
	    	}
	    }
		
		return dp[0];
	}
}