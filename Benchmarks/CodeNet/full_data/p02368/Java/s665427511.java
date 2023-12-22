
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main implements Runnable{
	@Override
	public void run(){
		new Main().solver();

	}
	// Template
	public static void main(String[] args) {
		new Thread(null, new scc(), "", 16 * 1024 * 1024).start(); 
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] e = new ArrayList[V];
		for (int i = 0; i < V; i++)
			e[i] = new ArrayList<>();
		for (int i = 0; i < E; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			e[s].add(t);
		}
		int Q = sc.nextInt();
		int[] scc = stronglyConnectedComponents(e);
		for (int i = 0; i < Q; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			if (scc[u]==scc[v]) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}

	}

	int[] dfsnum;
	int[] low;
	ArrayDeque<Integer> S = new ArrayDeque<>();
	ArrayList<Integer> T = new ArrayList<>();
	int N = 0;
	boolean[] used;
	int[] ret;

	int[] stronglyConnectedComponents(ArrayList<Integer> e[]) {
		int n = e.length;
		dfsnum = new int[n];
		low = new int[n];
		used = new boolean[n];
		ret = new int[n];

		for (int i = 0; i < n; i++) {
			if (used[i])
				continue;
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
			if (used[j])
				continue;
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
}