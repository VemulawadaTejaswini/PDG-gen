import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int K = sc.nextInt();
		long[] A = nextLongArray(sc, X);
		long[] B = nextLongArray(sc, Y);
		long[] C = nextLongArray(sc, Z);
		boolean[][][] d = new boolean[X][Y][Z];
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		int ix = A.length - 1;
		int iy = B.length - 1;
		int iz = C.length - 1;

		// 最大値を表示
		System.out.println(A[ix] + B[iy] + C[iz]);
		K--;

		List<Point> list = new ArrayList<>();
		while (K > 0) {
			int cx = ix - 1;
			int cy = iy - 1;
			int cz = iz - 1;
			if (cx >= 0 && !d[cx][iy][iz]) {
				list.add(new Point(cx, iy, iz, A[cx] + B[iy] + C[iz]));
				d[cx][iy][iz] = true;
			}
			if (cy >= 0 && !d[ix][cy][iz]) {
				list.add(new Point(ix, cy, iz, A[ix] + B[cy] + C[iz]));
				d[ix][cy][iz] = true;
			}
			if (cz >= 0 && !d[ix][iy][cz]) {
				list.add(new Point(ix, iy, cz, A[ix] + B[iy] + C[cz]));
				d[ix][iy][cz] = true;
			}
			if (!list.isEmpty()) {
				Collections.sort(list);
				Point point = list.get(list.size() - 1);
				list.remove(list.size() - 1);
				System.out.println(point.value);
				ix = point.x;
				iy = point.y;
				iz = point.z;
			}
			K--;
		}

	}

	private static long[] nextLongArray(FastScanner sc, int x) {
		long[] array = new long[x];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextLong();
		}
		return array;
	}

}

class Point implements Comparable<Point> {
	public Point(int x, int y, int z, long l) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.value = l;
	}

	int x;
	int y;
	int z;
	long value;

	@Override
	public int compareTo(Point o) {
		if (value > o.value) {
			return 1;
		} else if (value == o.value) {
			return 0;
		}
		return -1;
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
