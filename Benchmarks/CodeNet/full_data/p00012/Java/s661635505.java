import java.util.*;   
import java.lang.*;   
import java.math.*;   
import java.io.*; 

public class Main {
	Scanner sc;
	void run() {
		sc = new Scanner(System.in);
		Point[] a = new Point [4]; 
		while (sc.hasNext()){
			for (int i=0;i<4;i++) {
				double x = sc.nextDouble();
				double y = sc.nextDouble();
				a[i] = new Point(x,y);
			}
			Line[] l = new Line[3];
			Line[] lc = new Line [3];
			boolean flg = true;
			for (int i=0;i<3;i++) {
				l[i] = new Line(a[i%3], a[(i+1)%3]);
				lc[i] = new Line(a[(i+2)%3], a[3]);
				if (l[i].judgeCloss(lc[i])) {
					flg = false;
					break;
				}
			}
			if (flg)
				System.out.println("YES");
			else System.out.println("NO");
			
		}
		
	}
	public static void main(String[] args) {
		new Main().run();
	}
	
	
}
class Point {
	private double x;
	private double y;
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX(){
		return x;
	}
	public double getY() {
		return y;
	}
}

class Line {
	Point a1;
	Point a2;
	public Line (Point a, Point b) {
		a1 = a;
		a2 = b;
	}
	public Point getS() {
		return a1;
	}
	public Point getE() {
		return a2;
	}
	public boolean judgeCloss(Line l) {
		double a = ( (a1.getY() - l.getS().getY()) * (l.getS().getX() - l.getE().getX() - (l.getS().getY() - l.getE().getY()) * (a1.getX() - l.getS().getX())) );
		double b = ( (a2.getY() - l.getS().getY()) * (l.getS().getX() - l.getE().getX() - (l.getS().getY() - l.getE().getY()) * (a2.getX() - l.getS().getX())) );
		
		System.out.println( a + " " + b );
		
		if (a*b >= 0)
			return false;
		else return true;
	}

}