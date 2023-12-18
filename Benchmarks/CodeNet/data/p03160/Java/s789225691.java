import java.util.*;
import java.io.*;
public class atcoder {
	static int n,arr[];
	static long dp[][];
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=1;
//		Integer.parseInt(br.readLine().trim());
		StringBuilder printans=new StringBuilder();
		while(t-->0)
		{
			n=Integer.parseInt(br.readLine().trim());
			arr=new int[n];
			int sum=0;
			StringTokenizer tok=new StringTokenizer(br.readLine()," ");
			for(int i=0;i<n;i++) {
				arr[i]=Integer.parseInt(tok.nextToken());
				sum+=arr[i];
			}
			dp=new long[n+1][sum+1];
			memset();
			
			printans.append(call(0,0));
		    
		}
		System.out.println(printans);

	}
	static void memset() {
		for(long a[]:dp) {
			Arrays.fill(a, -1);
		}
	}
	static long call(int i,int h) {
		if(i==n) {
			return h;
		}
		if(dp[i][h]!=-1) {
			return dp[i][h];
		}
		long ans=Integer.MAX_VALUE;
		if(i<n-2) {
			ans=Math.min(ans, call(i+2,h+Math.abs(arr[i]-arr[i+2])));
			ans=Math.min(ans, call(i+1,h+Math.abs(arr[i+1]-arr[i])));
		}
		else if(i<n-1) {
			ans=Math.min(ans, call(i+1,h+Math.abs(arr[i+1]-arr[i])));
		}
		else if(i==n-1) {
			ans=Math.min(ans, call(i+1,h));
		}
		dp[i][h]=ans;
		return ans;
			
	}

}
