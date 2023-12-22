import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int R = I.nextInt();
		int C = I.nextInt();
		int K = I.nextInt();
		int Bl = 0;
		int ans = 0;
		char[][] grid = new char[R][C];
		for (int r = 0; r < R; r++) {
			grid[r] = I.next().toCharArray();
			for (int i = 0; i < C; i++) if (grid[r][i]=='#') Bl++;
		}
		for (int rnum = 0; rnum < (1<<R); rnum++) {
			int curK = Bl;
			boolean[]vis = new boolean[R];
			for (int row = 0; row < R; row++) {
				if ((rnum>>row)%2==1) {
					for (int c = 0; c < C; c++) {
						vis[row]=true;
						if (grid[row][c]=='#') curK--;
					}
				}
			}
			if (curK>=K) {
				int temp = curK;
				for (int cnum = 0; cnum < (1<<C); cnum++) {
					for (int col = 0; col < C; col++) {
						if ((cnum>>col)%2==1) {
							for (int r = 0; r < R; r++) {
								if (!vis[r]&&grid[r][col]=='#') temp--;
							}
						}
					}
					if (temp==K) ans++;
					temp=curK;
				}
			}	
		}
		O.pln(ans);
	}
	public static ArrayList<String> recur(int N){
		ArrayList<String> ret = new ArrayList<String>();
		if (N==1) {
			for (int i = 0; i <= N; i++) {
				ret.add(Integer.toString(i)+" ");
			}
			return ret;
		}
		ArrayList<String> prev = recur(N-1);
		for (int i = 0; i < prev.size(); i++) {
			String S = prev.get(i);
			String[] cur = prev.get(i).split(" ");
			int cmp = Integer.parseInt(cur[cur.length-1]);
			for (int j = cmp; j <= N; j++) {
				ret.add(S+Integer.toString(j)+" ");
			}
		}
		return ret;
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
		void p(int x) {w.print(x);w.flush();}
		void p(long x) {w.print(x);w.flush();}
		void p(String x) {w.print(x);w.flush();}
		void p(char x) {w.print(x);w.flush();}
		void p(StringBuilder x) {w.print(x);w.flush();}
	}
}
