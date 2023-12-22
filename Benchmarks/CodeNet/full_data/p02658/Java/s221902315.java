import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		long result = 1;
		long n = sc.nextLong();
		List<String> a = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String next = sc.next();
			if ("0".equals(next)) {
				result = 0;
				break;
			}
			a.add(next);
		}
		if (result == 1) {
			for (int i = 0; i < n; i++) {
				String next = a.get(i);
				result *= Long.parseLong(next);
			}
			if (result > (long) Math.pow(10.0, 18.0)) {
				result = -1;
			}
		}
		System.out.println(result);
	}
}

class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}

		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public long nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
