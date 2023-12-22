import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int xp1 = sc.nextInt();
		int yp1 = sc.nextInt();
		int xp2 = sc.nextInt();
		int yp2 = sc.nextInt();

		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int xp0 = sc.nextInt();
			int yp0 = sc.nextInt();

			int ax = xp2 - xp1;
			int ay = yp2 - yp1;
			int bx = xp0 - xp1;
			int by = yp0 - yp1;
			double dot = Geom.dot(ax, ay, bx, by);
			int a2 = Geom.sumofsquare(ax, ay);
			double x = dot / a2 * ax + xp1;
			double y = dot / a2 * ay + yp1;
			
			System.out.printf("%.9f %.9f\n", x, y);
		}

		sc.close();
	}
	
	@SuppressWarnings("unused")
	private static class Geom {
		static int dot(int xa, int ya, int xb, int yb) {
			return xa * xb + ya * yb;
		}

		static int cross(int xa, int ya, int xb, int yb) {
			return xa * yb - xb * ya;
		}
		
		static int sumofsquare(int xa, int ya) {
			return xa * xa + ya * ya;
		}
	}
}