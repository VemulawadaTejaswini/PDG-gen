import java.awt.Point;
import java.util.*;
public class Main {
	
	static List<Point>[] edge;
	static boolean[] used;
	static int[] d;
	
	static boolean dfs(int a, int b) {
		if(used[a])
			return d[a] == b;
		used[a] = true;
		d[a] = b;
		for(Point p : edge[a])
			if(!dfs(p.x, d[a] + p.y))
				return false;
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		edge = new ArrayList[N];
		for(int i = 0; i < N; i++)
		    edge[i] = new ArrayList<>();
		for(int i = 0; i < M; i++) {
			int L = sc.nextInt()-1;
			int R = sc.nextInt()-1;
			int D = sc.nextInt();
			edge[L].add(new Point(R, D));
			edge[R].add(new Point(L, -D));
		}
		boolean ok = true;
		used = new boolean[N];
		d = new int[N];
		for(int i = 0; i < N; i++)
			if(!used[i])
				if(!dfs(i, 0))
					ok = false;
		System.out.println(ok ? "Yes" : "No");
	}

}
