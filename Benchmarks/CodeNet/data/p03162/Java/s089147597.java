
import java.util.*;

public class Main {
 
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][3];
		long dp[][]=new long[n][3];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			Arrays.fill(dp[i], -1);
		}
		long ans=rec(arr,dp,0,0);
		System.out.println(ans);
	}
 
	private static long rec(int[][] arr, long[][] dp, int ind, int sel) {
		// TODO Auto-generated method stub
		if(ind==arr.length)
		{
			return 0;
		}
		long ans=0;
		//System.out.println(ind+" "+sel);
		if(sel!=0&&dp[ind][sel-1]!=-1)
		{
			//System.out.println("y");
			return dp[ind][sel-1];
		}
		if(sel==0)
		{
			long opt1=arr[ind][0]+rec(arr,dp,ind+1,1);
			long opt2=arr[ind][1]+rec(arr,dp,ind+1,2);
			long opt3=arr[ind][2]+rec(arr,dp,ind+1,3);
			ans=Math.max(opt1, Math.max(opt2, opt3));
			return ans;
		}else if(sel==1)
		{
			long opt1=arr[ind][1]+rec(arr,dp,ind+1,2);
			long opt2=arr[ind][2]+rec(arr,dp,ind+1,3);
			ans=Math.max(opt1, opt2);
		}else if(sel==2)
		{
			long opt1=arr[ind][0]+rec(arr,dp,ind+1,1);
			long opt2=arr[ind][2]+rec(arr,dp,ind+1,3);
			ans=Math.max(opt1, opt2);
		}else {
			long opt1=arr[ind][0]+rec(arr,dp,ind+1,1);
			long opt2=arr[ind][1]+rec(arr,dp,ind+1,2);
			ans=Math.max(opt1, opt2);
		}
		//System.out.println(ind+" "+sel);
		dp[ind][sel-1]=ans;
		return ans;
	}
}