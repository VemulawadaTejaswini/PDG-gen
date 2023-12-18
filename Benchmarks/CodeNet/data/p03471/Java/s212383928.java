import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) throws IOException {
		try (AtCoderReader ar = new AtCoderReader()) {

			int[] input = ar.nextIntArray();

			int N = input[0];
			int Y = input[1];

			System.out.println(getAns(N, Y));
		}
	}

	private static String getAns(int N, int Y) {
		for (int i = 0; i <= N; i++) {
			for (int j = 0; i + j <= N; j++) {
				int k = N - (i + j);
				if (isMatch(Y, k, j, i)) {
					return String.join(" ", String.valueOf(k), String.valueOf(j), String.valueOf(i));
				}
			}
		}
		return "-1 -1 -1";
	}

	private static boolean isMatch(int price, int d100, int d50, int d10) {
		return price == (d100 * 10000 + d50 * 5000 + d10 * 1000);
	}

	public static class AtCoderReader implements AutoCloseable {
		private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		public final String[] nextStringArray() throws IOException {
			return this.br.readLine().split(" ");
		}

		public final Stream<String> nextStream() throws IOException {
			return Arrays.stream(this.nextStringArray());
		}

		public final IntStream nextIntStream() throws NumberFormatException, IOException {
			return this.nextStream().mapToInt(Integer::parseInt);
		}

		public final int[] nextIntArray() throws IOException {
			return this.nextIntStream().toArray();
		}

		public final int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(nextLine());
		}

		public final int nextInt(int radix) throws NumberFormatException, IOException {
			return Integer.parseInt(nextLine(), radix);
		}

		public final long nextBits() throws NumberFormatException, IOException {
			return Long.parseLong(nextLine().replaceAll(" ", ""), 2);
		}

		public final String nextLine() throws IOException {
			return this.br.readLine();
		}

		@Override
		public final void close() throws IOException {
			br.close();
		}
	}
}
