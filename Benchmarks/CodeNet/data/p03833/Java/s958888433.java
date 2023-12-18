import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] A = new long[N];
		for (int i = 1; i < N; ++i) {
			A[i] = Integer.parseInt(sc.next());
		}
		int[][] B = new int[N][M];
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < M; ++j) {
				B[i][j] = Integer.parseInt(sc.next());
			}
		}
		long[][] sum = new long[N + 1][N + 1];
		for (int i = 0; i < M; ++i) {
			int[][] a = new int[N][];
			for (int j = 0; j < N; ++j) {
				a[j] = new int[] { j, B[j][i] };
			}
			Arrays.sort(a, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return Integer.compare(o1[1], o2[1]);
				}
			});
			boolean[] vis = new boolean[N];
			int[] mate = new int[N];
			for (int j = 0; j < N; ++j) {
				mate[j] = j;
			}
			for (int j = 0; j < N; ++j) {
				int idx = a[j][0];
				int l = idx, r = idx;
				if (idx > 0 && vis[idx - 1]) {
					l = mate[idx - 1];
				}
				if (idx + 1 < N && vis[idx + 1]) {
					r = mate[idx + 1];
				}
				sum[l][idx] += a[j][1];
				sum[idx + 1][r + 1] += a[j][1];
				sum[l][r + 1] -= a[j][1];
				sum[idx + 1][idx] -= a[j][1];
				vis[idx] = true;
				if (idx > 0 && idx + 1 < N && vis[idx - 1] && vis[idx + 1]) {
					mate[l] = r;
					mate[r] = l;
				} else if (idx > 0 && vis[idx - 1]) {
					mate[l] = idx;
					mate[idx] = l;
				} else if (idx + 1 < N && vis[idx + 1]) {
					mate[r] = idx;
					mate[idx] = r;
				}
			}
		}
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				if (j > 0)
					sum[i][j] += sum[i][j - 1];
			}
		}
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				if (j > 0)
					sum[j][i] += sum[j - 1][i];
			}
		}
		for (int i = 0; i < N; ++i) {
			if (i > 0)
				A[i] += A[i - 1];
		}
		long best = 0;
		for (int i = 0; i < N; ++i) {
			for (int j = i; j < N; ++j) {
				best = Math.max(best, sum[i][j] - (A[j] - A[i]));
			}
		}
		System.out.println(best);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
