import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0021
public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N;
	static final double EPS = 1e-8;
	public static void main(String[] args) {
		N = sc.nextInt();
		double[] x = new double[4], y = new double[4];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 4; j++) {
				x[j] = sc.nextDouble();
				y[j] = sc.nextDouble();
			}
			
			if (y[1] > y[0]) {
				double t = y[1];
				y[1] = y[0];
				y[0] = t;
				t = x[1];
				x[1] = x[0];
				x[0] = t;
			}

			if (y[3] > y[2]) {
				double t = y[3];
				y[3] = y[2];
				y[2] = t;
				t = x[3];
				x[3] = x[2];
				x[2] = t;
			}
			
			/*
			for (int j = 0; j < 4; j++) {
				System.out.println((j + 1) + ": (" + x[j] + ", " + y[j] + ")" );
			}
			*/
			
			
			double r1 = hypot(x[1] - x[0], y[1] - y[0]);
			double r2 = hypot(x[3] - x[2], y[3] - y[2]);
			double r3 = hypot(x[1] - x[0], 0);
			double r4 = hypot(x[3] - x[2], 0);
			
			double aA = r3 / r1;
			double aB = r4 / r2;
			
			if (x[1] < x[0])
				aA *= -1;

			if (x[3] < x[2])
				aB *= -1;

			if (abs(aA - aB) < EPS) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}