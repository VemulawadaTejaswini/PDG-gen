
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main{

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if(n == 0) break;
			long[] d = new long[n], v = new long[n];
			d[0] = sc.nextLong(); v[0] = sc.nextLong();
			long nume = d[0], deno = v[0];
			for(int i=1;i<n;i++) {
				d[i] = sc.nextLong(); v[i] = sc.nextLong();
				long div = gcd(d[i], v[i]); 
				d[i] /= div; v[i] /= div;
				nume = lcm(nume, d[i]);
				deno = gcd(deno, v[i]);
				debug(deno, nume);
			}
			for(int i=0;i<n;i++) {
				debug(nume, v[i], d[i], deno);
				System.out.println(nume / d[i] * v[i] / deno  );				
			}
		}
	}
	
	long lcm(long x, long y) {
		return x / gcd(x, y) * y;
	}
	
	long gcd(long x, long y) {
		if(y == 0) return x;
		return gcd(y, x%y);
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}