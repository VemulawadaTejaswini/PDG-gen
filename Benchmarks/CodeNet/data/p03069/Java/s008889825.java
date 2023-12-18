import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { //Generate sets of [W,B]
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int N  = I.nextInt();
		String S = I.next();
		int[] W = new int[N+1]; //Number of white stones up to index i (exclusive)
		int[] B = new int[N+1]; //Number of black stones up to index i (exclusive)
		//i = 0 is the null set
		long ans = 100001000;
		for (int i = 0; i < N; i++) {
			B[i+1]=B[i];
			W[i+1]=W[i];
			if (S.charAt(i)=='.') W[i+1]++;
			else B[i+1]++;
		}
		for (int chk = 0; chk<=N; chk++) {
			int white = W[chk];
			int black = B[N]-B[chk];
			int changeW = chk-white;
			int changeB = N-chk-black;
			ans=Math.min(ans, changeB+changeW);
		}
		O.pln(ans);
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
