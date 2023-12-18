package b075;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] s = new String[h];
		int[] dx = { -1, 0, 1, -1, 1, -1, 0, 1 };
		int[] dy = { -1, -1, -1, 0, 0, 1, 1, 1 };

		for (int i = 0; i < h; i++) {
			s[i] = sc.next();
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (s[i].charAt(j) == '#') {
					System.out.print('#');
					continue;
				}

				int num = 0;
				for (int d = 0; d < 8; d++) {
					int ni = i + dx[d];
					int nj = j + dy[d];

					if (ni < 0 || h <= ni) {
						continue;
					}
					if (nj < 0 || h <= nj) {
						continue;
					}

					if (s[ni].charAt(nj) == '#') {
						num++;
					}
				}

				System.out.print(num);
			}
			System.out.println();
		}}}