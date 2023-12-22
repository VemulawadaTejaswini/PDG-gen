import java.util.Scanner;
import java.lang.Math;

// ALDS1_5_C
public class Main {
	void kochCurve(int n, Point p1, Point p2) {
		if (n != 0) {
			Point s = new Point((2*p1.x + p2.x)/3, (2*p1.y + p2.y)/3);
			Point t = new Point((p1.x + 2*p2.x)/3, (p1.y + 2*p2.y)/3);
			Point u = new Point((t.x - s.x)*Math.cos(Math.toRadians(60)) -
					(t.y - s.y)*Math.sin(Math.toRadians(60)) + s.x,
					(t.x - s.x)*Math.sin(Math.toRadians(60)) +
					(t.y - s.y)*Math.cos(Math.toRadians(60)) + s.y);
			kochCurve(n-1, p1, s);
			s.print();
			kochCurve(n-1, s, u);
			u.print();
			kochCurve(n-1, u, t);
			t.print();
			kochCurve(n-1, t, p2);
		}
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Point p1 = new Point(0, 0);
		Point p2 = new Point(100, 0);
		p1.print();
		kochCurve(n, p1, p2);
		p2.print();
		sc.close();
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}

class Point {
	double x;
	double y;
	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	void print() {
		System.out.printf("%.8f %.8f\n", x, y);
	}
}
