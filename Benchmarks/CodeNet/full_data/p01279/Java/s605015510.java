import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int M = sc.nextInt();
			int[] xt = new int[N];
			int[] yt = new int[N];
			int[] vt = new int[N];
			int[] xb = new int[M];
			int[] yb = new int[M];
			for (int i = 0; i < N; ++i) {
				xt[i] = sc.nextInt();
				yt[i] = sc.nextInt();
				vt[i] = sc.nextInt();
			}
			for (int i = 0; i < M; ++i) {
				xb[i] = sc.nextInt();
				yb[i] = sc.nextInt();
			}
			double[][] time = new double[M][N];
			for (int i = 0; i < M; ++i) {
				for (int j = 0; j < N; ++j) {
					time[i][j] = Math.sqrt((xb[i] - xt[j]) * (xb[i] - xt[j]) + (yb[i] - yt[j]) * (yb[i] - yt[j])) / vt[j];
				}
			}
			double lo = 0;
			double hi = 15000;
			while (hi - lo > 1e-6) {
				double mid = (lo + hi) / 2;
				BiMatching bm = new BiMatching(M, N);
				for (int i = 0; i < M; ++i) {
					for (int j = 0; j < N; ++j) {
						if (time[i][j] <= mid) {
							bm.addEdge(i, j);
						}
					}
				}
				if (bm.matching() == M) {
					hi = mid;
				} else {
					lo = mid;
				}
			}
			System.out.printf("%.8f\n", hi);
		}
	}

	static class BiMatching {
		ArrayList<ArrayList<Integer>> left = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> right = new ArrayList<ArrayList<Integer>>();
		int[] l2r, r2l;

		BiMatching(int n, int m) {
			l2r = new int[n];
			r2l = new int[m];
			Arrays.fill(l2r, -1);
			Arrays.fill(r2l, -1);
			for (int i = 0; i < n; ++i) {
				left.add(new ArrayList<Integer>());
			}
			for (int i = 0; i < m; ++i) {
				right.add(new ArrayList<Integer>());
			}
		}

		void addEdge(int ln, int rn) {
			left.get(ln).add(rn);
			right.get(rn).add(ln);
		}

		int matching() {
			int res = 0;
			for (int i = 0; i < left.size(); ++i) {
				if (l2r[i] != -1) continue;
				boolean[] visited = new boolean[right.size()];
				for (int j = 0; j < left.get(i).size(); ++j) {
					if (dfs(left.get(i).get(j), visited)) {
						l2r[i] = left.get(i).get(j);
						r2l[left.get(i).get(j)] = i;
						++res;
						break;
					}
				}
			}
			return res;
		}

		boolean dfs(int rn, boolean[] visited) {
			int l = r2l[rn];
			if (l == -1) {
				return true;
			}
			visited[rn] = true;
			for (int i = 0; i < left.get(l).size(); ++i) {
				int r = left.get(l).get(i);
				if (visited[r]) continue;
				if (dfs(r, visited)) {
					r2l[r] = l;
					l2r[l] = r;
					return true;
				}
			}
			return false;
		}
	}

}