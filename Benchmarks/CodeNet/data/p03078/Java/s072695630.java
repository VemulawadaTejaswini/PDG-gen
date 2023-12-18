import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.HashSet;

class CakeData {
  Long[] A;
  Long[] B;
  Long[] C;
  HashSet<Integer> checked;
  
  public CakeData(FastScanner sc, int X, int Y, int Z, int K) {
        // 入力
    	A = sc.nextLongArray(sc, X);
		B = sc.nextLongArray(sc, Y);
		C = sc.nextLongArray(sc, Z);
    
        // 降順でソート
		Arrays.sort(A, Collections.reverseOrder());
		Arrays.sort(B, Collections.reverseOrder());
		Arrays.sort(C, Collections.reverseOrder());
    
    	// 作成済みチェック用ハッシュセット
        checked = new HashSet<>(K + 10);
  }
  
  public CakeSet createCakeSet(int i, int j, int k) {
    checked.add(buildCakeSetID(i, j, k));
    return new CakeSet(i, j, k, A[i] + B[j] + C[k]);
  }

  public boolean isCreatedCakeSet(int i, int j, int k) {
    return checked.contains(buildCakeSetID(i, j, k));
  }
  
  private int buildCakeSetID(int i, int j, int k) {
    return i * 1000 * 1000 + j * 1000 + k;
  }
}

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
      // 入力
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int K = sc.nextInt();
        CakeData cd = new CakeData(sc, X, Y, Z, K);
      
      // 美味しさの合計値を格納する優先度付きキュー
		PriorityQueue<CakeSet> queue = new PriorityQueue<>(K + 10);
		queue.offer(cd.createCakeSet(0, 0, 0));

        int ix;
		int iy;
		int iz;
		int cx;
		int cy;
		int cz;

		PrintWriter out = new PrintWriter(System.out);
		while (K > 0) {
			CakeSet point = queue.poll();
			out.println(point.value);

			ix = point.x;
			iy = point.y;
			iz = point.z;

			cx = ix + 1;
			cy = iy + 1;
			cz = iz + 1;

			if (cx < X && !cd.isCreatedCakeSet(cx, iy, iz)) {
				queue.offer(cd.createCakeSet(cx, iy, iz));
			}
			if (cy < Y && !cd.isCreatedCakeSet(ix, cy, iz)) {
				queue.offer(cd.createCakeSet(ix, cy, iz));
			}
			if (cz < Z && !cd.isCreatedCakeSet(ix, iy, cz)) {
				queue.offer(cd.createCakeSet(ix, iy, cz));
			}

			K--;
		}

		out.flush();
	}
}

class CakeSet implements Comparable<CakeSet> {
	public CakeSet(int x, int y, int z, Long l) {
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
	public int compareTo(CakeSet o) {
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
    
    public Long[] nextLongArray(FastScanner sc, int x) {
		Long[] array = new Long[x];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextLong();
		}
		return array;
	}
}
