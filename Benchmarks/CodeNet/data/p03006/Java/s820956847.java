import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Pair {
		long x, y;

		@Override
		public int hashCode() {
			long value = x % 9999991 + y % 9999991;
			return Long.hashCode(value);
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
		Map<Pair, Integer> count = new HashMap<>();
		for (int i = 0; i + 1 < pairs.size(); ++i) {
			for (int j = i + 1; j < pairs.size(); ++j) {
				Pair p1 = pairs.get(i);
				Pair p2 = pairs.get(j);
				Pair src2dst = new Pair(p2.x - p1.x, p2.y - p1.y);
				Pair dst2src = new Pair(p1.x - p2.x, p1.y - p2.y);
				if (!count.containsKey(src2dst)) {
					count.put(src2dst, 1);
				} else {
					count.put(src2dst, count.get(src2dst) + 1);
				}
				if (!count.containsKey(dst2src)) {
					count.put(dst2src, 1);
				} else {
					count.put(dst2src, count.get(dst2src) + 1);
				}
			}
		}
		int max = Collections.max(count.values());
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