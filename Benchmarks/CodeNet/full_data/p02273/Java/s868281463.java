import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("0 0");
		kock(n, 0, 0, 100, 0);
		System.out.println("100 0");
	}

	public static void kock(double n, double p1x, double p1y, double p2x,
			double p2y) {
		if (n == 0) {
			return;
		}

		double sx = (2 * p1x + p2x) / 3;
		double sy = (2 * p1y + p2y) / 3;
		double tx = (p1x + 2 * p2x) / 3;
		double ty = (p1y + 2 * p2y) / 3;

		double z = Math.toRadians(60);

		double ux = (tx - sx) * Math.cos(z) - (ty - sy) * Math.sin(z) + sx;
		double uy = (tx - sx) * Math.sin(z) + (ty - sy) * Math.cos(z) + sy;

		kock(n - 1, p1x, p1y, sx, sy);
		System.out.print(sx);
		System.out.print(" ");
		System.out.println(sy);

		kock(n - 1, sx, sy, ux, uy);
		System.out.print(ux);
		System.out.print(" ");
		System.out.println(uy);

		kock(n - 1, ux, uy, tx, ty);
		System.out.print(tx);
		System.out.print(" ");
		System.out.println(ty);

		kock(n - 1, tx, ty, p2x, p2y);
	}
}