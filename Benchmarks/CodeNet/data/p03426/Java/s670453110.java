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

			int q = sc.nextInt();
			for (int i = 0; i < q; i++) {

				int l = sc.nextInt();
				int r = sc.nextInt();
				int x = l;

				int[] pos = a[l - 1];

				int magic = 0;
				while (x != r) {

					x += d;

					int[] next = a[x - 1];

					magic += Math.abs(next[0] - pos[0]) + Math.abs(next[1] - pos[1]);

					pos = next;

				}

				System.out.println(magic);

			}

		}

	}

}
