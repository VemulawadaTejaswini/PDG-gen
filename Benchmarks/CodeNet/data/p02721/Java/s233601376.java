import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;

class Main {

	public static void main(String[] args) {
		final FastScanner sc = new FastScanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int c = sc.nextInt();
		char[] s = sc.next().toCharArray();

		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (s[i] == 'o') a.add(i);
		}

		if (c == 0 && a.size() > 1) {
			return;
		}

		List<Integer>[] prev = new List[a.size()];
		for (int i = 0; i < a.size(); i++) {
			prev[i] = new ArrayList<>();
		}

		int last = -1;
		for (int i = 0; i < a.size() - 1; i++) {
			int index = lowerBound(a, a.get(i) + c + 1);
			if (index == a.size()) continue;
			last = Math.max(last, index);
			prev[index].add(i);
		}

		if (last == -1) {
			return;
		}

		boolean ok = false;
		boolean one = true;
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[]{last, 1});
		List<Integer> answer = new ArrayList<>();

		boolean addLast = true;
		if (last != a.size() - 1) {
			for (int p : prev[last]) {
				if (a.get(p) + c <= a.get(last + 1)) {
					addLast = false;
					break;
				}
			}
		}

		if (addLast) answer.add(a.get(last));

		while (!q.isEmpty()) {
			int[] x = q.poll();
			if (x[1] >= k) ok = true;
			if (one && prev[x[0]].size() == 1) {
				answer.add(a.get(prev[x[0]].get(0)));
			}
			if (prev[x[0]].size() > 1) one = false;
			for (int next : prev[x[0]]) {
				q.offer(new int[]{next, x[1] + 1});
			}
		}

		if (!ok) return;
		Collections.sort(answer);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < answer.size(); i++) {
			sb.append(answer.get(i) + 1).append("\n");
		}

		System.out.print(sb);
	}

	private static int lowerBound(List<Integer> a, long x) {
		int l = -1, r = a.size() - 1;
		while (r - l > 1) {
			int m = (l + r) / 2;
			if (x <= a.get(m)) r = m;
			else l = m;
		}
		if (r == a.size() - 1 && a.get(r) < x) r++;
		return r;
	}


	static class FastScanner {
		private final InputStream in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

		public FastScanner(InputStream source) {
			in = source;
		}

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
			if (hasNextByte()) return buffer[ptr++];
			else return -1;
		}

		private static boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
			return hasNextByte();
		}

		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public long nextLong() {
			if (!hasNext()) throw new NoSuchElementException();
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
}
