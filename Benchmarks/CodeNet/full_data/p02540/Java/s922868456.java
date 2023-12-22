import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	static int[] stmin;
	static int[] stmax;
	static int[] a;
	static int INF = (int)(1e9);
	static ArrayList<Integer>[] graph;
	static int N;
	static int[] seen;
	public static void main(String[] args) { 
		/*
		 * */
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		N = I.nextInt();
		a = new int[N+1]; //a[i] = {y-coordinate of x=i}
		int[][] town = new int[N][2];
		int[] in = new int[N+1]; //in[i] = index of town with y-coordinate i
		stmin = new int[4*N];
		stmax = new int[4*N];
		graph = new ArrayList[N+1];
		seen = new int[N];
		for (int i = 0; i <= N; i++) graph[i] = new ArrayList<Integer>();
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i<N; i++) {
			int x = I.nextInt();
			int y = I.nextInt();
			in[y]=i;
			town[i][0]=x;
			town[i][1]=y;
			a[x]=y;
		} 
		buildmax(1,1,N);
		buildmin(1,1,N);
		for (int i = 0; i < N; i++) {
			int x = town[i][0];
			int y = town[i][1];
			int min = getMin(1,1,N,1,x-1); //Minimum y among all x's less than current x
			int max = getMax(1,1,N,x+1,N); //Maximum y among all x's greater than current x
			if (min<y) {
				int index = in[min];
				graph[i].add(index); //We can go from this city to city i
				graph[index].add(i);
			}
			if (max>y) {
				int index = in[max]; //Remember, indices are in 0 based indexing
				graph[i].add(index);
				graph[index].add(i);
			}
		}
		for (int i = 0; i < N; i++) {
			int size = seen[i];
			if (size==0) size=BFS(i);
			ans.append(size);
			ans.append("\n");
		}
		O.pln(ans);
		/*for (int i = 0; i < N; i++) {
			O.p(i+"-->");
			for (int j = 0; j < graph[i].size(); j++) {
				O.p(graph[i].get(j)+" ");
			}
			O.p("\n");
		}*/
	}
	public static int BFS(int start) {
		int ans = 1;
		boolean[] vis = new boolean[N];
		Queue<Integer> cur = new LinkedList<Integer>();
		cur.add(start);
		vis[start]=true;
		while (!cur.isEmpty()) {
			int size = cur.size();
			for (int i = 0; i < size; i++) {
				int now = cur.poll();
				for (int j = 0; j < graph[now].size(); j++) {
					int nbr = graph[now].get(j);
					if (!vis[nbr]) {
						ans++;
						cur.add(nbr);
						vis[nbr]=true;
					}
				}
			}
		}
		for (int i = 0; i < N; i++) {
			if (vis[i]) seen[i]=ans; //Same connected sub graph
		}
		return ans;
	}
	public static void buildmax(int node, int start, int end) {
		if (start==end) {
			stmax[node]=a[start];
		}else {
			int mid = (start+end)/2;
			buildmax(2*node,start,mid);
			buildmax(2*node+1,mid+1,end);
			stmax[node]=max(stmax[2*node],stmax[2*node+1]);
		}
	}
	public static int getMax(int node, int start, int end, int L, int R) {
		if (end<L||start>R) return -INF;
		if (L<=start&&R>=end) return stmax[node];
		int mid = (start+end)/2;
		int left = getMax(2*node,start,mid,L,R);
		int right = getMax(2*node+1,mid+1,end,L,R);
		return max(left,right);
	}
	public static void buildmin(int node, int start, int end) {
		if (start==end) {
			stmin[node]=a[start];
		}else {
			int mid = (start+end)/2;
			buildmin(2*node,start,mid);
			buildmin(2*node+1,mid+1,end);
			stmin[node]=min(stmin[2*node],stmin[2*node+1]);
		}
	}
	public static int getMin(int node,int start, int end,int L, int R) {
		if (end<L||start>R) return INF;
		if (L<=start&&R>=end) return stmin[node];
		int mid = (start+end)/2;
		int left = getMin(2*node,start,mid,L,R);
		int right = getMin(2*node+1,mid+1,end,L,R);
		return min(left,right);
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
