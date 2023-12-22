import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		var X = sc.get();
		var chars = X.toCharArray();
		int popcount = 0;
		{
			for (char x : chars) {
				if (x == '1') {
					popcount++;
				}
			}
		}
		var l = Integer.parseInt(X.substring(Math.max(X.length() - 1 - 31, 0)), 2);
		for (int i = N - 1; i > 31; i--) {
			if (chars[N - 1 - i] == '1') {
				System.out.println(circularMod(l, popcount - 1));
			} else {
				System.out.println(circularMod(l, popcount + 1));
			}
		}
		for (int i = Math.min(31, N - 1); i >= 0; i--) {
			if (chars[N - 1 - i] == '1') {
				System.out.println(circularMod(l ^ (1 << i), popcount - 1));
			} else {
				System.out.println(circularMod(l ^ (1 << i), popcount + 1));
			}
		}
	}

	int circularMod(int x, int popcount) {
		if (x == 0) return 0;
		return circularMod(x % popcount, Integer.bitCount(x % popcount)) + 1;
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