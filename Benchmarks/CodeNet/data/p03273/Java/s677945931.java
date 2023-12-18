import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H, W;
		H = sc.nextInt();
		W = sc.nextInt();
		char a[][] = new char[H][W];

		for (int i = 0; i < H; i++) {
			String s = sc.next();
			for (int j = 0; j < W; j++) {
				a[i][j] = s.charAt(j);
			}
		}
		sc.close();

		for (int i = 0; i < H; i++) {
			int x = 0;
			for (int j = 0; j < W; j++) {
				if (a[i][j] == '.') {
					x++;
				}
			}
			if (x == W) {
				for (int j = 0; j < W; j++) {
					a[i][j] = '0';
				}
			}
		}

		for (int i = 0; i < W; i++) {
			int x = 0;
			for (int j = 0; j < H; j++) {
				if (a[j][i] == '.' || a[j][i] == '0') {
					x++;
				}
			}
			if (x == H) {
				for (int j = 0; j < H; j++) {
					a[j][i] = '0';
				}
			}
		}

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (a[i][j] != '0') {
					System.out.print(a[i][j]);
					if (j == W - 1) {
						System.out.print("\n");
					}
				}
			}
		}
	}
}