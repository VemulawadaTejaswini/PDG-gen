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

		TreeSet<Integer> xSet = new TreeSet<Integer>();
		TreeSet<Integer> ySet = new TreeSet<Integer>();

		for (int i = 0; i < n; i++) {
			xSet.add(xs[i]);
			ySet.add(ys[i]);
		}
		xSet.add((int) 1e9);
		ySet.add((int) 1e9);
		xSet.add((int) -1e9);
		ySet.add((int) -1e9);

		Integer[] xss = xSet.toArray(new Integer[0]);
		Integer[] yss = ySet.toArray(new Integer[0]);

		int w = xss.length;
		int h = yss.length;

		int[][] a = new int[h + 1][w + 1];
		for (int i = 0; i < n; i++) {
			int x = binarySearch(xss, xs[i]);
			int y = binarySearch(yss, ys[i]);
			a[y + 1][x + 1]++;
		}

		for (int j = 0; j < h; j++) {
			for (int i = 0; i < w; i++) {
				a[j + 1][i + 1] += a[j + 1][i] + a[j][i + 1] - a[j][i];
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			int x1 = binarySearch(xss, xSet.ceiling(nextInt()));
			int y1 = binarySearch(yss, ySet.ceiling(nextInt()));
			int x2 = binarySearch(xss, xSet.floor(nextInt())) + 1;
			int y2 = binarySearch(yss, ySet.floor(nextInt())) + 1;
			sb.append(a[y2][x2] - a[y1][x2] - a[y2][x1] + a[y1][x1]);
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