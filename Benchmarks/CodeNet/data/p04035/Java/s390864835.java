import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws IOException
	{
		int n=nextInt();
		int l=nextInt();
		int ans=-1;
		int a[]=new int[n+1];
		for(int i=1;i<=n;i++)
		{
			a[i]=nextInt();
			if(i!=1 && a[i]+a[i-1]>=l)
				ans=i-1;
		}
		if(ans==-1)
			out.println("Impossible");
		else
		{
			out.println("Possible");
			for(int i=1;i<ans;i++)
				out.println(i);
			for(int i=ans+1;i<n;i++)
				out.println(i);
			out.println(ans);
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