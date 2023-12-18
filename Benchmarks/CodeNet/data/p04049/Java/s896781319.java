import java.io.*;
import java.util.*;
public class Main
{
	int n,k;
	ArrayList<Integer> list[];
	final int inf=(int)(1e9+1);
	private void solve()throws IOException
	{
		n=nextInt();
		k=nextInt();
		list=new ArrayList[n+1];
		for(int i=0;i<=n;i++)
			list[i]=new ArrayList<>();
		for(int i=1;i<n;i++)
		{
			int u=nextInt();
			int v=nextInt();
			list[u].add(v);
			list[v].add(u);
		}
		int ans=inf;
		if(k%2==0)
		{
			for(int i=1;i<=n;i++)
				ans=Math.min(ans,count(i,0));
		}
		else
		{
			for(int i=1;i<=n;i++)
				for(int j:list[i])
					ans=Math.min(ans,count(i,j));
		}
		out.println(ans);
	}
	int count(int x,int y)
	{
		Queue<Integer> queue=new LinkedList<>();
		queue.add(x);
		queue.add(y);
		int dist[]=new int[n+1];
		Arrays.fill(dist,inf);
		dist[x]=0;
		dist[y]=0;
		while(!queue.isEmpty())
		{
			int v=queue.remove();
			for(int vv:list[v])
				if(dist[vv]>dist[v]+1)
				{
					dist[vv]=dist[v]+1;
					queue.add(vv);
				}
		}
		int c=0;
		for(int i=1;i<=n;i++)
			if(dist[i]>k/2)
				c++;
		return c;
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