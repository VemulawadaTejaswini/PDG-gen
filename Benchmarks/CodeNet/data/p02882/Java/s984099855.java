import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double x = sc.nextDouble();
		sc.close();
		double right = 2 * Math.PI;
		double left = 0.0;
		for(int i = 1;i <= 100000;i++) {
			double mid = (right + left) / 2.0;
			if(function(a,b,mid) < x) {
				right = mid;
			}else {
				left = mid;
			}
		}
		System.out.println(right / Math.PI * 180);
	}

	private static double function(double a, double b, double theta) {
		if(theta > Math.PI/2.0 - 0.0000000001) {
			return 0.0;
		}
		double res = 0.0;
		if(a * Math.tan(theta) <= b) {
			BigDecimal tan = new BigDecimal(a*a*b - (a*a*a*Math.tan(theta)/2.0));
			res = tan.doubleValue();
		}else {
			BigDecimal tan = new BigDecimal(b * b / Math.tan(theta) * a / 2.0);
			res = tan.doubleValue();
		}
		return res;
	}
}