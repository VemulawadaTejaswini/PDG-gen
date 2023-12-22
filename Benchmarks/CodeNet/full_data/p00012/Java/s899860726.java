import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x1, x2, x3, y1, y2, y3, xp, yp;
		double ax, ay, bx, by, cx, cy;
		double s1, s2, s3;

		while (scan.hasNext()) {
			x1 = scan.nextDouble();
			y1 = scan.nextDouble();
			x2 = scan.nextDouble();
			y2 = scan.nextDouble();
			x3 = scan.nextDouble();
			y3 = scan.nextDouble();
			xp = scan.nextDouble();
			yp = scan.nextDouble();
			ax = x2 - x1;
			ay = y2 - y1;
			bx = x3 - x1;
			by = y3 - y1;
			cx = xp - x1;
			cy = yp - y1;
			s1 = Math.sqrt((ax * ax + ay * ay) * (bx * bx + by * by)
					- (ax * bx + ay * by) * (ax * bx + ay * by)) / 2;
			s2 = Math.sqrt((ax * ax + ay * ay) * (cx * cx + cy * cy)
					- (ax * cx + ay * cy) * (ax * cx + ay * cy)) / 2;
			s3 = Math.sqrt((bx * bx + by * by) * (cx * cx + cy * cy)
					- (bx * cx + by * cy) * (bx * cx + by * cy)) / 2;
			if (s1 > s2 + s3) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

}