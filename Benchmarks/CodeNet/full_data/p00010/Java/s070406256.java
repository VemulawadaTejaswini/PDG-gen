import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();

			double a = x1*x1 - x2*x2 + y1*y1 - y2*y2;
			double b = 2*x2 - 2*x1;
			double c = 2*y2 - 2*y1;
			double d = x3*x3 - x2*x2 + y3*y3 - y2*y2;
			double e = 2*x2 - 2*x3;
			double f = 2*y2 - 2*y3;
//			System.out.println(c);
//			System.out.println(f);
			double px = (c*d - f*a) / (f*b - c*e);
			double py;
			if (f != 0) py = - (d + e*px) / f;
			else py = - (a + b*px) / c;

			double rr = (px - x1)*(px - x1) + (py - y1)*(py - y1);
			double r = Math.sqrt(rr);

			BigDecimal dpx = new BigDecimal(px);
			BigDecimal dpy = new BigDecimal(py);
			BigDecimal dr = new BigDecimal(r);
			dpx = dpx.setScale(3, BigDecimal.ROUND_HALF_UP);
			dpy = dpy.setScale(3, BigDecimal.ROUND_HALF_UP);
			dr = dr.setScale(3, BigDecimal.ROUND_HALF_UP);

			System.out.printf("%.3f %.3f %.3f\n",
					dpx.doubleValue(), dpy.doubleValue(), dr.doubleValue());
		}
	}

}