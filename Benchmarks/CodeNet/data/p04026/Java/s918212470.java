import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		String S = sc.get();
		Pattern cont = Pattern.compile("(.)((\\1.)|(.\\1)|((?!\\1)(.)\\6))");
		Matcher matcher = cont.matcher(S);
		if (!matcher.find()) {
			System.out.println("-1 -1");
			return;
		}
		MatchResult result = matcher.toMatchResult();
		System.out.printf("%d %d%n", result.start() + 1, result.end());
	}
}

class Main {
	public static void main(String... args) {
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
	}
}
