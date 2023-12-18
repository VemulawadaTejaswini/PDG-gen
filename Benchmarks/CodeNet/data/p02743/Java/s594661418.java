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
		// 2 * sq(ab) < c - a - b
		long a = Long.parseLong(reader.ns());
		long b = Long.parseLong(reader.ns());
		long c = Long.parseLong(reader.ns());
		// long t = c - a - b;
		// t /= 2;
		long ab = a * b;
		long t = c - a - b;

		if (t <= 0) {
			System.out.println("No");
			return;
		}


		// 4 * ab < t*t
		long L = 4L * ab;
		long R = t * t;
		if (L < R) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
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
