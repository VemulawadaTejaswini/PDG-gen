import java.util.*;

public class Main
{
	static int [] dp;
	static ArrayList<Integer>[] a;
	public static int solve(int i)
	{
		if(dp[i]!=-1)
		{
			return dp[i];
		}
		int ret=0;
		for(int j=0;j<a[i].size();j++)
		{
			ret=Math.max(ret,solve(a[i].get(j))+1);
		}
		dp[i]=ret;
		return dp[i];
	}
	public static void main(String [] Args)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		a=new ArrayList[n];
		dp = new int [n];
		for(int i=0;i<n;i++)
		{
			dp[i]=-1;
			a[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<m;i++)
		{
			int p=in.nextInt();
			int q=in.nextInt();
			a[p-1].add(q-1);
		}
		int ret=0;
		for(int i=0;i<n;i++)
		{
			ret=Math.max(ret,solve(i));
		}
		System.out.println(ret);
	}
}
	