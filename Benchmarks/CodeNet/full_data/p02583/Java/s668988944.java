import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		long[] L = new long[N];
		Arrays.setAll(L, $ -> Long.parseLong(sc.get()));
		Arrays.sort(L);
		int count = 0;
		for (int i = 0; i < L.length; i++) {
			for (int j = i + 1; j < L.length; j++) {
				if (L[i] == L[j]) continue;
				for (int k = j + 1; k < L.length; k++) {
					if (L[i] == L[k] || L[j] == L[k]) continue;
					if (L[k] < L[i] + L[j]){
						count++;
					}
				}
			}
		}
		System.out.println(count);
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