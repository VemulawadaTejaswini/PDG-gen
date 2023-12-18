import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	private static final int MOD = 1000000007;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		int t = sc.nextInt();
		int[] u = new int[m];
		int[] v = new int[m];
		int[] a = new int[m];
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			u[i] = sc.nextInt();
			v[i] = sc.nextInt();
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		Map<Integer, List<Rail>> map = new HashMap<>();
		for (int i = 0; i < m; i++) {
			int index = i;
			map.compute(u[index], (key, list) -> {
				if (list == null) {
					list = new ArrayList<>();
				}
				list.add(new Rail(v[index], a[index], b[index]));
				return list;
			});
			map.compute(v[index], (key, list) -> {
				if (list == null) {
					list = new ArrayList<>();
				}
				list.add(new Rail(u[index], a[index], b[index]));
				return list;
			});
		}

		Outer: for (int year = 0; year < n; year++) {
			Queue<State> queue = new PriorityQueue<>(Comparator.comparingLong(State::getMoney).reversed());
			queue.add(new State(1000000000000000L, s, s, false));
			while (!queue.isEmpty()) {
				State current = queue.remove();
				if (current.index == t) {
					if (current.snuuk || current.index > year) {
						System.out.println(current.money);
						continue Outer;
					}
				}

				List<Rail> list = map.get(current.index);
				if (list == null) {
					continue;
				}
				for (Rail r : list) {
					if (r.next == current.prev) {
						continue;
					}

					long money = current.money - (current.snuuk ? r.b : r.a);
					queue.add(new State(money, current.index, r.next, current.snuuk));

					// 両替
					if (!current.snuuk) {
						if (current.index > year) {
							queue.add(new State(current.money - r.b, current.index, r.next, true));
						}

						// 寄り道するパターン
						for (Rail r2 : list) {
							if (r2.next == r.next || r2.next == current.prev) {
								continue;
							}
							queue.add(new State(current.money - r2.a - r2.b - r.b, current.index, r.next, true));
						}
					}
				}
			}
			debug("failed.");
		}
	}

	private static class Rail {
		public int next;
		public int a;
		public int b;

		public Rail(int next, int a, int b) {
			this.next = next;
			this.a = a;
			this.b = b;
		}
	}

	private static class State {
		public long money;
		public int prev;
		public int index;
		public boolean snuuk;

		public State(long money, int prev, int index, boolean snuuk) {
			this.money = money;
			this.prev = prev;
			this.index = index;
			this.snuuk = snuuk;
		}

		public long getMoney() {
			return money;
		}

		@Override
		public String toString() {
			return "State [money=" + money + ", index=" + index + ", snuuk=" + snuuk + "]";
		}
	}

	private static HashMap<Integer, Long> map = new HashMap<>();

	private static long fact(int x) {
		Long value = map.get(x);
		if (value != null) {
			return value;
		}

		long v = 1;
		for (int i = 1; i <= x; i++) {
			v *= i;
			map.put(i, v);
		}

		return v;
	}

	private static boolean isDebug = System.getProperty("sun.desktop") != null;

	private static void debug(Object... o) {
		if (isDebug) {
			System.err.println(Arrays.deepToString(o));
		}
	}

	public static class Scanner {
		private BufferedInputStream inputStream;

		public Scanner(InputStream in) {
			inputStream = new BufferedInputStream(in);
		}

		public int nextInt() throws IOException {
			int num = 0;

			int read = skip();
			do {
				num = num * 10 + (read - 0x30);
			} while ((read = inputStream.read()) > 0x20);

			return num;
		}

		public void fill(int[] a) throws IOException {
			for (int i = 0; i < a.length; i++) {
				a[i] = nextInt();
			}
		}

		public void fill(int[] a, int[] b) throws IOException {
			if (a.length != b.length) {
				throw new IllegalArgumentException();
			}

			for (int i = 0; i < a.length; i++) {
				a[i] = nextInt();
				b[i] = nextInt();
			}
		}

		public long nextLong() throws IOException {
			long num = 0;

			int read = skip();
			do {
				num = num * 10 + (read - 0x30);
			} while ((read = inputStream.read()) > 0x20);

			return num;
		}

		public void fill(long[] a) throws IOException {
			for (int i = 0; i < a.length; i++) {
				a[i] = nextLong();
			}
		}

		public void fill(long[] a, long[] b) throws IOException {
			if (a.length != b.length) {
				throw new IllegalArgumentException();
			}

			for (int i = 0; i < a.length; i++) {
				a[i] = nextLong();
				b[i] = nextLong();
			}
		}

		public long[] nextLong(int n) throws IOException {
			long[] array = new long[n];
			for (int i = 0; i < n; i++) {
				array[i] = nextLong();
			}

			return array;
		}

		public String next() throws IOException {
			StringBuilder builder = new StringBuilder();

			int read = skip();
			do {
				builder.append((char) read);
			} while ((read = inputStream.read()) > 0x20);

			return builder.toString();
		}

		private int skip() throws IOException {
			int read;
			while ((read = inputStream.read()) <= 0x20)
				;

			return read;
		}
	}
}