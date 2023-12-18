import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) throws IOException {
		try (AtCoderReader ar = new AtCoderReader()) {
			ar.next();
			int[] A = ar.nextIntArray();

			int min = Integer.MAX_VALUE;

			for (int i = 0; i < A.length; i++) {
				min = Math.min(min, getCan2DivCount(A[i]));
			}

			System.out.println(min);
		}
	}

	private static int getCan2DivCount(int num) {
		if (num % 2 == 0) {
			return 1 + getCan2DivCount(num / 2);
		} else {
			return 0;
		}
	}

	public static class AtCoderReader implements AutoCloseable {
		private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		public final String[] nextStringArray() throws IOException {
			return this.br.readLine().split(" ");
		}

		public final Stream<String> nextStream() throws IOException {
			return Stream.of(this.nextStringArray());
		}

		public final IntStream nextIntStream() throws NumberFormatException, IOException {
			return this.nextStream().mapToInt(Integer::parseInt);
		}

		public final int[] nextIntArray() throws IOException {
			return this.nextIntStream().toArray();
		}

		public final int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}

		public final String next() throws IOException {
			return this.br.readLine();
		}

		@Override
		public final void close() throws IOException {
			br.close();
		}
	}
}
