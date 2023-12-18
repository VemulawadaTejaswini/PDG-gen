import java.util.*;

public class Main {
	static final int INF = Integer.MAX_VALUE/2;
	static final int mod = (int)1e9+7;
	static int n, c[], cnt, ans[], score;
	static List<Integer>[] graph;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		graph = new ArrayList[n];
		for(int i=0;i<n;i++) graph[i] = new ArrayList<>();
		for(int i=0;i<n-1;i++) {
			int a = sc.nextInt()-1, b = sc.nextInt()-1;
			graph[a].add(b);
			graph[b].add(a);
		}
		c = new int[n];
		for(int i=0;i<n;i++)c[i] = sc.nextInt();
		sc.close();
		Arrays.sort(c);
		cnt = 0;
		ans = new int[n];
		dfs(0,-1);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			sb.append(ans[i] + " ");
		}
		score -= c[n-1];
		System.out.println(score);
		System.out.println(sb.toString());
	}
	
	static void dfs(int v, int p) {
		for(int to:graph[v]) {
			if(to==p)continue;
			dfs(to, v);
		}
		ans[v] = c[cnt++];
		score += ans[v];
	}	
}