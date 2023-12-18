import java.util.HashSet;
import java.util.Scanner;

public class Main 
{
	static class Edge
	{
		Node n;
		boolean odddis = false;
		
		public Edge(Node n, boolean odd)
		{
			odddis = odd;
			this.n = n;
		}
	}
	
	static class Node
	{
		int id;
		HashSet<Edge> e = new HashSet<>();
		
		public Node(int i)
		{
			id=i;
		}
	}
	
	static void trav(int pos, boolean odd)
	{
		oddnode[pos] = odd;
		Node n = nd[pos];
		vis[pos]=true;
		
		for(Edge e : n.e)
		{
			if(!vis[e.n.id])
			{
				trav(e.n.id, odd^e.odddis);
			}
		}
	}
	
	static boolean[] vis;
	static boolean[] oddnode;
	
	static Node[] nd;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		nd = new Node[n];
		vis = new boolean[n];
		oddnode = new boolean[n];
		for(int i =0; i<n;i++)
			nd[i] = new Node(i);
		
		for(int i = 0; i < n-1; i++)
		{
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			long w = sc.nextLong();
			nd[a].e.add(new Edge(nd[b], w%2==1));
			nd[b].e.add(new Edge(nd[a], w%2==1));
		}
		
		trav(0,false);
		
		for(int i = 0; i < n; i++)
		{
			if(oddnode[i])System.out.println(1);
			else System.out.println(0);
		}
	}

}
