import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main 
{
	static class Node
	{
		HashSet<Node> e = new HashSet<>();
		int i;
		int dis1 = -1;
		int dis2 = -1;
		
		public Node(int id)
		{
			i=id;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int start1 = sc.nextInt()-1;
		int start2 = sc.nextInt()-1;
		Node[] nd = new Node[n];
		
		for(int i = 0; i < n; i++)
		{
			nd[i] = new Node(i);
		}
		
		for(int i = 0; i < n-1; i++)
		{
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			nd[a].e.add(nd[b]);
			nd[b].e.add(nd[a]);
		}
		
		Node s1 = nd[start1];
		Node s2 = nd[start2];
		LinkedList<Node> q = new LinkedList<Node>();
		q.add(s1);
		s1.dis1 = 0;
		while(!q.isEmpty())
		{
			Node pos = q.pollFirst();
			for(Node e : pos.e)
			{
				if(e.dis1 == -1)
				{
					e.dis1 = pos.dis1+1;
					q.add(e);
				}
			}
		}
		
		q = new LinkedList<Node>();
		q.add(s2);
		s2.dis2 = 0;
		while(!q.isEmpty())
		{
			Node pos = q.pollFirst();
			for(Node e : pos.e)
			{
				if(e.dis2 == -1)
				{
					e.dis2 = pos.dis2+1;
					q.add(e);
				}
			}
		}
		
		int best = 0;
		for(Node x : nd)
		{
//			System.out.println("node " + x.i + " " + x.dis1 + " " + x.dis2);
			if(x.dis2 > x.dis1)
				best = Math.max(best, x.dis2-1);
		}
		System.out.println(best);
	}

}
