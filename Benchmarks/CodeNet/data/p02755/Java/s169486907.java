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
		int a = reader.ni(), b = reader.ni();


		double a_l = a * 12.5;
		double a_r = (a + 1) * 12.5;
		double b_l = b * 10;
		double b_r = ((b + 1) * 10) - 1;

		// System.out.println(a_l + " " + a_r);
		// System.out.println(b_l + " " + b_r);

		if (a_l >= b_l && a_l <= b_r) {
			System.out.println((int)Math.ceil(a_l));
			// System.out.println("-1");
			return;
		} else {
			// System.out.println(Math.ceil(a_l));
			System.out.println("-1");
			return;
		}

		// return;
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
