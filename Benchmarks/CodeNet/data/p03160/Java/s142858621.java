import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static final double EPS = 1e-9;
	static long mod = (int) 1e9 + 7;
	static int inf = (int) 1e9 + 2;
	static long[] fac;
	static int[] si;
	static ArrayList<Integer> primes;
	static ArrayList<Integer>[] ad;
	static ArrayList<pair>[] d;
	static edge[] ed;
	static boolean []vis;
	static int[] l, ch;
	static int[] occ;
	static Queue<Integer>[] can;
	static String s;
	static int n,m;
	static long []memo;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
	    n=sc.nextInt();
	    memo=new long [n];
	    long []a=new long [n];
	    for(int i=0;i<n;i++)
	    	a[i]=sc.nextLong();
	    for(int i=n-1;i>=0;i--) {
	    	if(i<n-2)
	    	    memo[i]=Math.min(Math.abs(a[i]-a[i+1])+memo[i+1], Math.abs(a[i]-a[i+2])+memo[i+2]);
	    	else if(i==n-2)
	    		memo[i]=Math.abs(a[i]-a[i+1])+memo[i+1];
	    }
	    out.print(memo[0]);
		out.flush();
	}
	static long inver(long x,long kk) {
		int a = (int) x;
		long e = (kk - 2);
		long res = 1;
		while (e > 0) {
			if ((e & 1) == 1) {
				// System.out.println(res*a);
				res = (int) ((1l * res * a) % kk);
			}
			a = (int) ((1l * a * a) % kk);
			e >>= 1;
		}
		// out.println(res+" "+x);
		return res % kk;
	}
 
	static TreeSet<Integer> trr;

	static class qu  implements Comparable<qu>{
		int i,j;
		qu(int a, int s) {
			i=a;
			j=s;
		}
       public String toString() {
    	   return i+" "+j;
       }
       public int compareTo(qu o) {
    	   if(i==o.i)
    		   return j-o.j;
    	   return i-o.i;
       }
	}
    
	static class pair {
		int to;
		int number;
 
		pair(int t, int n) {
			number = n;
			to = t;
		}
 
		public String toString() {
			return to + " " + number;
		}
	}
 
	static double modPow(double a, int e)
 
	{
		double res = 1;
		while (e > 0) {
			if ((e & 1) == 1)
				res = (res * a);
			a = (a * a);
			e >>= 1;
		}
		return res;
	}
 
	static boolean[] in;
 
	/*
	 * static void mst() { Arrays.sort(ed); UnionFind uf=new UnionFind(n); for(int
	 * i=0;i<m;i++) { edge w=ed[i]; if(!uf.union(w.from, w.to)) continue;
	 * in[i]=true; } }
	 */
	static class edge implements Comparable<edge> {
		int from;
		int to;
		int number;
 
		edge(int f, int t, int n) {
			from = f;
			to = t;
			number = n;
		}
 
		public String toString() {
			return from + " " + to + " " + number;
		}
 
		public int compareTo(edge f) {
			return number - f.number;
		}
	}
 
	static class seg implements Comparable<seg> {
		int a;
		int b;
 
		seg(int s, int e) {
			a = s;
			b = e;
		}
 
		public String toString() {
			return a + " " + b;
		}
 
		public int compareTo(seg o) {
			// if(a==o.a)
			return o.b - b;
			// return
		}
	}
 
	static long power(int i) {
		// if(i==0)
		// return 1;
		long a = 1;
		for (int k = 0; k < i; k++)
			a *= i;
		return a;
	}
 
	static void seive(int N) {
		si = new int[N];
		primes = new ArrayList<>();
		si[1] = 1;
		for (int i = 2; i < N; i++) {
			if (si[i] == 0) {
				si[i] = i;
				primes.add(i);
			}
			for (int j = 0; j < primes.size() && primes.get(j) <= si[i] && (i * primes.get(j)) < N; j++)
				si[primes.get(j) * i] = primes.get(j);
 
		}
	}
	static long fac(int n) {
		if (n == 0)
			return fac[n] = 1;
		if (n == 1)
			return fac[n] = 1;
		long ans = 1;
		for (int i = 1; i <= n; i++)
			fac[i] = ans = (i % mod * ans % mod) % mod;
		return ans % mod;
	}
 
	static long gcd(long a, long b) {
 
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
 
	static class unionfind {
		int[] p;
		int[] size;
 
		unionfind(int n) {
			p = new int[n];
			size = new int[n];
 
			for (int i = 0; i < n; i++) {
				p[i] = i;
			}
			Arrays.fill(size, 1);
		}
 
		int findSet(int v) {
			if (v == p[v])
				return v;
			return p[v] = findSet(p[v]);
		}
 
		boolean sameSet(int a, int b) {
			a = findSet(a);
			b = findSet(b);
			if (a == b)
				return true;
			return false;
		}
 
		int max() {
			int max = 0;
			for (int i = 0; i < size.length; i++)
				if (size[i] > max)
					max = size[i];
			return max;
		}
 
		boolean combine(int a, int b) {
			a = findSet(a);
			b = findSet(b);
			if (a == b)
				return true;
			if (size[a] > size[b]) {
				p[b] = a;
				size[a] += size[b];
 
			} else {
				p[a] = b;
				size[b] += size[a];
			}
			return false;
		}
	}
 
	static class Scanner {
		StringTokenizer st;
		BufferedReader br;
 
		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}
 
		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
 
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
 
		public char nextChar() throws IOException {
			return next().charAt(0);
		}
 
		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}