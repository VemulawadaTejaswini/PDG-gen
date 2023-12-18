import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int N;
	static ArrayList<Integer>[] adj;
	static int[] val;
	static int[] min;
	static int[] max;
	static int[] parity;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		adj = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		for (int i = 1; i < N; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			adj[A].add(B);
			adj[B].add(A);
		}
		val = new int[N + 1];
		min = new int[N + 1];
		max = new int[N + 1];
		parity = new int[N + 1];
		int K = sc.nextInt();
		int V0 = 0;
		int P0 = 0;
		for (int i = 1; i <= K; i++) {
			int V = sc.nextInt();
			int P = sc.nextInt();
			val[V] = P;
			min[V] = P;
			max[V] = P;
			parity[V] = P % 2;
			if (i == 1) {
				V0 = V;
				P0 = P;
			}
		}

		sc.close();

		boolean ret = rec(V0, P0, P0, P0 % 2, new ArrayList<Integer>());
		StringBuffer buf = new StringBuffer();
		if (ret) {
			buf.append("Yes");
			buf.append("\n");
			for (int i = 1; i <= N; i++) {
				buf.append(Integer.toString(max[i]));
				buf.append("\n");
			}
		} else {
			buf.append("No");
		}

		System.out.println(buf.toString());
	}

	private static boolean rec(int cur, int r_min, int r_max, int par,
			ArrayList<Integer> step) {
		if (val[cur] != 0) {
			if (r_min > val[cur] || r_max < val[cur] || par != parity[cur]) {
				return false;
			}
			// back
			int tmp_min = val[cur];
			int tmp_max = val[cur];
			for (int i = step.size() - 1; i >= 0; i--) {
				tmp_min--;
				tmp_max++;
				boolean flg = false;
				if (tmp_min > min[step.get(i)]) {
					min[step.get(i)] = tmp_min;
					flg = true;
				}
				if (tmp_max < max[step.get(i)]) {
					max[step.get(i)] = tmp_max;
					flg = true;
				}
				if (flg == false) {
					break;
				}
			}
		} else {
			min[cur] = r_min;
			max[cur] = r_max;
			parity[cur] = par;
		}
		step.add(cur);
		for (Integer next : adj[cur]) {
			if (step.size() >= 2 && next == step.get(step.size() - 2)) {
				continue;
			}
			boolean res = rec(next, min[cur] - 1, max[cur] + 1, 1 - parity[cur],
					step);
			if (res == false) {
				step.remove(step.size() - 1);
				return false;
			}
		}
		step.remove(step.size() - 1);
		return true;
	}
}
