import java.io.*;
import java.util.*;

public class Main {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;

	static class State {
		int[][] a;

		public State(int[][] a) {
			this.a = a;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			for (int[] row : a) {
				for (int x : row) {
					result = result * prime + x;
				}
			}
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			State other = (State) obj;
			if (!Arrays.deepEquals(a, other.a))
				return false;
			return true;
		}

	}

	HashSet<State> states = new HashSet<>();

	int[][] deepCopy(int[][] a) {
		int[][] b = new int[a.length][];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i].clone();
		}
		return b;
	}

	void dfs(State s, int r, int c) {

		states.add(s);

		for (int i = 0; i < r; i++) {

			int[][] newA = deepCopy(s.a);
			for (int j1 = 0, j2 = c - 1; j1 < j2; j1++, j2--) {

				int tmp = newA[i][j1];
				newA[i][j1] = newA[i][j2];
				newA[i][j2] = tmp;
			}

			State newS = new State(newA);

			if (!states.contains(newS)) {
				dfs(newS, r, c);
			}
		}

		for (int j = 0; j < c; j++) {

			int[][] newA = deepCopy(s.a);
			for (int i1 = 0, i2 = r - 1; i1 < i2; i1++, i2--) {

				int tmp = newA[i1][j];
				newA[i1][j] = newA[i2][j];
				newA[i2][j] = tmp;
			}

			State newS = new State(newA);

			if (!states.contains(newS)) {
				dfs(newS, r, c);
			}
		}

	}

	void go(int r, int c) {
		int[][] a = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j] = i * c + j;
			}
		}

		State s = new State(a);

		states.clear();

		dfs(s, r, c);

		System.err.println(states.size());
		System.err.println(fastCount(r, c));

		for (State endS : states) {
			// System.err.println(Arrays.deepToString(endS.a));
		}
	}
	
	int pow(int a, int b) {
		if (b == 0) {
			return 1;
		}
		if ((b & 1) == 0) {
			int ret = pow(a, b / 2);
			return ret * ret; 
		}
		return a * pow(a, b - 1);
	}

	int fastCount(int r, int c) {
		
		if (r == 1 || c == 1) {
			return (r * c == 1) ? 1 : 2;
		}
		
		int ret = pow(24, (r / 2) * (c / 2));
		
		if (r % 2 == 1) {
			ret *= 2;
		}
		
		if (c % 2 == 1) {
			ret *= 2;
		}
		
		return ret;
	}

	void solve() throws IOException {
		int r = nextInt();
		int c = nextInt();
		
		char[][] f = new char[r][];
		
		for (int i = 0; i < r; i++) {
			f[i] = nextToken().toCharArray();
		}
		
		if (r > c) {
			
			char[][] newF = new char[c][r];
			
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					newF[j][i] = f[i][j];
				}
			}
			
			f = newF;
			
			int tmp = r;
			r = c;
			c = tmp;
			
		}
		
//		if (r == 1) {
//			
//			out.println(isPalindrome(f[0]) ? 1 : 2);
//			return;
//		}
		
		int ans = 1;
		int p = 1_000_000_007;
		
		for (int i = 0; i < r / 2; i++) {
			for (int j = 0; j < c / 2; j++) {
				
				char[] arr = {f[i][j], f[r - 1 - i][j], f[i][c - 1 - j], f[r - 1 - i][c - 1 - j]};
				
				
				ans = (int)((long)ans * go(arr) % p);
			}
		}
		
		if (r % 2 == 1) {
			ans *= isPalindrome(f[r / 2]) ? 1 : 2;
			ans %= p;
		}
		
		if (c % 2 == 1) {
			char[] tmp = new char[r];
			for (int i = 0; i < r; i++) {
				tmp[i] = f[i][c / 2];
			}
			
			ans *= isPalindrome(f[r / 2]) ? 1 : 2;
			ans %= p;
		}
		
		
		out.println(ans);
		
		
	}
	
	boolean isPalindrome(char[] c) {
		String s = new String(c);
		String revS = new StringBuilder(s).reverse().toString();
		
		return s.equals(revS);
	}
	
	int[] fact = {1, 1, 2, 6, 24};

	int go(char[] arr) {
		int[] cnt = new int[26];
		for (char c : arr) {
			cnt[c - 'a']++;
		}
		
		int ret = fact[arr.length];
		for (int x : cnt) {
			ret /= fact[x];
		}
		return ret;
	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		
//		go(4, 4);
		solve();
		out.close();
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (Exception e) {
				eof = true;
				return null;
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			eof = true;
			return null;
		}
	}

	int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}
}