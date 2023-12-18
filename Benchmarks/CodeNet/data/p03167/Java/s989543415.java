import java.io.*;
import java.util.*;




public class Main
{

	static int n,m;


	static int[][] a;


	static long[][] dp;

	static int mod=1000000007;



	static long find(int i,int j)
	{
		if(i>=n || j>=m) return 0L;
		if((i==n-1) && (j==m-1)) return 1L;
		if(dp[i][j] != -1) return (dp[i][j])%mod;
		dp[i][j]=0;
		if(j<(m-1) && a[i][j+1]!=0) dp[i][j]=(find(i,j+1))%mod;
		if(i<(n-1) && a[i+1][j]!=0) dp[i][j]+=(find(i+1,j))%mod;
		return dp[i][j]=dp[i][j]%mod;
	}

	


	public static void main(String[] Rohan)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));





		String[] s=br.readLine().split(" ");

		n=Integer.parseInt(s[0]);m=Integer.parseInt(s[1]);

		a=new int[n][m];

		dp=new long[n][m];


		for(int i=0;i<n;i++)
		{
			String s1=br.readLine();

			for(int j=0;j<m;j++)
			{
				if(s1.charAt(j)=='.') a[i][j]=1;
				else a[i][j]=0;
				dp[i][j]=-1;
			}
		}

		
		System.out.println(find(0,0));
		

	}
}