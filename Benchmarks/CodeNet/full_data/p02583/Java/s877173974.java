    import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.sound.sampled.ReverbType;

import java.util.*;
import java.io.*;

public class Main {
	static ArrayList<Integer> adj[];
	// static PrintWriter out = new PrintWriter(System.out);

	static int[][] notmemo;
	static int k;
	static int[] a;
	static int b[];
	static int m;

	static class Pair implements Comparable<Pair> {
		int d;
		int s;

		public Pair(int b, int l) {
			d = b;
			s = l;
		}

		@Override
		public int compareTo(Pair o) {
			if (o.d - o.s > this.d - this.s) {
				return 1;
			} else if (o.d - o.s < this.d - this.s) {
				return -1;
			} else
				return 0;

		}

	}

	static Pair s1[];
	static ArrayList<Pair> adjlist[];
	// static char c[];
	public static long mod = (long) (1e9 + 7);
	static int V;
	static long INF = (long) 1E16;
	static int n;
	static int c;
	static int d[];
	static int z;
	static Pair p[];
	static int h[];
	static int count[][];
	static int r[];
	static int g[];

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int count=0;
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		sortarray(a);
		int i=0;
		int j=1;
		int k=2;
		while(i<n-2) {
			int sum=a[i]+a[j];
			
			
			if(sum>a[k]&&(a[i]!=a[j]&&a[i]!=a[k]&&a[j]!=a[k])) {
				
				count++;
			}
			k++;
			
			if(k==n) {
				j++;
			k=j+1;
			}
			if(j==n-1) {
				i++;
				j=i+1;
				k=i+2;
			}
			
		}
		System.out.println(count);
		
	}
	static ArrayList<Integer> euler=new ArrayList<>();
		static int dp(int i,int j,int k) {
			if((i==-1&&j==-1)||(i==-1&&k==-1)||(j==-1&&k==-1)) {
				return 0;
			}
			if(memo[i+1][j+1][k+1]!=-1)
				return memo[i+1][j+1][k+1];
			int ans=0;
			if(i==-1) {
				ans=Math.max(ans,b[k]*g[j]+dp(i,j-1,k-1));
					
			}
			else if(j==-1) {
				ans=Math.max(ans,r[i]*b[k]+dp(i-1,j,k-1));
							
			}
			else if(k==-1) {
				ans=Math.max(ans,r[i]*g[j]+dp(i-1,j-1,k));	
			}
			else {
				ans=Math.max(ans,r[i]*g[j]+dp(i-1,j-1,k));
				ans=Math.max(ans,r[i]*b[k]+dp(i-1,j,k-1));
				ans=Math.max(ans,b[k]*g[j]+dp(i,j-1,k-1));
			}
			return memo[i+1][j+1][k+1]=ans;
		}

	static ArrayList<Integer> arr;

	
static long total[];
static TreeMap<Integer,Integer> map1;

		static int zz;
//static int dp(int idx,int left,int state) {
//if(idx>=k-((zz-left)*2)||idx+1==n) {
//	return 0;
//}
//if(memo[idx][left][state]!=-1) {
//	return memo[idx][left][state];
//}
//int ans=a[idx+1]+dp(idx+1,left,0);
//if(left>0&&state==0&&idx>0) {
//	ans=Math.max(ans,a[idx-1]+dp(idx-1,left-1,1));
//}
//return memo[idx][left][state]=ans;
//}
static HashMap<Integer,Integer> map;
static int maxa=0;
static int ff=123123;

