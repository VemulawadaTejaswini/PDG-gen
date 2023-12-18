import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer>[] g = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			char[] s = sc.next().toCharArray();
			g[i] = new ArrayList<>();
			for(int j = 0; j < n; j++) {
				if(s[j] == '1') {
					g[i].add(j);
				}
			}
		}
		//check if bipartite
		int[] color = new int[n];
		color[0] = 1;
		LinkedList<Integer> q = new LinkedList<Integer>();
		q.add(0);
		while(!q.isEmpty()) {
			int u = q.pollFirst();
			for(int v: g[u]) {
				if(color[v] == 0) {
					color[v] = -color[u];
					q.add(v);
				}
				else if(color[v] == color[u]) {
					System.out.println(-1);
					return;
				}
			}
		}
		int max = 0;
		for(int u = 0; u < n; u++) {
			max = Integer.max(max, calc(u, g, n));
		}
		System.out.println(max+1);
	}
	static int calc(int v0, ArrayList<Integer>[] g, int n) {
		int[] dist = new int[n];
		Arrays.fill(dist, -1);
		dist[v0] = 0;
		LinkedList<Integer> q = new LinkedList<Integer>();
		q.add(v0);
		while(!q.isEmpty()) {
			int u = q.pollFirst();
			for(int v: g[u]) {
				if(dist[v] == -1) {
					dist[v] = dist[u]+1;
					q.add(v);
				}
			}
		}
		int max = 0;
		for(int u = 0; u < n; u++) {
			max = Integer.max(max, dist[u]);
		}
		return max;
	}

}
