import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		TreeSet<Pair> taka = new TreeSet<>(
				Comparator.comparingInt(Pair::getA)
						.thenComparingInt(Pair::getB)
						.thenComparingLong(Pair::getIndex)
						.reversed());
		TreeSet<Pair> aoki = new TreeSet<>(
				Comparator.comparingInt(Pair::getB)
						.thenComparingInt(Pair::getA)
						.thenComparingLong(Pair::getIndex)
						.reversed());
		for (int i = 0; i < N; i++) {
			Pair p = new Pair(sc.nextInt(), sc.nextInt());
			taka.add(p);
			aoki.add(p);
		}

		long takaSum = 0;
		long aokiSum = 0;
		for (int i = 0; i < N; i++) {
			if (taka.isEmpty()) {
				break;
			}

			if (i % 2 == 0) {
				Pair p = taka.pollFirst();
				takaSum += p.A;
				aoki.remove(p);
			} else {
				Pair p = aoki.pollFirst();
				aokiSum += p.B;
				taka.remove(p);
			}
		}

		System.out.println(takaSum - aokiSum);
	}

	private static class Pair {
		private int A;
		private int B;
		private long index;

		private static long count = 0;

		public Pair(int A, int B) {
			this.A = A;
			this.B = B;
			this.index = count++;
		}

		public int getA() {
			return A;
		}

		public int getB() {
			return B;
		}

		public long getIndex() {
			return index;
		}
	}

	private static boolean isDebug = System.getProperty("sun.desktop") != null;

	private static void debug(Object... o) {
		if (isDebug) {
			System.err.println(Arrays.deepToString(o));
		}
	}

	public static class Scanner {
		private BufferedInputStream inputStream;
		private StringBuilder buffer = new StringBuilder();

		public Scanner(InputStream in) {
			inputStream = new BufferedInputStream(in);
		}

		public int nextInt() throws IOException {
			int num = 0;
			int sign = 1;

			int read = skip();
			if (read == '-') {
				sign = -1;
				read = inputStream.read();
			}

			do {
				num = num * 10 + sign * (read - 0x30);
			} while ((read = inputStream.read()) > 0x20);

			return num;
		}

		public void fill(int[] a) throws IOException {
			for (int i = 0; i < a.length; i++) {
				a[i] = nextInt();
			}
		}

		public void fill(int[] a, int[] b) throws IOException {
			if (a.length != b.length) {
				throw new IllegalArgumentException();
			}

			for (int i = 0; i < a.length; i++) {
				a[i] = nextInt();
				b[i] = nextInt();
			}
		}

		public long nextLong() throws IOException {
			long num = 0;
			int sign = 1;

			int read = skip();
			if (read == '-') {
				sign = -1;
				read = inputStream.read();
			}

			do {
				num = num * 10 + sign * (read - 0x30);
			} while ((read = inputStream.read()) > 0x20);

			return num;
		}

		public void fill(long[] a) throws IOException {
			for (int i = 0; i < a.length; i++) {
				a[i] = nextLong();
			}
		}

		public void fill(long[] a, long[] b) throws IOException {
			if (a.length != b.length) {
				throw new IllegalArgumentException();
			}

			for (int i = 0; i < a.length; i++) {
				a[i] = nextLong();
				b[i] = nextLong();
			}
		}

		public long[] nextLong(int n) throws IOException {
			long[] array = new long[n];
			for (int i = 0; i < n; i++) {
				array[i] = nextLong();
			}

			return array;
		}

		public String next() throws IOException {
			int read = skip();
			do {
				buffer.append((char) read);
			} while ((read = inputStream.read()) > 0x20);

			String text = buffer.toString();
			buffer.delete(0, buffer.length());

			return text;
		}

		private int skip() throws IOException {
			int read;
			while ((read = inputStream.read()) <= 0x20)
				;

			return read;
		}
	}
}
