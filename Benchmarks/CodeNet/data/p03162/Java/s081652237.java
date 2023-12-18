import java.util.*;
public class Main
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		int dp[]=new int[3];
		int [] cost = new int [3];
		for(int i=0;i<N;i++)
		{
		int new_dp [] =new int[3];
			for(int j=0;j<3;j++)
			{
				cost[j]=sc.nextInt();
			}
			
			
			
			for(int j=0;j<3;j++)
			{
			
				for(int k=0;k<3;k++)
				{
					if(j!=k)
					{
						new_dp[k]=Math.max(new_dp[k],cost[k]+dp[j]);
					}
				}
			}
			
			dp=new_dp;
			
			
		}
		
		System.out.println(Math.max(dp[2],Math.max(dp[0],dp[1])));
	}
}