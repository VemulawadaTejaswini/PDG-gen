import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Pair {
		long x, y;

		@Override
		public int hashCode() {
			return Long.hashCode(x) + Long.hashCode(y * 10);
		}

		@Override
		public boolean equals(Object obj) {
			Pair pair = (Pair) obj;
			if (this.x == pair.x && this.y == pair.y) {
				return true;
			} else {
				return false;
			}
		}

		Pair(long x, long y) {
			this.x = x;
			this.y = y;
		}
	}

	int N;
	long[] x, y;
	int result;
	Comparator<Pair> xFirst, yFirst;

	Main(int N, long[] x, long[] y) {
		this.N = N;
		this.x = x;
		this.y = y;
		this.xFirst = new Comparator<Pair>() {
			@Override
			public int compare(Pair o1, Pair o2) {
				if (o1.x < o2.x) {
					return -1;
				} else if (o1.x > o2.x) {
					return 1;
				} else {
					if (o1.y < o2.y) {
						return -1;
					} else if (o1.y > o2.y) {
						return 1;
					} else {
						return 0;
					}
				}
			}
		};
		this.yFirst = new Comparator<Pair>() {
			@Override
			public int compare(Pair o1, Pair o2) {
				if (o1.y < o2.y) {
					return -1;
				} else if (o1.y > o2.y) {
					return 1;
				} else {
					if (o1.x < o2.x) {
						return -1;
					} else if (o1.x > o2.x) {
						return 1;
					} else {
						return 0;
					}
				}
			}
		};
		calc();
		System.out.println(result);
	}

	void calc() {
		if (N == 1) {
			result = 1;
			return;
		}
		List<Pair> pairs = this.getPairs();
		Collections.sort(pairs, xFirst);
		// count
		Map<Pair, Integer> count = new HashMap<>();
		for (int i = 0; i + 1 < pairs.size(); ++i) {
			Pair pair = new Pair(pairs.get(i + 1).x - pairs.get(i).x, pairs.get(i + 1).y - pairs.get(i).y);
			if (!count.containsKey(pair)) {
				count.put(pair, 1);
			} else {
				count.put(pair, count.get(pair) + 1);
			}
		}
		int max1 = Collections.max(count.values());

		Collections.sort(pairs, yFirst);
		count = new HashMap<>();
		for (int i = 0; i + 1 < pairs.size(); ++i) {
			Pair pair = new Pair(pairs.get(i + 1).x - pairs.get(i).x, pairs.get(i + 1).y - pairs.get(i).y);
			if (!count.containsKey(pair)) {
				count.put(pair, 1);
			} else {
				count.put(pair, count.get(pair) + 1);
			}
		}
		int max2 = Collections.max(count.values());
		int max = Math.max(max1, max2);
		result = N - max;
	}

	List<Pair> getPairs() {
		List<Pair> result = new ArrayList<>();
		for (int i = 0; i < N; ++i) {
			result.add(new Pair(x[i], y[i]));
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		long[] x = new long[N];
		long[] y = new long[N];
		for (int i = 0; i < N; ++i) {
			String[] tokens = in.readLine().split(" ");
			x[i] = Long.parseLong(tokens[0]);
			y[i] = Long.parseLong(tokens[1]);
		}
		in.close();
		Main ins = new Main(N, x, y);
	}

}