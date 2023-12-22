import java.util.Scanner;
import java.math.*;
import java.text.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		DecimalFormat df = new DecimalFormat("#.000");
		for(int iter=0; iter<n; iter++){
			double x1 = in.nextDouble(), y1 = in.nextDouble(),
				x2 = in.nextDouble(), y2 = in.nextDouble(),
				x3 = in.nextDouble(), y3 = in.nextDouble();
			double a, b, r, det;
			det = 4.0 * ((x1-x2)*(y1-y3)-(x1-x3)*(y1-y2));
			a = 2.0 * ((x1*x1+y1*y1-x2*x2-y2*y2)*(y1-y3)-(x1*x1+y1*y1-x3*x3-y3*y3)*(y1-y2));
			b = -2.0 *((x1*x1+y1*y1-x2*x2-y2*y2)*(x1-x3)-(x1*x1+y1*y1-x3*x3-y3*y3)*(x1-x2));
			a /= det;
			b /= det;
			r = Math.sqrt(Math.pow(x1-a, 2) + Math.pow(y1-b, 2));
			System.out.println(df.format(a) + " " + df.format(b) + " " + df.format(r));
		}
	}

}