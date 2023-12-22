import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		for (;;) {
			int N = in.nextInt(), D = in.nextInt();
			if (N == 0 && D == 0)
				break;
			double dx = 0, dy = 1;
			double x = 0, y = 0;
			for (int i = 0; i < N; i++) {
				double ls = in.nextDouble() / 180 * Math.PI, rs = in
						.nextDouble() / 180 * Math.PI, t = in.nextDouble();
				if (ls == rs) {
					x += dx * (ls + rs) / 2 * t;
					y += dy * (ls + rs) / 2 * t;
				}
				else if (rs != 0) {
					double R = rs / (rs - ls) * 2 * D;
					double vx = dy * (R - D), vy = -dx * (R - D);
					double ox = x - vx, oy = y - vy;
					double alpha = rs * t / R;
					double nx = ox
							+ (Math.cos(alpha) * vx - Math.sin(alpha) * vy), ny = oy
							+ (Math.sin(alpha) * vx + Math.cos(alpha) * vy);
					x = nx;
					y = ny;
					double ndx = Math.cos(alpha) * dx - Math.sin(alpha) * dy, ndy = Math
							.sin(alpha) * dx + Math.cos(alpha) * dy;
					dx = ndx;
					dy = ndy;
				} else {
					double R = ls / (rs - ls) * 2 * D;
					double vx = dy * (R + D), vy = -dx * (R + D);
					double ox = x - vx, oy = y - vy;
					double alpha = ls * t / R;
					double nx = ox
							+ (Math.cos(alpha) * vx - Math.sin(alpha) * vy), ny = oy
							+ (Math.sin(alpha) * vx + Math.cos(alpha) * vy);
					x = nx;
					y = ny;
					double ndx = Math.cos(alpha) * dx - Math.sin(alpha) * dy, ndy = Math
							.sin(alpha) * dx + Math.cos(alpha) * dy;
					dx = ndx;
					dy = ndy;
				}
			}
			if (Math.abs(x)<1e-5) x=0;
			if (Math.abs(y)<1e-5) y=0;
			System.out.printf("%.5f%n%.5f%n", x, y);
		}
	}
}