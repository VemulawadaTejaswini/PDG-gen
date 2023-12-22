import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int dataSet = in.nextInt();
	for (int i = 0; i < dataSet; i++) {
	 double[] x = new double[2];
	 double[] y = new double[2];
	 double[] r = new double[2];
	 for (int j = 0; j < r.length; j++) {
		x[j] = in.nextDouble();
		y[j] = in.nextDouble();
		r[j] = in.nextDouble();
	 }
	 double l = Math.hypot(x[0] - x[1], y[0] - y[1]);
	 if (r[0] + r[1] < l) {
		System.out.println(0);
	 } else {
		double c = (r[0] - r[1]);
		if (l < c) {
		 System.out.println(2);
		} else if (l < -c) {
		 System.out.println(-2);
		} else {
		 System.out.println(1);
		}
	 }
	}
 }
}