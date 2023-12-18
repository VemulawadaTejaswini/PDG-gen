import java.io.*;
import java.util.*;
public class Main
{
	final int inf=(int)(1e9+1);
	private void solve()throws IOException
	{
		int A=nextInt();
		int B=nextInt();
		int M=nextInt();
		int a[]=new int[A+1];
		int b[]=new int[B+1];
		int mina=inf,minb=inf;
		for(int i=1;i<=A;i++)
		{
			a[i]=nextInt();
			mina=Math.min(mina,a[i]);
		}
		for(int i=1;i<=B;i++)
		{
			b[i]=nextInt();
			minb=Math.min(minb,b[i]);
		}
		long ans=mina+minb;
		for(int i=1;i<=M;i++)
		{
			int x=nextInt();
			int y=nextInt();
			int c=nextInt();
			ans=Math.min(ans,a[x]+b[y]-c);
		}
		out.println(ans);
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