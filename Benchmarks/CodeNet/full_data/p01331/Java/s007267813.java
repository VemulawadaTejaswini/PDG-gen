
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;

public class Main{
	InputStream is;
	PrintWriter out;
	String INPUT = "./data/judge/201709/A2214.txt";

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

static final int MOD = 1000000007;
	
	class Wormhole implements Comparable<Wormhole>{
		int x1;
		int y1;
		int x2;
		int y2;
		
		public Wormhole(int x1, int y1, int x2, int y2) {
			this.x1 = x1;
			this.x2 = x2;
			this.y1 = y1;
			this.y2 = y2;
		}

		@Override
		public int compareTo(Wormhole that) {
			return this.x1 != that.x1 ? this.x1 - that.x1 : this.y1 - that.y1;
		}
	}
	
	List<Wormhole> holes;
	
	void solve() {
		
		init_factorial();
		
		while (true) {
			int n = ni();
			int m = ni();
			int k = ni();
			
			if (n == 0 && m == 0 && k == 0) break;
			holes = new ArrayList<>();
			n --;
			m --;
			for (int i = 0; i < k; ++i) {
				int x1 = ni();
				int y1 = ni();
				int x2 = ni();
				int y2 = ni();
				holes.add(new Wormhole(x1 - 1, y1 - 1, x2 - 1, y2 - 1));
			}
			
			Collections.sort(holes);
			holes.add(new Wormhole(n, m, n + 1, m + 1));
			
			int[] dp = new int[k + 16];
			for (int i = 0; i <= k; ++i) {
				Wormhole hole = holes.get(i);
				dp[i] = nck(hole.x1+ hole.y1, hole.x1);
				for (int j = 0; j < i; ++j) {
					Wormhole prev = holes.get(j);
					dp[i] = add(dp[i], mul(dp[j], sub(calc(prev.x2, prev.y2, hole.x1, hole.y1), 
													  calc(prev.x1, prev.y1, hole.x1, hole.y1))));
				}
			}
			
			out.println(dp[k]);
		}
	}
	
	/************************* mod_fact && mod_comb*****************************/
	int add(int a, int b) {
		return (a + b) % MOD;
	}
	
	int sub(int a, int b) {
		return (a - b + MOD) % MOD;
	}
	
	int mul(long a, long b) {
		return (int) (((a * b)) % MOD);
	}
	
	int[] fact = new int[200010];
	
	void init_factorial() {
		fact[0] = 1;
		for (int i = 1; i < 200000; ++i) {
			fact[i] = mul(fact[i - 1], i);
		}
	}
	
	class GCD{
		int d;
		int x;
		int y;
		public GCD(int d, int x, int y) {
			this.d = d;
			this.x = x;
			this.y = y;
		}
	}
	
	GCD extgcd(int a, int b) {
		if (b == 0) return new GCD(a, 1, 0);
		else {
			GCD p   = extgcd(b, a % b);
			GCD ans = new GCD(0, 0, 0);
			ans.d = p.d;
			ans.x = p.y;
			ans.y = p.x - (a / b) * p.y;
			return ans;
		}
	}
	
	int inv(int a, int m) {
		GCD p = extgcd(a, m);
		if (p.d != 1) return -1;
		return (p.x % m + m) % m;
	}
	
	int nck(int n, int k) {
		return mul(mul(fact[n], inv(fact[n - k], MOD)), inv(fact[k], MOD));
	}
	
	int calc(int x1, int y1, int x2, int y2) {
		if (x2 < x1 || y2 < y1) return 0;
		return nck(x2 - x1 + y2 - x1, x2 - x1);
	}

	void run() throws Exception {
		is = oj ? System.in : new FileInputStream(new File(INPUT));
		out = new PrintWriter(System.out);

		long s = System.currentTimeMillis();
		solve();
		out.flush();
		tr(System.currentTimeMillis() - s + "ms");
	}

	private byte[] inbuf = new byte[1024];
	public int lenbuf = 0, ptrbuf = 0;

	private int readByte() {
		if (lenbuf == -1)
			throw new InputMismatchException();
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = is.read(inbuf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (lenbuf <= 0)
				return -1;
		}
		return inbuf[ptrbuf++];
	}

	private boolean isSpaceChar(int c) {
		return !(c >= 33 && c <= 126);
	}

	private int skip() {
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}

	private double nd() {
		return Double.parseDouble(ns());
	}

	private char nc() {
		return (char) skip();
	}

	private String ns() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != '
									// ')
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	private char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n && !(isSpaceChar(b))) {
			buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}

	private char[][] nm(int n, int m) {
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}

	private int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}

	private int ni() {
		int num = 0, b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private long nl() {
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private boolean oj = System.getProperty("ONLINE_JUDGE") != null;

	private void tr(Object... o) {
		if (!oj)
			System.out.println(Arrays.deepToString(o));
	}
}