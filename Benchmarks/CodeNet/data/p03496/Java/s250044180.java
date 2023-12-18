import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		FastScanner scanner = new FastScanner(System.in);
		int size = (int) scanner.nextInt();
		int[] nums = scanner.nextIntArray(size);

		List<Point> list = new ArrayList<>();

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int maxIndex = -1;
		int minIndex = -1;

		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			if (num > max) {
				max = num;
				maxIndex = i;
			}
			if (num < min) {
				min = num;
				minIndex = i;
			}
		}

		boolean isAllNeg = true;
		if (min >= 0 || max <= 0) {
			// all positives or all negatives
		} else {
			int value = min;
			int valueIndex = minIndex;
			if (Math.abs(min) <= Math.abs(max)) {
				value = max;
				valueIndex = maxIndex;
				isAllNeg = false;
			}
			for (int i = 0; i < nums.length; i++) {
				nums[i] += value;
				list.add(new Point(valueIndex, i));
			}
		}

		if (!isAllNeg) {
			for (int i = 1; i < nums.length; i++) {
				if (nums[i - 1] > nums[i]) {
					nums[i] += nums[i - 1];
					list.add(new Point(i - 1, i));
				}
			}
		} else {
			for (int i = nums.length - 2; i >= 0; i--) {
				if (nums[i] > nums[i + 1]) {
					nums[i] += nums[i + 1];
					list.add(new Point(i + 1, i));
				}
			}
		}

		System.out.println(list.size());
		list.forEach(p -> {
			System.out.println((p.x + 1) + " " + (p.y + 1));
		});
	}

	static class FastScanner {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;

		public FastScanner(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
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

		public long nextLong() {
			return Long.parseLong(next());
		}

		public long nextInt() {
			return Integer.parseInt(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = (int) nextInt();
			return a;
		}

		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}
	}
}