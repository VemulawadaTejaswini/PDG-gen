import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Main 
{
	static class Node
	{
		int i;
		HashSet<Node> e = new HashSet<>();
		boolean vis = false;
		boolean bt = false;
		
		public Node(int id)
		{
			i=id;
		}
		
		public String toString()
		{
			return Integer.toString(i);
		}
	}

	static Node[] nd;
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		nd = new Node[n];
		boolean[] rootcan = new boolean[n];
		
		for(int i = 0; i < n; i++)
		{
			nd[i] = new Node(i);
		}

		for(int i = 0; i < n-1+m; i++)
		{
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			nd[a].e.add(nd[b]);
			rootcan[b] = true;
		}
		
		int root = -1;
		for(int i = 0; i < n && root==-1; i++)
			if(!rootcan[i])
				root = i;
		
		Stack<Node> q = new Stack<>();
		Stack<Node> st = new Stack<>();
		
		q.add(nd[root]);
		
		while(!q.isEmpty())
		{
			Node pos = q.peek();
			
			if(!pos.vis)
			{
//				System.out.println("go " + pos.i);
				pos.vis = true;
				
				for(Node e : pos.e)
				{
					if(!e.vis)
					{
						q.add(e);
					}
				}
			}
			else if(!pos.bt)
			{ //backtrack
				pos.bt = true;
				st.add(pos);
//				System.out.println("bt " + pos);
				q.pop();
			}
			else q.pop();
		}
		
//		System.out.println(st);
		int[] a = new int[n];
		for(int i = 0; i < n-1; i++)
		{
//			System.out.println("peek " + st.peek());
//			System.out.println("peek " + Integer.toString((int)(st.peek().i)+1));
			Node pos = st.pop();
			for(Node e : pos.e)
			{
				a[e.i] = pos.i+1;
			}
		}
		
		for(int i = 0; i < n; i++)
			System.out.println(a[i]);
//		System.out.println(Arrays.toString(a));

	}

}
