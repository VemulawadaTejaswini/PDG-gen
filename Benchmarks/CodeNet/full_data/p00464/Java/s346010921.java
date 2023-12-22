import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h, w, n;
		int a[][];
		int x, y;

		while (true) {
			h = sc.nextInt();
			w = sc.nextInt();
			n = sc.nextInt();
			if ((h | w | n) == 0) {
				break;
			}

			a = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					a[i][j]= sc.nextInt();
				}
			}

			x = y = 1;
			while (n-- != 0) {
				x = y = 1;
				while (x <= w && y <= h) {
					if (a[y - 1][x - 1] == 0) {
						a[y - 1][x - 1]++;
						a[y - 1][x - 1] %= 2;
						y++;
					} else {
						a[y - 1][x - 1]++;
						a[y - 1][x - 1] %= 2;
						x++;
					}
				}
			}
			
			System.out.println(y + " " + x);
		}
	}
}