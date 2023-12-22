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

			double dot = Geom.dot(xp2 - xp1, yp2 - yp1, xp0 - xp1, yp0 - yp1);
			int a2 = Geom.sumofsquare(xp2 - xp1, yp2 - yp1);
			double x = dot / a2 * (xp2 - xp1);
			double y = dot / a2 * (yp2 - yp1);
			
			System.out.printf("%.9f %.9f\n", x, y);
		}

		sc.close();
	}
	
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