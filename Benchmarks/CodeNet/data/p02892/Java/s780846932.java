import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main 
{
	static class Node
	{
		int i;
		int mark = -999;
		int run = -999;
		HashSet<Node> e = new HashSet<Node>();
		
		public Node(int id)
		{
			i = id;
		}
	}
	
	static int best = -1;
	static int run;
	static int cur = 0;
	static boolean quit = false;


	static Node[] nd;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		nd = new Node[n];
		
		for(int i = 0; i<n;i++)
		{
			nd[i]=new Node(i);
		}
		for(int i = 0; i < n; i++)
		{
			String s = sc.next();
			for(int j = 0; j < n; j++)
			{
				if(s.charAt(j) == '1')
					nd[i].e.add(nd[j]);
			}
		}
		
		for(run = 0; run < n; run++)
		{
			quit = false;
//			System.out.println("run " + run);
			
			int pos = run;
			
			LinkedList<Node> q = new LinkedList<>();
			
			q.add(nd[run]);
			nd[run].mark = 1;
			cur = 1;
			nd[run].run = run;
			
			while(!q.isEmpty())
			{
				Node x = q.pollFirst();
//				System.out.println("do " + x.i);
				
				int minad = 99999999;
				int maxad = -99999999;
				int a = 0;
				int b = 0;
				x.run = run;
				for(Node e : x.e)
				{
					if(e.run != run)
					{
						q.add(e);
					}
					else
					{
//						System.out.println("adj with " + e.i);
						minad = Math.min(minad, e.mark);
						maxad = Math.max(maxad, e.mark);
					}
				}
				
				if(minad == maxad || maxad - minad == 2 || minad == 99999999)
				{
					if(minad==99999999)minad=0;
					x.mark = minad+1;
					cur=Math.max(cur, x.mark);
				}
				else
				{
//					System.out.println("quit " + x.i + " " + minad + " " + maxad);
					quit = true;
					break;
				}
			}
			
			if(!quit)best = Math.max(best, cur);
		}
		
		System.out.println(best);
	}

}
