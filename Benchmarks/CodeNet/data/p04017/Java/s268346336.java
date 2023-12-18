import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Printer pr = new Printer(System.out);

		int n = sc.nextInt();

		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		int[] rx = new int[n];
		for (int i = 0; i < n; i++) {
			rx[i] = -x[n - 1 - i];
		}

		int l = sc.nextInt();
		int q = sc.nextInt();

		int[] a = new int[q];
		int[] b = new int[q];
		for (int i = 0; i < q; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;

			int[] tmp;
			int s;
			int e;
			if (b[i] > a[i]) {
				tmp = x;
				s = a[i];
				e = b[i];
			} else {
				tmp = rx;
				s = n - 1 - a[i];
				e = n - 1 - b[i];
			}

			int cnt = 0;
			int d = l;
			for (int j = s + 1; j <= e; j++) {
				int diff = tmp[j] - tmp[j - 1];
				if (diff <= d) {
					d -= diff;
				} else {
					cnt++;
					d = l - diff;
				}
			}

			pr.println(cnt + 1);
		}

		pr.close();
		sc.close();
	}

	@SuppressWarnings("unused")
	private static class Scanner {
		BufferedReader br;
		Iterator<String> it;

		Scanner (InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}

		String next() throws RuntimeException  {
			try {
				if (it == null || !it.hasNext()) {
//					it = Arrays.asList(br.readLine().split(" ")).iterator();
					it = Arrays.asList(br.readLine().split("\\p{javaWhitespace}+")).iterator();
				}
				return it.next();
			} catch (IOException e) {
				throw new IllegalStateException();
			}
		}

		int nextInt() throws RuntimeException {
			return Integer.parseInt(next());
		}

		long nextLong() throws RuntimeException {
			return Long.parseLong(next());
		}

		float nextFloat() throws RuntimeException {
			return Float.parseFloat(next());
		}

		double nextDouble() throws RuntimeException {
			return Double.parseDouble(next());
		}

		void close() {
			try {
				br.close();
			} catch (IOException e) {
//				throw new IllegalStateException();
			}
		}
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}
