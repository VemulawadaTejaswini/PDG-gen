import java.io.*;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.LongUnaryOperator;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(FastScanner sc) {
		int N = sc.nextInt();
		LongUnaryOperator[] ops = new LongUnaryOperator[N - 1];
		for (int i = 0; i < N - 1; i++) {
			int C = sc.nextInt();
			int S = sc.nextInt();
			int F = sc.nextInt();
			ops[i] = t -> {
				if (S >= t) return C + S;
				else {
					long wait = (t - S) % F;
					if (wait == 0) return t + C;
					return t + (F - wait) + C;
				}
			};
		}
		StringJoiner joiner = new StringJoiner("\n");
		for (int i = 0; i < N; i++) {
			long t = 0;
			for (int j = i; j < N - 1; j++) {
				t = ops[j].applyAsLong(t);
			}
			joiner.add(String.valueOf(t));
		}
		System.out.println(joiner.toString());
	}
}

final class FastScanner extends BufferedReader {
	private StringTokenizer tokenizer;

	FastScanner(InputStream in) {
		super(new InputStreamReader(in));
	}

	String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(readLine());
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
		return tokenizer.nextToken();
	}

	int nextInt() {
		return Integer.parseInt(next());
	}

	//10^10~
	long nextLong() {
		return Long.parseLong(next());
	}
}

class Main {
	public static void main(String... args) {
		FastScanner in = new FastScanner(System.in);

		Solver.INSTANCE.solve(in);

		try {
			in.close();
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
	}
}