import java.util.*;
import java.io.*;
class Main{
	private static long getMaxSum(int i,int weights[],int values[],int n,int w,Long dp[][]){
		if(i>=n || w<=0)
			return 0;

		if(dp[i][w] != -1)
			return dp[i][w];
		long take = Long.MIN_VALUE;
		long notTake = Long.MIN_VALUE;
		if(weights[i]<=w)
			take = values[i]+ getMaxSum(i+1,weights,values,n,w-weights[i],dp);
		notTake = getMaxSum(i+1,weights,values,n,w,dp);
		dp[i][w]= Math.max(take,notTake);
		return dp[i][w];
	}
	public static void main(String[] args)throws Exception
	 {
	 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in[]=br.readLine().split(" ");
		int n = Integer.parseInt(in[0]);
		int w = Integer.parseInt(in[1]);
		int weights[]=new int[n];
		int values[]=new int[n];
		int i=0;
		while(i<n){
			String inp[]=br.readLine().split(" ");
			weights[i]=Integer.parseInt(inp[0]);
			values[i]=Integer.parseInt(inp[1]);
			i++;
		}
		Long dp[][]=new Long[n][w+1];
		for(Long a[]:dp)
			Arrays.fill(a,-1l);
		long maxSum = getMaxSum(0,weights,values,n,w,dp);
		System.out.println(maxSum);
	}
}