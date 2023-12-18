import java.io.*;
import java.math.*;
import java.util.*;
public class Main { //CASH MONEY --> Collections.sort()>>>>>Arrays.sort()
 
	public static void main(String[] args) { //Ball out dawg
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int[][] grid = new int[3][3];
		boolean good = false;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				grid[i][j] = I.nextInt();
			}
		}
		for (int a = 0; a <= 100; a++) {
			for (int b = 0; b <= 100; b++) {
				for (int c = 0; c <= 100; c++) {
					int check = 0; //how many columns are valid
					for (int col = 0; col < 3; col++) {
						if (grid[0][col]-a==grid[1][col]-b&&grid[0][col]-a==grid[2][col]-c) {
							check++;
						}
					}
					if (check==3) good=true;
				}
				if (good) break;
			}
			if (good) break;
		}
		O.pln(good?"Yes":"No");
	}
	public static int MEX(int N,int[] cnts) {
		for (int test = 0; test <=N; test++) if (cnts[test]==0) return test;
		return -1;
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
