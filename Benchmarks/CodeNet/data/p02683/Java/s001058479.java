import java.io.*;
import java.util.*;
import java.util.function.*;

class Book {
	int cost;
	int[] a;

	Book(int cost, int[] a) {
		this.cost = cost;
		this.a = a;
	}
}

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int M = Integer.parseInt(sc.get());
		int X = Integer.parseInt(sc.get());
		var references = new Book[N];
		for (int i = 0; i < N; i++) {
			int C = Integer.parseInt(sc.get());
			int[] A = new int[M];
			Arrays.setAll(A, $ -> Integer.parseInt(sc.get()));
			references[i] = new Book(C, A);
		}

		boolean flag = false;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < 1 << N; i++) {
			var bitSet = BitSet.valueOf(new long[]{i});
			int[] sum = new int[M];
			int cost = 0;
			var iterator = bitSet.stream().iterator();
			while (iterator.hasNext()) {
				int bookIdx = iterator.nextInt();
				var book = references[bookIdx];
				cost += book.cost;
				for (int j = 0; j < M; j++) {
					sum[j] += book.a[j];
				}
			}

			if (Arrays.stream(sum).noneMatch(j -> j < X)) {
				min = Math.min(cost, min);
				flag = true;
			}
		}

		System.out.println(flag ? min : -1);
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