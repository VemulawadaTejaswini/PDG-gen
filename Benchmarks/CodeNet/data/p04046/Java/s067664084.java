import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Pair{
	int x, y;
	
	public Pair(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}
public class Main {

	public static long count = 0;
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split("\\s+");
		
		int m = Integer.parseInt(s[0]);
		int n = Integer.parseInt(s[1]);
		int r = Integer.parseInt(s[2]);
		int c = Integer.parseInt(s[3]);
		
		boolean[][] visited = new boolean[m][n];
		for(int i=0;i<m;i++)
			Arrays.fill(visited[i], false);
		for(int i=m-1;i>m-1-r;i--)
		{
			for(int j=0;j<c;j++)
				visited[i][j] = true;
		}
		
//		for(int i=0;i<m;i++)
//		{
//			for(int j=0;j<n;j++)
//				System.out.print(visited[i][j]+" ");
//			System.out.println();
//		}
			
		Deque<Pair> queue = new ArrayDeque<>();
		queue.add(new Pair(0, 0));
		BFS(visited, queue, m, n);
		System.out.println(count);
	}

	public static void BFS(boolean[][] visited, Deque<Pair> queue, int m, int n)
	{
		while(!queue.isEmpty())
		{
			Pair p = queue.poll();
			
			if(p.x == m-1 && p.y == n-1)
				count++;
			visited[p.x][p.y] = true;
			
			if(isSafe(visited, m, n, p.x+1, p.y))
				queue.add(new Pair(p.x+1, p.y));
			
			if(isSafe(visited, m, n, p.x, p.y+1))
				queue.add(new Pair(p.x, p.y+1));
		}
	}
	
	public static boolean isSafe(boolean[][] visited, int m, int n, int i, int j)
	{
		if(i >= 0 && i < m && j >= 0 && j < n && !visited[i][j])
			return true;
		return false;
	}
}
