import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		FScanner sc = new FScanner();
		long N = sc.nextLong();
		List<Integer> list = new ArrayList<Integer>();
		int[] n = new int[(int) N];
		for (int i = 0; i < N; i++) {
			n[i] = sc.nextInt();
		}
		for (long i = 0; i < N; i++) {
			int num = n[(int) i];
			int j = LowerBoundCollection(list, num);
			if (list.size() == 0) {
				list.add(num);
				continue;
			}
			if (list.size() < j || j > 0) {
				list.set(j - 1, num);
			} else {
				list.add(0, num);
			}
		}
		System.out.println(list.size());
	}

	public static int LowerBoundCollection(List<Integer> ary, int target) {
		int result = Collections.binarySearch(ary, target, new LowerBoundComparator<>());
		int insertionPoint = (result >= 0) ? result : ~result;
		return insertionPoint;
	}

	public static class LowerBoundComparator<T extends Comparable<? super T>>
			implements Comparator<T> {
		public int compare(T x, T y) {
			return (x.compareTo(y) >= 0) ? 1 : -1;
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