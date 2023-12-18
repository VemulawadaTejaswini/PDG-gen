import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws IOException
	{
		int n=nextInt();
		int m=nextInt();
		PriorityQueue<Integer> pq=new PriorityQueue<>(11,Collections.reverseOrder());
		while(n-->0)
			pq.add(nextInt());
		while(m-->0)
		{
			int x=pq.remove();
			x=x/2;
			pq.add(x);
		}
		long ans=0;
		while(!pq.isEmpty())
			ans+=pq.remove();
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