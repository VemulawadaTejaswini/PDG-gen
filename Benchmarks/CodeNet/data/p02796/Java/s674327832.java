import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.lang.*;


public class Main{
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		ArrayList<Pair> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(new Pair(sc.nextLong(), sc.nextLong()));
		}
		Collections.sort(list, new ComparatorByKey());
		int remove = 0;
		for (int i = 0; i < list.size() - 1; i++) {
			Pair a = list.get(i);
			Pair b = list.get(i + 1);
			if (a.key + a.value > b.key - b.value) {
				if (a.key + a.value > b.key + b.value) {
					list.remove(i);
					remove++;
				} else {
					list.remove(i + 1);
					remove++;
				}
				i--;
			}
		}
		System.out.println(n - remove);
	}
}

class Pair {
	public long key;
	public long value;
	public Pair(long key, long value) {
		this.key = key;
		this.value = value;
	}
}

class ComparatorByValue implements Comparator<Pair> {
	@Override
	public int compare(Pair sort1, Pair sort2) {
		if (sort1.value == sort2.value) {
			return 0;
		} else if (sort1.value > sort2.value) {
			return 1;
		} else {
			return -1;
		}
	}
}

class ComparatorByKey implements Comparator<Pair> {
	@Override
	public int compare(Pair sort1, Pair sort2) {
		if (sort1.key == sort2.key) {
			return 0;
		} else if (sort1.key > sort2.key) {
			return 1;
		} else {
			return -1;
		}
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
		if (hasNextByte()) {
			return buffer[ptr++];
		} else {
			return -1;
		}
	}
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
			ptr++;
		}
		return hasNextByte();
	}
	public String next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
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
		if (nl < Integer.MIN_VALUE || Integer.MAX_VALUE < nl) {
			throw new NumberFormatException();
		}
		return (int) nl;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
