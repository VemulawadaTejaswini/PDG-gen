import java.util.*;

public class Main {

	static int N;
	static int M;
	static int Q;
	static int[][] a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		Q = sc.nextInt();
		a = new int[Q][4];
		for (int i = 0; i < Q; i++) {
			a[i][0] = sc.nextInt() - 1;
			a[i][1] = sc.nextInt() - 1;
			a[i][2] = sc.nextInt();
			a[i][3] = sc.nextInt();
		}
		sc.close();

		int[] b = new int[N];
		long ans = dfs(0, 1, b);
		System.out.println(ans);
	}

	public static long dfs(int idx, int curmax, int[] b) {
		long ret = 0l;
		if (idx == N) {
			for (int i = 0; i < Q; i++) {
				int x = a[i][0], y = a[i][1], c = a[i][2], d = a[i][3];
				if (b[y] - b[x] == c) {
					ret += d;
				}
			}
			return ret;
		} else {
			for (int k = curmax; k <= M; k++) {
				b[idx] = k;
				long t = dfs(idx + 1, Math.max(k, curmax), b);
				ret = Math.max(ret, t);
			}
		}
		return ret;
	}
}
