import java.util.*;
public class Main {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		int dp[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		dp[0]=0;
		dp[1]=Math.abs(arr[0]-arr[1]);
		for(int i=2;i<n;i++)
		{
			int min=1000000;
			for(int j=1;j<=k&&i-j>=0;j++)
			{
				//System.out.println(i+" "+j);
				int temp=dp[i-j]+Math.abs(arr[i]-arr[i-j]);
			min=Math.min(temp, min);
			}
			dp[i]=min;
			//System.out.println(dp[i]);
		}
		System.out.println(dp[n-1]);
	}
}
