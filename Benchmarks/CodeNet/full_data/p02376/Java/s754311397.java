

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main 
{
	static long[][] res;
	static Scanner sc = new Scanner(System.in);
	static int vn;
	static int en;
	static int[] parent; //parent of each node in the path, for backtracking
	
	static boolean BFS() //find an augmenting path if existing
	{
//		System.out.println("BFS starts");
		boolean[] visited = new boolean[vn];
		
		int pos = 0;
		
		LinkedList<Integer> q = new LinkedList<Integer>();
		q.add(0);
		
		while(!q.isEmpty())
		{
			pos = q.pop();
			
			//reached sink?
			if(pos == vn-1)return true;
			
			for(int i = 0; i < vn; i++)
			{
				if(res[pos][i] > 0 && !visited[i])
				{
					visited[i] = true;
					parent[i] = pos;
					q.push(i);
				}
			}
		}
		
//		if(visited[vn-1])System.out.println("FATAL ERROR");
//		System.out.println("FALSE");
//		System.out.println(Arrays.toString(visited));
		
		return false;
	}
	
	public static void main(String[] args) 
	{
		int ans = 0;
		vn = sc.nextInt();
		en = sc.nextInt();

		res = new long[vn][vn];
		parent = new int[vn];
		
		for(int i = 0; i < en; i++)
		{
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int cap = sc.nextInt();
			
			res[v1][v2] = cap;
		}
		
		while(BFS() == true)
		{
			//update residuals on each edge in the path
			long minflow = 9999999999l;
			int backtrackpos = vn-1;
			
//			System.out.println(Arrays.toString(parent));
			while(backtrackpos != 0)
			{
				minflow = Math.min(minflow, res[parent[backtrackpos]][backtrackpos]);
				
				if(backtrackpos == 0)break;
				backtrackpos = parent[backtrackpos];
				
			}
			
			ans += minflow;
//			System.out.println("minflow " + minflow);
			//update flows
			backtrackpos = vn-1;
			while(backtrackpos != 0)
			{
				res[parent[backtrackpos]][backtrackpos] -= minflow;
				res[backtrackpos][parent[backtrackpos]] += minflow;
				
				backtrackpos = parent[backtrackpos];
			}
		}
		
		System.out.println(ans);
	}

}

