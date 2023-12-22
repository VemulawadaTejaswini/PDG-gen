
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;sc.hasNext();) {
			double x[] = new double[4];
			double y[] = new double[4];
			for(int i=0;i<4;i++) {
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
			}
			
			x[0] -= x[1];
			y[0] -= y[1];
			x[2] -= x[3];
			y[2] -= y[3];
			if( x[0] * x[2] + y[0] * y[2] == 0 ) 
				System.out.println("YES");
			else System.out.println("NO");
		}
	}
	

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}