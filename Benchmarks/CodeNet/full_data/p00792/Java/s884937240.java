import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N < 0) break;
			boolean[][] hor = new boolean[9][8];
			boolean[][] ver = new boolean[8][9];
			for (int i = 0; i < N; ++i) {
				char dir = sc.next().charAt(0);
				int I = sc.nextInt();
				int J = sc.nextInt();
				if (dir == 'x') {
					hor[J][I] = true;
				} else {
					ver[J][I] = true;
				}
			}
			int r = 0;
			int c = 1;
			int dr = 1;
			int dc = 1;
			boolean first = true;
			while (true) {
				int nr = r + dr;
				int nc = c + dc;
				if (!first && r + nr == 1 && c + nc == 3) {
					System.out.println("75 25");
					break;
				}
				r = nr;
				c = nc;
				boolean reflec = false;
				if (r % 2 == 0) {
					if (hor[r / 2][c / 2]) {
						dr *= -1;
						reflec = true;
					}
				} else {
					if (ver[r / 2][c / 2]) {
						dc *= -1;
						reflec = true;
					}
				}
				if ((r == 16 || c == 16) && !reflec) {
					System.out.printf("%d %d\n", c * 50, r * 50);
					break;
				}
				first = false;
			}
		}
	}
}