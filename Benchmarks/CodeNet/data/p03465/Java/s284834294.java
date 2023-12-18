import java.io.*;
import java.util.*;
public class Main
{
	int n,a[];
	private void solve()throws IOException
	{
		n=nextInt();
		a=new int[n+1];
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			a[i]=nextInt();
			sum+=a[i];
		}
		int maxn=4000000;
		BitSet dp=new BitSet(maxn+1);
		dp.set(maxn);
		for(int i=1;i<=n;i++)
			dp.or(dp.get(a[i],maxn+1));
		for(int i=(sum+1)/2;i<=maxn;i++)
			if(dp.get(maxn-i))
			{
				out.println(i);
				return;
			}
	}

	 
	///////////////////////////////////////////////////////////

	public void run()throws IOException
	{
		br=new BufferedReader(new InputStreamReader(System.in));
		st=null;
		out=new PrintWriter(System.out);

		solve();
		
		br.close();
		out.close();
	}
	public static void main(String args[])throws IOException{
		new Main().run();
	}
	BufferedReader br;
	StringTokenizer st;
	PrintWriter out;
	String nextToken()throws IOException{
		while(st==null || !st.hasMoreTokens())
		st=new StringTokenizer(br.readLine());
		return st.nextToken();
	}
	String nextLine()throws IOException{
		return br.readLine();
	}
	int nextInt()throws IOException{
		return Integer.parseInt(nextToken());
	}
	long nextLong()throws IOException{
		return Long.parseLong(nextToken());
	}
	double nextDouble()throws IOException{
		return Double.parseDouble(nextToken());
	}
}