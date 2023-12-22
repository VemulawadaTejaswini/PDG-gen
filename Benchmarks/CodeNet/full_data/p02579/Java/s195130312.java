import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	/**/
	public static void main(String[] args) {  
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int R = I.nextInt();
		int C = I.nextInt();
		int r1 = I.nextInt()-1;
		int c1 = I.nextInt()-1;
		int r2 = I.nextInt()-1;
		int c2 = I.nextInt()-1;
		char[][] grid = new char[R][C];
		for (int i = 0; i < R; i++) grid[i] = I.next().toCharArray();
		long[][] dp = new long[R][C]; //dp[i][j] holds minimum magic to get to square (i,j)
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				dp[i][j] = Integer.MAX_VALUE;
			}
		}
		dp[r1][c1]=0; //Already here
		for (int r = r1; r < R; r++) {
			for (int c = c1; c < C; c++) {
				if (grid[r][c]=='.') {
					if (r>0) dp[r][c]=min(dp[r][c],dp[r-1][c]);
					if (c>0) dp[r][c]=min(dp[r][c],dp[r][c-1]);
					if (r+1<R) dp[r][c]=min(dp[r][c],dp[r+1][c]);
					if (c+1<C) dp[r][c]=min(dp[r][c],dp[r][c+1]);
					for (int backr = max(r-2,0); backr<=min(r+2,R-1); backr++) {
						for (int backc = max(c-2,0); backc<=min(c+2,C-1); backc++) {
							dp[r][c]=min(dp[r][c],dp[backr][backc]+1); //Magic check
							//Obstacles will be huge numbers, 
							//therefore no affect on final answer
						}
					}
				}			
			}
		}
		for (int r = r1; r >= 0; r--) {
			for (int c = c1; c < C; c++) {
				if (grid[r][c]=='.') {
					if (r>0) dp[r][c]=min(dp[r][c],dp[r-1][c]);
					if (c>0) dp[r][c]=min(dp[r][c],dp[r][c-1]);
					if (r+1<R) dp[r][c]=min(dp[r][c],dp[r+1][c]);
					if (c+1<C) dp[r][c]=min(dp[r][c],dp[r][c+1]);
					for (int backr = max(r-2,0); backr<=min(r+2,R-1); backr++) {
						for (int backc = max(c-2,0); backc<=min(c+2,C-1); backc++) {
							dp[r][c]=min(dp[r][c],dp[backr][backc]+1); //Magic check
							//Obstacles will be huge numbers, 
							//therefore no affect on final answer
						}
					}
				}			
			}
		}
		for (int r = r1; r >= 0; r--) {
			for (int c = c1; c >= 0; c--) {
				if (grid[r][c]=='.') {
					if (r>0) dp[r][c]=min(dp[r][c],dp[r-1][c]);
					if (c>0) dp[r][c]=min(dp[r][c],dp[r][c-1]);
					if (r+1<R) dp[r][c]=min(dp[r][c],dp[r+1][c]);
					if (c+1<C) dp[r][c]=min(dp[r][c],dp[r][c+1]);
					for (int backr = max(r-2,0); backr<=min(r+2,R-1); backr++) {
						for (int backc = max(c-2,0); backc<=min(c+2,C-1); backc++) {
							dp[r][c]=min(dp[r][c],dp[backr][backc]+1); //Magic check
							//Obstacles will be huge numbers, 
							//therefore no affect on final answer
						}
					}
				}			
			}
		}
		for (int r = r1; r < R; r++) {
			for (int c = c1; c >= 0; c--) {
				if (grid[r][c]=='.') {
					if (r>0) dp[r][c]=min(dp[r][c],dp[r-1][c]);
					if (c>0) dp[r][c]=min(dp[r][c],dp[r][c-1]);
					if (r+1<R) dp[r][c]=min(dp[r][c],dp[r+1][c]);
					if (c+1<C) dp[r][c]=min(dp[r][c],dp[r][c+1]);
					for (int backr = max(r-2,0); backr<=min(r+2,R-1); backr++) {
						for (int backc = max(c-2,0); backc<=min(c+2,C-1); backc++) {
							dp[r][c]=min(dp[r][c],dp[backr][backc]+1); //Magic check
							//Obstacles will be huge numbers, 
							//therefore no affect on final answer
						}
					}
				}			
			}
		}
		for (int r = 0; r < R; r++) { //Full matrix check after intermediate values were 
			//calculated
 			for (int c = 0; c < C; c++) {
				if (grid[r][c]=='.') {
					if (r>0) dp[r][c]=min(dp[r][c],dp[r-1][c]);
					if (c>0) dp[r][c]=min(dp[r][c],dp[r][c-1]);
					if (r+1<R) dp[r][c]=min(dp[r][c],dp[r+1][c]);
					if (c+1<C) dp[r][c]=min(dp[r][c],dp[r][c+1]);
					for (int backr = max(r-2,0); backr<=min(r+2,R-1); backr++) {
						for (int backc = max(c-2,0); backc<=min(c+2,C-1); backc++) {
							dp[r][c]=min(dp[r][c],dp[backr][backc]+1); //Magic check
							//Obstacles will be huge numbers, 
							//therefore no affect on final answer
						}
					}
				}			
			}
		}
		O.pln(dp[r2][c2]>=Integer.MAX_VALUE?-1:dp[r2][c2]);
	}
	public static long min(long a, long b) {return Math.min(a,b);}
	public static long max(long a, long b) {return Math.max(a,b);}
	public static int min(int a, int b) {return Math.min(a,b);}
	public static int max(int a, int b) {return Math.max(a,b);}
	public static long abs(long x, long y) {return Math.abs(x-y);}
	public static long ceil(long num, long den) {long ans = num/den; if (num%den!=0) 
	ans++; return ans;}
	public static long GCD(long a, long b) {
		if (a==0||b==0) return max(a,b);
		return GCD(max(a,b),max(a,b)%min(a,b));
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
