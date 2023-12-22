import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main
{
	
	private void solve()throws Exception
	{
		int n=nextInt();
		BigInteger ans=new BigInteger("1");
		long a[]=new long[n+1];
		boolean flag=true;
		for(int i=1;i<=n;i++)
		{
			a[i]=nextLong();
			if(a[i]==0)
				flag=false;
		}
		if(!flag)
		{
			out.println(0);
			return;
		}
		for(int i=1;i<=n;i++)
		{
			BigInteger x=new BigInteger(Long.toString(a[i]));
			ans=ans.multiply(x);
			if(ans.compareTo(new BigInteger("1000000000000000000"))>0)
			{
				out.println(-1);
				return;
			}
		}
		out.println(ans);
	}

	 
	///////////////////////////////////////////////////////////

	public void run()throws Exception
	{
		br=new BufferedReader(new InputStreamReader(System.in));
		st=null;
		out=new PrintWriter(System.out);

		solve();
		
		br.close();
		out.close();
	}
	public static void main(String args[])throws Exception{
		new Main().run();
	}
	BufferedReader br;
	StringTokenizer st;
	PrintWriter out;
	String nextToken()throws Exception{
		while(st==null || !st.hasMoreTokens())
		st=new StringTokenizer(br.readLine());
		return st.nextToken();
	}
	String nextLine()throws Exception{
		return br.readLine();
	}
	int nextInt()throws Exception{
		return Integer.parseInt(nextToken());
	}
	long nextLong()throws Exception{
		return Long.parseLong(nextToken());
	}
	double nextDouble()throws Exception{
		return Double.parseDouble(nextToken());
	}
}