import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Built using CHelper plug-in Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputReader in = new InputReader(System.in);
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), true);
		TaskB solver = new TaskB();
		solver.solve(1, in, out);
		out.flush();
		out.close();
	}
}

class Pair<A, B> {
	A first;
	B second;

	Pair(A first, B second) {
		this.first = first;
		this.second = second;
	}

}

class TaskB {
	static int INF = (int) 1e9;

	public void solve(int testNumber, InputReader in, PrintWriter pw) {
		String s = in.next();
		String t = in.next();
		Pair<Integer, Pair<Integer, Integer>> dp[][] = new Pair[s.length() + 1][t.length() + 1];
		// stores the length of subsequence up till this point in the iteration
		for (int i = 0; i <= s.length(); i++) {
			for (int j = 0; j <= t.length(); j++) {
				dp[i][j] = new Pair<Integer, Pair<Integer, Integer>>(-INF, new Pair<Integer, Integer>(0, 0));
			}
		}
		dp[0][0] = new Pair<Integer, Pair<Integer, Integer>>(0, new Pair<Integer, Integer>(0, 0));
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < t.length(); j++) {
				if (s.charAt(i) == t.charAt(j)) {
					dp[i + 1][j + 1] = dp[i + 1][j + 1].first >= new Pair<Integer, Pair<Integer, Integer>>(
							dp[i][j].first + 1, new Pair<Integer, Integer>(i, j)).first ? dp[i + 1][j + 1]
									: new Pair<Integer, Pair<Integer, Integer>>(dp[i][j].first + 1,
											new Pair<Integer, Integer>(i, j));
				}
				dp[i + 1][j] = dp[i + 1][j].first >= new Pair<Integer, Pair<Integer, Integer>>(dp[i][j].first,
						new Pair<Integer, Integer>(i, j)).first ? dp[i + 1][j]
								: new Pair<Integer, Pair<Integer, Integer>>(dp[i][j].first,
										new Pair<Integer, Integer>(i, j));
				dp[i][j + 1] = dp[i][j + 1].first >= new Pair<Integer, Pair<Integer, Integer>>(dp[i][j].first,
						new Pair<Integer, Integer>(i, j)).first ? dp[i][j + 1]
								: new Pair<Integer, Pair<Integer, Integer>>(dp[i][j].first,
										new Pair<Integer, Integer>(i, j));

			}
		}
//		for (int i = 0; i < s.length + 1; i++) {
//			for (int j = 0; j < t.length + 1; j++) {
//				pw.print(dp[i][j].first + " ");
//			}
//			pw.println();
//		}
		Pair<Integer, Pair<Integer, Integer>> ans = dp[0][0];
		for (int j = 0; j <= t.length(); j++) {
			if (dp[s.length()][j].first >= ans.first) {
				ans = new Pair<Integer, Pair<Integer, Integer>>(dp[s.length()][j].first,
						new Pair<Integer, Integer>(s.length(), j));
			}
		}
		for (int i = 0; i <= s.length(); i++) {
			if (dp[i][t.length()].first >= ans.first) {
				ans = new Pair<Integer, Pair<Integer, Integer>>(dp[i][t.length()].first,
						new Pair<Integer, Integer>(i, t.length()));
			}
		}
//		pw.println(ans.second.first + " " + ans.second.second);
		StringBuilder str = new StringBuilder("");
		Pair<Integer, Integer> cur = ans.second;
		while (!FirstRow_Col(cur)) {
			int first = cur.first;
			int second = cur.second;
			Pair<Integer, Integer> prev = dp[first][second].second;
//			System.out.println(dp[first][second].second.first + " " + dp[first][second].second.second);
			if (prev.first == first - 1 && prev.second == second - 1) {
				str.append(s.charAt(first - 1));
			}
			cur = prev;
		}
		for (int i = 0; i < str.length(); i++) {
			pw.print(str.charAt(str.length() - 1 - i));
		}
	}

	boolean FirstRow_Col(Pair<Integer, Integer> pair) {
		return pair.first == 0 || pair.second == 0;
	}

	int __gcd(int a, int b) {
		if (b == 0)
			return a;
		return __gcd(b, a % b);

	}

	public int getInt(int num) {
		int ret = -1;
		switch (num) {
		case 0:
			ret = 6;
			break;
		case 1:
			ret = 2;
			break;
		case 2:
			ret = 5;
			break;
		case 3:
			ret = 5;
			break;
		case 4:
			ret = 4;
			break;
		case 5:
			ret = 5;
			break;
		case 6:
			ret = 6;
			break;
		case 7:
			ret = 3;
			break;
		case 8:
			ret = 7;
			break;
		case 9:
			ret = 6;
			break;
		}
		return ret;
	}

	public int isPow(long num) {
		int count = 0;
		while (num > 0) {
			num /= 2;
			count++;
		}
		return count;
	}
}

class InputReader {
	BufferedReader br;
	StringTokenizer st;

	public InputReader(InputStream in) {
		br = new BufferedReader(new InputStreamReader(in));
		st = null;
	}

	public String next() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
