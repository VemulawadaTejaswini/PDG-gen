import java.awt.Point;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		Point p[];
		int s, max;

		n = sc.nextInt();
		while (n != 0) {
			p = new Point[n];
			max = 0;
			s = 0;

			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				p[i] = new Point(x, y);
			}

			quickSort(p, 0, n - 1);

			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					s = f(p, n, i, j);
					if (max < s) {
						max = s;
					}
				}
			}

			System.out.println(max);
			n = sc.nextInt();
		}
	}

	public static int f(Point p[], int n, int a, int b) {
		int x = p[b].x - p[a].x;
		int y = p[b].y - p[a].y;
		boolean flag = false;
		Point c1 = new Point(p[b].x - y, p[b].y + x);
		Point d1 = new Point(p[a].x - y, p[a].y + x);
		Point c2 = new Point(p[b].x + y, p[b].y - x);
		Point d2 = new Point(p[a].x + y, p[a].y - x);

		for (int i = 0; i < n && !flag && p[i].x <= c1.x; i++) {
			if (p[i].equals(c1)) {
				flag = true;
			}
		}
		for (int i = 0; i < n && flag && p[i].x <= d1.x; i++) {
			if (p[i].equals(new Point(d1))) {
				return x * x + y * y;
			}
		}

		flag = false;
		for (int i = 0; i < n && !flag; i++) {
			if (p[i].equals(c2)) {
				flag = true;
			}
		}
		for (int i = 0; i < n && flag; i++) {
			if (p[i].equals(new Point(d2))) {
				return x * x + y * y;
			}
		}

		return 0;
	}

	public static void quickSort(Point p[], int low, int high) {
		if (high <= low) {
			return ;
		}

		int i = low;
		int j = high;
		int x = p[(low + high) / 2].x;

		while (i <= j) {
			while (p[i].x < x) {
				i++;
			}
			while (x < p[j].x) {
				j--;
			}
			if (i <= j) {
				Point swap = p[i];
				p[i] = p[j];
				p[j] = swap;
				i++;
				j--;
			}
		}
		quickSort(p, low, j);
		quickSort(p, i, high);
	}
}