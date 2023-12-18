

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		String[] s = new String[h];
		for (int i = 0; i < h; i++) {
			s[i] = sc.next();
		}

		char[][] c = new char[h][];

		for (int i = 0; i < h; i++) {
			c[i] = s[i].toCharArray();
		}

		String ans = "Yes";

		out: for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				boolean flg = false;

				if (c[i][j] == '#') {

					if (i != 0) {
						if (c[i - 1][j] == '#')
							flg = true;
					}
					if (i != h - 1) {
						if (c[i + 1][j] == '#')
							flg = true;
					}
					if (j != 0) {
						if (c[i][j - 1] == '#')
							flg = true;
					}
					if (j != w - 1) {
						if (c[i][j + 1] == '#')
							flg = true;
					}

					if (!flg) {
						ans = "No";
						break out;
					}
				}
			}
		}
		System.out.println(ans);
	}

}
