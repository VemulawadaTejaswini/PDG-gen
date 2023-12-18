//--- pE ---//
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
		int N = reader.ni();
		String str = reader.ns();

		List<BIT> list_st = new ArrayList<>();
		for (int i=0; i<26; i++) list_st.add(new BIT(N+1));
		// SegmentTreeRSQ st = new SegmentTreeRSQ(1, N);
		for (int i=0; i<str.length(); i++) {
			int idx = str.charAt(i) - 'a';
			// int t = (int)list_st.get(idx).query(i + 1, i + 1);
			list_st.get(idx).addVal(i, 1);
		}

		int Q = reader.ni();
		StringBuilder str_sb = new StringBuilder(str);
		for (;Q-->0;) {
			// int[] arr = strToIntArray(scanner.nextLine());
			// String[] vals = scanner.nextLine().split("\\s+");

			int q = reader.ni();

			if (q == 1) {
				int i = reader.ni();
				char c = reader.ns().charAt(0);
				int n = str_sb.charAt(i-1) - 'a';
				int m = c - 'a';

				// int t = (int)list_st.get(n).query(i, i);
				list_st.get(n).addVal(i-1, -1);

				str_sb.setCharAt(i-1, c);

				// t = (int)list_st.get(m).query(i, i);
				list_st.get(m).addVal(i-1, 1);
			} else {
				int l = reader.ni()-1;
				int r = reader.ni()-1;
				int cnt = 0;
				for (int i=0; i<26; i++) {
					if (list_st.get(i).getSum(l, r) > 0) cnt ++;
				}
				System.out.println(cnt);
			}
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

class BIT {
	public long[] arr;
	public BIT(int n) {
		arr = new long[n];
	}
	public long getSum(int i) {
		long sum = 0;
		for(i++;i > 0;i -= i&-i)sum += arr[i];
		return sum;
	}
	public long getSum(int l, int r) {
		return getSum(r) - getSum(l-1);
	}
	public void addVal(int i, long v) {
		if(v == 0)return;
		int n = arr.length;
		for(i++;i < n;i += i&-i)arr[i] += v;
	}
}
