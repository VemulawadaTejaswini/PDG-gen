import java.io.*;
import java.math.*;
import java.util.*;
public class Main {  
	public static void main(String[] args) { 
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int R = I.nextInt();
		int C = I.nextInt();
		char[][] grid = new char[R][C];
		for (int i = 0; i < R; i++) grid[i] = I.next().toCharArray();
		for (int r = 0; r < R; r++) {
			for (int c = 0; c < C; c++) {
				if (grid[r][c]=='.') {
					O.p(check(grid,r,c));
				}else O.p(grid[r][c]);
			}
			O.p("\n");
		}
	}
	public static int check(char[][] grid, int r, int c) {
		int ret = 0;
		int R = grid.length;
		int C = grid[0].length;
		if (r>0&&grid[r-1][c]=='#') ret++;
		if (r<R-1&&grid[r+1][c]=='#') ret++;
		if (c>0&&grid[r][c-1]=='#') ret++;
		if (c<C-1&&grid[r][c+1]=='#') ret++;
		if (r>0&&c>0&&grid[r-1][c-1]=='#') ret++;
		if (r>0&&c<C-1&&grid[r-1][c+1]=='#') ret++;
		if (r<R-1&&c>0&&grid[r+1][c-1]=='#') ret++;
		if (r<R-1&&c<C-1&&grid[r+1][c+1]=='#') ret++;
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
