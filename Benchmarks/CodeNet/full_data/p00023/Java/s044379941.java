import java.util.Scanner;

public class Main {

	// ２点間の距離
	public static double getDistance (double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

	public static int solve (double xa, double ya, double ra, double xb, double yb, double rb) {
		double largeR = Math.max(ra, rb);
		double smallR = Math.min(ra, rb);
		double d = getDistance(xa,ya,xb,yb);
		if (d < largeR - smallR)
			return smallR == ra ? -2 : 2;
		return largeR + smallR < d ? 0 : 1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			double xa = sc.nextDouble();
			double ya = sc.nextDouble();
			double ra = sc.nextDouble();
			double xb = sc.nextDouble();
			double yb = sc.nextDouble();
			double rb = sc.nextDouble();
			System.out.println(solve(xa,ya,ra,xb,yb,rb));
		}

	}

}