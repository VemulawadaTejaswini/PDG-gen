/*													   *********************
													   	     I. COINS	
													   *********************                   Atharva Tripathi                                 */
													   
import java.util.*;
import java.io.*;
public class Main
{
	static int mod=(int)(1e9+7);
	public static class pair
	{
		int x;
		int y;
		public pair(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String input[]=br.readLine().split(" ");
		double pheads[]=new double[n];
		for(int i=0;i<n;i++)
			pheads[i]=Double.parseDouble(input[i]);
		
		double dp[][]=new double[n+1][n+1];
		dp[1][0]=1.0-pheads[0];
		dp[1][1]=pheads[0];
		
		for(int i=2;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j!=0)
					dp[i][j]=dp[i-1][j]*(1-pheads[i-1])+dp[i-1][j-1]*pheads[i-1];
				else
					dp[i][j]=dp[i-1][j]*(1-pheads[i-1]);
			}
		}
		
		double ans=0.0;
		for(int i=(n/2+1);i<=n;i++)
			ans+=dp[n][i];
		
		System.out.println(ans);
		
		
	}
}