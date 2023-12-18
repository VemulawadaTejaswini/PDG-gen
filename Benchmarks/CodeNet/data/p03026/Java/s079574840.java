import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Main 
{
	static class C implements Comparator<Node>
	{

		@Override
		public int compare(Node o1, Node o2) 
		{
			return o1.e.size() - o2.e.size();
		}
		
	}
	
	static class Node
	{
		int i;
		boolean visited = false;
		HashSet<Node> e = new HashSet<Node>();
		int fil;
		public Node(int i0)
		{
			i = i0;
		}
	}

	static Node[] nd;
	static int[] d;
	static int cur;
	static int[] a;
	static int scr = 0;
	
	static void go(Node n, int prev)
	{
		d[n.i] = a[cur];
		n.fil = a[cur];
		scr += Math.min(prev, n.fil);
		cur--;
		n.visited = true;
		for(Node e : n.e)
		{
			if(!e.visited)
			{
				go(e, n.fil);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		nd = new Node[n];
		
		for(int i = 0; i < n; i++)
			nd[i]=new Node(i);
		
		for(int i = 0; i < n-1; i++)
		{
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			nd[a].e.add(nd[b]);
			nd[b].e.add(nd[a]);
		}
		
		C c = new C();
		Arrays.sort(nd,c);
		
		a = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
			sum += a[i];
		}
		
		d = new int[n];
		Arrays.sort(a);
		cur = n-1;
		go(nd[0], 0);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++)
		{
			if(i>0)sb.append(" ");
			sb.append(d[i]);
		}
		System.out.println(scr);
//		System.out.println("xx " + (sum - a[n-1]));
		System.out.println(sb);
			
	}

}
