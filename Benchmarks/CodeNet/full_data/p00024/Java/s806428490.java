
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double v = sc.nextDouble();
			double t = v / 9.8;
			int y = (int)(4.9 * t * t);
			y /= 5;
			System.out.println(y+2);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}