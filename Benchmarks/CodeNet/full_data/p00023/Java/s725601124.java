import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			CCircle c1 = new CCircle(new CPoint(sc.nextDouble(), sc.nextDouble()), sc.nextDouble());
			CCircle c2 = new CCircle(new CPoint(sc.nextDouble(), sc.nextDouble()), sc.nextDouble());
			
			System.out.println(CCircle.clossing(c1, c2));
		}
		
		sc.close();
	}
	
}

class CCircle{
	CPoint center;
	double r;
	
	CCircle(CPoint center, double r) {
		this.center = center;
		this.r = r;
	}
	
	static Clossing clossing(CCircle c1, CCircle c2) {
		double distance = CPoint.distance(c1.center, c2.center);
		
		if(distance + c1.r < c2.r) return Clossing.AINB;
		else if(distance + c2.r < c1.r) return Clossing.BINA;
		else if(c1.r + c2.r < distance) return Clossing.OUTSIDE;
		else return Clossing.X;
	}
	
	static double max(double d1, double d2) {
		return (d1 > d2) ? d1: d2;
	}
	
	static double min(double d1, double d2) {
		return (d1 < d2) ? d1: d2;
	}
}

class CPoint{
	double x;
	double y;
	
	CPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	static double distance(CPoint p1, CPoint p2) {
		double dx = p1.x - p2.x;
		double dy = p1.y - p2.y;
		
		return Math.sqrt(dx * dx + dy * dy);
	}
}

enum Clossing{
	
	OUTSIDE(0), X(1), AINB(-2), BINA(2);
	
	private int n;
	
	private Clossing(int n) {
		this.n = n;
	}
	
	public String toString() {
		return String.valueOf(this.n);
	}
}