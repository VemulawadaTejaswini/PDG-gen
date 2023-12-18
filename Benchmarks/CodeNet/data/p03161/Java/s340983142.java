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
		int[] arr = new int[N];
		for(int i=0;i<N;++i) arr[i] = Integer.parseInt(s[i]);
		System.out.println(solve(arr,N,K));
	}
	
	private static int solve(int[] arr,int N,int K){
		int[] dp = new int[N];
	    
	    for(int i=N-2;i>=0;--i){
	    	for(int j=i;j<N && j <= i+K;++j){
	    		int val = dp[j] + Math.abs(arr[i] - arr[j]);
	    		if(dp[i] == 0 || dp[i] > val){
	    			dp[i] = val;
	    		}
	    	}
	    }
		
		return dp[0];
	}
}