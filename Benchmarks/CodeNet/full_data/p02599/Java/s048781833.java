import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

/**
 * 解説通りに実装したソースコード
 * 
 * https://atcoder.jp/contests/abc174/submissions/15644133 と https://atcoder.jp/contests/abc174/submissions/15644479
 * にも参考<br/>
 * java.util.Scanner が遅いため、https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb のScannerを使用
 */
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), q = scanner.nextInt();
			int[] c = new int[n];
			IntStream.range(0, n).forEach(i -> c[i] = scanner.nextInt());
			Queue<Query> queue = new PriorityQueue<>();
			IntStream.range(0, q).forEach(i -> {
				int l = scanner.nextInt(), r = scanner.nextInt();
				queue.add(new Query(i, l, r));
			});
			BinaryIndexedTree bit = new BinaryIndexedTree(n + 1);
			int[] answers = new int[q], indexes = new int[n + 1];
			Arrays.fill(indexes, 0);
			for (int i = 0; i < n; i++) {
				if (indexes[c[i]] > 0) {
					bit.add(indexes[c[i]], -1);
				}
				bit.add(i + 1, 1);
				indexes[c[i]] = i + 1;
				while (!queue.isEmpty() && (i + 1 == queue.peek().right)) {
					Query query = queue.poll();
					answers[query.index] = bit.sum(query.left, query.right);
				}
				if (queue.isEmpty()) {
					break;
				}
			}
			Arrays.stream(answers).forEach(System.out::println);
		}
	}

	private static class Query implements Comparable<Query> {
		int index;
		int left;
		int right;

		Query(int index, int left, int right) {
			super();
			this.index = index;
			this.left = left;
			this.right = right;
		}

		@Override
		public int compareTo(Query o) {
			return this.right - o.right;
		}
	}

	private static class BinaryIndexedTree {
		int size;
		int[] data;

		BinaryIndexedTree(int size) {
			super();
			this.size = size;
			data = new int[size];
			Arrays.fill(data, 0);
		}

		void add(int index, int value) {
			for (int i = index; i < size; i += (i & -i)) {
				data[i] += value;
			}
		}

		int sum(int index) {
			int sum = 0;
			for (int i = index; i > 0; i -= (i & -i)) {
				sum += data[i];
			}
			return sum;
		}

		int sum(int from, int to) {
			return sum(to) - sum(from - 1);
		}
	}

	private static class Scanner implements Closeable {
		private InputStreamReader isr;
		private BufferedReader reader;
		private StringTokenizer tokenizer;

		Scanner(InputStream in) {
			isr = new InputStreamReader(in);
			reader = new BufferedReader(isr);
			tokenizer = null;
		}

		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		@SuppressWarnings("unused")
		public String nextLine() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					return reader.readLine();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}

			return tokenizer.nextToken("\n");
		}

		@SuppressWarnings("unused")
		public long nextLong() {
			return Long.parseLong(next());
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		@SuppressWarnings("unused")
		public double nextDouble() {
			return Double.parseDouble(next());
		}

		@Override
		public void close() {
			if (null != isr) {
				try {
					isr.close();
				} catch (IOException e) {
					// 何もしない
					;
				}
			}
			if (null != reader) {
				try {
					reader.close();
				} catch (IOException e) {
					// 何もしない
					;
				}
			}
		}
	}
}
