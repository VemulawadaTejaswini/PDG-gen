import java.util.Scanner;

public class Main {
	static int n;
	static int pre[][];
	static int jpx[][];
	static int jpy[][];

	public static boolean mark(int x, int y, int mark) {
		if (0 < pre[y][x]) {
			if (pre[y][x] == mark) {
				return true;
			} else {
				return false;
			}
		}
		pre[y][x] = mark;
		int nx = jpx[y][x];
		int ny = jpy[y][x];
		return mark(nx, ny, mark);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}

			pre = new int[n][n];
			jpx = new int[n][n];
			jpy = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					jpx[i][j] = sc.nextInt();
					jpy[i][j] = sc.nextInt();
				}
			}

			int cnt = 0;
			int mark = 1;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (pre[i][j] == 0) {
						if (mark(j, i, mark)) {
							cnt++;
						}
						mark++;
					}
				}
			}
			
			System.out.println(cnt);
		}
	}
}