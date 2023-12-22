import java.util.Scanner;

public class Main {
	static boolean[][] flag;
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while ((n = sc.nextInt()) != 0) {
			flag = new boolean[n][n];
			for (int i = 0; i < n; i++) {
				String str = sc.next();
				for (int j = 0; j < n; j++) {
					if (str.charAt(j) == '*') {
						flag[i][j] = true;
					}
				}
			}
			int size = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (!flag[j][i]) {
						size = Math.max(size, squareSearching(j, i, 1));
					}
				}
			}
			System.out.println(size);
		}
	}

	static int squareSearching(int x, int y, int size) {
		x++;
		y++;
		size++;
		if (x >= n || y >= n) {
			return size;
		}
		for (int i = x; i < size + x && i < n; i++) {
			if (flag[y][i]) {
				return size - 1;
			}
		}
		for (int i = y; i < size + y && i < n; i++) {
			if (flag[i][x]) {
				return size - 1;
			}
		}
		return squareSearching(x, y, size);
	}
}