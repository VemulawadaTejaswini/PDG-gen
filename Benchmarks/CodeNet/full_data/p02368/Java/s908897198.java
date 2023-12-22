import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	@SuppressWarnings("unchecked")
	void run() {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
		ArrayList<Integer>[] g = new ArrayList[V];
		for (int i = 0; i < V; ++i) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < E; ++i) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			g[s].add(t);
		}
		int[] col = new int[V];
		int cols = stronglyConnectedComponents(g, col);
		int Q = sc.nextInt();
		for (int i = 0; i < Q; ++i) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			System.out.println(col[u] == col[v] ? 1 : 0);
		}
	}

	// void run() {
	// Scanner sc = new Scanner(System.in);
	// int n = sc.nextInt();
	// int m = sc.nextInt();
	// int[] r = new int[n];
	// for (int i = 0; i < n; ++i) {
	// r[i] = sc.nextInt();// if r[i] = 0 , the room is locked.
	// }
	// int[][] x = new int[m][];
	// for (int i = 0; i < m; ++i) {
	// int sz = sc.nextInt();
	// x[i] = new int[sz];
	// for (int j = 0; j < sz; ++j) {
	// x[i][j] = sc.nextInt();
	// --x[i][j];
	// }
	// }
	// solver(n, m, r, x);
	// }
	//
	// void solver(int n, int m, int[] r, int[][] x) {
	// ArrayList<Integer>[] lis = new ArrayList[n];
	// ArrayList<Integer>[] g = new ArrayList[2 * n];
	// for (int i = 0; i < n; ++i) {
	// lis[i] = new ArrayList<>();
	// }
	// for (int i = 0; i < 2 * n; ++i) {
	// g[i] = new ArrayList<>();
	// }
	// for (int i = 0; i < m; ++i) {
	// for (int v : x[i]) {
	// lis[v].add(i);
	// }
	// }
	// for (int i = 0; i < n; ++i) {
	// int p = lis[i].get(0);
	// int q = lis[i].get(1);
	// if (r[i] == 0) {
	// g[p].add(q + n);
	// g[p + n].add(q);
	// g[q].add(p + n);
	// g[q + n].add(p);
	// } else {
	// g[p].add(q);
	// g[q].add(p);
	// g[p + n].add(q + n);
	// g[q + n].add(p + n);
	// }
	// }
	//
	// }

	class State {
		int i;
		int parent;
		int j;

		public State(int i_, int parent_, int j_) {
			i = i_;
			parent = parent_;
			j = j_;
		}
	}

	int stronglyConnectedComponents(ArrayList<Integer>[] g, int[] col) {
		int n = g.length;
		int cols = 0;
		Arrays.fill(col, -1);
		int[] low = new int[n];
		int[] ord = new int[n];
		boolean[] mark = new boolean[n];
		Arrays.fill(low, -1);
		Arrays.fill(ord, -1);
		int order = 0;
		ArrayDeque<State> stk = new ArrayDeque<>();
		ArrayDeque<Integer> pnd = new ArrayDeque<>();
		for (int ii = 0; ii < n; ++ii) {
			if (ord[ii] == -1) {
				stk.add(new State(ii, -1, 0));
			}
			while (!stk.isEmpty()) {
				State s = stk.pollFirst();
				if (ord[s.i] == -1) {
					low[s.i] = (ord[s.i] = order++);
					pnd.addFirst(s.i);
				}
				if (s.j > 0 && s.parent != g[s.i].get(s.j - 1) && !mark[g[s.i].get(s.j - 1)]) {
					if (low[g[s.i].get(s.j - 1)] == -1) {
						throw new AssertionError();
					}
					low[s.i] = Math.min(low[s.i], low[g[s.i].get(s.j - 1)]);
				}
				if (s.j == g[s.i].size() && low[s.i] == ord[s.i]) {
					while (true) {
						int v = pnd.pollFirst();
						col[v] = cols;
						mark[v] = true;
						if (v == s.i) {
							break;
						}
					}
					++cols;
					continue;
				}
				if (s.j == g[s.i].size()) {
					continue;
				}
				int v = g[s.i].get(s.j);
				stk.addFirst(new State(s.i, s.parent, s.j + 1));
				if (ord[v] == -1) {
					stk.addFirst(new State(v, s.i, 0));
				} else if (!mark[v]) {
					low[s.i] = Math.min(low[s.i], low[v]);
				}
			}
		}
		return cols;
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}