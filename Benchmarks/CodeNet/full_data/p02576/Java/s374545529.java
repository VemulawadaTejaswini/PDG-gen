
/**
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author b
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner();
		PrintWriter writer = new PrintWriter(System.out);
		solve(scanner, writer);
		writer.close();
	}

	private static void solve(Scanner scanner, PrintWriter writer) {

		int n = scanner.nextInt();
		int x = scanner.nextInt();
		int t = scanner.nextInt();

		writer.println((int) Math.ceil(n * 1.0 / x) * t);

	}

	// Props to SecondThread
	static class Scanner {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer("");

		String next() {
			while (!tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return tokenizer.nextToken();
		}

		long[] nextLongArr(int num) {
			long[] vals = new long[num];
			for (int i = 0; i < num; i++)
				vals[i] = nextLong();
			return vals;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] nextIntArr(int numberOfElements) {
			int[] values = new int[numberOfElements];
			for (int i = 0; i < numberOfElements; i++)
				values[i] = nextInt();
			return values;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
