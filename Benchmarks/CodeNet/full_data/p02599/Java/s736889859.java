import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 解説通りに実装したソースコード
 * 
 * https://atcoder.jp/contests/abc174/submissions/15644133 と https://atcoder.jp/contests/abc174/submissions/15644479
 * にも参考
 */
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), q = scanner.nextInt();
			int[] c = new int[n];
			IntStream.range(0, n).forEach(i -> c[i] = scanner.nextInt());
			Query[] queries = new Query[q];
			IntStream.range(0, q).forEach(i -> {
				int l = scanner.nextInt(), r = scanner.nextInt();
				queries[i] = new Query(i, l, r);
			});
			Arrays.sort(queries);
			BinaryIndexedTree bit = new BinaryIndexedTree(n + 1);
			int[] answers = new int[q], indexes = new int[n + 1];
			Arrays.fill(indexes, 0);
			int queryIndex = 0;
			for (int i = 0; i < n; i++) {
				if (indexes[c[i]] > 0) {
					bit.add(indexes[c[i]], -1);
				}
				bit.add(i + 1, 1);
				indexes[c[i]] = i + 1;
				while ((queryIndex < q) && (i + 1 == queries[queryIndex].right)) {
					answers[queries[queryIndex].index] = bit.sum(queries[queryIndex].left, queries[queryIndex].right);
					queryIndex++;
				}
				if (queryIndex >= q) {
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
}
