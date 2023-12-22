import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		var A = new long[N];
		Arrays.setAll(A, $ -> Long.parseLong(sc.get()));

		for (long l : A) {
			if (l == 0) {
				System.out.println(0);
				return;
			}
		}

		long result = 1;
		try {
			for (int i = 0; i < N; i++) {
				long l = A[i];
				result = Math.multiplyExact(result, l);
				if (result > 1000000000000000000L) {
					System.out.println(-1);
					return;
				}
			}
		}
		catch(ArithmeticException e){
			System.out.println(-1);
			return;
		}
		System.out.println(result);
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