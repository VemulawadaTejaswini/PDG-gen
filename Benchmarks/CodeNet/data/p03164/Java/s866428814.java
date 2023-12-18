import java.util.Scanner;
public class Main{
	
	
	private static Scanner sc=new Scanner(System.in);
	private static long dp[][];
	
	public static long maxProfit(int weivalue[][],int i,int capacity){
		
		if(capacity<=0)
			return 0;
		if(i>=weivalue.length)
			return 0;
		
		if(dp[i][capacity]!=Integer.MIN_VALUE)
			return dp[i][capacity];
		
		if(capacity>=weivalue[i][0])		
			dp[i][capacity]=Math.max(maxProfit(weivalue,i+1,capacity),
									weivalue[i][1]+maxProfit(weivalue,i+1,capacity-weivalue[i][0]));
		else
			dp[i][capacity]=maxProfit(weivalue,i+1,capacity);
		
		return dp[i][capacity];
		
	}
	
	public static void main(String []args){
		
		int n=sc.nextInt();
		int w=sc.nextInt();
		int weivalue[][]=new int[n][w];
		dp=new long[n+1][w+1];
		for(int i=0;i<n;i++){
			weivalue[i][0]=sc.nextInt();
			weivalue[i][1]=sc.nextInt();
		}
		for(int i=0;i<=n;i++)
			for(int j=0;j<=w;j++)
				dp[i][j]=Integer.MIN_VALUE;
			
		
		System.out.println(maxProfit(weivalue,0,w));
		
	}
}