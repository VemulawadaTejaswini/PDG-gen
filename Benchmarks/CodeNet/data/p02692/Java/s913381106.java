//--- pF ---//
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

	int[] mem;
	int[] sel;
	private void run_case() {
		int n = reader.ni();

		int ab = 0, bc = 0, ac = 0;
		int a = reader.ni();
		int b = reader.ni();
		int c = reader.ni();

		mem = new int[3]; // ab ac bc; 1 -> a ..
		sel = new int[3];

		List<String> list_q = new ArrayList<>();

		for (int i=0; i<n; i++) {
			String s = reader.ns();
			list_q.add(s);
			if (s.equals("AB")) {
				ab++;
			} else if (s.equals("BC")) {
				bc++;
			} else {
				ac++;
			}
		}

		ab%=2; bc%=2; ac%=2;

		boolean ok = dfs(a, b, c, ab, ac, bc);

		List<String> t = new ArrayList<>();
		int ab_dir = 0, bc_dir = 0, ac_dir = 0;
		if (ok) {
			for (String q : list_q) {
				if (q.equals("AB")) {
					if (ab == 0) {
						if (a == 0 && b == 0) {
							out.println("No");
							return;
						}
						if (ab_dir == 0) {
							t.add("A");
						} else {
							t.add("B");
						}
						ab_dir ^= 1;
					} else {
						if (sel[0] == 1) {
							t.add("A");
							a ++; b--;
						} else {
							b ++; a--;
							t.add("B");
						}
						ab --;
					}
				} else if (q.equals("AC")) {
					if (ac == 0) {
						if (a == 0 && c == 0) {
							out.println("No");
							return;
						}
						if (ac_dir == 0) {
							t.add("A");
						} else {
							t.add("C");
						}
						ac_dir ^= 1;
					} else {
						if (sel[1] == 1) {
							a ++; c --;
							t.add("A");
						} else {
							a --; c ++;
							t.add("C");
						}
						ac --;
					}
				} else if (q.equals("BC")) {
					if (bc == 0) {
						if (c == 0 && b == 0) {
							out.println("No");
							return;
						}
						if (bc_dir == 0) {
							t.add("C");
						} else {
							t.add("B");
						}
						bc_dir ^= 1;
					} else {
						if (sel[2] == 2) {
							b ++; c --;
							t.add("B");
						} else {
							b --; c++;
							t.add("C");
						}
						bc --;
					}
				}
			}
			out.println("Yes");
			for (String u : t) out.println(u);
		} else {
			out.println("No");
		}

		return;
	}

	private boolean dfs(int a, int b, int c, int ab, int ac, int bc) {
		if (a < 0 || b < 0 || c < 0) return false;
		if (ab == 0 && bc ==0 && ac == 0) {
			if (a>=0&&b>=0&&c>=0) {
				for (int i=0; i<3; i++) sel[i] = mem[i];
				return true;
			}
			return false;
		}
		boolean res = false;
		if (ab > 0) {
			mem[0] = 1;
			res |= dfs(a+1, b-1, c, ab-1, ac, bc);
			mem[0] = 2;
			res |= dfs(a-1, b+1, c, ab-1, ac, bc);
			mem[0] = 0;
		}
		if (ac > 0) {
			mem[1] = 1;
			res |= dfs(a+1, b, c-1, ab, ac-1, bc);
			mem[1] = 3;
			res |= dfs(a-1, b, c+1, ab, ac-1, bc);
			mem[1] = 0;
		}
		if (bc > 0) {
			mem[2] = 2;
			res |= dfs(a, b+1, c-1, ab, ac, bc-1);
			mem[2] = 3;
			res |= dfs(a, b-1, c+1, ab, ac, bc-1);
			mem[2] = 0;
		}
		return res;
	}
}

// 8 6 9 1
// BC
// AB

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
