
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
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		br=new BufferedReader(new InputStreamReader(System.in));
		int[]ar=split();
		int n=ar[0];
		int k=ar[1];
		int[] arr=split();
		boolean[]dp=new boolean[k+1];
		Arrays.fill(dp,false);
		for(int i=1;i<=k;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i-arr[j]<0)
					break;
				if(!dp[i-arr[j]])
				{
					dp[i]=true;
					break;
				}
			}
		}
		System.out.println(dp[k]?"First":"Second");
	}
}
