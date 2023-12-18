import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main 
{
	static class Node
	{
		int i;
		boolean vis = false;
		HashSet<Node> e = new HashSet<>();
		int depth = 0;
		
		public Node(int id)
		{
			i=id;
		}
	}

	static Node[] nd;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		nd = new Node[n];
		
		for(int i = 0; i < n; i++)
			nd[i] = new Node(i);

		for(int i = 0; i < n-1; i++)
		{
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			
			nd[a].e.add(nd[b]);
			nd[b].e.add(nd[a]);
		}
		long an = 1;
		long MOD = 1000000007;
		//0 serves as the root
		//cover the impossible case too
		
		LinkedList<Node> q = new LinkedList<Node>();
		q.add(nd[0]);
		nd[0].vis=true;
		
		an = k;
		
//		System.out.println("Starting an " + an);
		while(!q.isEmpty())
		{
			Node pos = q.poll();
			
			int children = 0;
			for(Node e : pos.e)
				if(!e.vis)
				{
					children++;
				}
			
			for(Node e : pos.e)
				if(!e.vis)
				{
					e.vis = true;
					e.depth = pos.depth+1;
					q.add(e);
				}
			
			if(children > 0)
			{
				int biggestsubt = children;
				if(pos.depth > 0)biggestsubt++;
				
				for(int i = 0; i < children; i++)
				{
					an = (an * (k-(biggestsubt-i)))%MOD;
				}
			}
		}
		an = an%MOD;
		System.out.println(an);
		
	}

}
