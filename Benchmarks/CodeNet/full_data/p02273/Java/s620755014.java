import static java.lang.Math.*;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(0.0 + " " + 0.0);
		koch(n, 0.0, 0.0, 100.0, 0.0);
		System.out.println(100.0 + " " + 0.0);
	}

	static void koch(int n, double p1x, double p1y, double p2x, double p2y) {
		if (n == 0) return;

		double sx, sy;
		double ux, uy;
		double tx, ty;

		// sx = (p2x - p1x) * 1/3 + p1x = (p2x + 2*p1x) / 3
		// tx = (p2x - p1x) * 2/3 + p1x = (2*p2x + p1x) / 3
		sx = (p2x + 2*p1x) / 3;
		sy = (p2y + 2*p1y) / 3;

		tx = (2*p2x + p1x) / 3;
		ty = (2*p2y + p1y) / 3;

		double cos60 = cos( toRadians(60) );
		double sin60 = sin( toRadians(60) );

		ux = (tx-sx)*cos60 - (ty-sy)*sin60 + sx;
		uy = (tx-sx)*sin60 + (ty-sy)*cos60 + sy;

		koch(n-1, p1x, p1y, sx, sy);
		System.out.println(sx + " " + sy);

		koch(n-1, sx, sy, ux, uy);
		System.out.println(ux + " " + uy);

		koch(n-1, ux, uy, tx, ty);
		System.out.println(tx + " " + ty);

		koch(n-1, tx, ty, p2x, p2y);
	}
}