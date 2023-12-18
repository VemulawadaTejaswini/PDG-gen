import java.io.*;
import java.util.*;
public class Main
{
	int n,k,ans;
	ArrayList<Integer> list[];	
	private void solve()throws IOException
	{
		n=nextInt();
		k=nextInt();
		list=new ArrayList[n+1];
		for(int i=1;i<=n;i++)
			list[i]=new ArrayList<>();
		ans=0;
		for(int i=1;i<=n;i++)
		{
			int a=nextInt();
			if(i==1)
			{
				if(a!=1)
					ans++;
			}
			else
				list[a].add(i);
		}
		dfs(1,0);
		out.println(ans);
	}
	void dfs(int v,int dist)
	{
		if(dist>k)
		{
			ans++;
			dist=1;
		}
		for(int vv:list[v])
			dfs(vv,dist+1);
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