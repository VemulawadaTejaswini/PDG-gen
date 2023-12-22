

import java.util.Scanner;

class Vector {
	public double x;
	public double y;
	
	Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Vector sub(Vector a) {
		return new Vector(this.x - a.x, this.y - a.y);
	}
}

public class Main{
	public static final double EPS = 1e-10;
	
	public static boolean isParallel(Vector a, Vector b) {
		return equals(cross(a, b), 0.0);
	}

	public static boolean isParallel(Vector a1, Vector a2, Vector b1, Vector b2) {
		return isParallel(a1.sub(a2), b1.sub(b2));
	}
	
	public static double cross(Vector a, Vector b) {
		return a.x * b.y - a.y * b.x;
	}

	public static boolean equals(double a, double b) {
		return Math.abs(a - b) < EPS;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double x1, y1, x2, y2, x3, y3, x4, y4;
		for (int i = 0; i < n; i++) {
			x1 = sc.nextDouble();
			y1 = sc.nextDouble();
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();
			x3 = sc.nextDouble();
			y3 = sc.nextDouble();
			x4 = sc.nextDouble();
			y4 = sc.nextDouble();
			Vector a1 = new Vector(x1, y1);
			Vector a2 = new Vector(x2, y2);
			Vector b1 = new Vector(x3, y3);
			Vector b2 = new Vector(x4, y4);
			
			if (isParallel(a1, a2, b1, b2)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
	
}