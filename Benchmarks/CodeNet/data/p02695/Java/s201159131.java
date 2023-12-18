import java.io.*;
import java.util.*;
import java.util.function.*;

final class Quad {
	int a, b, c, d;

	Quad(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
}

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int M = Integer.parseInt(sc.get());
		int Q = Integer.parseInt(sc.get());
		Quad[] quads = new Quad[Q];
		for (int i = 0; i < Q; i++) {
			quads[i] = new Quad(Integer.parseInt(sc.get()) - 1, Integer.parseInt(sc.get()) - 1, Integer.parseInt(sc.get()), Integer.parseInt(sc.get()));
		}

		var arrays = createArrays(new int[N + 2], M, 0);

		int max = 0;
		for (int[] raw : arrays) {
			int[] array = summarize(raw);
			int point = 0;
			for (Quad quad : quads) {
				if (array[quad.b] - array[quad.a] == quad.c) point += quad.d;
			}
			max = Math.max(max, point);
		}

		System.out.println(max);
	}

	int[] summarize(int[] array) {
		int[] result = new int[array.length - 2];
		int sum = array[0];
		for (int i = 0; i < result.length; i++) {
			result[i] = sum;
			sum += array[i + 1];
		}
		return result;
	}

	Collection<int[]> createArrays(int[] filled, int remaining, int from) {
		if (remaining == 0) return Collections.singleton(filled);
		List<int[]> set = new ArrayList<>();
		for (int i = from; i < filled.length; i++) {
			var copy = Arrays.copyOf(filled, filled.length);
			copy[i] += 1;
			set.addAll(createArrays(copy, remaining - 1, i));
		}
		return set;
	}
}

class Main {
	public static void main(String... args) {
		try (var reader = new BufferedReader(new InputStreamReader(System.in))) {
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
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
	}
}