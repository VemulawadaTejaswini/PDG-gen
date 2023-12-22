import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		Point2D.Double p[];
		int start;
		int count;

		n = sc.nextInt();
		while (n != 0) {
			p = new Point2D.Double[n];
			start = 0;
			count = 0;
			for (int i = 0; i < n; i++) {
				String s[] = sc.next().split(",");
				p[i] = new Point2D.Double(Double.valueOf(s[0]), Double.valueOf(s[1]));
				if (p[i].x < p[start].x) {
					start = i;
				}
			}
			int pre = start;
			while (true) {
				for (int i = 0; i < n; i++) {
					if (i != pre) {
						boolean flag = true;
						for (int j = 0; j < n && flag; j++) {
							if (j != i && j != pre) {
								flag = isLeft(p[pre], p[i], p[j]);
							}
						}
						if (flag) {
							count++;
							pre = i;
							break;
						}
					}
				}
				if (pre == start) {
					break;
				}
			}
			System.out.println(n - count);
			n = sc.nextInt();
		}
	}

	public static boolean isLeft(Point2D.Double p, Point2D.Double q, Point2D.Double x) {
		double dx1 = q.x - p.x;
		double dy1 = q.y - p.y;
		double dx2 = x.x - p.x;
		double dy2 = x.y - p.y;
		if (0 < dx1 * dy2 - dx2 * dy1) {
			return true;
		} else {
			return false;
		}
	}
}