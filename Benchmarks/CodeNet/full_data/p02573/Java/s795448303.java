import java.util.*;

class Graph
{
	int v;
	Set<Integer> adj[];
	int count = 0;

	Graph(int n)
	{
		v = n;

		adj = new HashSet[n];

		for(int i = 0 ; i < n ; i++)
			adj[i] = new HashSet<Integer>(); 
	}
	void addEdge(int u,int v)
	{
		adj[u].add(v);
		adj[v].add(u);
	}
	int conn()
	{
		int res = -1;
		boolean visited[] = new boolean[v];
		for(int i = 0; i < v ; i++)
		{
			if(!visited[i])
			{
				dfs(i,visited);
				if(count > res)
					res = count;
				count = 0;
			}
		}
		return res;

	}
	void dfs(int cur,boolean visited[])
	{
		visited[cur] = true;
		count++;

		for(int k : adj[cur])
		{
			if(!visited[k])
				dfs(k,visited);
		}
	}

}
public class Main
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();

		Graph G = new Graph(n);

		int m = kb.nextInt();

		while(m-- > 0)
		{
			int a = kb.nextInt();
			int b = kb.nextInt();

			G.addEdge(a-1,b-1);
		}
		System.out.println(G.conn());

	}
}