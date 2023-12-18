import java.math.*;
import java.util.*;
import java.lang.*;
public class Main { 
 
	public static void main(String[] args) { 
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int N = I.nextInt();
		int Q = I.nextInt();
		ArrayList<Integer>[] graph = new ArrayList[N+1];
		long[] dp = new long[N+1]; //Total increment of subtree rooted at vertex i
		long[] ans = new long[N+1];
		for (int i = 1; i <= N; i++) graph[i] = new ArrayList<Integer>();
		for (int i = 1; i < N; i++) {
			int a = I.nextInt();
			int b = I.nextInt();
			graph[a].add(b);
			graph[b].add(a);
		} 
		for (int i = 0; i < Q; i++) {
			int root = I.nextInt();
			long inc = I.nextLong();
			dp[root]+=inc;
		}
		//DFS graph strand updates
		Stack<Integer> cur = new Stack<Integer>();
		long sum = dp[1]; //Current strand sum of total increments done (know these due to dp)
		boolean[] vis = new boolean[N+1];
		boolean[] strand = new boolean[N+1];
		strand[1]=true; //Avoiding O(N) strand look up time in DFS 
		cur.push(1); //Root of tree is 1
		while (!cur.isEmpty()) {
			int curRoot = cur.peek();
			boolean added=false;
			for (int i = 0; i < graph[curRoot].size(); i++) {
				int nbr = graph[curRoot].get(i);
				if (!strand[nbr]&&!vis[nbr]) {
					cur.add(nbr);
					sum+=dp[nbr];
					added=true;
					strand[nbr]=true;
					break;
				}
			}
			if (!added) {
				int last = cur.pop();
				vis[last]=true;
				ans[last]+=sum;
				sum-=dp[last];
			}
		}
		for (int i = 1; i <= N; i++) O.p(ans[i]+" ");
	}
	public static long ceil(long num, long den) {long ans = num/den; if (num%den!=0) 
	ans++; return ans;}
	public static long GCD(long a, long b) {
		if (a==0||b==0) return Math.max(a,b);
		return GCD(Math.min(a, b),Math.max(a, b)%Math.min(a, b));
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
	}
	static class OutPut{
		PrintWriter w = new PrintWriter(System.out);
		void pln(int x) {w.println(x);w.flush();}
		void pln(long x) {w.println(x);w.flush();}
		void pln(String x) {w.println(x);w.flush();}
		void pln(char x) {w.println(x);w.flush();}
		void pln(StringBuilder x) {w.println(x);w.flush();}
		void pln(boolean x) {w.println(x);w.flush();}
		void p(int x) {w.print(x);w.flush();}
		void p(long x) {w.print(x);w.flush();}
		void p(String x) {w.print(x);w.flush();}
		void p(char x) {w.print(x);w.flush();}
		void p(StringBuilder x) {w.print(x);w.flush();}
		void p(boolean x) {w.println(x);w.flush();}
	}
}