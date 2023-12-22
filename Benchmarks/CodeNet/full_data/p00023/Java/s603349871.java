import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0023
public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N;
	static final double EPS = 1e-10;
	public static void main(String[] args) {
		N = sc.nextInt();
		double xa, ya, ra, xb, yb, rb;
		for (int i = 0; i < N; i++) {
			xa = sc.nextDouble();
			ya = sc.nextDouble();
			ra = sc.nextDouble();
			xb = sc.nextDouble();
			yb = sc.nextDouble();
			rb = sc.nextDouble();
			System.out.println(collision_detection(xa, ya, ra, xb, yb, rb));
		}
	}
	
	static int collision_detection(
			double x1, double y1, double r1,
			double x2, double y2, double r2) {
		double d = hypot(x1 - x2, y1 - y2);
		double lR = r1 + r2;
		double sR = abs(r1 - r2);
		if (d > lR) {
			return 0;
		} else if (d < lR && sR < d){
			return 1;
		} else if (sR > d) {
			return (r1 > r2) ? 2 : -2;
		} else {
			return 1;
		}
	}
}