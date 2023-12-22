import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	static int[] a;
	static HashSet<Integer>[] st;
	public static void main(String[] args) { 
		/* O(Q*[log(N)]^2) --> BEAST
		 * */
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int N = I.nextInt();
		int Q = I.nextInt();
		a = new int[N];
		st = new HashSet[4*N];
		for (int i = 0; i < 4*N; i++) st[i] = new HashSet<Integer>();
		for (int i = 0; i < N; i++) a[i] = I.nextInt();
		build(1,0,N-1);
		StringBuilder ret = new StringBuilder();
		while (Q-->0) {
			int L = I.nextInt()-1;
			int R = I.nextInt()-1;
			HashSet<Integer> ans = getAns(1,0,N-1,L,R);
			ret.append(ans.size());
			ret.append("\n");
		}
		O.pln(ret);
	}
	public static void build(int node, int start, int end) {
		if (start==end) st[node].add(a[start]);
		else {
			int mid = (start+end)/2;
			build(2*node,start,mid);
			build(2*node+1,mid+1,end);
			st[node].addAll(st[2*node]);
			st[node].addAll(st[2*node+1]);
		}
	}
	public static HashSet<Integer> getAns(int node, int start, int end, int L, int R) {
		HashSet<Integer> empty = new HashSet<Integer>();
		if (R<start||L>end) return empty;
		if (L<=start&&R>=end) {
			empty.addAll(st[node]);
			return empty;
		}
		int mid = (start+end)/2;
		HashSet<Integer> left = getAns(2*node,start,mid,L,R);
		HashSet<Integer> right = getAns(2*node+1,mid+1,end,L,R);
		left.addAll(right);
		return left;
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
