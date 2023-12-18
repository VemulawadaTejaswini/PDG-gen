//--- pD ---//
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		new Solution();
	}
}
class Solution {
	Reader reader;
	PrintWriter out;
	public Solution() {
		reader = new Reader();
		out = new PrintWriter(System.out);
		while (reader.hasNext()) {
			run_case();
		}
		out.flush();
	}

	private void run_case() {
		long a = reader.nl();
		long b = reader.nl();
		long n = reader.nl();

		double res = 0.0;
		double pv = -1e9;

		if (n >= b-1) {
			long x = b-1;
			double t = Math.floor(1.0*a*x/b) - a*Math.floor(1.0*x/b);
			out.println((long)t);
		} else {
			long x = n;
			double t = Math.floor(1.0*a*x/b) - a*Math.floor(1.0*x/b);
			out.println((long)t);
		}

		// for (long x=1; x<=n; x++) {
		// // long x = Math.max(n, b-1;
		// 	double t = Math.floor(1.0*a*x/b) - a*Math.floor(1.0*x/b);
		// 	System.out.println(t + " x = " + x);
		// 	// if (t < pv) {
		// 	// 	out.println((long)t);
		// 	// 	return;
		// 	// }
		// // 	pv = t;
		// }
		// out.println(pv);
		return;
	}
}
// floor(Ax/B) - A * floor(x/B);

// 3.33 - 3 = 0.33


class Reader {
	BufferedReader br;
	StringTokenizer st;
	public Reader(){
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String next() {
		if (st.hasMoreTokens()) return st.nextToken();
		try {
			st = new StringTokenizer(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return st.nextToken();
	}
	public boolean hasNext() {
		try {
			if (!st.hasMoreTokens() && !br.ready()) return false;
			else return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public int ni() {return Integer.parseInt(this.next());}
	public long nl() {return Long.parseLong(this.next());}
	public String ns() {return this.next();}
}
