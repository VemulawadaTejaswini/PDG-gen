import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws IOException
	{
		int a=nextInt();
		int b=nextInt();
		int c=nextInt();
		int d=nextInt();
		for(int i=1;;i=i==1?2:1)
		{
			if(i==1)
			{
				c=c-b;
				if(c<=0)
				{
					out.println("Yes");
					return;
				}
			}
			else
			{
				a=a-d;
				if(a<=0)
				{
					out.println("No");
					return;
				}
			}
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