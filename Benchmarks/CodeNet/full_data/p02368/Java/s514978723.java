

import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class Main 
{
	static class Vertex
	{
		TreeSet<Integer> adjl = new TreeSet<Integer>();
	}
	
	static Scanner sc = new Scanner(System.in);
	static int vn;
	static int en;
	static Vertex[] vs;
	static boolean[] visited;
	static boolean[] backtracked;
	static TreeSet<Integer> unvisited = new TreeSet<Integer>();
	static boolean debug = false;
	
	//Disjoint Segments
	static int[] parent;
	
	static int root(int i)
	{
		if(parent[i] == i)
		{
			return i;
		}
		else
		{
			int ans = root(parent[i]);
			parent[i] = ans;
			return ans;
		}
	}
	
	static void union(int a, int b)
	{
		parent[root(b)] = root(a);
	}
	
	public static void main(String[] args) 
	{
		vn = sc.nextInt();
		en = sc.nextInt();
		
		vs = new Vertex[vn];
		visited = new boolean[vn];
		parent = new int[vn];
		backtracked = new boolean[vn];
		
		for(int i = 0; i < vn; i++)
		{
			vs[i] = new Vertex();
			unvisited.add(i);
			parent[i] = i;
		}
		
		for(int i = 0; i < en; i++)
		{
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			vs[v1].adjl.add(v2);
		}
		
		int time = 0;
		int[] low = new int[vn];
		int[] visitedtime = new int[vn];
		//
		Stack<Integer> queue = new Stack<Integer>();
		while(!unvisited.isEmpty()) 
		{
			queue.push(unvisited.pollFirst());
			//start from an unvisited vertex and start.
			
			Stack<Integer> stack = new Stack<Integer>();
//			System.out.println("New game!");
			while(!queue.isEmpty())
			{
				int pos = queue.peek();
				Vertex vpos = vs[pos];
				
				boolean backtracking = visited[pos];
				//step into this vertex.
				
				if(!backtracking)
				{
					time += 1;
					unvisited.remove(pos);
					visited[pos] = true;
					visitedtime[pos] = time;
					low[pos] = time;
					
					stack.push(pos);
					if(debug)System.out.println("visit " + pos + ", " + vpos.adjl.size() + " children, stack " + stack + ",               queue: " + queue);
					
					
					for(int child : vpos.adjl)
					{
						if(!visited[child])
						{
							//mark children to be visited by putting them to queue stack
//							System.out.println("Mark " + child);
//							queue.removeElement(child);
							queue.push(child);
						}
					}
				}
				else if(!backtracked[pos])
				{
					if(debug)System.out.println("Backtrack to " + pos + ", stack " + stack + ",                queue: " + queue);
					if(debug)if(pos != queue.peek())System.out.println("FATAL ERROR");
					queue.pop();
					
					for(int child : vpos.adjl)
					{
						//compare lows and stuff
						if(stack.contains(child))
						{
							low[pos] = Math.min(low[pos], low[child]);
						}
					}
					
					if(visitedtime[pos] == low[pos])
					{ //SCC found (pop stack until pos, all of them are in the same SCC)
						int a = stack.pop();
						
						while(a != pos)
						{
							union(pos, a);
							if(debug)System.out.println("union " + pos + " " + a);
							a = stack.pop();
						}
					}
					
					backtracked[pos] = true;
				}
				else
				{
					queue.pop();
				}
				
				//Because a vertex may get into the queue more than once, even though we only need to visit and backtrack exactly
				//once, we need to either make sure the vertex is only in the queue once (when adding vertex already in the queue
				//into the queue, delete the old entry of the vertex, essentially moving it to the top of the queue)
				//OR
				//keep track of whether we've already backtracked each vertex, preventing backtracking it twice,
				//similar to how we're keeping track of visited vertices, preventing iterating through children to add to queue twice.
			}
		}
		
//		System.out.println(Arrays.toString(low));
//		System.out.println(Arrays.toString(visitedtime));
		
		//
		int q = sc.nextInt();
		for(int i = 0; i < q; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(root(a) == root(b))
				System.out.println(1);
			else
				System.out.println(0);
		}
	}
	
}

