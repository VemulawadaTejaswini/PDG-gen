
import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br;
	static int cin() throws Exception
	{
		return Integer.valueOf(br.readLine());
	}
	static int[] split() throws Exception
	{
		String[] cmd=br.readLine().split(" ");
		int[] ans=new int[cmd.length];
		for(int i=0;i<cmd.length;i++)
		{
			ans[i]=Integer.valueOf(cmd[i]);
		}
		return ans;
	}
	static long[] splitL() throws IOException
	{
		String[] cmd=br.readLine().split(" ");
		long[] ans=new long[cmd.length];
		for(int i=0;i<cmd.length;i++)
		{
			ans[i]=Long.valueOf(cmd[i]);
		}
		return ans;
	}
	static long[][]dp;
	static int n;
	static long mod=1000000007;
	static int[][] mat;
	static long solve(int ind,int mask)
	{
		if(ind==n)
			return 1;
		if(dp[ind][mask]!=-1)
		{
			return dp[ind][mask];
		}
		long res=0;
		for(int i=0;i<n;i++)
		{
			if(mat[ind][i]==1 && ((mask&(1<<i))==0))
				res=(res+solve(ind+1,mask|(1<<i)))%mod;
		}
		dp[ind][mask]=res;
		return res;
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		br=new BufferedReader(new InputStreamReader(System.in));
		n=cin();
		mat=new int[n][n];
		for(int i=0;i<n;i++)
		{
			mat[i]=split();
		}
		dp=new long[n+1][(int)Math.pow(2, n)];
		for(int i=0;i<=n;i++)
		{
			Arrays.fill(dp[i], -1);
		}
		System.out.println(solve(0,0));
	}
}
