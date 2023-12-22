import static java.util.Arrays.binarySearch;

import java.io.IOException;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		int n = nextInt();
		int m = nextInt();
		int[] xs = new int[n];
		int[] ys = new int[n];
		for (int i = 0; i < n; i++) {
			xs[i] = nextInt();
			ys[i] = nextInt();
		}

		TreeSet<Integer> xTreeSet = new TreeSet<Integer>();
		TreeSet<Integer> yTreeSet = new TreeSet<Integer>();

		for (int i = 0; i < n; i++) {
			xTreeSet.add(xs[i]);
			yTreeSet.add(ys[i]);
		}
		xTreeSet.add((int) Integer.MAX_VALUE);
		xTreeSet.add((int) Integer.MIN_VALUE);
		yTreeSet.add((int) Integer.MAX_VALUE);
		yTreeSet.add((int) Integer.MIN_VALUE);

		Integer[] xIntegers = xTreeSet.toArray(new Integer[0]);
		Integer[] yIntegers = yTreeSet.toArray(new Integer[0]);

		int w = xIntegers.length;
		int h = yIntegers.length;

		int[][] location = new int[h + 1][w + 1];

		for (int i = 0; i < n; i++) {
			int x = binarySearch(xIntegers, xs[i]);
			int y = binarySearch(yIntegers, ys[i]);
			location[y + 1][x + 1]++;
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				location[i + 1][j + 1] += location[i + 1][j] + location[i][j + 1] - location[i][j];
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			// TreeSet.ceiling(e)...e以上の1番小さい要素を返す
			// TreeSet.floor(e)...e以下の1番大きい要素を返す
			int x1 = binarySearch(xIntegers, xTreeSet.ceiling(nextInt()));
			int y1 = binarySearch(yIntegers, yTreeSet.ceiling(nextInt()));
			int x2 = binarySearch(xIntegers, xTreeSet.floor(nextInt())) + 1;
			int y2 = binarySearch(yIntegers, yTreeSet.floor(nextInt())) + 1;
			sb.append(location[y2][x2] - location[y1][x2] - location[y2][x1] + location[y1][x1]);
			sb.append('\n');
		}
		System.out.print(sb.toString());
	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}

}