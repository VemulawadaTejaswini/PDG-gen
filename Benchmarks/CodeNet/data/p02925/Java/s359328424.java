import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] A = new int[N][N - 1];
		V[][] vs = new V[N][N];
		int[][] d = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - 1; j++) {
				A[i][j] = sc.nextInt() - 1;
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				vs[i][j] = vs[j][i] = new V(i, j);
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - 2; j++) {
				vs[i][A[i][j]].add(vs[i][A[i][j+1]]);
				d[i][A[i][j+1]]++;
				d[A[i][j+1]][i]++;
			}
		}
		Queue<V> que = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (d[i][j] == 0) {
					que.offer(vs[i][j]);
					vs[i][j].depth = 1;
				}
			}
		}
		int cnt = 0;
		while (!que.isEmpty()) {
			V v = que.poll();
			cnt++;
			for (V w: v) {
				d[w.p][w.q]--;
				w.depth = Math.max(w.depth, v.depth + 1);
				if (d[w.p][w.q] == 0) {
					que.offer(w);
				}
			}
		}
		if (cnt != N * (N - 1) / 2) {
			System.out.println(-1);
			return;
		}
		int diam = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				diam = Math.max(diam, vs[i][j].depth);
			}
		}
		System.out.println(diam);
	}
	static class V extends ArrayList<V>
	{
		int p, q;
		int depth = 0;
		V(int _p, int _q) {p = _p; q = _q;}
	}
}