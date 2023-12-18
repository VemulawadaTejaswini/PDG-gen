
import java.io.*;
import java.math.BigInteger;
import java.util.*;
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
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		int q=cin();
		int rev=0;
		for(int i=0;i<q;i++)
		{
			String[] st=br.readLine().split(" ");
			int t=Integer.valueOf(st[0]);
			if(t==1)
				rev=rev^1;
			else
			{
				int f=Integer.valueOf(st[1]);
				if(f==2)
				{
					if(rev==0)
						s=s+""+st[2];
					else
						s=st[2]+s;
				}
				else
				{
					if(rev==0)
						s=st[2]+""+s;
					else
						s=s+""+st[2];
				}
			}
		}
		if(rev==0)
			System.out.println(s);
		else
		{
			StringBuilder sr=new StringBuilder(s);
			System.out.println(sr.reverse().toString());
		}
	}
}
