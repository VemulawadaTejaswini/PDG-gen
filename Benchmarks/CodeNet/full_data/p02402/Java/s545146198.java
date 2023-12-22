import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.InputMismatchException;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			min = Math.min(min, a);
			max = Math.max(max, a);
			sum += a;
		}

		System.out.println(min + " " + max + " " + sum);

		sc.close();
	}

	@SuppressWarnings("unused")
	private static class Scanner {
		InputStreamReader isr;
		BufferedReader br;
		StreamTokenizer st;

		private Scanner() {
		}

		Scanner (InputStream in) {
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			st = new StreamTokenizer(br);
		}

		String next() throws RuntimeException  {
			try {
				if (st.nextToken() != StreamTokenizer.TT_WORD) {
				}
			} catch (IOException e) {
				throw new IllegalStateException();
			}

			return st.sval;
		}

		int nextInt() throws RuntimeException {
			try {
				if (st.nextToken() != StreamTokenizer.TT_NUMBER) {
					throw new InputMismatchException();
				}
			} catch (IOException e) {
				throw new IllegalStateException();
			}

			return (int)st.nval;
		}

		void close() {
		}
	}
}