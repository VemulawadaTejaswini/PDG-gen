import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public final class Main {

	static final FastScanner sc = new FastScanner(System.in);
	static PrintWriter writer = new PrintWriter(System.out);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int Q = sc.nextInt();
		ArrayList<State> ss = new ArrayList<>(N * 2 + Q);
		for (int i = 0; i < N; i++) {
			int S = sc.nextInt();
			int T = sc.nextInt();
			int X = sc.nextInt();
			ss.add(new State(S - X, X, -2));
			ss.add(new State(T - X, X, -1));
		}
		for (int i = 0; i < Q; i++) {
			int D = sc.nextInt();
			ss.add(new State(D, 0, i));
		}
		Collections.sort(ss);
		int[] ans = new int[Q];
		TreeSet<Integer> stop = new TreeSet<>();
		for (int i = 0; i < ss.size(); i++) {
			State s = ss.get(i);
			if (s.v == -2) {
				stop.add(s.d);
			} else if (s.v == -1) {
				stop.remove(s.d);
			} else {
				ans[s.v] = stop.isEmpty() ? -1 : stop.first();
			}
		}
		for (int i = 0; i < Q; i++) {
			writer.println(ans[i]);
		}
		writer.flush();
	}

	static class State implements Comparable<State> {
		int t, d, v;

		State(int t, int d, int v) {
			this.t = t;
			this.d = d;
			this.v = v;
		}

		@Override
		public int compareTo(State o) {
			return Integer.compare(this.t, o.t);
		}
	}
	static class FastScanner {
		Reader input;

		FastScanner() {
			this(System.in);
		}

		FastScanner(InputStream stream) {
			this.input = new BufferedReader(new InputStreamReader(stream));
		}

		int nextInt() {
			return (int) nextLong();
		}

		long nextLong() {
			try {
				int sign = 1;
				int b = input.read();
				while ((b < '0' || '9' < b) && b != '-' && b != '+') {
					b = input.read();
				}
				if (b == '-') {
					sign = -1;
					b = input.read();
				} else if (b == '+') {
					b = input.read();
				}
				long ret = b - '0';
				while (true) {
					b = input.read();
					if (b < '0' || '9' < b) return ret * sign;
					ret *= 10;
					ret += b - '0';
				}
			} catch (IOException e) {
				e.printStackTrace();
				return -1;
			}
		}

		double nextDouble() {
			try {
				double sign = 1;
				int b = input.read();
				while ((b < '0' || '9' < b) && b != '-' && b != '+') {
					b = input.read();
				}
				if (b == '-') {
					sign = -1;
					b = input.read();
				} else if (b == '+') {
					b = input.read();
				}
				double ret = b - '0';
				while (true) {
					b = input.read();
					if (b < '0' || '9' < b) break;
					ret *= 10;
					ret += b - '0';
				}
				if (b != '.') return sign * ret;
				double div = 1;
				b = input.read();
				while ('0' <= b && b <= '9') {
					ret *= 10;
					ret += b - '0';
					div *= 10;
					b = input.read();
				}
				return sign * ret / div;
			} catch (IOException e) {
				e.printStackTrace();
				return Double.NaN;
			}
		}

		char nextChar() {
			try {
				int b = input.read();
				while (Character.isWhitespace(b)) {
					b = input.read();
				}
				return (char) b;
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}

		String nextStr() {
			try {
				StringBuilder sb = new StringBuilder();
				int b = input.read();
				while (Character.isWhitespace(b)) {
					b = input.read();
				}
				while (b != -1 && !Character.isWhitespace(b)) {
					sb.append((char) b);
					b = input.read();
				}
				return sb.toString();
			} catch (IOException e) {
				e.printStackTrace();
				return "";
			}
		}

	}

}