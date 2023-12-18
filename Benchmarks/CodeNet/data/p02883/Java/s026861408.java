import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Pair implements Comparable<Pair> {
		long a, f;

		Pair(long a, long f) {
			this.a = a;
			this.f = f;
		}

		long getCost() {
			return a * f;
		}

		@Override
		public int compareTo(Pair o) {
			if (this.getCost() != o.getCost()) {
				return -1 * Long.compare(this.getCost(), o.getCost());
			} else {
				return -1 * Long.compare(this.f, o.f);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		long K = Long.parseLong(tokens[1]);
		List<Long> A = new ArrayList<>();
		List<Long> F = new ArrayList<>();
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			A.add(Long.parseLong(tokens[i]));
		}
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			F.add(Long.parseLong(tokens[i]));
		}

		Collections.sort(A);
		Collections.sort(F);

		Queue<Pair> que = new PriorityQueue<>();
		for (int i = 0; i < N; ++i) {
			que.add(new Pair(A.get(i), F.get(N - 1 - i)));
		}

		while (K > 0) {
			Pair target = que.poll();
			if (target.getCost() == 0) {
				break;
			}
			long k = Math.min(K, (target.getCost() - que.peek().getCost()) / target.f + 1);
			target.a -= k;
			K -= k;
			que.add(target);
		}
		System.out.println(que.peek().getCost());
	}
}