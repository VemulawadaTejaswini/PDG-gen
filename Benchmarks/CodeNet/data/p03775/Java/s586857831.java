import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		Task task = new Task();
		task.solve();
	}

	public static class Task {
		static final long MOD = (long) 1e9 + 7;

		public void solve() {
			Scan sc = new Scan();
			long n = sc.scanLong();
			long i = (long) Math.sqrt(n);
			for (; i >= 1; --i) {
				if (n % i == 0) {
					break;
				}
			}
			long other = n / i;
			long res = Math.max(String.valueOf(i).length(), String.valueOf(other).length());
			System.out.println(res);
		}
	}

	public static class Scan {
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
