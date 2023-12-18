
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskX solver = new TaskX();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskX {
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int n = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			long[] an = new long[n];
			for (int i = 0; i < n; i++) {
				an[i] = in.nextLong();
			}

			Arrays.sort(an);

			boolean isAllEqual = (an[0] == an[n-1]);

			double as = 0;
			for (int i = 0; i < a; i++) {
				as += an[n-i-1];
			}
			as /= a;

			int maxAInACount = 0;
			int maxAInALLCount = 0;
			for (int i = n-a; i < n; i++) {
				if (an[n-1] == an[i]) maxAInACount++;
			}
			for (int i = 0; i < n; i++) {
				if (an[n-1] == an[i]) maxAInALLCount++;
			}

			long ans = 0;
			if (isAllEqual) {
				for (int i = a; i <= b; i++) {
					ans += countCombination(b, i);
				}
			} else {
				ans += countCombination(maxAInALLCount, maxAInACount);
			}

			out.println(String.format("%1$.6f", as));
			out.println(ans);


		}
	}

	static long countCombination(long n, long r) {
		r = Math.min(r, n-r);
		BigInteger numerator = new BigInteger("1");
		BigInteger donominator = new BigInteger("1");

		for (long i = n; i > n-r; i--) {
			BigInteger is = new BigInteger(String.valueOf(i));
			numerator = numerator.multiply(is);
		}
		for (long i = 1; i <= r; i++) {
			BigInteger is = new BigInteger(String.valueOf(i));
			donominator = donominator.multiply(is);
		}
		return numerator.divide(donominator).longValue();
	}

	static class ArrayUtils {
		public static Map<Integer, Integer> getCountMap(int[] array) {
			Map<Integer, Integer> map = new TreeMap<>();
			for (int x : array)
				map.merge(x, 1, Integer::sum);
			return map;
		}
	}

	static class InputReader {
		BufferedReader in;
		StringTokenizer tok;

		public String nextString() {
			while (!tok.hasMoreTokens()) {
				try {
					tok = new StringTokenizer(in.readLine(), " ");
				} catch (IOException e) {
					throw new InputMismatchException();
				}
			}
			return tok.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextString());
		}

		public long nextLong() {
			return Long.parseLong(nextString());
		}

		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}

		public long[] nextLongArray(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong();
			}
			return res;
		}

		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}

	}

}
