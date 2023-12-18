import java.util.*;
import java.lang.*;
import java.io.*;
public class Main{
	static int mod=1000000007;
	static long[][][]dp=new long[31][31][2];
	static long solve(long[]arr,int i,int j,int turn){
		if(i>j)
			return 0;
		if(dp[i][j][turn]!=0)
			return dp[i][j][turn];
		if(turn==1)
			return dp[i][j][turn]=Math.max(arr[i]+solve(arr,i+1,j,0),arr[j]+solve(arr,i,j-1,0));
		else
			return dp[i][j][turn]=Math.min(solve(arr,i+1,j,1),solve(arr,i,j-1,1));

	}
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		long []arr=new long[n+1];
		long sum=0;
		String s=br.readLine();
		String[]s1=s.split(" ");
		long y=0;
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(s1[i]);
			sum+=arr[i];
		}
		long x=solve(arr,0,n-1,1);
		y=sum-x;;
		System.out.println(x-y);

	}
}