import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	static Stack<Integer> st;

	static void topologicalSort(ArrayList<Integer> graph[], int n)
	{
		int visited[]=new int[n];
		for(int i=0;i<n;i++)
		{
			dfs(graph, i, visited);
		}
	}

	static void dfs(ArrayList<Integer> graph[], int i, int visited[])
	{
		if(visited[i]==1)
			return;
		visited[i]=1;

		for(int child: graph[i])
			dfs(graph, child, visited);

		st.add(i);
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();

		ArrayList<Integer> graph[]=new ArrayList[n];
		for(int i=0;i<n;i++)
			graph[i]=new ArrayList<>();

		for(int i=0;i<m;i++)
		{
			graph[scan.nextInt()-1].add(scan.nextInt()-1);
		}

		st=new Stack<>();
		topologicalSort(graph, n);

		int str = st.peek();

		Queue<Integer> q=new LinkedList<>();
		q.add(str);
		int visited[]=new int[n];
		int dist[]=new int[n];
		visited[str]=1;
		int maxAns=0;

		while(!q.isEmpty())
		{
			int top=q.remove();
			for(int child: graph[top])
			{
				if(visited[child]==0)
				{
					dist[child]=Math.max(dist[child], 1+dist[top]);
					q.add(child);
					maxAns=Math.max(maxAns, dist[child]);
				}
			}
		}
		System.out.println(maxAns);

	}
}