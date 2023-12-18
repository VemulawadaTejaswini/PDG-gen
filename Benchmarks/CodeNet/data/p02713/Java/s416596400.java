//--- pC ---//
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
		// int t = reader.ni();
		while (reader.hasNext()) {
			run_case();
		}
		out.flush();
	}

	private void run_case() {
		int n = reader.ni();
		long res = 0;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				for (int k=1; k<=n; k++) {
					res += gcd(k, gcd(i, j));
				}
			}
		}
		System.out.println(res);
		return;
	}

	private long gcd(long a, long b) {
	    if (b == 0) return a;
	    else return gcd(b, a%b);
	}
}

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
