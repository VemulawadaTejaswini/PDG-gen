import java.math.BigDecimal;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayDeque<Double> x = new ArrayDeque<Double>();
		ArrayDeque<Double> y = new ArrayDeque<Double>();
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			int f = sc.nextInt();
			
			double t = (double)(d*c-a*f)/(d*b-a*e);
			double s = (double)(c-t*b)/a;
			x.push(s);
			y.push(t);
		}
		int num = x.size();
		for(int i=0;i<num;i++){
			BigDecimal bdx = new BigDecimal(x.pop());
			BigDecimal bdy = new BigDecimal(y.pop());

			BigDecimal ansx = bdx.setScale(4, BigDecimal.ROUND_HALF_UP);
			BigDecimal ansy = bdy.setScale(4, BigDecimal.ROUND_HALF_UP);
			
			System.out.printf("%.3f", ansx.doubleValue());
			System.out.print(" ");
			System.out.printf("%.3f", ansy.doubleValue());
			System.out.println();
		}
		
	}
}