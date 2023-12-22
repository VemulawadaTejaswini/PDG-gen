import java.io.*; 
import java.math.*;
import java.util.*;
public class Main{  //~IQEmperor~ 
	public static void main(String[] args) {
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		/*long ret = 0;
		double s = System.nanoTime();
		for (int i = 1; i <= 3000; i++) {
			for (int j = 1; j <= 3000; j++) {
				for (int k = 1; k <= 3000; k++) {
					ret++;
				}
			}
		}
		O.pln(ret);
		double e = System.nanoTime();
		e-=s;
		O.pln(e/(double)(1e9));*/
		int R = I.nextInt();
		int C = I.nextInt();
		int K = I.nextInt();
		long[][] goods = new long[R][C];
		long[][] dp = new long[R][C]; //{0,1,2,3} items picked up in row so far
		long ans = 0;
		while (K-->0) {
			int r = I.nextInt()-1;
			int c = I.nextInt()-1;
			goods[r][c] = I.nextLong();
		}
		dp[0][0]=goods[0][0];
		ArrayList<Long> items = new ArrayList<Long>();
		if (goods[0][0]>0) items.add(goods[0][0]);
		for (int c = 1; c < C; c++) {
			if (goods[0][c]>0) {
				items.add(goods[0][c]);
				Collections.sort(items);
				for (int i = items.size()-1; i>=max(items.size()-3,0); i--) {
					long cur = items.get(i);
					dp[0][c]+=cur; //3 biggest
				}
			}else dp[0][c]=dp[0][c-1]; //Just rely on previous cell if no items 
		}
		for (int r = 1; r < R; r++) {
			dp[r][0]=dp[r-1][0]+goods[r][0];
		}
		for (int r = 1; r < R; r++) {
			for (int c = 1; c < C; c++) {
				if (goods[r][c]>0) {
					long x = 0;
					long y = 0;
					long z = 0; //{x,y,z} indicate three biggest in sorted order 
					for (int back = c; back>=0; back--) {
						if (goods[r][back]>0) {
							if (goods[r][back]>z) {
								long Y = z;
								long X = y;
								z=goods[r][back];
								y=Y;
								x=X;
							}else if (goods[r][back]>y) {
								long X = y;
								y=goods[r][back];
								x=X;
							}else if (goods[r][back]>x) {
								x=goods[r][back];
							}
						}
						dp[r][c]=max(dp[r][c],dp[r-1][back]+x+y+z);
					}
				}else {
					dp[r][c]=max(dp[r-1][c],dp[r][c-1]);
				}
			}
		}
		O.pln(dp[R-1][C-1]);
	}
	public static long min(long a, long b) {return Math.min(a,b);}
	public static long max(long a, long b) {return Math.max(a,b);}
	public static int min(int a, int b) {return Math.min(a,b);}
	public static int max(int a, int b) {return Math.max(a,b);}
	public static long abs(long x, long y) {return Math.abs(x-y);}
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