import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static class Edge {
		int v;
		long cost;
		public Edge(int v, long cost) {
			this.v = v;
			this.cost = cost;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<List<Edge>> list = new ArrayList<>(n);
		for(int i = 0; i < n; i++) list.add(new ArrayList<>());
		for(int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			long c = sc.nextLong();
			list.get(a).add(new Edge(b, c));
			list.get(b).add(new Edge(a, c));
		}
		Queue<Integer> queue = new LinkedList<>();
		long[] sum = new long[n];
		boolean[] used = new boolean[n];
		int q = sc.nextInt();
		int k = sc.nextInt() - 1;
		queue.add(k);
		while(!queue.isEmpty()) {
			int now = queue.poll();
			used[now] = true;
			for(Edge e : list.get(now)) {
				if(!used[e.v]) {
					sum[e.v] = sum[now] + e.cost;
					queue.add(e.v);
				}
			}
		}
		for(int i = 0; i < q; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			System.out.println(sum[x] + sum[y]);
		}
	}
}
