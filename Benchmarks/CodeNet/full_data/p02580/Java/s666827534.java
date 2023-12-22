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
		int M = I.nextInt();
		int ans = 0;
		int[] row = new int[R];
		int[] col = new int[C];
		int[][] bomb = new int[M][2];
		int maxR = 0;
		int maxC = 0;
		int bestR = 0;
		int bestC = 0;
		for (int i = 0; i < M; i++) {
			int r = I.nextInt()-1;
			int c = I.nextInt()-1;
			bomb[i][0]=r;
			bomb[i][1]=c;
			row[r]++;
			col[c]++;
			if (row[r]>maxR) {
				maxR=row[r];
				bestR=r;
			}
			if (col[c]>maxC) {
				maxC=col[c];
				bestC=c;
			}
		}	
		int Rowans = maxR;
		int mostC = 0;
		int CC = 0;
		int[] cntsC = new int[C];
		for (int i = 0; i < M; i++) {
			if (bomb[i][0]!=bestR) {
				cntsC[bomb[i][1]]++;
				if (cntsC[bomb[i][1]]>mostC) {
					mostC = cntsC[bomb[i][1]];
					CC=bomb[i][1];
				}
			}
		}
		Rowans+=cntsC[CC];
		ans=max(Rowans,ans);
		int[] cntsR = new int[R];
		int mostR = 0;
		int RR = 0;
		int colAns = maxC;
		for (int i = 0; i < M; i++) {
			if (bomb[i][1]!=bestC) {
				cntsR[bomb[i][0]]++;
				if (cntsR[bomb[i][0]]>mostR) {
					mostR = cntsR[bomb[i][0]];
					RR=bomb[i][0];
				}
			}
		}
		colAns+=cntsR[RR];
		ans=max(ans,colAns);
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
