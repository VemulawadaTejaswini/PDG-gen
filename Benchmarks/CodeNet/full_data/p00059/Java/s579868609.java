import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextDouble()) {
			Rectangle r1 = new Rectangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
			Rectangle r2 = new Rectangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
			
			if(r1.hasIntersection(r2)) System.out.println("YES");
			else System.out.println("NO");
		}
		sc.close();
	}
	
}

class Rectangle{
	double ldx;
	double ldy;
	double rux;
	double ruy;
	
	Rectangle(double ldx, double ldy, double rux, double ruy){
		this.ldx = ldx;
		this.ldy = ldy;
		this.rux = rux;
		this.ruy = ruy;
	}
	
	boolean inThisRectangle(double x, double y) {
		if(ldx <= x && x <= rux && ldy <= y && y <= ruy) return true;
		else return false;
	}
	
	boolean hasIntersection(Rectangle r) {
		if(inThisRectangle(r.ldx, r.ldy)) return true;
		else if(inThisRectangle(r.rux, r.ruy)) return true;
		else return false;
	}
}