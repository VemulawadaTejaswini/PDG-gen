import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		String[] S = new String[N];
		Arrays.setAll(S, $ -> sc.get());
		int ac = 0, wa = 0, tle = 0, re = 0;
		for (String s : S) {
			switch (s) {
				case "AC":
					ac++;
					break;
				case "WA":
					wa++;
					break;
				case "TLE":
					tle++;
					break;
				case "RE":
					re++;
					break;
			}
		}
		System.out.printf("AC x %d%nWA x %d%nTLE x %d%nRE x %d%n", ac, wa, tle, re);
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