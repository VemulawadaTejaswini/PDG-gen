import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main
{
	
	private void solve()throws Exception
	{
		int n=nextInt();
		BigInteger ans=new BigInteger("1");
		for(int i=1;i<=n;i++)
		{
			BigInteger a=new BigInteger(nextToken());
			ans=ans.multiply(a);
		}
		if(ans.compareTo(new BigInteger("1000000000000000000"))>0)
		{
			out.println(-1);
		}
		else
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