import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);

		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();

		if (H % h == 0 && W % w == 0) {
			out.println("No");
		} else {
			out.println("Yes");
			for (int i = 0; i < H; i++) {
				if (i % h == 0) {
					for (int j = 0; j < W - 1; j++) {
						if (j % w == 0) out.print(1145141919 + " ");
						else out.print(0 + " ");
					}
					if ((W - 1) % w == 0) out.println(1145141919);
					else out.println(0);
				} else if ((i + 1) % h == 0) {
					for (int j = 0; j < W - 1; j++) {
						if ((j + 1) % w == 0) out.print(-1145141920 + " ");
						else out.print(0 + " ");
					}
					if (W % w == 0) out.println(-1145141920);
					else out.println(0);
				} else {
					for (int j = 0; j < W - 1; j++) out.print(0 + " ");
					out.println(0);
				}
			}
		}

		out.flush();
	}

}

class FastScanner {
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
			if (buflen <= 0) { return false; }
		}
		return true;
	}

	private byte readByte() {
		if (hasNextByte()) {
			return buffer[ptr++];
		} else {
			return -1;
		}
	}

	private boolean isPrintableChar(int c) {
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

	public int nextInt() {
		if (!hasNext()) { throw new NoSuchElementException(); }
		int n = 0;
		boolean minus = false;
		byte b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) { throw new NumberFormatException(); }
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