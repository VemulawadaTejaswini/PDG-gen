import java.util.*;
public class frog1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int dp[]=new int[n+1];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		dp[1]=Math.abs(arr[0]-arr[1]);
		for(int i=2;i<n;i++)
		{
			int opt1=dp[i-2]+Math.abs(arr[i-2]-arr[i]);
			int opt2=dp[i-1]+Math.abs(arr[i]-arr[i-1]);
		//	System.out.println(opt1+" "+opt2);
			dp[i]=Math.min(opt1, opt2);
		}
		System.out.println(dp[n-1]);
	}
}
