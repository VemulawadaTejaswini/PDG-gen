import java.util.*;

public class Main {
	static int W, H;
	static int[][] land;

	static void search(int y, int x) {
		if (x + 1 < W) {
			if (land[y][x + 1] == 1) {
				land[y][x + 1] = 2;
				search(y, x + 1);
			}
			if (y + 1 < H) {
				if (land[y + 1][x + 1] == 1) {
					land[y + 1][x + 1] = 2;
					search(y + 1, x + 1);
				}
			}
			if (y - 1 >= 0) {
				if (land[y - 1][x + 1] == 1) {
					land[y - 1][x + 1] = 2;
					search(y - 1, x + 1);
				}
			}
		}
		if (x - 1 >= 0) {
			if (land[y][x - 1] == 1) {
				land[y][x - 1] = 2;
				search(y, x - 1);
			}
			if (y + 1 < H) {
				if (land[y + 1][x - 1] == 1) {
					land[y + 1][x - 1] = 2;
					search(y + 1, x - 1);
				}
			}
			if (y - 1 >= 0) {
				if (land[y - 1][x - 1] == 1) {
					land[y - 1][x - 1] = 2;
					search(y - 1, x - 1);
				}
			}
		}
		if (y + 1 < H) {
			if (land[y + 1][x] == 1) {
				land[y + 1][x] = 2;
				search(y + 1, x);
			}
		}
		if (y - 1 >= 0) {
			if (land[y - 1][x] == 1) {
				land[y - 1][x] = 2;
				search(y - 1, x);
			}
		}
	}

	public static void main(String[] args) {
		int i, j;
		int count;
		Scanner s = new Scanner(System.in);

		while (true) {
			count = 0;
			W = s.nextInt();
			H = s.nextInt();

			if (W == 0 && H == 0)
				break;

			land = new int[H][W];
			for (i = H - 1; i >= 0; i--) {
				for (j = 0; j < W; j++) {
					land[i][j] = s.nextInt();
				}
			}
			for (i = H - 1; i >= 0; i--) {
				for (j = 0; j < W; j++) {
					if (land[i][j] == 1) {
						land[i][j] = 2;
						search(i, j);
						count++;
					}
				}
			}
			System.out.println(count);
		}
		s.close();
	}

}