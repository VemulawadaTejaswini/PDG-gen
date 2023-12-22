package h0004;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		DecimalFormat df = new DecimalFormat("0.000");
		while(scan.hasNext()){
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			d = scan.nextInt();
			e = scan.nextInt();
			f = scan.nextInt();
			
			x = (b*f-e*c)/(b*d-a*e);
			y = (a*f-d*c)/(a*e-b*d);
	
			System.out.println(df.format(x)+" "+df.format(y));
		}
	}
}