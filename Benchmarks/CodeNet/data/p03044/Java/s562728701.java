import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	Set<Integer> set;

	void doIt() {
		int n = sc.nextInt();
		ArrayList<Edge> e[] = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			e[i] = new ArrayList<>();
		}
		for(int i = 1; i < n; i++) {
			int v = sc.nextInt() -1;
			int u = sc.nextInt() -1;
			int w = sc.nextInt();
			e[v].add(new Edge(u, w));
			e[u].add(new Edge(v, w));
		}
		int col[] = new int[n];
		Arrays.fill(col, -1);
		col[0] = 0;
		search(0, e, n, col);
		for(int i = 0; i < n; i++) {
			System.out.println(col[i]);
		}
	}

	void search(int idx, ArrayList<Edge>[] e, int n ,int col[]) {
		for(Edge i : e[idx]) {
			if(col[i.t] >= 0) continue;
			if(i.w % 2 == 0) {
				col[i.t] = col[idx];
				search(i.t, e, n, col);
			}
			else {
				col[i.t] = col[idx] ^ 1;
				search(i.t, e, n, col);
			}

		}
	}
	
	class Edge{
		int t, w;
		Edge(int to, int weight){
			t = to; w = weight;
		}
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
