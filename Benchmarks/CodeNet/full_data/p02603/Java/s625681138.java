import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		long[] A = new long[N];
		Arrays.setAll(A, $ -> Long.parseLong(sc.get()));
		boolean increasing = false;
		boolean decreasing = true;
		long cash = 1000;
		long stock = 0;
		for (int i = 1; i < A.length; i++) {
			boolean inc = A[i] > A[i - 1];
			boolean dec = A[i] < A[i - 1];
			if (!inc && !dec) continue;
			if (increasing && dec){
				cash += stock * A[i - 1];
				stock = 0;
			} else if (decreasing && inc) {
				stock += cash / A[i - 1];
				cash = cash % A[i - 1];
			}
			increasing = inc;
			decreasing = dec;
		}
		System.out.println(cash + stock * A[N - 1]);
	}
}

class Main {
	public static void main(String... args) {
		System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		var reader = new BufferedReader(new InputStreamReader(System.in));
		new Solver().solve(new Supplier<>() {
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