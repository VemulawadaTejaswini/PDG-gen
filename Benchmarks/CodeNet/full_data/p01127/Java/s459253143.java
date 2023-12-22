import java.util.Scanner;

public class Main {
	static int n;
	static int h, w;
	static int xline[][];

	public static void check(int mark) {
		int right = 0, left = w - 1, top = 0, bottom = h - 1;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (xline[i][j] == mark) {
					right = Math.max(right, j);
					left = Math.min(left, j);
					top = Math.max(top, i);
					bottom = Math.min(bottom, i);
				}
			}
		}
		for (int i = bottom; i <= top; i++) {
			for (int j = left; j <= right; j++) {
				if (xline[i][j] != mark && xline[i][j] != '@') {
					return ;
				}
			}
		}
		for (int i = bottom; i <= top; i++) {
			for (int j = left; j <= right; j++) {
				if (xline[i][j] == mark) {
					xline[i][j] = '@';
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		n = sc.nextInt();
		while (n-- != 0) {
			h = sc.nextInt();
			w = sc.nextInt();
			xline = new int[h][w];
			for (int i = 0; i < h; i++) {
				String s = sc.next();
				for (int j = 0; j < w; j++) {
					xline[i][j] = s.charAt(j);
				}
			}

			for (int q = 0; q < 7; q++) {
				for (int r = 'A'; r <= 'Z'; r++) {
					check(r);
				}
			}

			boolean f = true;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (xline[i][j] != '.' && xline[i][j] != '@') {
						f = false;
					}
				}
			}

			if (f) {
				System.out.println("SAFE");
			} else {
				System.out.println("SUSPICIOUS");
			}
		}
	}
}