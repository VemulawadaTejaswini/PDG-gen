import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		double v = Math.pow(a, 2)*b/2;
		double ans = 0;
		if (x<=v) {
			double s = 2*x/(a*Math.pow(b, 2));
			ans = 90 - Math.atan(s)*180/Math.PI;
			System.out.println(ans);
		} else {
			double t = a/(2*b - (2*x/Math.pow(a,2)));
			ans = 90 - Math.atan(t)*180/Math.PI;
			System.out.println(ans);
		}

	}
}
