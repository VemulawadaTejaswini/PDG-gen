import java.io.*;
import java.util.*;
import java.util.function.*;

final class Log{
	long original;
	int divide = 0;
	Log(long original){
		this.original = original;
	}

	double actualSize(){
		return original / (divide + 1d);
	}

	void increaseDividing(){
		divide++;
	}
}

final class Solver {
	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		long K = Long.parseLong(sc.get());
		long[] A = new long[N];
		Arrays.setAll(A, $ -> Long.parseLong(sc.get()));
		var logs = new PriorityQueue<Log>(Comparator.comparingDouble(Log::actualSize).reversed());
		for (long l : A) {
			logs.add(new Log(l));
		}
		for (long i = 0; i < K; i++) {
			var log = logs.remove();
			log.increaseDividing();
			logs.add(log);
		}
		System.out.println((long) Math.ceil(logs.element().actualSize()));
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