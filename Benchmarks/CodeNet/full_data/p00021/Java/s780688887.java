import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn( new FileInputStream("src/aoj0021/aoj0021.in"));	
			System.setOut( new PrintStream( new FileOutputStream("src/aoj0021/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		for(int N = sc.nextInt(); N > 0; N--) {
			P a = new P(sc.nextDouble(), sc.nextDouble());
			P b = new P(sc.nextDouble(), sc.nextDouble());
			P c = new P(sc.nextDouble(), sc.nextDouble());
			P d = new P(sc.nextDouble(), sc.nextDouble());
			
			boolean parallel = abs(b.sub(a).cross(c.sub(d))) < EPS;
			System.out.println(parallel ? "YES" : "NO");
		}
	}
	double EPS = 1e-8;
	class P implements Comparable<P> {
		double x, y;
		P(double x, double y) {
			this.x = x;
			this.y = y;
		}
		P sub(P p) {
			return new P(x - p.x, y - p.y);
		}
		double dot(P p) {
			return x * p.x + y * p.y;
		}
		double cross(P p) {
			return x * p.y - y * p.x;
		}
		double abs() {
			return hypot(x, y);
		}
		public int compareTo(P o) {
			if (x != o.x) return Double.compare(x, o.x);
			return Double.compare(y, o.y);
		}
	}
}