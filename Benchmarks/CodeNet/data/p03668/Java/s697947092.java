import java.io.*;
import java.util.*;
public class Main
{
	int n;
	ArrayList<Integer> list[];
	private void solve()throws IOException
	{
		n=nextInt();
		list=new ArrayList[n+1];
		for(int i=1;i<=n;i++)
			list[i]=new ArrayList<>();
		for(int i=1;i<n;i++)
		{
			int u=nextInt();
			int v=nextInt();
			list[u].add(v);
			list[v].add(u);
		}
		out.println(dfs(1,-1)==0?"Bob":"Alice");
	}
	int dfs(int v,int p)
	{
		int ret=0;
		for(int vv:list[v])
			if(vv!=p)
				ret^=dfs(vv,v)+1;
		return ret;
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