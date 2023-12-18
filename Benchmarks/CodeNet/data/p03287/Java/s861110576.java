import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Stream;


public class Main implements Runnable {
	static final double time = 1e9;
	static final int MOD = (int) 1e9 + 7;
	static final long mh = Long.MAX_VALUE;
	static final Reader in = new Reader();
	static final PrintWriter out = new PrintWriter(System.out);
	StringBuilder answer = new StringBuilder();
	long start = System.nanoTime();
	public static void main(String[] args) {
		new Thread(null, new Main(), "persefone", 1 << 28).start();
	}

	@Override
	public void run() {
		
		solve();		
		printf();
		long elapsed = System.nanoTime() - start;
//		out.println("stamp : " + elapsed / time);
//		out.println("stamp : " + TimeUnit.SECONDS.convert(elapsed, TimeUnit.NANOSECONDS));
		close();
//		out.flush();
	}
	
	void solve() {
		int n = in.nextInt();
		int m = in.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		long ans = 0;
		int s = 0;
		for (int i = 0; i < n; i++) {
			s = (s + in.nextInt()) % m;
			if (s % m == 0) ans++;
			int r = map.getOrDefault(s, 0);
			ans += r;
			map.put(s, r + 1);
		}
		printf(ans);
	}
	
	
	class Manacher {
		private int n;
		private char[] s;
		private int[] odd, even;
		Manacher(char[] s) {
			this.s = s;
			n = s.length;
			odd = new int[n];
			computeOdd();
			even = new int[n];
			computeEven();
		}
		
		Manacher(String s) {
			this(s.toCharArray());
		}
		
		void computeOdd() {
			for (int i = 0, l = 0, r = -1; i < n; i++) {
				int k = (i > r) ? 1 : Math.min(odd[r + l - i], r - i);
				while (0 <= i - k && i + k < n && s[i - k] == s[i + k]) {
					k++;
				}
				odd[i] = k--;
				if (i + k > r) {
					l = i - k;
					r = i + k;
				}
			}
		}
		
		void computeEven() {
			for (int i = 0, l = 0, r = -1; i < n; i++) {
				int k = (i > r) ? 0 : Math.min(even[r + l - i + 1], r - i + 1);
				while (0 <= i - k - 1 && i + k < n && s[i - k - 1] == s[i + k]) {
					k++;
				}
				even[i] = k--;
				if (i + k > r) {
					l = i - k - 1;
					r = i + k;
				}
			}
		}
	}

	class Fenwick {
		private int n;
		private int[] bit1, bit2, oo1, oo2;
		private long ans;
		
		Fenwick(int n) {
			this.n = n;
			bit1 = new int[n + 1];
			bit2 = new int[n + 1];
			oo1 = new int[n];
			oo2 = new int[n];
		}
		
		Fenwick(int[] a) {
			this(a, true);
		}
		
		Fenwick(int[] a, boolean compressed) {
			this(a.length);
			if (compressed) {
				build(compress(a), n);
			} else 
				build(a, n);
		}
		
		void build(int[] a, int n) {
			for (int i = 0; i < n; i++) {
				oo1[i] = i + 1 - query(bit1, i - 1);
				update(bit1, i + 1, a[i] + i);
			}
			
			for (int i = n - 1; i > -1; i--) {
				oo2[i] = query(bit2, i - 1);
				update(bit2, i + 1, i - a[i]);
			}
			
			for (int i = 0; i < n - 1; i++)
				ans += 1L * oo1[i] * oo2[i];
		}
		
		void update(int i, int v) {
//			update(bit, i, v);
		}
		
		private void update(int[] bit,int i, int v) {
			for (; i <= n; i += i & -i) { 
				
			}
		}
				
		/*
		int query(int i) {
			return query(bit, i);
		}
		*/
		private int query(int[] bit, int i) {
			if (i < 0) return 0;
			int s = 0;
			for (; i > 0; i -= i & -i) {
				s += bit[i];
			}
			return s;
		}
		/*
		int rangeQuery(int i, int j) {
			return query(j) - query(i - 1);
		}
		*/
		private int rangeQuery(int[] bit, int i, int j) {
			return query(bit, j) - query(bit, i - 1);
		}
		
		private int[] compress(int[] a) {
			int[] b = a.clone();
			Arrays.sort(b);
			for (int i = 0; i < n; i++) 
				a[i] = lw(b, 0, n, a[i]) + 1;
			return a;
		}
			
	}
	