static long dist[][];
static int[][][] memo;


	static long modmod=998244353;
	static int dx[]= {1,-1,0,0};
	 static int dy[]= {0,0,1,-1};	
	static class BBOOK implements Comparable<BBOOK>{
		int t;
		int alice;
		int bob;
		public BBOOK(int x,int y,int z) {
		t=x;
		alice=y;
		bob=z;
		}
		@Override
		public int compareTo(BBOOK o) {
			return this.t-o.t;
		}
	}
	private static long lcm(long a2, long b2) {
	return (a2*b2)/gcd(a2,b2);
	}
	static class Edge implements Comparable<Edge>
	{
		int node;long cost ; long time; 
		
		Edge(int a, long b,long c) { node = a;	cost = b; time=c; }
		
		public int compareTo(Edge e){ return Long.compare(time,e.time);	}
	}
	
        static void sieve(int N)	// O(N log log N) 
	{
		isComposite = new int[N+1];					
		isComposite[0] = isComposite[1] = 1;			// 0 indicates a prime number
		primes = new ArrayList<Integer>();
 
		for (int i = 2; i <= N; ++i) 					//can loop till i*i <= N if primes array is not needed O(N log log sqrt(N)) 
			if (isComposite[i] == 0) 					//can loop in 2 and odd integers for slightly better performance
			{
				primes.add(i);
				if(1l * i * i <= N)
					for (int j = i * i; j <= N; j += i)	// j = i * 2 will not affect performance too much, may alter in modified sieve
						isComposite[j] = 1;
			}   
	}
    static TreeSet<Integer> factors;
    static ArrayList<Integer> primeFactors(int N)		// O(sqrt(N) / ln sqrt(N))
	{
		ArrayList<Integer> factors = new ArrayList<Integer>();		//take abs(N) in case of -ve integers
		int idx = 0, p = primes.get(idx);

		while(1l*p * p <= N)
		{
			while(N % p == 0) { factors.add(p); N /= p; }
			p = primes.get(++idx);
		}

		if(N != 1)						// last prime factor may be > sqrt(N)
			factors.add(N);				// for integers whose largest prime factor has a power of 1
		return factors;
	}

	static class UnionFind {
		int[] p, rank, setSize;
		int numSets;
		int max[];

		public UnionFind(int N) {
			p = new int[numSets = N];
			rank = new int[N];
			setSize = new int[N];
			for (int i = 0; i < N; i++) {
				p[i] = i;
				setSize[i] = 1;
			}
		}

		public int findSet(int i) {
			return p[i] == i ? i : (p[i] = findSet(p[i]));
		}

		public boolean isSameSet(int i, int j) {
			return findSet(i) == findSet(j);
		}
		public int chunion(int i,int j, int x2) {
			if (isSameSet(i, j))
				return 0;
			numSets--;
			int x = findSet(i), y = findSet(j);
			int z=findSet(x2);
			p[x]=z;;
			p[y]=z;
		return x;
		}

		public void unionSet(int i, int j) {
			if (isSameSet(i, j))
				return;
			numSets--;
			int x = findSet(i), y = findSet(j);
			if (rank[x] > rank[y]) {
				p[y] = x;
				setSize[x] += setSize[y];


			} else {
				p[x] = y;
				setSize[y] += setSize[x];
				if (rank[x] == rank[y])
					rank[y]++;


			}
		}

		

		public int numDisjointSets() {
			return numSets;
		}

		public int sizeOfSet(int i) {
			return setSize[findSet(i)];
		}
	}


	static class Quad implements Comparable<Quad> {
		int u;
		int v;
		char state;
		int turns;

		public Quad(int i, int j, char c, int k) {
			u = i;
			v = j;
			state = c;
			turns = k;
		}

		public int compareTo(Quad e) {
			return (int) (turns - e.turns);
		}

	}

	static long manhatandistance(long x, long x2, long y, long y2) {
		return Math.abs(x - x2) + Math.abs(y - y2);
	}

	static long fib[];

	static long fib(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}
		if (fib[n] != -1) {
			return fib[n];
		} else
			return fib[n] = ((fib(n - 2) % mod + fib(n - 1) % mod) % mod);
	}

	static class Point  implements Comparable<Point>{
		long x, y;

		Point(long counth, long counts) {
			x = counth;
			y = counts;
		}

		@Override
		public int compareTo(Point p )
		{
			return Long.compare(p.y*1l*x, p.x*1l*y);
		}
	}

	static TreeSet<Long> primeFactors(long N) // O(sqrt(N) / ln sqrt(N))
	{
		TreeSet<Long> factors = new TreeSet<Long>(); // take abs(N) in case of -ve integers
		int idx = 0, p = primes.get(idx);

		while (p * p <= N) {
			while (N % p == 0) {
				factors.add((long) p);
				N /= p;
			}
			if (primes.size() > idx + 1)
				p = primes.get(++idx);
			else
				break;
		}

		if (N != 1) // last prime factor may be > sqrt(N)
			factors.add(N); // for integers whose largest prime factor has a power of 1
		return factors;
	}

	static boolean visited[];

	/**
	 * static int bfs(int s) { Queue<Integer> q = new LinkedList<Integer>();
	 * q.add(s); int count=0; int maxcost=0; int dist[]=new int[n]; dist[s]=0;
	 * while(!q.isEmpty()) {
	 * 
	 * int u = q.remove(); if(dist[u]==k) { break; } for(Pair v: adj[u]) {
	 * maxcost=Math.max(maxcost, v.cost);
	 * 
	 * 
	 * 
	 * if(!visited[v.v]) {
	 * 
	 * visited[v.v]=true; q.add(v.v); dist[v.v]=dist[u]+1; maxcost=Math.max(maxcost,
	 * v.cost); } }
	 * 
	 * } return maxcost; }
	 **/

	static boolean[] vis2;

	static boolean f2 = false;

	static long[][] matMul(long[][] a2, long[][] b, int p, int q, int r) // C(p x r) = A(p x q) x (q x r) -- O(p x q x
																			// r)
	{
		long[][] C = new long[p][r];
		for (int i = 0; i < p; ++i) {
			for (int j = 0; j < r; ++j) {
				for (int k = 0; k < q; ++k) {
					C[i][j] = (C[i][j] + (a2[i][k] % mod * b[k][j] % mod)) % mod;
					C[i][j] %= mod;
				}

			}
		}
		return C;
	}
	public static int[] schuffle(int[] a2) {
		for (int i = 0; i < a2.length; i++) {
			int x =  (int) (Math.random() * a2.length);
			int temp = a2[x];
			a2[x] = a2[i];
			a2[i] = temp;
		}
		return a2;
	}


	static boolean vis[];
	static HashSet<Integer> set = new HashSet<Integer>();

	static long modPow(long ways, long count, long mod) // O(log e)
	{
		ways %= mod;
		long res = 1;
		while (count > 0) {
			if ((count & 1) == 1)
				res = (res * ways) % mod;
			ways = (ways * ways) % mod;
			count >>= 1;
		}
		return res % mod;
	}

	static long gcd(long l, long o) {
		if (o == 0) {
			return l;
		}
		return gcd(o, l % o);
	}

	static int[] isComposite;
	static int[] valid;

	static ArrayList<Integer> primes;
	static ArrayList<Integer> l1;

	
	static TreeSet<Integer> primus = new TreeSet<Integer>();
	
	static void sieveLinear(int N)
	{
		int[] lp = new int[N + 1];								//lp[i] = least prime divisor of i
		for(int i = 2; i <= N; ++i)
		{
			if(lp[i] == 0)
			{
				primus.add(i);
				lp[i] = i;
			}
			int curLP = lp[i];
			for(int p: primus)
				if(p > curLP || p * i > N)
					break;
				else
					lp[p * i] = i;
		}
	}
	

	public static long[] schuffle(long[] a2) {
		for (int i = 0; i < a2.length; i++) {
			int x =  (int) (Math.random() * a2.length);
			long temp = a2[x];
			a2[x] = a2[i];
			a2[i] = temp;
		}
		return a2;
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

		public int[] nxtArr(int n) throws IOException {
			int[] ans = new int[n];
			for (int i = 0; i < n; i++)
				ans[i] = nextInt();
			return ans;
		}
		
	}
	public static int[] sortarray(int a[]) {
		schuffle(a);
		Arrays.sort(a);
		return a;
		}
		public static long[] sortarray(long a[]) {
			schuffle(a);
			Arrays.sort(a);
			return a;
		}
}