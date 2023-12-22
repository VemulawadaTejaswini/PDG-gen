
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double xa,ya,xb,yb,xc,yc,xp,yp;
		double abc, abp, bcp, cap;
		
			xa = sc.nextDouble();
			ya = sc.nextDouble();
			xb = sc.nextDouble();
			yb = sc.nextDouble();
			xc = sc.nextDouble();
			yc = sc.nextDouble();
			xp = sc.nextDouble();
			yp = sc.nextDouble();
			
			abc = calculate_area(xa,ya,xb,yb,xc,yc);
			abp = calculate_area(xa,ya,xb,yb,xp,yp);
			bcp = calculate_area(xb,yb,xc,yc,xp,yp);
			cap = calculate_area(xc,yc,xa,ya,xp,yp);
			
			System.out.println(abc +"\n"+ abp +"\n"+ bcp +"\n"+ cap);
		
		if(abc-(abp+bcp+cap) == 0){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	static double calculate_area(double x1, double y1, double x2, double y2, double x3, double y3){
		double result;
			result = 0.5 * ((x3-x1)*(y2-y1)-(y3-y1)*(x2-x1));
			if(result < 0) result*=-1;
		return result;
	}
}