import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int xp0 = sc.nextInt();
			int yp0 = sc.nextInt();
			int xp1 = sc.nextInt();
			int yp1 = sc.nextInt();
			int xp2 = sc.nextInt();
			int yp2 = sc.nextInt();
			int xp3 = sc.nextInt();
			int yp3 = sc.nextInt();

			int ax = xp1 - xp0;
			int ay = yp1 - yp0;
			int bx = xp3 - xp2;
			int by = yp3 - yp2;
			int dot = Geom.dot(ax, ay, bx, by);
			int cross = Geom.cross(ax, ay, bx, by);

			if (cross == 0) {
				System.out.println("2");
			} else if (dot == 0) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
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