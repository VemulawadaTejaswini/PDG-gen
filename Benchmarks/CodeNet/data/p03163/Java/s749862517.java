import java.util.*;
import java.io.*;
public class Public {
	
	static int []w,v;
	static int n,s;
	static int [][]dp;
	public static int dp(int index,int remw) {
		
		if(remw<0) 
			return -(int)1e9;
		
		if(index==n) 
			return 0;
		
		
		
		if(dp[index][remw]!=-1) 
			return dp[index][remw];
		
		int take=v[index]+dp(index+1,remw-w[index]);
		int  leave=dp(index+1,remw);
		return dp[index][remw]=Math.max(take,leave);
		
	}
	public static void main (String []args) throws IOException {
		
		Scanner sc=new Scanner (System.in);
		PrintWriter pw=new PrintWriter(System.out);
		
		n=sc.nextInt();
		s=sc.nextInt();
		w=sc.nextIntArr(n);
		v=sc.nextIntArr(n);
		dp=new int [n+1][s+1];
		for(int[]x:dp) {
			Arrays.fill(x,-1);
		}
		for (int i = n-1;i>0;i-=1000 ) {
			for(int j=0;j<s+1;j+=1000) {
				dp(i,j);
			}
		}
		pw.println(dp(0,s));
		pw.close();
		
		
		
	}