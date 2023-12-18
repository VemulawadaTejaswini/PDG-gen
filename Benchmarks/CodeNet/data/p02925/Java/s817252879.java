import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		long N = sc.nextLong();
		List<Deque<Long>> list = new ArrayList<>();
		List<Long> count = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			Deque<Long> q = new ArrayDeque<>();

			count.add(N - 1l);
			for (int j = 0; j < N - 1; j++) {
				q.add(sc.nextLong());
			}
			list.add(q);
		}
		int sum = 0;
		long size = N;
		while (true) {
			Set<Long> set = new HashSet<>();
			for (int i = 0; i < N; i++) {
				Deque<Long> q = list.get(i);
				if (q.isEmpty()) {
					size--;
					continue;
				}
				long val = q.getFirst();
				if (!set.contains(val)) {
					q.poll();
					set.add(val);
				}
			}
			if ((set.size() % 2 != 0) && !set.isEmpty()) {
				System.out.println(-1);
				return;
			} else if (size <= 0) {
				System.out.println(sum);
				return;
			} else {
				for (Long l : set) {
					long tmp = list.get(list.get(l.intValue()).element().intValue()).element();
					if(tmp != l) {
						System.out.println(-1);
					}
				}
				sum++;
			}
		}
	}

	public static class FastScanner {
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

		public boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		private void skipUnprintable() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr]))
				ptr++;
		}

		public boolean hasNext() {
			skipUnprintable();
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
	}
}
