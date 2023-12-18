import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int w=s.nextInt();
		
		long[][] arr=new long[n][2];
		
		for(int i=0;i<n;i++)
		{
			arr[i][0]=s.nextInt();
			arr[i][1]=s.nextInt();
		}
		
		long[][] dp=new long[n+1][w+1];
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=w;j++)
			{
				if(j<arr[i-1][0])
				{
					dp[i][j]=dp[i-1][j];
				}
				else
				{
					dp[i][j]=Math.max(dp[i-1][j],arr[i-1][1]+dp[i-1][(int)(j-arr[i-1][0])]);
				}
			}
		}
		
		System.out.println(dp[n][w]);
		
	}
	
}