	void printf() {
		out.print(answer);
	}
	
	void close() {
		out.close();
	}

	void printf(Stream<?> str) {
		str.forEach(o -> add(o, " "));
		add("\n");
	}

	 
	void printf(Object... obj) {
		printf(false, obj);
	}

	void printfWithDescription(Object... obj) {
		printf(true, obj);
	}
	
		
	private void printf(boolean b, Object... obj) {

		if (obj.length > 1) {
			for (int i = 0; i < obj.length; i++) {
				if (b) add(obj[i].getClass().getSimpleName(), " - ");
				if (obj[i] instanceof Collection<?>) {
					printf((Collection<?>) obj[i]);
				} else if (obj[i] instanceof int[][]) {
					printf((int[][])obj[i]);
				} else if (obj[i] instanceof long[][]) {
					printf((long[][])obj[i]);
				} else if (obj[i] instanceof double[][]) {
					printf((double[][])obj[i]);
				} else printf(obj[i]);
			}
			return;
		}

		if (b) add(obj[0].getClass().getSimpleName(), " - ");
		printf(obj[0]);
	}

	void printf(Object o) {
		if (o instanceof int[])
			printf(Arrays.stream((int[]) o).boxed());
		else if (o instanceof char[])
			printf(new String((char[]) o));
		else if (o instanceof long[])
			printf(Arrays.stream((long[]) o).boxed());
		else if (o instanceof double[])
			printf(Arrays.stream((double[]) o).boxed());
		else if (o instanceof boolean[]) {
			for (boolean b : (boolean[]) o) add(b, " ");
			add("\n");
		}
		else 
			add(o, "\n");
	}

	void printf(int[]... obj) {
		for (int i = 0; i < obj.length; i++) printf(obj[i]);
	}
	
	void printf(long[]... obj) {
		for (int i = 0; i < obj.length; i++) printf(obj[i]);
	}
	
	void printf(double[]... obj) {
		for (int i = 0; i < obj.length; i++) printf(obj[i]);
	}
	
	void printf(boolean[]... obj) {
		for (int i = 0; i < obj.length; i++) printf(obj[i]);
	}
	
	void printf(Collection<?> col) {
		printf(col.stream());
	}

	<T, K> void add(T t, K k) {
		if (t instanceof Collection<?>) {
			((Collection<?>) t).forEach(i -> add(i, " "));
		} else if (t instanceof Object[]) {
			Arrays.stream((Object[]) t).forEach(i -> add(i, " "));
		} else
			add(t);
		add(k);
	}
	
	
	
	<T> void add(T t) {
		answer.append(t);
	}

	@SuppressWarnings("unchecked")
	<T extends Comparable<? super T>> T min(T... t) {
		if (t.length == 0)
			return null;
		T m = t[0];
		for (int i = 1; i < t.length; i++)
			if (t[i].compareTo(m) < 0)
				m = t[i];
		return m;
	}

	@SuppressWarnings("unchecked")
	<T extends Comparable<? super T>> T max(T... t) {
		if (t.length == 0)
			return null;
		T m = t[0];
		for (int i = 1; i < t.length; i++)
			if (t[i].compareTo(m) > 0)
				m = t[i];
		return m;
	}

	int gcd(int a, int b) {
		return (b == 0) ? a : gcd(b, a % b);
	}

	long gcd(long a, long b) {
		return (b == 0) ? a : gcd(b, a % b);
	}
	
	// c = gcd(a, b) -> extends gcd method: ax + by = c <----> (b % a)p + q = c;
	int[] ext_gcd(int a, int b) {
		if (b == 0) return new int[] {a, 1, 0 };
		int[] vals = ext_gcd(b, a % b);
		int d = vals[0]; // gcd
	    int p = vals[2]; // 
		int q = vals[1] - (a / b) * vals[2];
		return new int[] { d, p, q };	  
	}
	
	// find any solution of the equation: ax + by = c using extends gcd
	boolean find_any_solution(int a, int b, int c, int[] root) {
		int[] vals = ext_gcd(Math.abs(a), Math.abs(b));
		if (c % vals[0] != 0) return false;
		printf(vals);
		root[0] = c * vals[1] / vals[0];
		root[1] = c * vals[2] / vals[0];
		if (a < 0) root[0] *= -1;
		if (b < 0) root[1] *= -1;
		return true;
	}
	
