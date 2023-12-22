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
		BigInteger resultBig = new BigInteger("1");

		for (int i = 0; i < n; i++) {
			String next = sc.next();
			if ("0".equals(next)) {
				result = 0;
				break;
			}
			long tmp = result;
			try {
				result = Math.multiplyExact(result, Long.parseLong(next));
			} catch (ArithmeticException e) {
				BigInteger tmpResult = BigInteger.valueOf(tmp);
				resultBig = resultBig.multiply(tmpResult.multiply(new BigInteger(next)));
				result = 1;
			}
		}
		resultBig = resultBig.multiply(BigInteger.valueOf(result));
		BigInteger max = new BigInteger("10").pow(18);
		if (max.compareTo(resultBig) < 0) {
			resultBig = new BigInteger("-1");
		}
		System.out.println(resultBig);
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
