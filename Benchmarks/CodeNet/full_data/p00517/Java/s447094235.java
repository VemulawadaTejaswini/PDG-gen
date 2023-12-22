import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int W = sc.nextInt();
		int H = sc.nextInt();
		int N = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int d = 0;
		for (int i = 0; i < N - 1; ++i) {
			int nx = sc.nextInt();
			int ny = sc.nextInt();
			d += dist(x, y, nx, ny);
			x = nx;
			y = ny;
		}
		System.out.println(d);
	}

	static int dist(int x1, int y1, int x2, int y2) {
		if (x1 > x2) {
			int tmp = x1;
			x1 = x2;
			x2 = tmp;
			tmp = y1;
			y1 = y2;
			y2 = tmp;
		}
		if (y1 < y2) {
			int diag = Math.min(x2 - x1, y2 - y1);
			x1 += diag;
			y1 += diag;
			return diag + x2 - x1 + y2 - y1;
		} else {
			return x2 - x1 + Math.abs(y2 - y1);
		}
	}

}