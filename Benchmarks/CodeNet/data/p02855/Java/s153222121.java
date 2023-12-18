import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		FScanner sc = new FScanner();
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		char[][] SW = new char[H][W];
		for (int i = 0; i < H; i++) {
			String str = sc.next();
			for (int j = 0; j < W; j++) {
				char data = str.charAt(j);
				SW[i][j] = data;
			}
		}
		int[][] out = new int[H][W];
		int index = 1;
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (SW[i][j] == '#') {
					out[i][j] = index;
					index++;
				}
			}
		}
		int color = 1;
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (SW[i][j] == '#') {
					int leftIndex = j;
					// 左を塗る
					for (int left = j - 1; left > 0; left--) {
						if (out[i][left] == 0) {
							out[i][left] = color;
							leftIndex = left;
						} else {
							break;
						}
					}
					int rightIndex = j;
					// 右を塗る
					for (int right = j + 1; right < W; right++) {
						if (out[i][right] == 0) {
							out[i][right] = color;
							rightIndex = right;
						} else {
							break;
						}
					}
					boolean upperFlg = true;
					// 上を塗る
					for (int over = i - 1; over >= 0; over--) {
						for (int location = leftIndex; location <= rightIndex; location++) {
							if (out[over][location] == 0) {
								out[over][location] = color;
							} else {
								for (int prevlocation = leftIndex; prevlocation <= rightIndex; prevlocation++) {
									if (out[over][prevlocation] == color) {
										out[over][prevlocation] = 0;
									}
								}
								upperFlg = false;
								break;
							}
							if (!upperFlg) {
								break;
							}
						}
						if (!upperFlg) {
							break;
						}
					}
					boolean underFlg = true;
					//下を塗る
					for (int under = i + 1; under < H; under++) {
						for (int location = leftIndex; location <= rightIndex; location++) {
							if (out[under][location] == 0) {
								out[under][location] = color;
							} else {
								for (int prevlocation = leftIndex; prevlocation <= rightIndex; prevlocation++) {
									if (out[under][prevlocation] == color) {
										out[under][prevlocation] = 0;
									}
								}
								underFlg = false;
								break;
							}
							if (!underFlg) {
								break;
							}
						}
						if (!underFlg) {
							break;
						}
					}
					color++;
				}
			}
		}
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				System.out.print(out[i][j]);
			}
			System.out.println();
		}
	}
}

class FScanner {
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

	private boolean isPrintableChar(int c) {
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