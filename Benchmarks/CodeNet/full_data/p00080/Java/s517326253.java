
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	double EPS = 1e-5;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			double q = sc.nextDouble();
			if( q == 0 ) { System.out.println(0.00000); continue; }
			if( q == -1 ) break;
			double x = q / 2;
			while( abs( x*x*x - q) >= EPS * q ) {
				x = f(x, q);
			}
//			debug(EPS*q);
			System.out.println( x);
		}
	}
	
	double f(double x, double q) {
		return x - (x*x*x - q) / ( 3 * x*x);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}