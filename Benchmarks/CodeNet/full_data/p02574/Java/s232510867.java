import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		var A = new int[N];
		Arrays.setAll(A, $ -> Integer.parseInt(sc.get()));

		if (isPairwise(A)) {
			System.out.println("pairwise coprime");
			return;
		}

		if (isSetwise(A)) {
			System.out.println("setwise coprime");
			return;
		}

		System.out.println("not coprime");
	}

	int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	boolean isPairwise(int[] A) {
		int[] count = new int[1000000 + 1];
		for (int n : A) {
			for (int div = 2; (long) div * div <= (long) n; div++) {
				if (n % div == 0) {
					if (count[div] > 0 || count[n / div] > 0) {
						return false;
					}
					count[div]++;
					if (div != n / div) count[n / div]++;
				}
			}
			if (n != 1) {
				if (count[n] > 0) return false;
				count[n]++;
			}
		}
		return true;
	}

	boolean isSetwise(int[] A){
		int gcd = A[0];
		for (int i = 1; i < A.length; i++) {
			gcd = gcd(gcd, A[i]);
		}
		return gcd == 1;
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