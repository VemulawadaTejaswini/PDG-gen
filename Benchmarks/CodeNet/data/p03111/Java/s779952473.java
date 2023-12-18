import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		long A = Long.parseLong(sc.get());
		long B = Long.parseLong(sc.get());
		long C = Long.parseLong(sc.get());
		long[] L = new long[N];
		Arrays.setAll(L, $ -> Long.parseLong(sc.get()));

		System.out.println(dfs(A, B, C, L, 0, false, false, false));
	}

	long dfs(long a, long b, long c, long[] L, int index, boolean aflag, boolean bflag, boolean cflag) {
		long minCost = aflag && bflag && cflag ? Math.abs(a) + Math.abs(b) + Math.abs(c) : Integer.MAX_VALUE;
		if (index == L.length) {
			return minCost;
		}
		minCost = Math.min(minCost, dfs(a - L[index], b, c, L, index + 1, true, bflag, cflag) + (aflag ? 10 : 0));
		minCost = Math.min(minCost, dfs(a, b - L[index], c, L, index + 1, aflag, true, cflag) + (bflag ? 10 : 0));
		minCost = Math.min(minCost, dfs(a, b, c - L[index], L, index + 1, aflag, bflag, true) + (cflag ? 10 : 0));
		minCost = Math.min(minCost, dfs(a, b, c, L, index + 1, aflag, bflag, cflag));
		return minCost;
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