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

		var currentSatisfaction = 0;
		var last = new int[26];
		int[] result = new int[D];
		for (int day = 0; day < D; day++) {
			int max = -1;
			int maxIdx = -1;
			for (int open = 0; open < 26; open++) {
				int attempt = currentSatisfaction + S[day][open];
				
				for (int k = 0; k < 26; k++) {
					if (k == open) continue;
					attempt -= calc満足度減少(C[k], day, last[k]);
				}
				
				if (max < attempt){
					max = attempt;
					maxIdx = open;
				}
			}
			
			last[maxIdx] = day + 1;
			currentSatisfaction = result[day] = maxIdx;
		}

		for (int value : result) {
			System.out.println(value + 1);
		}
	}
	
	int calc満足度減少(int rate, int day, int last){
		return rate * (day + 1 - last);
	}

	void judge(Supplier<String> sc){
		int D = Integer.parseInt(sc.get());
		int[] C = new int[26];
		Arrays.setAll(C, $ -> Integer.parseInt(sc.get()));
		var S = new int[D][26];
		for (int i = 0; i < D; i++) {
			int[] row = S[i];
			Arrays.setAll(row, $ -> Integer.parseInt(sc.get()));
		}
		int[] T = new int[D];
		Arrays.setAll(T, $ -> Integer.parseInt(sc.get()) - 1);

		var currentSatisfaction = 0;
		var last = new int[26];
		for (int i = 0; i < D; i++) {
			last[T[i]] = i + 1;
			currentSatisfaction += S[i][T[i]];
			for (int j = 0; j < 26; j++) {
				currentSatisfaction -= C[j] * (i + 1 - last[j]);
			}
			System.err.println(currentSatisfaction);
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