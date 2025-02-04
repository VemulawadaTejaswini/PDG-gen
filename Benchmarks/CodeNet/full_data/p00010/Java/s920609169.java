import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		for(int i=0;i<n;i++) {
			Point p1 = new Point(in.nextDouble(), in.nextDouble());
			Point p2 = new Point(in.nextDouble(), in.nextDouble());
			Point p3 = new Point(in.nextDouble(), in.nextDouble());

			Circle ans = CircleUtil.calcCircleFromTriangle(p1, p2, p3);

			System.out.printf("%.3f %.3f %.3f\n", ans.getCenter().getX(), ans.getCenter().getY(), ans.getR());
		}
	}
}

class CircleUtil {
	public static Circle calcCircleFromTriangle(Point p1, Point p2, Point p3) {
		if(p1.getY() - p2.getY() == 0) {
			if(p2.getY() - p3.getY() != 0) {
				swap(p2, p3);
			} else if(p1.getY() - p3.getY() != 0) {
				swap(p1, p3);
			} else {
				new Exception("it is illegal input");
			}
		}
		double x1 = p1.getX();
		double x2 = p2.getX();
		double x3 = p3.getX();
		double y1 = p1.getY();
		double y2 = p2.getY();
		double y3 = p3.getY();
		double px_bunbo = 2*( (x1-x2)*(y1-y3)/(y2-y1) + (x1-x3) );
		double px_bunshi = (x1*x1 - x2*x2)*(y1-y3) + (x1*x1-x3*x3) + (y1*y1-y3*y3)+(y1*y1-y2*y2)*(y1-y3)/(y2-y1);
		double px = px_bunshi / px_bunbo;
		double py = ( (x1*x1-x2*x2) + 2*px*(x2-x1) + (y1*y1-y2*y2) ) / (2*(y1-y2));
		double r = sqrt(Math.pow(px-x1, 2.0) + Math.pow(py-y1, 2.0));

		return new Circle(new Point(px,py), r);
	}

	public static void swap(Point a, Point b) {
		double tx = a.x, ty = a.y;
		a.x = b.x; a.y = b.y;
		b.x = tx; b.y = ty;
	}
}

class Circle {
	Point center;
	double r;

	public Circle(Point center, double r) {
		this.center = center;
		this.r = r;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
}

class Point {
	double x;
	double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}