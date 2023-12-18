import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

final class Solver {
	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int K = Integer.parseInt(sc.get());
		String S = sc.get();
		Pattern pattern = Pattern.compile("1+");
		Matcher matcher = pattern.matcher(S);
		int[] starts, ends;
		{
			IntStream.Builder startsBuilder = IntStream.builder();
			IntStream.Builder endsBuilder = IntStream.builder();
			while (matcher.find()){
				startsBuilder.add(matcher.start());
				endsBuilder.add(matcher.end());
			}
			starts = startsBuilder.build().toArray();
			ends = endsBuilder.build().toArray();
		}

		if (starts.length == 0){
			System.out.println(N);
			return;
		}

		int zeros = starts.length - 1;
		if (starts[0] != 0) zeros += 1;
		if (ends[ends.length - 1] != N) zeros += 1;

		if (K >= zeros) {
			System.out.println(N);
			return;
		}


		int max = 0;
		for (int i = 0; i < ends.length; i++) {
			max = Math.max(max, ends[i] - starts[Math.max(i - K, 0)]);
		}
		if (starts[0] != 0){
			max = Math.max(max, ends[Math.min(K, ends.length) - 1]);
		}
		if (ends[ends.length - 1] != N){
			max = Math.max(max, N - starts[Math.max(starts.length - K, 0)]);
		}

		System.out.println(max);
	}
}

class Main {
	public static void main(String... args) {
		new Thread(null, () -> {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			new Solver().solve(new Supplier<String>() {
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
		}, "", Runtime.getRuntime().maxMemory()).start();
	}
}