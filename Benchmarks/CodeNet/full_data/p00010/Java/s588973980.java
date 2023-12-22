import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		double x1, x2, x3, y1, y2, y3, a, b, c, x, y, r;
		n = sc.nextInt();
		for(int i = 0; i < n ; i++) {
			x1 = sc.nextDouble();
			y1 = sc.nextDouble();
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();
			x3 = sc.nextDouble();
			y3 = sc.nextDouble();
			a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
			b = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
			c = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
			x = ((y1 - y3) * (y1 * y1 - y2 * y2 + x1 * x1 - x2 * x2) - (y1 - y2)
					* (y1 * y1 - y3 * y3 + x1 * x1 - x3 * x3))
					/ (2 * (y1 - y3) * (x1 - x2) - 2 * (y1 - y2) * (x1 - x3));
			y = ((x1 - x3) * (x1 * x1 - x2 * x2 + y1 * y1 - y2 * y2) - (x1 - x2)
					* (x1 * x1 - x3 * x3 + y1 * y1 - y3 * y3))
					/ (2 * (x1 - x3) * (y1 - y2) - 2 * (x1 - x2) * (y1 - y3));
			r = (Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1)));
			System.out.printf("%.3f %.3f %.3f/n", x, y, r);
		}
	}
}