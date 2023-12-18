
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
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

	static int maxQ = 100010;
	static class TaskX {
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			boolean[] isPrime = new boolean[maxQ];
			getPrimes(isPrime);
			int[] a = new int[maxQ];
			for (int i = 0; i < maxQ; i++) {
				if (i % 2 == 1 && isPrime[i] && isPrime[(i+1)/2]) a[i] = 1;
			}
			int[] sum = new int[maxQ];
			for (int i = 0; i < maxQ - 1; i++) {
				sum[i+1] = sum[i] + a[i+1];
			}

			int q = in.nextInt();
			for (int i = 0; i < q; i++) {
				int l = in.nextInt();
				int r = in.nextInt();
				out.println(sum[r]-sum[l-1]);
			}

		}
	}

	public static void getPrimes(boolean[] isPrime) {
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		for (int i = 2; i <= Math.sqrt(isPrime.length); i++) {
			if (!isPrime[i])
				continue;
			for (int j = i + i; j < isPrime.length; j += i) {
				isPrime[j] = false;
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
