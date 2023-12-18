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
		boolean census = false;
		int blacksize = 1;
		
		public Node(int id)
		{
			i=id;
		}
	}
	
	static int cen(Node n)
	{
//		System.out.println("census " + n.i);
		n.census = true;
		int score = 1;
		for(Node e : n.e)
		{
			if(!e.census)
			{
				e.census = true;
				score += cen(e);
			}
		}
		return score;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

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
		
		Node s1 = nd[0];
		Node s2 = nd[n-1];
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
		
		int path = nd[0].dis2;
		Node fb = null;
		for(int i = 0; i < n; i++)
		{ //find frontline black
			Node x = nd[i];
			if(x.dis1 + x.dis2 == path && x.dis1 == path/2)
			{
				fb = x;
				break;
			}
		}
		
		int blackscore = 1;
		fb.census = true;
//		System.out.println("frontline " + fb.i + ", dis " + fb.dis1 + " " + fb.dis2);
		for(Node e : fb.e)
		{
//			System.out.println(fb.i + " " + e.i);
			if(!(e.dis1 + e.dis2 == path && e.dis2 < fb.dis2))
			{
//				System.out.println("Open census " + e.i + ", dis " + e.dis1 + " " + e.dis2);
				blackscore += cen(e);
			}
		}

		int whitescore = n-blackscore;
//		System.out.println(blackscore + " " + whitescore);
		if(blackscore>whitescore)
			System.out.println("Fennec");
		else System.out.println("Snuke");
	}

}
