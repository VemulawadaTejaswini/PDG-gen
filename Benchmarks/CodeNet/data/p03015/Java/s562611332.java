import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		String L = sc.get();

		int[][] memo = new int[2][L.length() + 1];
		int[] filler = new int[L.length() + 1];
		Arrays.fill(filler, -1);
		Arrays.setAll(memo, $ -> Arrays.copyOf(filler, L.length() + 1));
		memo[0][0] =memo[1][0] = 1;

		System.out.println(dfs(L.length(), i -> L.charAt(L.length() - i) == '1', true, memo));
	}

	int dfs(int i, IntPredicate canBeOne, boolean higherCanBeOneButSelectZero, int[][] memo){
		int[] mem = memo[higherCanBeOneButSelectZero ? 1 : 0];
		int r = mem[i];
		if (r > -1) return r;
		if (i <= 0) return 1;
		if (canBeOne.test(i) || higherCanBeOneButSelectZero) {
			return mem[i] = (((2 * dfs(i - 1, canBeOne, false, memo)) % 1000000007) + dfs(i - 1, canBeOne, true, memo)) % 1000000007;
		} else {
			return mem[i] = dfs(i - 1, canBeOne, false, memo) % 1000000007;
		}
	}
}

class Main {
	public static void main(String... args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<String>() {
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
	}
}