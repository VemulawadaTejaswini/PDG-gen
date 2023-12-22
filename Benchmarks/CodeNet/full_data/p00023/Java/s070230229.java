import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn( new FileInputStream("src/aoj0023/input.txt"));	
			System.setOut( new PrintStream( new FileOutputStream("src/aoj0023/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}
	void run() {
		Scanner sc = new Scanner(System.in);
		for (int N = sc.nextInt(); N > 0; N--) {
			System.out.println(solve(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),
					sc.nextDouble(),sc.nextDouble(),sc.nextDouble()));
		}
	}
	
	double EPS = 1e-8;

	int solve(double xa, double ya, double ra, double xb, double yb, double rb) {
		double dist = hypot(xa - xb, ya - yb);
		if (dist > ra + rb + EPS)
			return 0;
		else if (ra > rb) {
			if (dist + rb < ra)
				return 2;
		} else if (ra < rb) {
			if (dist + ra < rb)
				return -2;
		}
		return 1;
	}
	
	void debug(Object...os) {
		System.err.println(deepToString(os));
	} 
}