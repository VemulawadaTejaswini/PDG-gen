
import java.util.*;

public class Main {
	static ArrayList[] graph;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=Integer.parseInt(s.next());
		int edges=Integer.parseInt(s.next());
		graph=new ArrayList[size];
		for(int i=0;i<size;i++)
			graph[i]=new ArrayList<Integer>();
		int[] indegree=new int[size];
		for(int i=0;i<edges;i++)
		{
			int source=s.nextInt();
			int dest=s.nextInt();
			graph[source-1].add(dest-1);
			indegree[dest-1]++;
			
		}
		Queue<Integer> Q=new LinkedList<>();
		for(int i=0;i<indegree.length;i++)
			if(indegree[i]==0)
				Q.add(i);
		int[] dist=new int[size];
		while(!Q.isEmpty())
			DFS(Q.poll(),dist,indegree);
		int ans=0;
		for(int d:dist)
			ans=Math.max(ans, d);
		System.out.println(ans);
		s.close();
	}
	static void DFS(int v,int[] dist,int[] indegree)
	{
		for (Integer e : (ArrayList<Integer>) graph[v]) {
			dist[e]=Math.max(dist[e], dist[v]+1);
			indegree[e]--;
			if (indegree[e] == 0)
				DFS(e,dist,indegree);
		}
	}
}
