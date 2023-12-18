import java.util.*;


import java.io.*;



public class Main 
{   
	static int dp[];
	public static void main(String[] args) throws IOException 
	{ 
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ar[]=new int[n];
		
		for(int i=0;i<n;i++)
			ar[i]=s.nextInt();
		
		
		int dp[]=new int[n];
		Arrays.fill(dp, Integer.MAX_VALUE);
		int k=2;
		dp[0]=0;
		dp[1]=Math.abs(ar[1]-ar[0]);
		for(int i=2;i<n;i++) {
			for(int j=1;j<=k;j++) {
				dp[i]=Math.min(dp[i],dp[i-j]+Math.abs(ar[i]-ar[i-j]));
				
			}
			
		}
		System.out.println(dp[n-1]);

	}
}