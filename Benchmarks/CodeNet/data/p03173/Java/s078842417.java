
import java.io.*;
import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
public class Main{
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
	static long[]arr;
	static long solve(int l,int r)
	{
		if(l>=r)
			return 0;
		if(dp[l][r]!=-1)
			return dp[l][r];
		long res=(long)Math.pow(10, 18);
		long sum=0;
		for(int i=l;i<=r;i++)
		{
			sum+=arr[i];
		}
		for(int i=l;i<=r-1;i++)
		{
			res=Math.min(res,solve(l,i)+solve(i+1,r)+sum);
		}
		dp[l][r]=res;
		return res;
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		br=new BufferedReader(new InputStreamReader(System.in));
		int n=cin();
		arr=splitL();
		dp=new long[n+1][n+1];
		for(int i=0;i<=n;i++)
		{
			Arrays.fill(dp[i], -1);
		}
		System.out.println(solve(0,n-1));
	}
}
