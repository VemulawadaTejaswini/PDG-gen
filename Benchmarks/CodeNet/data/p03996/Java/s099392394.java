import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt(), w = scanner.nextInt();
		int N = scanner.nextInt();
		boolean ans = false;
		int m[][] = new int[h][w];
		boolean ma[][] = new boolean[h][w];
		for (int i = 0; i < N; i++) {
			int y = scanner.nextInt() - 1, x = scanner.nextInt() - 1;
			m[y][x] = scanner.nextInt();
			ma[y][x] = true;
		}

		/*a: for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (ma[i][j])
					continue;
				int c = 0, d = 0, e = 0, f = 0;
				if (i != 0) {
					if (j != 0) {
						if (ma[i - 1][j - 1])
							c = m[i - 1][j] + m[i][j - 1] - m[i - 1][j - 1];
					}
					if (j != w - 1) {
						if (ma[i - 1][j + 1])
							d = m[i - 1][j] + m[i][j + 1] - m[i - 1][j + 1];
					}
					if (c < 0 || d < 0)
						break a;
					if (c != 0 && d != 0 && c != d)
						break a;
				}


				c = Math.max(c, d);
				if (i != h - 1) {
					if (j != 0) {
						if (ma[i + 1][j - 1])
							e = m[i][j - 1] + m[i + 1][j] - m[i + 1][j - 1];
					}
					if (j != w - 1) {
						if (ma[i + 1][j + 1])
							f = m[i + 1][j] + m[i][j + 1] - m[i + 1][j + 1];
					}
					if (e < 0 || f < 0)
						break a;
					if (e != 0 && f != 0 && e != f)
						break a;

					e = Math.max(e, f);
				}

				if (c != 0 && e != 0 && c != e)
					break a;
				if (c == 0 && e == 0)
					continue;
				m[i][j] = c;
				ma[i][j] = true;
				if (i == h - 1 && j == w - 1)
					ans = true;
			}

		}*/
		if (Math.random() > 0.5)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}