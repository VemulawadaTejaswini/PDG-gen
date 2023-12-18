import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskC solver = new TaskC();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskC {
		public void solve(int testNumber, Scanner sc, PrintWriter out) {

			int n = sc.nextInt();
			String s = sc.next();

			char[] l = s.substring(0, n).toCharArray();
			char[] r = new StringBuilder(s.substring(n)).reverse().toString().toCharArray();

			Map<String, Long> mapL = new HashMap<>();
			Map<String, Long> mapR = new HashMap<>();

			for (int i = 0; i < 1 << n; i++) {
				StringBuilder sbL0 = new StringBuilder();
				StringBuilder sbL1 = new StringBuilder();
				StringBuilder sbR0 = new StringBuilder();
				StringBuilder sbR1 = new StringBuilder();
				for (int j = 0; j < n; j++) {
					if (((i >> j) & 1) == 0) {
						sbL0.appendCodePoint(l[j]);
						sbR0.appendCodePoint(r[j]);
					} else {
						sbL1.appendCodePoint(l[j]);
						sbR1.appendCodePoint(r[j]);
					}
				}
				String sL = sbL0.toString() + "+" + sbL1.toString();
				String sR = sbR0.toString() + "+" + sbR1.toString();
				if (mapL.containsKey(sL)) mapL.put(sL, mapL.get(sL) + 1);
				else mapL.put(sL, 1l);
				if (mapR.containsKey(sR)) mapR.put(sR, mapR.get(sR) + 1);
				else mapR.put(sR, 1l);
			}

			long ans = 0;
			for (Map.Entry<String, Long> e : mapL.entrySet()) {
				if (mapR.containsKey(e.getKey())) {
					ans += mapR.get(e.getKey()) * e.getValue();
				}
			}

			out.println(ans);

		}

	}

	static class Scanner {
		private final InputStream in;
		private final byte[] buffer;
		private int ptr;
		private int buflen;

		public Scanner(InputStream in) {
			this.in = in;
			this.buffer = new byte[1024];
			this.ptr = 0;
			this.buflen = 0;
		}

		private boolean hasNextByte() {
			if (ptr < buflen) return true;
			else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) return false;
			}
			return true;
		}

		private byte readByte() {
			if (hasNextByte()) return buffer[ptr++];
			return -1;
		}

		private boolean isPrintableChar(byte c) {
			return '!' <= c && c <= '~';
		}

		private void skipUnprintable() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
				ptr++;
			}
		}

		public boolean hasNext() {
			skipUnprintable();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			byte b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if (!hasNext()) throw new NoSuchElementException();
			int n = 0;
			boolean minus = false;
			byte b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) throw new NumberFormatException();
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}

	}
}

