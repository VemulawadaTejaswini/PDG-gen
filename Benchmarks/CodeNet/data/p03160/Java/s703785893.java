import java.util.*;
import java.lang.*;
import java.io.*;
  public class Main{
	static long solve(long[]arr,int n,long[]dp){
		dp[1]=0;
		for(int i=2;i<=n;i++){
			long op1=Math.abs(arr[i]-arr[i-1])+dp[i-1];
			long op2=Math.abs(arr[i]-arr[i-2])+dp[i-2];
			dp[i]=Math.min(op1,op2);
		}
		return dp[n];

	}
	public static void main(String[] args)throws IOException {
		//Scanner in=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String s=br.readLine();
		String[]s1=s.split(" ");
		long[]arr=new long[n+1];
		long[]dp=new long[n+1];	
		for(int i=1;i<=n;i++){
			arr[i]=Integer.parseInt(s1[i-1]);
		}
		System.out.println(solve(arr,n,dp));
	}
}