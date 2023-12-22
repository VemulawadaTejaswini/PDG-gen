import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static ArrayList<Integer>[] g;
	static int N;
	static int[] B;
	static int[] C;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			N = sc.nextInt();
			if (N == 0)
				break;
			String[] A = new String[N];
			B = new int[N];
			C = new int[N];
			String[][] D = new String[N][];
			HashMap<String, Integer> id = new HashMap<>();
			for (int i = 0; i < N; ++i) {
				A[i] = sc.next();
				B[i] = sc.nextInt();
				C[i] = sc.nextInt();
				D[i] = new String[C[i]];
				for (int j = 0; j < C[i]; ++j) {
					D[i][j] = sc.next();
				}
				id.put(A[i], i);
			}

			g = new ArrayList[N];
			for (int i = 0; i < N; ++i)
				g[i] = new ArrayList<>();

			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < C[i]; ++j) {
					int dst = id.get(D[i][j]);
					g[i].add(dst);
					g[dst].add(i);
				}
			}
			long ans = 0;

			ans = Math.max(ans, dfs(1, 1) + B[0]);

			System.out.println(ans);
		}
	}

	static long dfs(long used, int cur) {
		if (cur >= N)
			return 0;
		long res = 0;
		boolean unadj = true;
		boolean unrestriected = true;
		for (int dst : g[cur]) {
			if (!(dst < cur && ((used >> dst) & 1) == 0)) {
				unadj = false;
			}
			if (((used >> dst) & 1) == 1) {
				unrestriected = false;
			}
		}
		if (!unrestriected && unadj)
			throw new AssertionError();
		if (unrestriected) {
			res = Math.max(res, res + dfs(used | (1L << cur), cur + 1) + B[cur]);
		}
		if (!unadj)
			res = Math.max(res, dfs(used, cur + 1));
		return res;
	}
}