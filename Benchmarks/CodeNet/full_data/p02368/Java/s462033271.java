

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solver();
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
		ArrayList<ArrayList<Integer>> scc = stronglyConnectedComponents(e);
		DJSet ds = new DJSet(V);
		for (int i = 0; i < scc.size(); i++) {
			for (int j = 1; j < scc.get(i).size(); j++) {
				ds.setUnion(scc.get(i).get(0), scc.get(i).get(j));
			}
		}
		for (int i = 0; i < Q; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			if (ds.equiv(u, v)) {
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
	ArrayList<ArrayList<Integer>> scc = new ArrayList<>();

	ArrayList<ArrayList<Integer>> stronglyConnectedComponents(ArrayList<Integer> e[]) {
		int n = e.length;
		dfsnum = new int[n];
		low = new int[n];
		used = new boolean[n];

		for (int i = 0; i < n; i++) {
			if (used[i])
				continue;
			if (dfsnum[i] == 0) {
				dfs(e, i);
			}
		}
		return scc;
	}


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

		ArrayList<Integer> ret = new ArrayList<>();
		if (low[i] == dfsnum[i]) {
			int v;
			do {
				v = S.removeFirst();
				ret.add(v);
				used[v] = true;
			} while (v != i);
			scc.add(ret);
		}
		return;
	}

	class DJSet {
		int n;// the number of vertices
		int[] d;

		DJSet(int n) {
			this.n = n;
			d = new int[n];
			Arrays.fill(d, -1);
		}

		int root(int x) {
			return d[x] < 0 ? x : root(d[x]);
		}

		boolean setUnion(int x, int y) {
			x = root(x);
			y = root(y);
			if (x != y) {
				if (x < y) {
					int d = x;
					x = y;
					y = d;
				}
				// x>y
				d[y] += d[x];
				d[x] = y;
			}
			return x != y;
		}

		boolean equiv(int x, int y) {
			return root(x) == root(y);
		}

		// x???????????¨???Node?????°
		int size(int x) {
			return d[root(x)] * (-1);
		}

		// ??£?????°???????????°
		int count() {
			int ct = 0;
			for (int u : d) {
				if (u < 0)
					ct++;
			}
			return ct;
		}
	}
}