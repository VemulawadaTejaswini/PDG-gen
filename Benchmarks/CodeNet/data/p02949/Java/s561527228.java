import java.util.*;

@SuppressWarnings("unchecked")
public class Main {
	// public static void printArray(int[] a) {
	// 	for (int i = 0; i < a.length; i++) {
	// 		System.out.print(a[i] + ", ");
	// 	}
	// 	System.out.println();
	// }

	// public static<T> void printArrayT(T[] a) {
	// 	for (int i = 0; i < a.length; i++) {
	// 		System.out.print(a[i] + ", ");
	// 	}
	// 	System.out.println();
	// }

	public static String joinInt(int[] a, String separator) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			if (i > 0) {
				sb.append(separator);
			}
			sb.append(a[i]);
		}
		return sb.toString();		
	}

	// public static class Triple implements Comparable<Triple> {
	// 	public int A, B, C;
	// 	Triple(int A, int B, int C) {
	// 		this.A = A;
	// 		this.B = B;
	// 		this.C = C;
	// 	}

	// 	@Override
	// 	public String toString() {
	// 		return String.format("(%d, %d, %d)", A, B, C);
	// 	}

	// 	@Override
	// 	public int compareTo(Triple o) {
	// 		int a = this.A - o.A;
	// 		if (a != 0) return a;
	// 		int b = this.B - o.B;
	// 		if (b != 0) return b;
	// 		return this.C - o.C;
	// 	}
	// }

	static int[] nextIntArray(Scanner sc, int N) {
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int P = sc.nextInt();

		ArrayList<Integer>[] s2e = new ArrayList[M];
		ArrayList<Integer>[] e2s = new ArrayList[M];
		int[][] edge = new int[M][];
		for (int i = 0; i < M; i++) {
			int A = sc.nextInt() - 1;
			int B = sc.nextInt() - 1;
			int C = sc.nextInt() - P;

			add(s2e, A, B);
			add(e2s, B, A);
			edge[i] = new int[]{A, B, C};
		}
		boolean[] ok1 = new boolean[N];
		dfs(ok1, s2e, 0);
		boolean[] ok2 = new boolean[N];
		dfs(ok2, e2s, N-1);

		int[] sum = new int[N];
		for (int i = 1; i < N; i++) {
			sum[i] = - 5000 * 2500 * 2;
		}
		int cnt = 0;
		while (true) {
			cnt++;
			boolean updated = false;
			for (int i = 0; i < edge.length; i++) {
				int src = edge[i][0];
				int dst = edge[i][1];
				int coin = edge[i][2];
				if (sum[src] == Integer.MIN_VALUE) continue;

				if (ok1[src] && ok2[src] && ok1[dst] && ok2[dst]) {
					int next = sum[src] + coin;
					if (sum[dst] < next) {
						sum[dst] = next;
						updated = true;
					}
				}
			}
			if (!updated) {
				break;
			}
			if (cnt > N) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(Math.max(sum[N-1], 0));
	}

	static void add(ArrayList<Integer>[] target, int a, int b) {
		if (target[a] == null) {
			target[a] = new ArrayList<>();
		}
		target[a].add(b);
	}

	static void dfs(boolean[] nodes, ArrayList<Integer>[] edges, int pos) {
		if (nodes[pos]) return;
		nodes[pos] = true;
		if (edges[pos] != null){
			for (int next : edges[pos]) {
				dfs(nodes, edges, next);
			}
		}
	}
}
