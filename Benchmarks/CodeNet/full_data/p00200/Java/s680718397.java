
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			n = scanner.nextInt();
			m = scanner.nextInt();
			if ((n | m) == 0)
				break;
			List<List<Pair>> cost = new ArrayList<List<Pair>>();
			List<List<Pair>> time = new ArrayList<List<Pair>>();
			for (int i = 0; i < m; i++) {
				cost.add(new ArrayList<Pair>());
				time.add(new ArrayList<Pair>());
			}
			for (int i = 0; i < n; i++) {
				int a = scanner.nextInt() - 1;
				int b = scanner.nextInt() - 1;
				int c = scanner.nextInt();
				int d = scanner.nextInt();
				cost.get(a).add(new Pair(b, c));
				cost.get(b).add(new Pair(a, c));
				time.get(a).add(new Pair(b, d));
				time.get(b).add(new Pair(a, d));
			}
			int s = scanner.nextInt();
			for (int i = 0; i < s; i++) {
				int a = scanner.nextInt() - 1;
				int b = scanner.nextInt() - 1;
				int c = scanner.nextInt();
				if (c == 0) {
					slove(a, b, cost);
				}else{
					slove(a, b, time);
				}
			}

		}

	}

	private void slove(int s, int g, List<List<Pair>> cost) {
		int[] map = new int[m];
		Arrays.fill(map, 1 << 24);
		map[0] = 0;
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
		pq.add(new Pair(0, s));
		while (!pq.isEmpty()) {
			Pair pair = pq.poll();
			int a = pair.a;
			int b = pair.b;
			if(map[b]<a)
				continue;
			for (int i = 0; i < cost.get(b).size(); i++) {
				int v = cost.get(b).get(i).b;
				int o = cost.get(b).get(i).a;
				if (map[o] > v + a) {
					map[o] = v + a;
					pq.offer(new Pair(v + a, o));
				}
			}
		}
		System.out.println(map[g]);

	}

	int n;
	int m;

	class Pair implements Comparable<Pair> {
		int a;
		int b;

		public Pair(int a, int b) {
			super();
			this.a = a;
			this.b = b;
		}

		@Override
		public int compareTo(Pair o) {
			return this.a - o.a;
		}

	}

}