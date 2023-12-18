import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		Task task = new Task();
		task.solve();
	}

	static class Task {
		static final long MOD = (long) 1e9 + 7;

		public void solve() {
			Scan sc = new Scan();
			int N = (int) sc.scanLong();
			int M = (int) sc.scanLong();
			int[] arr = new int[N];
			for (int i = 0; i < N; ++i)
				arr[i] = (int) sc.scanLong();
			Pair[] pairs = new Pair[M];
			for (int j = 0; j < M; j++) {
				Pair p = new Pair();
				p.setKey((int) sc.scanLong());
				p.setValue((int) sc.scanLong());
				pairs[j] = p;
			}
			Arrays.sort(arr);
			Arrays.sort(pairs);
			long ans = 0;
			for (int m = 0, n = 0; m < arr.length || n < pairs.length; m++) {
				if (m == arr.length)
					break;
				Pair pp = null;
				int count = 0;
				int value = 0;
				if (n < pairs.length) {
					pp = pairs[n];
					count = pp.getKey();
					value = pp.getValue();
				}
				if (arr[m] < value) {
					if (count > 0) {
						ans += value;
						count--;
						pp.setKey(count);
						pairs[n] = pp;
					} else {
						n++;
						m--;
					}
				} else {
					ans += arr[m];
				}
			}
			System.out.println(ans);
		}
	}

	static class Pair implements Comparable<Pair> {
		int key;
		int value;

		public void setKey(int key) {
			this.key = key;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public int getKey() {
			return this.key;
		}

		public int getValue() {
			return this.value;
		}

		public int compareTo(Pair pp) {
			return Integer.compare(pp.getValue(), this.value);
		}
	}

	static class Scan {
		private byte[] buf = new byte[1024];
		private int index;
		private InputStream in;
		private int total;

		public Scan() {
			in = System.in;
		}

		public int scan() {
			if (total < 0)
				throw new InputMismatchException();
			if (index >= total) {
				index = 0;
				try {
					total = in.read(buf);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
				if (total <= 0)
					return -1;
			}
			return buf[index++];
		}

		public long scanLong() {
			long integer = 0;
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			int neg = 1;
			if (n == '-') {
				neg = -1;
				n = scan();
			}
			while (!isWhiteSpace(n)) {
				if (n >= '0' && n <= '9') {
					integer *= 10;
					integer += n - '0';
					n = scan();
				} else
					throw new InputMismatchException();
			}
			return neg * integer;
		}

		public double scanDouble() throws IOException {
			double doub = 0;
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			int neg = 1;
			if (n == '-') {
				neg = -1;
				n = scan();
			}
			while (!isWhiteSpace(n) && n != '.') {
				if (n >= '0' && n <= '9') {
					doub *= 10;
					doub += n - '0';
					n = scan();
				} else
					throw new InputMismatchException();
			}
			if (n == '.') {
				n = scan();
				double temp = 1;
				while (!isWhiteSpace(n)) {
					if (n >= '0' && n <= '9') {
						temp /= 10;
						doub += (n - '0') * temp;
						n = scan();
					} else
						throw new InputMismatchException();
				}
			}
			return doub * neg;
		}

		public String scanString() {
			StringBuilder sb = new StringBuilder();
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			while (!isWhiteSpace(n)) {
				sb.append((char) n);
				n = scan();
			}
			return sb.toString();
		}

		public char scanChar() {
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			return (char) n;
		}

		private boolean isWhiteSpace(int n) {
			if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1)
				return true;
			return false;
		}
	}
}
