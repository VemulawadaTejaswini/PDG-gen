import java.io.*;
import java.util.*;
import java.util.function.*;

final class Sushi {
	int t;
	int d;

	Sushi(int t, int d) {
		this.t = t;
		this.d = d;
	}
}

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int K = Integer.parseInt(sc.get());
		Sushi[] sushis = new Sushi[N];
		for (int i = 0; i < N; i++) {
			int t = Integer.parseInt(sc.get()) - 1;
			int d = Integer.parseInt(sc.get());
			sushis[i] = new Sushi(t, d);
		}

		Arrays.sort(sushis, Comparator.comparingInt((Sushi s) -> s.d).reversed());

		long valuation;
		long delicious = 0;

		BitSet exist = new BitSet(N);
		PriorityQueue<Sushi> queue = new PriorityQueue<>(Comparator.comparingInt((Sushi s) -> s.d));
		for (int i = 0; i < K; i++) {
			Sushi sushi = sushis[i];
			int t = sushi.t;
			delicious += sushi.d;
			if (!exist.get(t)) {
				exist.set(t);
				continue;
			}
			queue.add(sushi);
		}
		valuation = exist.cardinality();

		BitSet st = new BitSet(N);
		PriorityQueue<Sushi> standing = new PriorityQueue<>(Comparator.comparingInt((Sushi s) -> s.d).reversed());
		for (int i = K; i < N; i++) {
			Sushi sushi = sushis[i];
			int t = sushi.t;
			if (exist.get(t) || st.get(t)) {
				continue;
			}
			st.set(t);
			standing.add(sushi);
		}

		long max = valuation * valuation + delicious;
		while (!standing.isEmpty()){
			valuation += 1;
			Sushi in = standing.remove();
			Sushi out = queue.remove();
			delicious -= out.d;
			delicious += in.d;

			max = Math.max(max, valuation * valuation + delicious);
		}

		System.out.println(max);
	}
}

class Main {
	public static void main(String... args) {
		System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<String>() {
			StringTokenizer line;

			public String get() {
				try {
					return (line = line != null && line.hasMoreTokens() ? line : new StringTokenizer(reader.readLine())).nextToken();
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
		});
		System.out.flush();
	}
}