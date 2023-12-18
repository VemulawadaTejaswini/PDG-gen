import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main{

	public static void main(String[] args) {
		int n = (int) sc.nextLong();
		int q = (int) sc.nextLong();

		List<Integer>[] ncs = new List[n + 1];
		int[] nps = new int[n + 1];
		int[] vs = new int[n + 1];

		for (int i = 0, max = n - 1; i < max; i++) {
			int n0 = (int) sc.nextLong();
			int n1 = (int) sc.nextLong();

			List<Integer> nc = ncs[n0];
			if (nc == null) {
				nc = new ArrayList<Integer>();
				ncs[n0] = nc;
			}
			nc.add(Integer.valueOf(n1));
			nps[n1] = n0;

		}

		for (int i = 0; i < q; i++) {
			int ni = (int) sc.nextLong();
			int v = (int) sc.nextLong();
			add(ni, v, ncs, vs);
		}

		for (int i = 1; i < vs.length; i++) {
			if (i != 1) {
				pw.print(" ");
			}
			pw.print(vs[i]);
		}
		pw.flush();
	}

	static void add(int ni, int v, List<Integer>[] ncs, int[] vs) {
		vs[ni] = vs[ni] + v;

		List<Integer> nc = ncs[ni];
		if (nc != null) {
			nc.forEach(c -> add(c, v, ncs, vs));
		}
	}

	static final FastScanner sc = new FastScanner();
	static final PrintWriter pw = new PrintWriter(System.out);

	static class FastScanner {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			} else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) {
					return false;
				}
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[ptr++];
			else
				return -1;
		}

		static boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		private void skipUnprintable() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr]))
				ptr++;
		}

		public boolean hasNext() {
			skipUnprintable();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
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
