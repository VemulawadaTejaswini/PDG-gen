import java.io.*;
import java.util.*;

public class Main {

	int solve(char[] s) {
		int ptr = 0;
		int n = s.length;
		int ans = 0;
		ArrayList<Integer> lst = new ArrayList<>();
		while (true) {
			lst.clear();
			while (ptr < n && s[ptr] == '0') {
				ptr++;
			}
			if (ptr == n) {
				return ans;
			}
			int curOnes = 0;
			while (ptr < n) {
				if (s[ptr] == '1') {
					curOnes++;
				} else {
					if (curOnes == 0) {
						break;
					} else {
						lst.add(curOnes);
						curOnes = 0;
					}
				}
				ptr++;
			}
			ans += go(lst);
		}
	}
	
	int go(ArrayList<Integer> lst) {
		int n = lst.size() - 1;
		if (n == 0) {
			return 0;
		}
		int[][] dp = new int[n + 1][3];
		// skip, takeL, takeR
		for (int i = 0; i < n; i++) {
			int szL = lst.get(i);
			int szR = lst.get(i + 1);
			dp[i + 1][0] = Math.max(Math.max(dp[i][0], dp[i][1]), dp[i][2]);
			dp[i + 1][1] = dp[i][0] + szL;
			if (szL > 1) {
				dp[i + 1][1] = Math.max(dp[i + 1][1], dp[i][1] + szL - 1);
			}
			
			dp[i + 1][2] = dp[i][0] + szR;
			if (szL > 1) {
				dp[i + 1][2] = Math.max(dp[i + 1][2], dp[i][1] + szR);
				dp[i + 1][2] = Math.max(dp[i + 1][2], dp[i][2] + szR - 1);
			}
		}
		
		return Math.max(Math.max(dp[n][0], dp[n][1]), dp[n][2]);
	}
	
	void submit() {
		int n = nextInt();
		char[] s = nextToken().toCharArray();
		out.println(solve(s));
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
