//package AtCoder;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[][] a=new int[n][3];
		
		for(int i=0;i<n;i++)
		{
			a[i][0]=sc.nextInt();
			a[i][1]=sc.nextInt();
			a[i][2]=sc.nextInt();
		}
		//System.out.print("a");
		
		sc.close();
		int[][] dp=new int[n][3];
		
		dp[0][0]=a[0][0];
		dp[0][1]=a[0][1];
		dp[0][2]=a[0][2];
		
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(j==0)
				{
					dp[i][j]=a[i][j]+Math.max(dp[i-1][1], dp[i-1][2]);
				}
				else if(j==1)
				{
					dp[i][j]=a[i][j]+Math.max(dp[i-1][0], dp[i-1][2]);
				}
				else if(j==2)
				{
					dp[i][j]=a[i][j]+Math.max(dp[i-1][0], dp[i-1][1]);
				}
			}
		}
		

		System.out.println(maximum(dp[n-1]));

	}
	static int maximum(int[] dp)
	{
		int max=Integer.MIN_VALUE;
		
		max=Math.max(dp[0], dp[1]);
		max=Math.max(max, dp[2]);
		return max;
	}

}
