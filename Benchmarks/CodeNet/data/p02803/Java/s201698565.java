import java.awt.Point;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int h = sc.nextInt();
		int w = sc.nextInt();
		int max = 0;

		//定数D4
		Point[] D4 = { new Point(0, -1), new Point(1, 0), new Point(0, 1), new Point(-1, 0) };

		char[][] c = new char[h][w];
		char[][] d = new char[h][w];

		for (int i = 0; i < h; i++) {
			String line = sc.next();
			for (int j = 0; j < w; j++) {
				c[i][j] = line.charAt(j);
			}
		}

		for (int sy = 0; sy < h; sy++) {
			for (int sx = 0; sx < w; sx++) {

				for (int i = 0; i < h; i++) {
					for (int j = 0; j < w; j++) {
						d[i][j] = c[i][j];
					}
				}

				Point start = new Point(sx, sy);

				if (d[sy][sx] == '#') {
					break;
				}

				//Queueを用意し、スタート地点を入れる
				Deque<Point> queue = new ArrayDeque<>();
				queue.add(start);

				//各地点のスタート地点からの距離を記録する二次元配列
				int[][] moves = new int[h][w];

				//スタート地点を"#"で埋めて、探索済みにする
				d[start.y][start.x] = '#';

				//幅優先探索
				while (queue.size() > 0) {

					//Queueの先頭の座標を取り出し＆削除して、その四方を探索する。
					Point p = queue.poll();

					for (int i = 0; i < 4; i++) {

						int x = p.x + D4[i].x;
						int y = p.y + D4[i].y;
						if ((x < 0 || y < 0) || (y >= h || x >= w))
							continue;

						if (d[y][x] == '.') {
							//"."であれば探索可能なので、Queueの末尾に追加する
							queue.add(new Point(x, y));

							//探索が終わった座標を"#"で埋めて、次回以降探索しないようにする
							d[y][x] = '#';

							//座標pからpの四方の座標への移動距離は、pまでの移動距離+1
							moves[y][x] = moves[p.y][p.x] + 1;

						}

					}

				}
				//ゴール地点に相当するmovesの値
				for (int i = 0; i < h; i++) {
					for (int j = 0; j < w; j++) {
						max = Math.max(max, moves[i][j]);
					}
				}

			}
		}
		System.out.println(max);

	}

	//以下、自作ライブラリ

	//階乗
	public static int fact(int n) {
		if (n == 1 || n == 0)
			return 1;
		else
			return n * fact(n - 1);
	}

	//指定した値以上の要素が最初に現れる位置
	//要素の数は+1（配列のズレ)
	public static long lowerBound(int n, long[] x, long y) {
		int left = 0;
		int right = n;
		while (left < right) {
			int mid = (left + right) / 2;
			if (x[mid] < y) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return left;
	}

	//指定した値より大きい要素が最初に現れる位置
	//要素の数は+1（配列のズレ)
	public static long upperBound(int n, long[] x, long y) {
		int left = 0;
		int right = n;
		while (left < right) {
			int mid = (left + right) / 2;
			if (x[mid] <= y) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return left;
	}

	//最大公約数
	public static long gcd(long a, long b) {
		if (a < b)
			return gcd(b, a);
		long c = 0;
		c = a % b;
		if (c == 0)
			return b;
		return gcd(b, c);
	}

	//最小公倍数
	public static long lcm(long m, long n) {
		return m * n / gcd(m, n);
	}

	//素数判定
	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;

		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}

//以下、高速スキャナークラス
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
