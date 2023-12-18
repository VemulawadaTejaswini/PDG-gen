import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	static int ans;
	static int[] a;
	static int N;
	static ArrayList<Integer>[] graph;
	static boolean[] vis;
	public static void main(String[] args) { 
		/*Make a graph of all connections
		 * Then BFS over all connected sub-graphs (Those indices can have any possible 
		 *elements that originally resided in their area
		 * */
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		N = I.nextInt();
		int M = I.nextInt();
		boolean[] open = new boolean[N+1];
		boolean[] can = new boolean[N+1]; //Among the indices that can be shuffled, what 
		//elements exist?
		graph = new ArrayList[N+1];
		for (int i = 1; i <= N; i++) graph[i] = new ArrayList<Integer>();
		a = new int[N+1];
		ans = 0;
		vis = new boolean[N+1];
		for (int i = 1; i <= N; i++) a[i] = I.nextInt();
		while (M-->0) {
			int x = I.nextInt();
			int y = I.nextInt();
			graph[x].add(y);
			graph[y].add(x);
			open[x]=true;
			open[y]=true;
		}
		for (int i = 1; i <= N; i++) {
			ans+=(!open[i]&&a[i]==i)?1:0;
		}
		for (int i = 1; i <= N; i++) {
			if (open[i]&&!vis[i]) BFS(i);
		}
		O.pln(ans);
	}
	public static void BFS(int start) {
		TreeSet<Integer> val = new TreeSet<Integer>(); //What permutation elements have been 
		//seen so far
		Queue<Integer> cur = new LinkedList<Integer>();
		boolean[] taken = new boolean[N+1]; //Don't want to add same possibility of 
		//a[i]=i > once
		cur.add(start);
		vis[start]=true;
		while (!cur.isEmpty()) {
			int size = cur.size();
			for (int i = 0; i < size; i++) {
				int now = cur.poll();
				val.add(a[now]); //Values
				taken[now]=true; //Indices
				for (int j = 0; j < graph[now].size(); j++) {
					int nbr = graph[now].get(j);
					if (!vis[nbr]) {
						cur.add(nbr);
						vis[nbr]=true;
					}
				}
			}
		}
		while (!val.isEmpty()) {
			int pos = val.pollFirst();
			ans+=taken[pos]?1:0;
		}
	}
	public static double max(double a, double b) {return Math.max(a, b);}
	public static double min(double a, double b) {return Math.min(a, b);}
	public static long min(long a, long b) {return Math.min(a,b);}
	public static long max(long a, long b) {return Math.max(a,b);}
	public static int min(int a, int b) {return Math.min(a,b);}
	public static int max(int a, int b) {return Math.max(a,b);}
	public static long abs(long x) {return Math.abs(x);}
	public static long ceil(long num, long den) {long ans = num/den; if (num%den!=0) 
	ans++; return ans;}
	public static long GCD(long a, long b) {
		if (a==0||b==0) return max(a,b);
		return GCD(min(a,b),max(a,b)%min(a,b));
	}
	public static long FastExp(long base, long exp, long mod) {
		long ans=1;
		while (exp>0) {
			if (exp%2==1) ans*=base;
			exp/=2;
			base*=base;
			base%=mod;
			ans%=mod;
		}
		return ans;
	}
	public static long ModInv(long num,long mod) {return FastExp(num,mod-2,mod);}
	public static int pop(long x) { //Returns number of bits within a number
		int cnt = 0;
		while (x>0) {
			if (x%2==1) cnt++;
			x/=2;
		}
		return cnt;
	}
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		int nextInt() {return Integer.parseInt(next());}
		long nextLong() {return Long.parseLong(next());};
		double nextDouble() {return Double.parseDouble(next());}
	}
	static class OutPut{
		PrintWriter w = new PrintWriter(System.out);
		void pln(double x) {w.println(x);w.flush();}
		void pln(boolean x) {w.println(x);w.flush();}
		void pln(int x) {w.println(x);w.flush();}
		void pln(long x) {w.println(x);w.flush();}
		void pln(String x) {w.println(x);w.flush();}
		void pln(char x) {w.println(x);w.flush();}
		void pln(StringBuilder x) {w.println(x);w.flush();}
		void pln(BigInteger x) {w.println(x);w.flush();}
		void p(int x) {w.print(x);w.flush();}
		void p(long x) {w.print(x);w.flush();}
		void p(String x) {w.print(x);w.flush();}
		void p(char x) {w.print(x);w.flush();}
		void p(StringBuilder x) {w.print(x);w.flush();}
		void p(BigInteger x) {w.print(x);w.flush();}
		void p(double x) {w.print(x);w.flush();}
		void p(boolean x) {w.print(x);w.flush();}
	}
}