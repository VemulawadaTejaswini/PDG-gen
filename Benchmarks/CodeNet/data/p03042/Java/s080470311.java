import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		String S = sc.get();
		int left = Integer.parseInt(S.substring(0, 2), 10);
		int right = Integer.parseInt(S.substring(2), 10);
		if (left == 0 || right == 0) {
			System.out.println("NA");
		}else if (left > 12 && right > 12) {
			System.out.println("NA");
		} else if (left > 12){
			System.out.println("YYMM");
		} else if (right > 12) {
			System.out.println("MMYY");
		} else {
			System.out.println("AMBIGUOUS");
		}
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