import java.util.*;
public class Main {

	static int N,M;
	static int[] a, b;
	static boolean[] visited;
	
	public static int dfs(int x, boolean[] visited) {
		boolean ok = true;
		for(int i = 1; i <= N; i++)
			if(!visited[i])
				ok = false;
		if(ok)
			return 1;
		int ans = 0;
		visited[x] = true;
		for(int i = 0; i < M; i++) {
			if(a[i] == x) {
				if(visited[b[i]])
					continue;
				visited[b[i]] = true;
				ans += dfs(b[i], visited);
				visited[b[i]] = false;
			}
			if(b[i] == x) {
				if(visited[a[i]])
					continue;
				visited[a[i]] = true;
				ans += dfs(a[i], visited);
				visited[a[i]] = false;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		a = new int[M];
		b = new int[M];
		visited = new boolean[N+1];
		for(int i = 0; i < M; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		System.out.println(dfs(1,visited));
	}

}