import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int M = Integer.parseInt(sc.get());
		int[] H = new int[N];
		Arrays.setAll(H, $ -> Integer.parseInt(sc.get()));

		var ROADS = new BitSet[N];
		for (int i = 0; i < M; i++) {
			int A = Integer.parseInt(sc.get()) - 1;
			int B = Integer.parseInt(sc.get()) - 1;
			var fromA = ROADS[A];
			if (fromA == null) fromA = ROADS[A] = new BitSet();
			var fromB = ROADS[B];
			if (fromB == null) fromB = ROADS[B] = new BitSet();
			fromA.set(B);
			fromB.set(A);
		}

		int count = 0;
		tower:
		for (int i = 0; i < N; i++) {
			var roads = ROADS[i];
			if (roads == null) {
				count += 1;
				continue;
			}
			var height = H[i];
			var iterator = roads.stream().iterator();
			while (iterator.hasNext()) {
				int next = iterator.nextInt();
				if (height <= H[next]) continue tower;
			}
			count += 1;
		}
		System.out.println(count);
	}
}

class Main {
	public static void main(String... args) {
		System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		var reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<>() {
			StringTokenizer line;

			public String get() {
				while (line == null || !line.hasMoreTokens()) try {
					line = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
				return line.nextToken();
			}
		});
		System.out.flush();
	}
}