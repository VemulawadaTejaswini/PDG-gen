/*
https://atcoder.jp/contests/dp/tasks/dp_a

*/
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	
		int N;
		Scanner sc=new Scanner(System.in);
		N =sc.nextInt();
		
		int arr[] =new int[N];
		
		for(int i=0;i<N;i++)
		{	
			arr[i]=sc.nextInt();
		}
	
		//logic
		int dp[]=new int[N+1];
		 
		dp[0]=0;
		dp[1]=arr[1]-arr[0];
		
		for(int i=2;i<N;i++)
		{
			 
			 
				dp[i]=Math.min( dp[i-1]+Math.abs(arr[i]-arr[i-1]), dp[i-2]+Math.abs(arr[i]-arr[i-2]));
				//System.out.println(dp[i]);
		}
		
		System.out.println(dp[N-1]);
	}
	
}