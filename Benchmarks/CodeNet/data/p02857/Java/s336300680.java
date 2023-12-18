import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

	void run() {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		String pre = "-1";
		String[] col = new String[2 * N];// 1(blue):-1(red)
		for (int i = 0; i < col.length; ++i)
			col[i] = "-1";
		for (int i = 0; i < 2 * N; ++i) {
			System.out.print("? ");
			for (int j = i; j < i + N; ++j) {
				System.out.print((j % (2 * N) + 1) + (j == i + N - 1 ? "\n" : " "));
			}
			String T = sc.next();
			if (pre.equals(T) || pre.equals("-1")) {
				pre = T;
				continue;
			} else {
				if (pre.equals("Blue")) {
					col[(i + N - 1) % (2 * N)] = "Red";
					col[(i - 1 + 2 * N) % (2 * N)] = "Blue";
				} else {
					col[(i + N - 1) % (2 * N)] = "Blue";
					col[(i - 1 + 2 * N) % (2 * N)] = "Red";
				}
				for (int j = 0; j < 2 * N; ++j) {
					if (!col[j].equals("-1") || (i <= j && j < i + N - 1))
						continue;
					System.out.print("?");
					for (int k = i; k < i + N - 1; ++k) {
						System.out.print((k % (2 * N) + 1) + " ");
					}
					System.out.println(j + 1);
					String U = sc.next();
					if (U.equals("Blue")) {
						col[j] = "Blue";
					} else {
						col[j] = "Red";
					}
				}
				ArrayList<Integer> lis = new ArrayList<>();
				int blue = 0, red = 0;
				for (int j = 0; j < 2 * N; ++j) {
					if (blue < N / 2 && col[j].equals("Blue")) {
						++blue;
						lis.add(j);
					} else if (red < N / 2 && col[j].equals("Red")) {
						++red;
						lis.add(j);
					}
				}
				for (int j = 0; j < 2 * N; ++j) {
					if (col[j].equals("-1")) {
						System.out.print("? ");
						for (int k = 0; k < lis.size(); ++k) {
							System.out.print((lis.get(k) + 1) + " ");
						}
						System.out.println(j + 1);
						String U = sc.next();
						if (U.equals("Blue")) {
							col[j] = "Blue";
						} else {
							col[j] = "Red";
						}
					}
				}
				break;
			}
		}
		System.out.print("! ");
		for (int i = 0; i < 2 * N; ++i) {
			System.out.print(col[i].equals("Red") ? "R" : "B");
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
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