import java.io.*;
import java.util.*;
public class Main
{
	final int maxn=(int)(1e6+1);
	private void solve()throws IOException
	{
		int n=nextInt();
		int a[]=new int[n+1];
		ArrayList<Integer> pos[]=new ArrayList[maxn+1];
		for(int i=0;i<=maxn;i++)
			pos[i]=new ArrayList<>();
		int xor=0;
		for(int i=1;i<=n;i++)
		{
			a[i]=nextInt();
			pos[a[i]].add(i);
			xor=xor^a[i];
		}
		pos[xor].add(0);
		int b[]=new int[n+1];
		boolean flag=true;
		int dest[]=new int[n+1];
		for(int i=1;i<=n;i++)
		{
			b[i]=nextInt();

			if(pos[b[i]].size()==0)
				flag=false;
			else
			{
				int x=pos[b[i]].remove(pos[b[i]].size()-1);
				dest[x]=i;
			}
		}
		if(!flag)
			out.println(-1);
		else
		{
			int ans=0;
			boolean visited[]=new boolean[n+1];
			if(dest[0]!=0)
				ans+=find(0,visited,dest)-1;
			for(int i=1;i<=n;i++)
				if(!visited[i] && dest[i]!=i)
					ans+=find(i,visited,dest)+1;
			out.println(ans);
		}
	}
	int find(int v,boolean visited[],int dest[])
	{
		if(visited[v])
			return 0;
		visited[v]=true;
		return 1+find(dest[v],visited,dest);
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