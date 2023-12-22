import java.util.*;
import java.math.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static double x1, x2, x3, xp, y1, y2, y3, yp, r;

	public static void main(String[] args) {
		while(read()){
			
		}
	}
	static boolean read(){
		int n = 0;
		if(!sc.hasNext())
			return false;
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			x1 = sc.nextDouble();
			y1 = sc.nextDouble();
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();
			x3 = sc.nextDouble();
			y3 = sc.nextDouble();
			solve();
		}
		return true;
	}
	static void solve(){
		double a, b, c, S, s, A1, B1, C1, A2, B2, C2;
		a = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		b = Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
		c = Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1));
		s = (a + b + c)/2;
		S = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		r = a*b*c/4/S;
		A1 = 2*(x2 - x1);
		B1 = 2*(y2 - y1);
		C1 = x1*x1 - x2*x2 + y1*y1 - y2*y2;
		A2 = 2*(x3 - x1);
		B2 = 2*(y3 - y1);
		C2 = x1*x1 - x3*x3 + y1*y1 - y3*y3;
		xp = (B1*C2 - B2*C1)/(A1*B2 - A2*B1);
		yp = (C1*A2 - C2*A1)/(A1*B2 - A2*B1);
		BigDecimal x = new BigDecimal(xp);
		BigDecimal y = new BigDecimal(yp);
		BigDecimal R = new BigDecimal(r);
		System.out.printf("%.3f", x.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
		System.out.print(" ");
		System.out.printf("%.3f", y.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
		System.out.print(" ");
		System.out.printf("%.3f", R.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
		
		
	}

}