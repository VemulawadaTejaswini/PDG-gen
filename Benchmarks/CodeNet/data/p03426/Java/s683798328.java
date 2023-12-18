import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		try (Scanner sc = new Scanner(System.in)) {

			int h = sc.nextInt();
			int w = sc.nextInt();
			int d = sc.nextInt();

			int[][] a = new int[h * w][2];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					a[sc.nextInt() - 1] = new int[] {i, j};
				}
			}

			int[] magic = new int[h * w];
			for (int i = 0; i + d < magic.length; i++) {

				int[] pos = a[i];
				int[] next = a[i + d];

				magic[i] = Math.abs(next[0] - pos[0]) + Math.abs(next[1] - pos[1]);

			}

			int q = sc.nextInt();
			for (int i = 0; i < q; i++) {

				int l = sc.nextInt();
				int r = sc.nextInt();
				int x = l;

				int m = 0;
				while (x != r) {

					m += magic[x - 1];

					x += d;

				}

				System.out.println(m);

			}

		}

	}

}
