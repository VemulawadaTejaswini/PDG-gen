//--- pA ---//
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
		int h1 = reader.ni();
		int m1 = reader.ni();
		int h2 = reader.ni();
		int m2 = reader.ni();
		int k = reader.ni();

		int a = h1 * 60 + m1;
		int b = h2 * 60 + m2;

		int p = b - a;
		p -= k;

		p = Math.max(0, p);

		out.println(p);
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
	public long nl() {return Long.parseLong(this.next());}
	public String ns() {return this.next();}
}
