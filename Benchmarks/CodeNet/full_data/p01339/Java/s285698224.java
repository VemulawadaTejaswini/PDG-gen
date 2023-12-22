import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solver();
	}

	final long MOD = 1_000_000_000 + 7;

	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	void solver() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// the number of fingers
		int m = sc.nextInt();// the number of rules
		ArrayList<Integer>[] e = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			e[i] = new ArrayList<>();
		}
		for (int i = 0; i < m; i++) {
			int v = sc.nextInt() - 1;
			int u = sc.nextInt() - 1;
			e[v].add(u);
		}
		int[] scc = stronglyConnectedComponets(e);
		ArrayList<Integer>[] dag = new ArrayList[NOW];
		for (int i = 0; i < NOW; i++) {
			dag[i] = new ArrayList();
		}
		for (int v = 0; v < n; v++) {
			for (int u : e[v]) {
				if (scc[v] != scc[u]) {
					if (!dag[scc[v]].contains(scc[u])) {
						dag[scc[v]].add(scc[u]);
					}
				}
			}
		}
		ArrayDeque<Integer> tsort = topological_sort(dag);
		ArrayList<Integer>[] dag_rev = reverseGraph(dag);
		long[] dp = new long[dag.length];

		f = new boolean[dag.length];
		Arrays.fill(f, false);
		long ans = 1;
		for (int i = 0; i < dag.length; i++) {
			int d = ord.pollLast();
			if (!f[d]) {
				ans = (ans * dfs_dp(dag_rev, d, -1)) % MOD;
			}
		}
		System.out.println(ans);

	}

	boolean[] f;

	long dfs_dp(ArrayList<Integer>[] e, int v, int p) {
		long ans = 1;
		for (int u : e[v]) {
			if (u != p) {
				ans *= dfs_dp(e, u, v);
				ans%=MOD;
			}
		}
		f[v] = true;
		return ans + 1;
	}

	int[] dfsnum;
	int[] low;
	ArrayDeque<Integer> S = new ArrayDeque<>();
	ArrayList<Integer> T = new ArrayList<>();
	int N = 0;
	boolean[] used;
	int[] ret;

	int[] stronglyConnectedComponets(ArrayList<Integer> e[]) {
		int n = e.length;
		dfsnum = new int[n];
		low = new int[n];
		used = new boolean[n];
		ret = new int[n];

		for (int i = 0; i < n; i++) {
			if (used[i]) {
				continue;
			}
			if (dfsnum[i] == 0) {
				dfs(e, i);
			}
		}
		return ret;
	}

	int NOW = 0;

	void dfs(ArrayList<Integer>[] e, int i) {
		S.addFirst(i);
		dfsnum[i] = N;
		N++;
		low[i] = dfsnum[i];
		for (int j : e[i]) {
			if (used[j]) {
				continue;
			}
			if (!T.contains(j)) {
				T.add(j);
				dfs(e, j);
				low[i] = Math.min(low[i], low[j]);
			} else {
				low[i] = Math.min(dfsnum[j], low[i]);
			}
		}
		if (low[i] == dfsnum[i]) {
			int v;
			do {
				v = S.removeFirst();
				ret[v] = NOW;
				used[v] = true;
			} while (v != i);
			NOW++;
		}
		return;
	}

	ArrayDeque<Integer> ord = new ArrayDeque<>();
	boolean[] visit;

	ArrayDeque<Integer> topological_sort(ArrayList<Integer>[] e) {
		visit = new boolean[e.length];
		for (int i = 0; i < e.length; i++) {
			if (!visit[i]) {
				dfs2(e, i);
			}
		}
		return ord;
	}

	void dfs2(ArrayList<Integer>[] e, int i) {
		visit[i] = true;
		for (int j : e[i]) {
			if (!visit[j]) {
				dfs(e, j);
			}
		}
		ord.addFirst(i);
	}

	ArrayList<Integer>[] reverseGraph(ArrayList<Integer>[] e) {
		int n = e.length;
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] rev_e = new ArrayList[n];
		for(int i=0;i<n;i++){
			rev_e[i]=new ArrayList<>();
		}
		for (int src = 0; src < n; src++) {
			for (int dst : e[src]) {
				rev_e[dst].add(src);
			}
		}
		return rev_e;
	}
}