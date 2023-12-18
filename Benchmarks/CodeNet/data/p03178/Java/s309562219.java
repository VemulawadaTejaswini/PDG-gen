
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
	static long p=1000000007;
	static long[][][]dp;
	static String s;
	static int n;
	static int k;
	static long count(int ind,int mod,int st)
	{
		if(ind==n && mod==0)
			return 1;
		if(ind==n)
			return 0;
		if(dp[ind][mod][st]!=-1)
			return dp[ind][mod][st];
		int x=s.charAt(ind)-'0';
		if(st==0)
			x=9;
		long res=0;
		for(int i=0;i<=x;i++)
		{
			int status=(st==1 && i==x)?1:0;
			res=(res+count(ind+1,(mod+i)%k,status));
		}
		dp[ind][mod][st]=res;
		return res;
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		br=new BufferedReader(new InputStreamReader(System.in));
		s=br.readLine();
		n=s.length();
		k=cin();
		dp=new long[n+1][k+1][2];
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=k;j++)
			{
				Arrays.fill(dp[i][j], -1);
			}
		}
		System.out.println((count(0,0,1)-1+p)%p);
	}
}
