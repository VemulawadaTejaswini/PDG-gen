import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
      // 入力
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int K = sc.nextInt();
		Long[] A = nextLongArray(sc, X);
		Long[] B = nextLongArray(sc, Y);
		Long[] C = nextLongArray(sc, Z);
      
      if (K == 1) {
        System.out.println(A[0] + B[0] + C[0]);
        return;
      }
      
      // 降順でソート
		Arrays.sort(A, Collections.reverseOrder());
		Arrays.sort(B, Collections.reverseOrder());
		Arrays.sort(C, Collections.reverseOrder());
      
      // 美味しさの合計値を格納する優先度付きキュー
		PriorityQueue<Point> queue = new PriorityQueue<>(K + 10);
		queue.offer(new Point(0, 0, 0, A[0] + B[0] + C[0]));
      
      // 追加済みチェック用セット
		HashSet<Integer> checked = new HashSet<>(K + 10);
		checked.add(0);

        int ix;
		int iy;
		int iz;
		int cx;
		int cy;
		int cz;

		PrintWriter out = new PrintWriter(System.out);
		while (K > 0) {
			Point point = queue.poll();
			out.println(point.value);

			ix = point.x;
			iy = point.y;
			iz = point.z;

			cx = ix + 1;
			cy = iy + 1;
			cz = iz + 1;

			if (cx < X && !checked.contains(cx * 100 * 100 + iy * 100 + iz)) {
				queue.offer(new Point(cx, iy, iz, A[cx] + B[iy] + C[iz]));
				checked.add(cx * 100 * 100 + iy * 100 + iz);
			}
			if (cy < Y && !checked.contains(ix * 100 * 100 + cy * 100 + iz)) {
				queue.offer(new Point(ix, cy, iz, A[ix] + B[cy] + C[iz]));
				checked.add(ix * 100 * 100 + cy * 100 + iz);
			}
			if (cz < Z && !checked.contains(ix * 100 * 100 + iy * 100 + cz)) {
				queue.offer(new Point(ix, iy, cz, A[ix] + B[iy] + C[cz]));
				checked.add(ix * 100 * 100 + iy * 100 + cz);
			}

			K--;
		}

		out.flush();
	}

	private static Long[] nextLongArray(FastScanner sc, int x) {
		Long[] array = new Long[x];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextLong();
		}
		return array;
	}

}

class Point implements Comparable<Point> {
	public Point(int x, int y, int z, Long l) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.value = l;
	}

	int x;
	int y;
	int z;
	Long value;

	@Override
	public int compareTo(Point o) {
		return o.value.compareTo(value);
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
