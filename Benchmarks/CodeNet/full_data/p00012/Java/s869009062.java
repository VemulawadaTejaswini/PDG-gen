import java.util.*;
import java.io.*;
import java.math.*;
import java.awt.*;
import java.awt.geom.*;
class Main {

	public static double Heron (double a, double b, double c) {
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));

	}

	public static boolean solve (double x1, double y1, double x2,
			double y2, double x3, double y3, double xp, double yp) {

		double d1 = Point2D.distance(x1, y1, x2, y2);
		double d2 = Point2D.distance(x1, y1, x3, y3);
		double d3 = Point2D.distance(x2, y2, x3, y3);
		double d4 = Point2D.distance(x1, y1, xp, yp);
		double d5 = Point2D.distance(x2, y2, xp, yp);
		double d6 = Point2D.distance(x3, y3, xp, yp);

		double area1 = Heron(d1,d2,d3);
		double area2 = Heron(d1,d4,d5);
		double area3 = Heron(d3,d5,d6);
		double area4 = Heron(d2,d4,d6);

		double error = Math.abs(area1 - (area2 + area3 + area4));
		return error < 0.0001;

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			String s = br.readLine();
			if (s == null) break;

			StringTokenizer st = new StringTokenizer(s," ");

			double x1 = Double.parseDouble(st.nextToken());
			double y1 = Double.parseDouble(st.nextToken());
			double x2 = Double.parseDouble(st.nextToken());
			double y2 = Double.parseDouble(st.nextToken());
			double x3 = Double.parseDouble(st.nextToken());
			double y3 = Double.parseDouble(st.nextToken());
			double xp = Double.parseDouble(st.nextToken());
			double yp = Double.parseDouble(st.nextToken());

			System.out.println(solve(x1,y1,x2,y2,x3,y3,xp,yp) ? "YES" : "NO");

		}

	}

}