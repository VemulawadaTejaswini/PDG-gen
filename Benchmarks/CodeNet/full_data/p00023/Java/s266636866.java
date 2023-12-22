
import java.awt.geom.Point2D;
import java.util.*;
public class Main {

	private boolean isNotOverlap(double dis, double r1, double r2){
		final double EPS = 1.0e-08;
		double result = dis - (r1 + r2);
		if(result > EPS)
			return true;
		else
			return false;
	}

	private boolean isInclude(double dis, double r1, double r2){
		final double EPS = 1.0e-08;
		double result = dis + r1 - r2;
		if(result < (EPS * (-1)))
			return true;
		else
			return false;
	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i < n; i++){
			double xa = sc.nextDouble();
			double ya = sc.nextDouble();
			double ra = sc.nextDouble();
			double xb = sc.nextDouble();
			double yb = sc.nextDouble();
			double rb = sc.nextDouble();
			double dis = Point2D.distance(xa, ya, xb, yb);
			if(isNotOverlap(dis, ra, rb))
				System.out.println(0);
			else if(isInclude(dis, ra, rb))
				System.out.println(-2);
			else if(isInclude(dis, rb, ra))
				System.out.println(2);
			else
				System.out.println(1);
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}

}