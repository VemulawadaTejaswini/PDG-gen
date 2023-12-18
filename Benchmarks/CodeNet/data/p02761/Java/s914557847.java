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
		int N = ni(), M = ni();
		int[] res = new int[N];
		for (int i=0; i<M; i++) {
			int s = ni(), c = ni();

			if (res[s - 1] != 0 && res[s - 1] != c) {
				System.out.println("-1");
				return;
			}
			if (N!=1 && s==1 && c==0) {
				System.out.println("-1");
				return;
			}

			res[s - 1] = c;
		}

		if (N != 1 && res[0] == 0) res[0] = 1;
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<N; i++) {
			sb.append(res[i]);
		}
		System.out.println(sb.toString());

		return;
	}
	private int ni() {return Integer.parseInt(reader.next());}
	private String ns() {return reader.next();}
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
}
