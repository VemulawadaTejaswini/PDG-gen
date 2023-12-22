import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		int D = Integer.parseInt(sc.get());
		int[] C = new int[26];
		Arrays.setAll(C, $ -> Integer.parseInt(sc.get()));
		var S = new int[D][26];
		for (int i = 0; i < D; i++) {
			int[] row = S[i];
			Arrays.setAll(row, $ -> Integer.parseInt(sc.get()));
		}

		int[] result = new int[D];
		for (int i = 0; i < D; i++) {
			int max = -1;
			for (int j = 0; j < S[i].length; j++) {
				if (max < S[i][j]) {
					max = S[i][j];
					result[i] = j;
				}
			}
		}

		for (int value : result) {
			System.out.println(value + 1);
		}
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