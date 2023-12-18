import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	private static final int MOD = 1000000007;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		char[] s = sc.next().toCharArray();
		char[] t = new char[Q];
		char[] d = new char[Q];
		for (int i = 0; i < Q; i++) {
			t[i] = sc.next().charAt(0);
			d[i] = sc.next().charAt(0);
		}

		long[] status = new long[s.length];
		Arrays.fill(status, 1);

		Map<Character, Set<Integer>> map = new HashMap<>();
		for (int i = 0; i < s.length; i++) {
			Set<Integer> list = map.get(s[i]);
			if (list == null) {
				list = new HashSet<>();
			}
			list.add(i);
			map.put(s[i], list);
		}

		for (int i = 0; i < Q; i++) {
			Set<Integer> set = map.get(t[i]);
			if (set == null) {
				continue;
			}

			if (d[i] == 'L') {
				Integer[] array = set.toArray(new Integer[set.size()]);
				Arrays.sort(array);

				for (int j = 0; j < array.length; j++) {
					int index = array[j];
					if (index > 0) {
						status[index - 1] += status[index];
						map.get(s[index - 1]).add(index - 1);
					}
					set.remove(index);
					status[index] = 0;
				}
			} else {
				Integer[] array = set.toArray(new Integer[set.size()]);
				Arrays.sort(array);

				for (int j = array.length - 1; j >= 0; j--) {
					int index = array[j];
					if (index < s.length - 1) {
						status[index + 1] += status[index];
						map.get(s[index + 1]).add(index + 1);
					}
					set.remove(index);
					status[index] = 0;
				}
			}
		}

		long count = 0;
		for (long ss : status) {
			count += ss;
		}

		System.out.println(count);
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