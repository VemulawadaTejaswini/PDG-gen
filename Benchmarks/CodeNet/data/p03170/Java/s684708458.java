
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
	static int n;
	static int[]arr;
	static boolean[]dp;
	static boolean solve(int k)
	{
		if(k==0)
			return false;
		if(!dp[k])
		{
			return false;
		}
		boolean res=false;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>k)
				continue;
			res=(solve(k-arr[i]));
			if(!res)
				return true;
		}
		dp[k]=false;
		return false;
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		br=new BufferedReader(new InputStreamReader(System.in));
		int[]ar=split();
		n=ar[0];
		int k=ar[1];
		arr=split();
		dp=new boolean[k+1];
		Arrays.fill(dp,true);
		boolean ans=solve(k);
		if(ans)
			System.out.println("First");
		else
			System.out.println("Second");
	}
}
