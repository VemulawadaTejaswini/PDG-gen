import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		try (Scanner sc = new Scanner(System.in)) {

			int h = sc.nextInt();
			int w = sc.nextInt();
			int d = sc.nextInt();

			int[][] a = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					a[i][j] = sc.nextInt();
				}
			}

			int q = sc.nextInt();
			for (int i = 0; i < q; i++) {

				int l = sc.nextInt();
				int r = sc.nextInt();
				int x = l;

				int[] pos = pos(a, l);

				int magic = 0;
				while (x != r) {

					x += d;

					int[] next = pos(a, x);

					magic += Math.abs(next[0] - pos[0]) + Math.abs(next[1] - pos[1]);

					pos = next;

				}

				System.out.println(magic);

			}

		}

	}

	private static int[] pos(int[][] grid, int v) {

		int[] pos = null;

		for (int i = 0; i < grid.length; i++) {

			for (int j = 0; j < grid[i].length; j++) {

				if (v != grid[i][j]) {
					continue;
				}

				pos = new int[] {i, j};
				break;

			}

			if (null != pos) {
				break;
			}

		}

		return pos;

	}

}
