import java.util.*;
import java.lang.*;
import java.io.*;
 public class Main{
	static int solve(int[]arr,int n,int[]dp){
		dp[1]=0;
		for(int i=2;i<=n;i++){
			int op1=Math.abs(arr[i]-arr[i-1])+dp[i-1];
			int op2=Math.abs(arr[i]-arr[i-2])+dp[i-2];
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
		int[]arr=new int[n+1];
		int[]dp=new int[n+1];	
		for(int i=1;i<=n;i++){
			arr[i]=Integer.parseInt(s1[i-1]);
		}
		System.out.println(solve(arr,n,dp));
	}
}