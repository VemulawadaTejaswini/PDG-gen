import java.io.*;

public class Main{

	// Point class
	static class Point{
		public double x;
		public double y;

		public Point(double x, double y){
			this.x = x;
			this.y = y;
		}

		public Point(Point p){
			x = p.x;
			y = p.y;
		}

		public void printPoint(){
			System.out.printf("%.8f %.8f\n", x, y);
		}
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		Point zero = new Point(0, 0);
		Point hyaku = new Point(100, 0);
		int i, j, k;

		n = Integer.parseInt(br.readLine());
		
		zero.printPoint();
		divisionPoint(n, zero, hyaku);
		hyaku.printPoint();
	}

	static void divisionPoint(int n, Point p1, Point p2){
		double x = p2.x - p1.x;
		double y = p2.y - p1.y;

		Point s = new Point((x/3)+p1.x, (y/3)+p1.y);
		Point t = new Point(2*(x/3)+p1.x, 2*(y/3)+p1.y);
		Point u = new Point(getKoch(s, t));

		if(n > 0){
			divisionPoint(n-1, p1, s);
			s.printPoint();

			divisionPoint(n-1, s, u);
			u.printPoint();

			divisionPoint(n-1, u, t);
			t.printPoint();

			divisionPoint(n-1, t, p2);
		}
	}

	static Point getKoch(Point s, Point t){
		double x = t.x - s.x;
		double y = t.y - s.y;

		double moveX = (Math.cos(Math.toRadians(60)) * x - Math.sin(Math.toRadians(60)) * y) + s.x;
		double moveY = (Math.sin(Math.toRadians(60)) * x + Math.cos(Math.toRadians(60)) * y) + s.y;

		Point u = new Point(moveX, moveY);
		return u;
	}
}