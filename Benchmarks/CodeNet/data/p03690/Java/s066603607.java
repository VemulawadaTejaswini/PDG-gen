import java.io.*;
import java.util.*;

public class Main {

	static long start;
	
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
	
	int go(int[] a, int[] b, int pos) {
//		System.err.println(Arrays.toString(a));
//		System.err.println(Arrays.toString(b));
		int n = a.length;
		Number[] na = new Number[n];
		Number[] nb = new Number[n];
		int sz = 0;
		for (int i = 0; i < n; i++) {
			if (i == pos || a[i] != b[i]) {
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
		
		for (int i = 0; i < sz;) {
			int j = i;
			while (j < sz && na[i].val == na[j].val) {
				j++;
			}
			
			for (int k = i; k < j; k++) {
				if (nb[k].val != na[k].val) {
					return INF;
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
	
	static final int INF = Integer.MAX_VALUE / 2;
	
	int solve(int[] a, int[] b) {
		int n = a.length;
		int xor = 0;
		for (int x : a) {
			xor ^= x;
		}
		
		boolean ret0 = true;
		for (int i = 0; i < n; i++) {
			ret0 &= a[i] == b[i];
		}
		
		if (ret0) {
			return 0;
		}

		long delta = 0;

		for (int x : a) {
			delta -= x;
		}

		for (int y : b) {
			delta += y;
		}

		int ret = INF;

		HashSet<Integer> whatA = new HashSet<>();
		
		for (int i = 0; i < n; i++) {
			if (b[i] == xor) {
				long newVal = b[i] - delta;
				if (newVal >= 0 && newVal < (1L << 30)) {
					int[] newB = b.clone();
					newB[i] = (int) newVal;
					int tmp = go(a, newB, i);
					if (tmp == INF) {
						break;
					}
					
					if (whatA.contains(a[i])) {
						continue;
					}
					whatA.add(a[i]);
					
					if (System.currentTimeMillis() - start > 1000) {
						break;
					}
					
					ret = Math.min(ret, Math.max(tmp - 1, 1));
				}
			}
		}

		ret = Math.min(ret, go(a, b, -1));
		if (ret < 1_000_000) {
			return ret;
		} else {
			return -1;
		}
	}
	
	static class State {
		int[] a;

		public State(int[] a) {
			this.a = a;
		}

		@Override
		public int hashCode() {
			int result = 1;
			for (int x : a) {
				result = result * 57 + x;
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
			if (!Arrays.equals(a, other.a))
				return false;
			return true;
		}
		
	}
	
	int slow(int[] a, int[] b) {
		State init = new State(a);
		State goal = new State(b);
		
		HashMap<State, Integer> map = new HashMap<>();
		ArrayDeque<State> q = new ArrayDeque<>();
		
		map.put(init, 0);
		q.add(init);
		
		while (!q.isEmpty()) {
			State v = q.poll();
			int dNow = map.get(v);
			if (v.equals(goal)) {
				return dNow;
			}
			int[] arr = v.a;
			
			int xor = 0;
			for (int x : arr) {
				xor ^= x;
			}
			
			for (int i = 0; i < arr.length; i++) {
				int[] newArr = arr.clone();
				newArr[i] = xor;
				
				State to = new State(newArr);
				if (!map.containsKey(to)) {
					map.put(to, dNow + 1);
					q.add(to);
				}
			}
		}
		
		return -1;
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
		
		out.println(solve(a, b));
//		out.println(slow(a, b));
	}

	void preCalc() {

	}

	static final int B = 6;
	
	void stress() {
		for (int tst = 0;; tst++) {
			int n = rand(1, B);
			int[] a = new int[n];
			int[] b = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = rand(0, B - 1);
				b[i] = rand(0, B - 1);
			}
			
			if (solve(a, b) != slow(a, b)) {
				System.err.println(Arrays.toString(a));
				System.err.println(Arrays.toString(b));
				System.err.println("fast " + solve(a, b));
				System.err.println("slow " + slow(a, b));
				throw new AssertionError();
			}
			System.err.println(tst);
		}
	}

	void test() {

	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		preCalc();
		submit();
//		 stress();
		// test();
		out.close();
	}

	static final Random rng = new Random();

	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}

	public static void main(String[] args) throws IOException {
		start = System.currentTimeMillis();
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
