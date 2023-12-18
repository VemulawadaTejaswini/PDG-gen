import java.io.*;
import java.util.*;

public class Main {
	
	int[] solve(String s) {
		int z = s.indexOf('0');
		int n = s.length() / 2;
		int[] ans = new int[2 * n];
		Arrays.fill(ans, -1);
		if (z == -1) {
			if (n % 2 == 0) {
				for (int i = 0; i < n; i += 2) {
					ans[4 * i] = ans[4 * i + 2] = i;
					ans[4 * i + 1] = ans[4 * i + 3] = i + 1;
				}
				return ans;
			} else {
				return null;
			}
		}
		
		int[] from = new int[2 * n];
		int[] lens = new int[2 * n];
		int sz = 0;
		
		int len = 0;
		int start = -1;
		for (int j = z + 1; ; j = (j + 1) % (2 * n)) {
			if (s.charAt(j) == '0') {
				if (len > 0) {
					from[sz] = start;
					lens[sz] = len;
					sz++;
					len = 0;
				}
			} else {
				if (len == 0) {
					start = j; 
				}
				len++;
			}
			if (j == z) {
				break;
			}
		}
		
		int tot = 0;
		int k0 = -1, k1 = -1;
		for (int i = 0; i < sz; i++) {
			tot += lens[i] - 1;
			if (lens[i] > 1) {
				if (k0 == -1) {
					k0 = i;
				} else if (k1 == -1) {
					k1 = i;
				}
			}
		}
		
		if (tot % 2 != 0) {
			return null;
		}
		
		int ptr = 0;
		if (tot % 4 == 0) {
			ArrayList<Integer> mids = new ArrayList<>();
			for (int i = 0; i < sz; i++) {
				int x = Math.floorMod(from[i] + lens[i] - 1, 2 * n);
				int y = Math.floorMod(from[(i + 1) % sz] - 1, 2 * n);
				ans[x] = ans[y] = ptr++;
				
				for (int j = 0; j < lens[i] - 1; j++) {
					mids.add((from[i] + j) % (2 * n));
				}
			}
			
			for (int i = 0; i < mids.size(); i += 4) {
				ans[mids.get(i)] = ans[mids.get(i + 2)] = ptr++;
				ans[mids.get(i + 1)] = ans[mids.get(i + 3)] = ptr++;
			}
			
			int left = 2;
			for (int i = 0; i < 2 * n; i++) {
				if (ans[i] == -1) {
					ans[i] = ptr;
					left--;
					if (left == 0) {
						left = 2;
					}
				}
			}
			
			return ans;
		}
		
		throw new AssertionError();
	}

	void submit() {
		int n = nextInt();
		String s = "1" + nextToken();
		
		int[] ans = solve(s);
		if (ans == null) {
			out.println("No");
		} else {
			out.println("Yes");
			for (int x : ans) {
				out.print((x + 1) + " ");
			}
			out.println();
		}

	}

	void preCalc() {

	}

	void stress() {

	}

	void test() {

	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		preCalc();
		submit();
		//stress();
		//test();
		out.close();
	}

	static final Random rng = new Random();

	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	int nextInt() {
		return Integer.parseInt(nextToken());
	}

	long nextLong() {
		return Long.parseLong(nextToken());
	}

	double nextDouble() {
		return Double.parseDouble(nextToken());
	}
}
