import java.io.*;
import java.util.*;
import java.util.function.*;

final class Pair{
	int a, b;

	Pair(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Pair pair = (Pair) o;

		if (a != pair.a) return false;
		return b == pair.b;
	}

	public int hashCode() {
		return (a << 12) ^ b;
	}
}

final class Solver {
	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int M = Integer.parseInt(sc.get());

		Pair[] pairs = new Pair[M];
		for (int i = 0; i < M; i++) {
			int A = Integer.parseInt(sc.get()) - 1;
			int B = Integer.parseInt(sc.get()) - 1;
			pairs[i] = new Pair(A, B);
		}


		BitSet[] forest = new BitSet[N];
		long[] unhappiness = new long[M];
		unhappiness[M - 1] = N * (N - 1L) / 2;
		for (int i = pairs.length - 1; i > 0; i--) {
			Pair pair = pairs[i];
			BitSet containsA = forest[pair.a];
			BitSet containsB = forest[pair.b];
			long link = unhappiness[i];
			if (containsA == null && containsB == null){
				BitSet bitSet = new BitSet();
				bitSet.set(pair.a);
				bitSet.set(pair.b);
				forest[pair.a] = forest[pair.b] = bitSet;
				link -= 1;
			} else if (containsA == containsB){

			} else if (containsA == null){
				link -= containsB.cardinality();
				forest[pair.a] = forest[pair.b];
				containsB.set(pair.a);
			} else if (containsB == null) {
				link -= containsA.cardinality();
				forest[pair.b] = forest[pair.a];
				containsA.set(pair.b);
			} else {
				link -= (long) containsA.cardinality() * containsB.cardinality();
				forest[pair.b] = forest[pair.a];
				containsA.or(forest[pair.b]);
			}
			unhappiness[i - 1] = link;
		}
		for (long l : unhappiness) {
			System.out.println(l);
		}
	}
}

class Main {
	public static void main(String... args) {
		System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		new Solver().solve(new Supplier<String>() {
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