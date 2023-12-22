import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 入力
		Scanner sc = new Scanner(System.in);
		double xp0 = sc.nextDouble();
		double yp0 = sc.nextDouble();
		Vector2d p0 = new Vector2d(xp0, yp0);
		double xp1 = sc.nextDouble();
		double yp1 = sc.nextDouble();
		Vector2d p1 = new Vector2d(xp1, yp1);
		int q = sc.nextInt();
		for (int i=0; i<q; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			System.out.println(solve(p0, p1, new Vector2d(x, y)));
		}
		sc.close();
	}

	static class Vector2d {
		Vector2d(Double x, Double y){
			this.x = x;
			this.y = y;
		}
		Double x;
		Double y;
		public String toString() {
			return String.format("%1$.10f %2$.10f", x, y);
		}
	}

	public static Vector2d sub(Vector2d v1, Vector2d v2){
		return new Vector2d(v2.x - v1.x, v2.y - v1.y);
	}

	public static String solve(Vector2d p0, Vector2d p1, Vector2d p2) {
		Vector2d v1 = sub(p0, p1);
		Vector2d v2 = sub(p0, p2);
		Double a = v1.x * v2.y - v1.y * v2.x;
		if(a == 0) {
			if(v2.x / v1.x < 0 || v2.y / v1.y < 0) {
				return "ONLINE_BACK";
			} else if(v2.x / v1.x > 1 || v2.y / v1.y > 1) {
				return "ONLINE_FRONT";
			} else {
				return "ON_SEGMENT";
			}
		} else if(a > 0) {
			return "COUNTER_CLOCKWISE";
		} else {
			return "CLOCKWISE";
		}
	}
}

