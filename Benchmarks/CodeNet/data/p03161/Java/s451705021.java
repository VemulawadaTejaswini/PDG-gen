import java.util.Arrays;
import java.util.Collections;
import java.util.*;
class Main
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in); 
		int t,i;	
		int n=sc.nextInt();
		int k=sc.nextInt();
		int h[]=new int[n];
		for(i=0;i<n;i++)
			h[i]=sc.nextInt();
		int dp[]=new int[n];
		Arrays.fill(dp, 0);
		dp[0]=0;
		int ans=0;
		for(i=1;i<n;i++)
		{
			int min=Integer.MAX_VALUE;
			for(int j=i-k;j<i;j++)
			{
				if(j<0)
					continue;
				min=Math.min(min, dp[j]+Math.abs(h[j]-h[i]));
			}
			dp[i]=min;
		}
		System.out.println(dp[n-1]);
	}
}