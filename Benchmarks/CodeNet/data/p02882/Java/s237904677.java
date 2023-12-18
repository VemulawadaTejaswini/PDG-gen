import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static final double pi = Math.PI;
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int x = scanner.nextInt();
		int V = Math.multiplyExact((int)Math.pow(a, 2),b);
		double ans = 0;
		double ref = V/2.0;
		DecimalFormat df = new DecimalFormat("0.0000000000");
		if (ref > x) {
			double a2 = x*1.0/b/a;
			ans = Math.atan(b*1.0/a2)/pi*180;
		} else if (ref < x) {
			double up = V*2.0/Math.pow(a,2)-b;
			ans = Math.atan((b-up)*1.0/a)/pi*180;
		} else {
			ans = Math.atan(b*1.0/a)/pi*180;
		}
		System.out.println(df.format(ans));
	}
}
