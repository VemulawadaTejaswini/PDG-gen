import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();
	private int N;

	void solve(Supplier<String> sc) {
		N = Integer.parseInt(sc.get());
		for (int i = 0; i < N + 1; i++) {
			dp.add(new HashMap<>());
		}
		System.out.println(dfs(0, "TTT"));
	}

	List<Map<String, Integer>> dp = new ArrayList<>();
	int dfs(int index, String prefix){
		if (dp.get(index).containsKey(prefix)) return dp.get(index).get(prefix);
		if (index == N) return 1;
		int result = 0;
		String p = prefix.substring(1);
		if (isOk(prefix + 'A')) result = add(result, dfs(index + 1, p + 'A'));
		if (isOk(prefix + 'G')) result = add(result, dfs(index + 1, p + 'G'));
		if (isOk(prefix + 'C')) result = add(result, dfs(index + 1, p + 'C'));
		if (isOk(prefix + 'T')) result = add(result, dfs(index + 1, p + 'T'));
		dp.get(index).put(prefix, result);
		return result;
	}

	boolean isOk(String subseq){
		for (int i = 0; i < 4; i++) { // simulate
			char[] chars = subseq.toCharArray();
			if (i >= 1) {
				char temp = chars[i];
				chars[i] = chars[i - 1];
				chars[i - 1] = temp;
			}
			if (String.valueOf(chars).contains("AGC")) {
				return false;
			}
		}
		return true;
	}

	static final int MOD = 1000000007;
	int mod(long val) {
		return (int) Math.floorMod(val, MOD);
	}

	int add(long a, long b) {
		return mod(a + b);
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