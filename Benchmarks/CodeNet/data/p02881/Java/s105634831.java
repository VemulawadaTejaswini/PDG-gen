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
	public Solution () {
		reader = new Reader();
		while (reader.hasNext()) {
			run_case();
		}
	}
	private void run_case() {
		long n = Long.parseLong(reader.ns());

		long min_sum = (long)1e12+5;
		for (long cur = 1; cur * cur <= n; cur ++) {
	        if (n % cur == 0) {
	            long a = cur;
	            long b = n / cur;
				min_sum = Math.min(min_sum, a + b);
	            // System.out.println(a + " " + b);
	        }
	    }

		System.out.println(min_sum - 2);

		return;
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
	public String ns() {return this.next();}
}
