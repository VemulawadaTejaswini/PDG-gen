import java.util.*;
import java.io.*;
class Main{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		dp=new long[n+1][n+1];
		for(int i=0;i<dp.length;i++) {
			Arrays.fill(dp[i], -1);
		}
		System.out.println(call(0,n-1,arr));
		
	}

	static long dp[][];
	static long call(int i,int j,int arr[]) {
		if(i>=j)return 0;
		if(dp[i][j]!=-1)return dp[i][j];
		long ans=Long.MAX_VALUE;
		for(int k=i;k<j;k++) {
			ans=Math.min(ans, call(i,k,arr)+sum(i,k,arr)+sum(k+1,j,arr)+call(k+1,j,arr));
		}
		return dp[i][j]=ans;
	}
	static long sum(int i,int j,int arr[]) {
		long ans=0;
		for(int k=i;k<=j;k++) {
			ans+=arr[k];
	
		}
return ans;	
}
	
}
