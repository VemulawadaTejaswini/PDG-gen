import java.awt.Point;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a[][];
		Point p[];
		int sum;
		int max;
		int arrayIndexMax;

		n = sc.nextInt();
		while (n != 0) {
			p = new Point[n];
			sum = 0;
			max = 0;
			arrayIndexMax = 0;

			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				p[i] = new Point(x, y);
				if (arrayIndexMax < Math.max(x, y)) {
					arrayIndexMax = Math.max(x, y);
				}
			}
			a = new int[arrayIndexMax + 1][arrayIndexMax + 1];
			for (int i = 0; i < n; i++) {
				a[p[i].x][p[i].y] = 1;
			}

			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					int x = p[j].x - p[i].x;
					int y = p[j].y - p[i].y;
					if (0 <= p[i].x - y && p[i].x - y < arrayIndexMax && 0 <= p[i].y + x && p[i].y + x < arrayIndexMax && a[p[i].x - y][p[i].y + x] == 1) {
						if (0 <= p[j].x - y && p[j].x - y < arrayIndexMax && 0 <= p[j].y + x && p[j].y + x < arrayIndexMax && a[p[j].x - y][p[j].y + x] == 1) {
							sum = x * x + y * y;
							if (max < sum) {
								max = sum;
							}
						}
					}
					if (0 <= p[i].x + y && p[i].x + y < arrayIndexMax && 0 <= p[i].y - x && p[i].y - x < arrayIndexMax && a[p[i].x + y][p[i].y - x] == 1) {
						if (0 <= p[j].x + y && p[j].x + y < arrayIndexMax && 0 <= p[j].y - x && p[j].y - x < arrayIndexMax && a[p[j].x + y][p[j].y - x] == 1) {
							sum = x * x + y * y;
							if (max < sum) {
								max = sum;
							}
						}
					}
				}
			}
			System.out.println(max);

			n = sc.nextInt();
		}
	}
}