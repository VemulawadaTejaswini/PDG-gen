import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int P = sc.nextInt();
		int[] A = new int[M];
		int[] B = new int[M];
		int[] C = new int[M];
		for (int i = 0; i < M; ++i) {
			A[i] = sc.nextInt() - 1;
			B[i] = sc.nextInt() - 1;
			C[i] = sc.nextInt() - P;
		}
		long[] cost = new long[N];
		Arrays.fill(cost, -Long.MAX_VALUE / 3);
		cost[0] = 0;
		long ans = 0;
		for (int t = 0; t < N; ++t) {
			for (int j = 0; j < M; ++j) {
				cost[B[j]] = Math.max(cost[B[j]], cost[A[j]] + C[j]);
				cost[B[j]] = Math.max(cost[B[j]], -Long.MAX_VALUE / 3);
			}
		}
		ans = cost[N - 1];
		for (int t = 0; t < N; ++t) {
			for (int j = 0; j < M; ++j) {
				cost[B[j]] = Math.max(cost[B[j]], cost[A[j]] + C[j]);
				cost[B[j]] = Math.max(cost[B[j]], -Long.MAX_VALUE / 3);
			}
		}
		if (ans < cost[N - 1]) {
			System.out.println(-1);
		} else {
			System.out.println(Math.max(0, ans));
		}
	}

	class Edge implements Comparable<Edge> {
		int src;
		int dst;
		int cost;

		public Edge(int src, int dst, int cost) {
			this.src = src;
			this.dst = dst;
			this.cost = cost;
		}

		@Override
		public int compareTo(Edge o) {
			return Integer.compare(cost, o.cost);
		}
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
