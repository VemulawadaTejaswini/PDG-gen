import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws IOException
	{
		int n=nextInt();
		int m=nextInt();
		int p[]=new int[n+1];
		for(int i=1;i<=n;i++)
			p[i]=nextInt();
		UnionFind dsu=new UnionFind(n);
		for(int i=1;i<=m;i++)
		{
			int u=nextInt();
			int v=nextInt();
			dsu.union(u,v);
		}
		int ans=0;
		for(int i=1;i<=n;i++)
			if(dsu.find(i)==dsu.find(p[i]))
				ans++;
		out.println(ans);
	}
	class UnionFind
	{       
		int parent[],rank[],size[],num;
		UnionFind(int n) 
		{
			num=n;
			parent=new int[n+1];
			rank=new int[n+1];
			size=new int[n+1];
			for(int i=1;i<=n;i++)
			{
				parent[i]=i;
				size[i]=1;
				rank[i]=0;
			}
		}
		int find(int a){
			if(parent[a]==a)
				return a;
			parent[a]=find(parent[a]);
			return parent[a];
		}
		void union(int a,int b){
			a=find(a);
			b=find(b);
			if(a==b)
				return;
			num--;
			if(rank[a]>rank[b])
			{
				parent[b]=a;
				size[a]+=size[b];
			}
			else
			{
				if(rank[a]==rank[b])
					rank[b]++;
				parent[a]=b;
				size[b]+=size[a];
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