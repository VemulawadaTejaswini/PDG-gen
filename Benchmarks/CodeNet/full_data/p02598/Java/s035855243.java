import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int K = Integer.parseInt(sc.get());
		int[] A = new int[N];
		Arrays.setAll(A, $ -> Integer.parseInt(sc.get()));
		Arrays.sort(A);
		int ok = A[A.length - 1];
		int ng = 0;
		while (Math.abs(ok - ng) > 1) {
			int mid = (ok + ng) / 2;
			if (canBe(K,mid, A)) ok = mid;
			else ng = mid;
		}
		System.out.println(ok);
	}

	boolean canBe(int k, int x, int... A){
		for (int value : A) {
			k -= -Math.floorDiv(-value, x) - 1;
		}
		return k >= 0;
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