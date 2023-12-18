
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskC solver = new TaskC();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskC {
		public void solve(int testNumber, InputReader in, PrintWriter out) {
			String n = in.nextString();
			String m = in.nextString();
			String devisor = "1000000007";

			int sa = Integer.parseInt(m) - Integer.parseInt(n);

			if (Math.abs(sa) > 1) out.print(0);
			if (Math.abs(sa) == 1) {
				out.println(MathUtils.factorial(n)
						.multiply(MathUtils.factorial(m))
						.remainder(new BigInteger(devisor))
						);
			}
			if (Math.abs(sa) == 0) {
				out.println(MathUtils.factorial(n)
						.multiply(MathUtils.factorial(m))
						.multiply(new BigInteger("2"))
						.remainder(new BigInteger(devisor))
						);
			}
		}
	}

	static class ArrayUtils {
		public static Map<Integer, Integer> getCountMap(int[] array) {
			Map<Integer, Integer> map = new TreeMap<>();
			for (int x : array)
				map.merge(x, 1, Integer::sum);
			return map;
		}
	}

	static class MathUtils {
		public static BigInteger factorial(String n) {
			BigInteger in = new BigInteger(n);
			BigInteger out = new BigInteger("1");
			for (BigInteger i = new BigInteger("1"); i.compareTo(in) <= 0; i = i.add(new BigInteger("1"))) {
				out = out.multiply(i);
			}
			return out;
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

		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}

		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}

	}

}
