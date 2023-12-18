import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String args[]) {

		FastScanner sc = new FastScanner();
		int h = sc.nextInt();
		int w = sc.nextInt();

		int a = sc.nextInt();
		int b = sc.nextInt();

		int a2 = w - a;
		int b2 = h - b;

		if(a == 0) {
			int work;
			work = a2;
			a2 = a;
			a = work;
		}
		if (b == 0) {
			int work;
			work = b2;
			b2 = b;
			b = work;
		}

		int checkY[] = new int[w];
		boolean cells[][] = new boolean[h][w];

		for (int y = 0; y < h; y++) {
			int xSum = 0;

			for (int x = 0; x < w; x++) {
				if (checkY[x] < b) {
					xSum++;
					checkY[x]++;
					cells[y][x] = true;
				}

				if (xSum >= a) {
					break;
				}
			}

			if (xSum != a && xSum != a2) {
				System.out.println("No");
				return;
			}
		}

		for (int x : checkY) {
			if (x != b && x != b2) {
				System.out.println("No");
				return;
			}
		}

		StringBuffer sb = new StringBuffer();
		String lf = System.getProperty("line.separator");
		for (boolean workB[] : cells) {
			for (boolean workB2 : workB) {
				sb.append(workB2 ? 1 : 0);
			}
			sb.append(lf);
		}
		System.out.print(sb.toString());
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

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
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

	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
        }

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}