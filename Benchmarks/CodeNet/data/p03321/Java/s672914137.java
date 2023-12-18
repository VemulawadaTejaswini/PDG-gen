import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.TreeSet;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskE solver = new TaskE();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskE {
		public void solve(int testNumber, Scanner sc, PrintWriter out) {

			int n = sc.nextInt();
			int m = sc.nextInt();

			ArrayList<HashSet<Integer>> to = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				to.add(new HashSet<>());
			}
			for (int i = 0; i < m; i++) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				to.get(a).add(b);
				to.get(b).add(a);
			}

			TreeSet<Integer> cities = new TreeSet<>();
			for (int i = 0; i < n; i++) {
				cities.add(i);
			}

			boolean[] visited = new boolean[n];
			HashSet<Integer> tks = new HashSet<>();
			TreeSet<Integer> tksCand = new TreeSet<>();
			int city = cities.pollFirst();
			visited[city] = true;
			tks.add(city);
			tksCand.addAll(to.get(city));
			loop:
			while (!tksCand.isEmpty()) {
				int cand = tksCand.pollFirst();
				visited[cand] = true;
				for (int c : tks) {
					if (!to.get(c).contains(cand)) {
						continue loop;
					}
				}
				tks.add(cand);
				cities.remove(cand);
				for (int i : to.get(cand)) {
					if (!visited[i]) tksCand.add(i);
				}
			}

			visited = new boolean[n];
			HashSet<Integer> hss = new HashSet<>();
			TreeSet<Integer> hssCand = new TreeSet<>();
			city = cities.pollFirst();
			visited[city] = true;
			hss.add(city);
			for (int i : to.get(city)) {
				if (!tks.contains(i)) hssCand.add(i);
			}
			loop:
			while (!hssCand.isEmpty()) {
				int cand = hssCand.pollFirst();
				visited[cand] = true;
				for (int c : hss) {
					if (!to.get(c).contains(cand)) {
						continue loop;
					}
				}
				hss.add(cand);
				cities.remove(cand);
				for (int i : to.get(cand)) {
					if (!visited[i] && !tks.contains(i)) hssCand.add(i);
				}
			}

			if (cities.size() > 0) {
				out.println(-1);
			} else {
				int ts = tks.size();
				int hs = hss.size();
				out.println(ts * (ts - 1) / 2 + hs * (hs - 1) / 2);
			}

		}

	}

	static class Scanner {
		private final InputStream in;
		private final byte[] buffer;
		private int ptr;
		private int buflen;

		public Scanner(InputStream in) {
			this.in = in;
			this.buffer = new byte[1024];
			this.ptr = 0;
			this.buflen = 0;
		}

		private boolean hasNextByte() {
			if (ptr < buflen) return true;
			else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) return false;
			}
			return true;
		}

		private byte readByte() {
			if (hasNextByte()) return buffer[ptr++];
			return -1;
		}

		private boolean isPrintableChar(byte c) {
			return '!' <= c && c <= '~';
		}

		private void skipUnprintable() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
				ptr++;
			}
		}

		public boolean hasNext() {
			skipUnprintable();
			return hasNextByte();
		}

		public int nextInt() {
			if (!hasNext()) throw new NoSuchElementException();
			int n = 0;
			boolean minus = false;
			byte b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) throw new NumberFormatException();
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

