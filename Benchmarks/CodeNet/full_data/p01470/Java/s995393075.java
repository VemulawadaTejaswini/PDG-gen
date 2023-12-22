
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		P x = new P(0, 1);
		for(int i=0;i<n;i++) {
			int op = sc.nextInt(), y = sc.nextInt();
			if( op==1 ) x.add(y);
			if( op==2 ) x.add(-y);
			if( op==3 ) x.mlt(y);
			if( op==4 ) x.div(y);
		}
		System.out.println(x.toInt());
	}
	
	class P {
		long x, y;
		P(long x, long y) {
			this.x = x;
			this.y = y;
		}
		
		void add(long v) {
			x += v * y;
		}
		
		void mlt(long v) {
			long gcd = gcd(v, y);
			x *= v / gcd;
			y /= gcd;
		}
		
		void div(long v) {
			long gcd = gcd(v, x);
			y *= v / gcd;
			x /= gcd;
		}
		
		long gcd(long a, long b) {
			if( b == 0) return a;
			return gcd(b, a%b);
		}
		
		long toInt() {
			return x / y;
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}