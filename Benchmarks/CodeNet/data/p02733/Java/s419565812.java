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
		char[][] grid = new char[R][C];
		int INF = 87237982;
		int ans = INF;
		for (int i = 0; i < R; i++) grid[i] = I.next().toCharArray();
		for (int mask = 0; mask<(1<<R); mask++) {
			//If R=2--> 00,01,10,11, NEVER 100 because that's length 3 (3>2)
			ArrayList<Integer> rows = new ArrayList<Integer>();
			rows.add(0); //Start column check from 0
			int curans = 0;
			for (int chk = 0; chk<R; chk++) {
				if ((mask>>chk)%2==1) {
					rows.add(chk+1); //End based of column segments
				}
			}
			rows.add(R); //Final stop
			curans=rows.size()-2; //Everything except default start and end segments
			ArrayList<Integer> cnts = new ArrayList<Integer>();
			int[] vis = new int[C+1]; //Which columns have been traversed so far
			//(Avoids infinite loop for impossible cases)
			for (int i = 0; i < rows.size(); i++) cnts.add(0);
			boolean bad=false;
			for (int c = 0;c < C; c++) {
				vis[c]++;
				if (vis[c]==3) {
					bad=true;
					break;
				}
				for (int i = 1; i < rows.size(); i++) {
					int start = rows.get(i-1);
					int end = rows.get(i);
					for (int r = start; r<end; r++) {
						if (grid[r][c]=='1') {
							cnts.set(i-1, cnts.get(i-1)+1);
							if (cnts.get(i-1)>K) {
								curans++;
								c--; //Go back one column ago and restart
								cnts=new ArrayList<Integer>();
								for (int j = 0; j < rows.size(); j++) cnts.add(0);
							}
						}
					}
				}
			}
			if (!bad) ans=min(ans,curans);
		}
		O.pln(ans);
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
