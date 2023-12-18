import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { //Ball out dawg
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		long A = I.nextLong();
		long B = I.nextLong();
		long C = I.nextLong();
		long D = I.nextLong();
		long ans = B-A+1;
		long sub = 0;
		long LCM = C*D;
		LCM/=GCD(C,D);
		
		//C check
		long lo = A%C;
		lo=C-lo;
		lo+=A;
		long hi = B-B%C; 
		if (A%C==0)lo=A;
		if (B%C==0) hi = B;
		long range = hi-lo;
		sub+=range/C;
		sub++;
		
		//O.pln(lo+" "+hi);
		//D check
		lo = A%D;
		lo=D-lo;
		lo+=A;
		hi = B-B%D; 
		if (A%D==0)lo=A;
		if (B%D==0) hi = B;
		range = hi-lo;
		sub+=range/D;
		sub++;
		
		//LCM check
		long alt = 0;
		lo = A%LCM;
		lo=C-lo;
		lo+=A;
		hi = B-B%LCM;
		if (A%LCM==0)lo=A;
		if (B%LCM==0) hi = B;
		range = hi-lo;
		alt+=range/LCM;
		//if (lo<=LCM&&hi>=LCM) alt++;
		alt++;
		sub-=alt;
		//O.pln(sub);
		O.pln(ans-sub);
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