//--- pB ---//
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
		int t_h = reader.ni();
		int t_s = reader.ni();
		int a_h = reader.ni();
		int a_s = reader.ni();
		int dir = 1;

		int res = 0; // 0 -> t

		while (true) {
			if (dir == 1) {
				a_h -= t_s;
				if (a_h <= 0) {
					res = 0;
					break;
				}
			} else {
				t_h -= a_s;
				if (t_h <= 0) {
					res = 1;
					break;
				}
			}
			dir ^= 1;
		}

		if (res == 0) {
			out.println("Yes");
		} else {
			out.println("No");
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
	public long nl() {return Long.parseLong(this.next());}
	public String ns() {return this.next();}
}
