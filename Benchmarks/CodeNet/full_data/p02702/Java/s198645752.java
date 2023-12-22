// Original Problem - https://atcoder.jp/contests/abc164/tasks/abc164_d
// number of substring is divisible by target.

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
		String str = reader.ns();

		Map<Integer, Integer> cnt = new HashMap<>();
		cnt.put(0, 1);

		int p = 0;
		int t = 1;

		long ans = 0;

		int target = 2019;

		for (int i=str.length()-1; i>=0; i--) {
			p += t * str.charAt(i) - '0';
			p %= target;
			t *= 10;
			t %= target;
			cnt.putIfAbsent(p, 0);
			cnt.put(p, cnt.get(p) + 1);
			ans += cnt.get(p);
		}

		out.println(ans);

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
