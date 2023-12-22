import java.math.BigDecimal;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,e,f;
		double x,y;
		while(sc.hasNext()){
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			e = sc.nextInt();
			f = sc.nextInt();
			x = (c*e - b*f)/(a*e - b*d);
			y = (c*d - a*f)/(b*d - a*e);
			if(x == -0) x = 0;
			if(y == -0) y = 0;
			BigDecimal bi = new BigDecimal(String.valueOf(x));
			double x1= bi.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
			BigDecimal ai = new BigDecimal(String.valueOf(y));
			double y1= ai.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
			System.out.printf("%3f %3f",x1,y1);
		}
	}
}