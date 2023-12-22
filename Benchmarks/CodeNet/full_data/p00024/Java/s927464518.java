import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/aoj0024/input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("src/xxxyyyy/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextDouble()) {
			System.out.println(solve(sc.nextDouble()));
		}
	}
	
	int solve(double d) {
		int hi = 987654321;
		int lo = 0;
		while( hi - lo > 1 ) {
			int mid = (hi + lo) >> 1;
			double height = 5.0 * mid - 5.0; 
			double t = sqrt(height / 4.9);
			double v = 9.8 * t;
			if( v >= d ) hi = mid;
			else lo = mid;
		}
		return hi;
	}
	
	void debug(Object... os) {
		System.err.println(deepToString(os));
	}
}