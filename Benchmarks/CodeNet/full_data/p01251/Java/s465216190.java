//package B_d;

import java.util.BitSet;
import java.util.Scanner;

public class Main {

	Scanner sc;

	Main() {
		sc = new Scanner(System.in);
	}

	void run() {
		for (;;) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			int n = sc.nextInt();

			if ((w | h | n) == 0) {
				break;
			}

			int m[][] = new int[h + 1][w + 1];
			for (int i = 0; i < n + 4; i++) {
				int x1, y1, x2, y2;
				if (i < n) {
					x1 = sc.nextInt();
					y1 = sc.nextInt();
					x2 = sc.nextInt();
					y2 = sc.nextInt();
				} else if (i == n) {
					x1 = 0;
					y1 = 0;
					x2 = 0;
					y2 = h;
				} else if (i == n + 1) {
					x1 = w;
					y1 = 0;
					x2 = w;
					y2 = h;
				} else if (i == n + 2) {
					x1 = 0;
					y1 = 0;
					x2 = w;
					y2 = 0;
				} else {
					x1 = 0;
					y1 = h;
					x2 = w;
					y2 = h;
				}
				if (x2 < x1) {
					int tmp = x2;
					x2 = x1;
					x1 = tmp;
				}
				if (y2 < y1) {
					int tmp = y2;
					y2 = y1;
					y1 = tmp;
				}

				if (x1 == x2) {
					for (int j = y1; j <= y2; j++) {
						if (j != y2)
							m[j][x1] |= 1 << 1;
						if (j != y1)
							m[j][x1] |= 1 << 3;
					}
				} else {
					for (int j = x1; j <= x2; j++) {
						if (j != x2)
							m[y1][j] |= 1 << 2;
						if (j != x1)
							m[y1][j] |= 1 << 0;
					}
				}
			}

			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			if (x2 < x1) {
				int tmp = x2;
				x2 = x1;
				x1 = tmp;
			}
			if (y2 < y1) {
				int tmp = y2;
				y2 = y1;
				y1 = tmp;
			}
			int st = -1;
			int sx = -1, sy = -1;
			if (x1 == x2) {
				if (x1 == 0) {
					st = 2;
					sx = x1;
					sy = y2;
					m[y1][sx] -= 1 << 1;
					m[y2][sx] -= 1 << 3;
				} else {
					st = 0;
					sx = x1;
					sy = y1;
					m[y1][sx] -= 1 << 1;
					m[y2][sx] -= 1 << 3;
				}
			} else {
				if (y1 == 0) {
					st = 1;
					sx = x1;
					sy = y1;
					m[sy][x1] -= 1 << 2;
					m[sy][x2] -= 1 << 0;
				} else {
					st = 3;
					sx = x2;
					sy = y1;
					m[sy][x1] -= 1 << 2;
					m[sy][x2] -= 1 << 0;
				}
			}
			int gxx = sc.nextInt();
			int gyy = sc.nextInt();
			int gx[] = { gxx, gxx, gxx + 1, gxx + 1 };
			int gy[] = { gyy, gyy + 1, gyy + 1, gyy };

			int cnt = 0;
			int x = sx;
			int y = sy;
			boolean ok = false;
			int[] dx = { -1, 0, 1, 0 };
			int[] dy = { 0, 1, 0, -1 };

			// for(int i=0; i<h+1; i++)
			// System.out.println(Arrays.toString(m[i]));
			BitSet used = new BitSet((h + 1) * (w + 1) * 4);
			for (;;) {
					// System.out.println("("+cnt+") "+x+" "+y+" "+st+" ");
				if ((m[y][x] & 1 << ((st + 1) % 4)) != 0) {
					st = (st + 1) % 4;
				} else if ((m[y][x] & 1 << (st)) != 0) {
					// st = st;
					cnt++;
				} else if ((m[y][x] & 1 << ((st + 3) % 4)) != 0) {
					st = (st + 3) % 4;
					cnt++;
				} else if (((m[y][x] & 1 << ((st + 2) % 4)) != 0)) {
					st = (st + 2) % 4;
					break;
				} else {
					break;
				}
				x = x + dx[st];
				y = y + dy[st];

				if (x == gx[st] && y == gy[st]) {
					// System.out.println(pst+" "+gx[pst]+" "+gy[pst]);
					ok = true;
					break;
				}
				if (used.get((y * (w + 1) + x) * 4 + st)) {
					break;
				}
				used.set((y * (w + 1) + x) * 4 + st);
		}
			System.out.println(ok ? cnt : "Impossible");
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

}