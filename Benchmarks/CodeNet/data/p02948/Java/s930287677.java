import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Pair implements Comparable<Pair> {
		int a, b;

		Pair(String[] tokens) {
			this.a = Integer.parseInt(tokens[0]);
			this.b = Integer.parseInt(tokens[1]);
		}

		@Override
		public int compareTo(Pair o) {
			// 報酬の降順
			int compB = Integer.compare(this.b, o.b);
			if (compB != 0) {
				return -1 * compB;
			}
			return -1 * Integer.compare(this.a, o.a);
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int M = Integer.parseInt(tokens[1]);
		List<Pair> pairs = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			pairs.add(new Pair(in.readLine().split(" ")));
		}
		Collections.sort(pairs, new Comparator<Pair>() {
			// 日数の昇順でソート
			@Override
			public int compare(Pair o1, Pair o2) {
				return Integer.compare(o1.a, o2.a);
			}
		});
		Deque<Pair> queue = new ArrayDeque<>(N);
		queue.addAll(pairs);
		long result = 0;
		Queue<Pair> pq = new PriorityQueue<>();
		for (int day = 1; day <= M; ++day) {
			// pq側に要素を移す
			while (!queue.isEmpty()) {
				if (queue.peekFirst().a <= day) {
					pq.add(queue.pollFirst());
				} else {
					break;
				}
			}
			// pqの先頭の要素を用いる
			Pair pair = pq.poll();
			if (pair != null) {
				result += (long) (pair.b);
			}
		}
		System.out.println(result);
	}
}
