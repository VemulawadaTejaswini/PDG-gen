import java.util.*;

public class Main{
	public static int n;
	public static int [] arr;
	public static int[] dp;
	public static int minCost(int pos)
	{
		if(pos>=n-1) 
			return 0;
		if(dp[pos]!=-1)
			return dp[pos];
		int onestep=Integer.MAX_VALUE;
		int twostep=Integer.MAX_VALUE;
		if(pos+1<n)
		{
			onestep=Math.abs(arr[pos]-arr[pos+1])+minCost(pos+1);
		//	System.out.println(onestep);
		}
		if(pos+2<n)
		{
			twostep=Math.abs(arr[pos]-arr[pos+2])+minCost(pos+2);
			//System.out.println(twostep);
		}
		return dp[pos]=Math.min(onestep, twostep);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		arr=new int[n];
		dp=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		Arrays.fill(dp,-1);
		System.out.println(minCost(0));
		
	}

}