	int mod(int x) { return x % MOD; }
	
	int mod(int x, int y) { return mod(mod(x) + mod(y)); }
	
	long mod(long x) { return x % MOD; }
	
	long mod (long x, long y) { return mod(mod(x) + mod(y)); }
	
	int lw(long[] f, int l, int r, long k) {
		int R = r, m = 0;
		while (l <= r) {
			m = l + r >> 1;
		    if (m == R) return m;
		    if (f[m] >= k) r = m - 1; else l = m + 1;
		}
		return l;
	}
	
	int up(long[] f, int l, int r, long k) {
		int R = r, m = 0;
		while (l <= r) {
			m = l + r >> 1;
		    if (m == R) return m;
		    if (f[m] > k) r = m - 1; else l = m + 1;
		}
		return l;
	}
	
	int lw(int[] f, int l, int r, int k) {
		int R = r, m = 0;
		while (l <= r) {
			m = l + r >> 1;
		    if (m == R) return m;
		    if (f[m] >= k) r = m - 1; else l = m + 1;
		}
		return l;
	}
	
	int up(int[] f, int l, int r, int k) {
		int R = r, m = 0;
		while (l <= r) {
			m = l + r >> 1;
		    if (m == R) return m;
		    if (f[m] > k) r = m - 1; else l = m + 1;
		}
		return l;
	}

	long calc(int base, int exponent) {
		if (exponent == 0) return 1;
		if (exponent == 1) return base % MOD;
		long m = calc(base, exponent >> 1);
		if (exponent % 2 == 0) return m * m % MOD;
		return base * m * m % MOD;
	}
	
	long calc(int base, long exponent) {
		if (exponent == 0) return 1;
		if (exponent == 1) return base % MOD;
		long m = calc(base, exponent >> 1);
		if (exponent % 2 == 0) return m * m % MOD;
		return base * m * m % MOD;
	}
	
	long calc(long base, long exponent) {
		if (exponent == 0) return 1;
		if (exponent == 1) return base % MOD;
		long m = calc(base, exponent >> 1);
		if (exponent % 2 == 0) return m * m % MOD;
		return base * m * m % MOD;
	}
	
	long power(int base, int exponent) {
		if (exponent == 0) return 1;
		long m = power(base, exponent >> 1);
		if (exponent % 2 == 0) return m * m;
		return base * m * m;
	}
	
	void swap(int[] a, int i, int j) {
		a[i] ^= a[j];
		a[j] ^= a[i];
		a[i] ^= a[j];
	}
	
	void swap(long[] a, int i, int j) {
		long tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	static class Pair<K extends Comparable<? super K>, V extends Comparable<? super V>>
			implements Comparable<Pair<K, V>> {
		private K k;
		private V v;

		Pair() {}

		Pair(K k, V v) {
			this.k = k;
			this.v = v;
		}

		K getK() { return k; }

		V getV() { return v; }

		void setK(K k) { this.k = k; }

		void setV(V v) { this.v = v; }

		void setKV(K k, V v) {
			this.k = k;
			this.v = v;
		}

		@SuppressWarnings("unchecked")
		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || !(o instanceof Pair)) return false;
			Pair<K, V> p = (Pair<K, V>) o;
			return k.compareTo(p.k) == 0 && v.compareTo(p.v) == 0;
		}

		@Override
		public int hashCode() {
			int hash = 31;
			hash = hash * 89 + k.hashCode();
			hash = hash * 89 + v.hashCode();
			return hash;
		}

		@Override
		public int compareTo(Pair<K, V> pair) {
			return k.compareTo(pair.k) == 0 ? v.compareTo(pair.v) : k.compareTo(pair.k);
		}

		@Override
		public Pair<K, V> clone() {
			return new Pair<K, V>(this.k, this.v);
		}

		@Override
		public String toString() {
			return String.valueOf(k).concat(" ").concat(String.valueOf(v)).concat("\n");
		}
	}

	static class Reader {
		private BufferedReader br;
		private StringTokenizer st;

		Reader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			try {
				while (st == null || !st.hasMoreTokens()) {
					st = new StringTokenizer(br.readLine());
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] nextIntArray(int n) {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = nextInt();
			return arr;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String s = "";
			try {
				s = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return s;
		}
	}
}