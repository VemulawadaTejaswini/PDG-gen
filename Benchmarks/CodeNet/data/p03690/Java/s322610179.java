import java.io.*;
import java.util.*;

public class Main {

	static class Number implements Comparable<Number> {
		int val, pos;

		public Number(int val, int pos) {
			this.val = val;
			this.pos = pos;
		}

		@Override
		public int compareTo(Number o) {
			return Integer.compare(val, o.val);
		}
	}
	
	int get(int[] p, int v) {
		return p[v] == v ? v : (p[v] = get(p, p[v]));
	}
	
	boolean unite(int a, int b, int[] p){
		a = get(p, a);
		b = get(p, b);
		if (a == b) {
			return false;
		}
		p[a] = b;
		return true;
	}
	
	int go(int[] a, int[] b) {
		int n = a.length;
		Number[] na = new Number[n];
		Number[] nb = new Number[n];
		int sz = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] != b[i]) {
				na[sz] = new Number(a[i], i);
				nb[sz] = new Number(b[i], i);
				sz++;
			}
		}
		na = Arrays.copyOf(na, sz);
		nb = Arrays.copyOf(nb, sz);
		
		Arrays.sort(na);
		Arrays.sort(nb);
		
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = i;
		}
		
		int comps = sz;
		
		for (int i = 0; i < sz; i++) {
			int j = i;
			while (j < sz && na[i].val == na[j].val) {
				j++;
			}
			
			for (int k = i; k < j; k++) {
				if (nb[k].val != na[k].val) {
					return Integer.MAX_VALUE;
				}
			}
			
			for (int k = i; k + 1 < j; k++) {
				if (unite(na[k].pos, na[k + 1].pos, p)) {
					comps--;
				}
				if (unite(nb[k].pos, nb[k + 1].pos, p)) {
					comps--;
				}
			}
			
			if (unite(na[j - 1].pos, nb[i].pos, p)) {
				comps--;
			}
			
			i = j;
		}
		
		return sz + comps;
	}

	void submit() {
		int n = nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = nextInt();
		}

		for (int i = 0; i < n; i++) {
			b[i] = nextInt();
		}

		int xor = 0;
		for (int x : a) {
			xor ^= x;
		}

		long delta = 0;

		for (int x : a) {
			delta -= x;
		}

		for (int y : b) {
			delta += y;
		}

		int ret = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			if (b[i] == xor) {
				long newVal = b[i] + delta;
				if (newVal >= 0 && newVal < (1L << 30)) {
					int[] newB = b.clone();
					newB[i] = (int) newVal;
					ret = Math.min(ret, Math.max(go(a, newB) - 1, 0));
				}
			}
		}

		ret = Math.min(ret, go(a, b));
		if (ret < 1_000_000) {
			out.println(ret);
		} else {
			out.println(-1);
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
		// stress();
		// test();
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
