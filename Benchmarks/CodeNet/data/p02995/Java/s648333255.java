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
		long LCM = C*D;
		LCM/=GCD(C,D);
		
		//C
		long lo = A;
		long mod = A%C;
		if (mod!=0) lo+=C-mod;
		if (lo<=B) { //If lower bound is within [A,B]
			long hi = B;  //A=5,B=20,C=6 --> hi = 20-20%6 = 18 
			hi-=(B%C);
			long range = hi-lo;
			ans-=range/C;
			ans--; //If range = [24,24] answer is 1 still (inclusion technique)
		}
		//D
		lo = A;
		mod = A%D;
		if (mod!=0) lo+=D-mod;
		if (lo<=B) { //If lower bound is within [A,B]
			long hi = B;  //A=5,B=20,C=6 --> hi = 20-20%6 = 18 
			hi-=(B%D);
			long range = hi-lo;
			ans-=range/D;
			ans--; //If range = [24,24] answer is 1 still (inclusion technique)
		}
		//LCM (Removes counting a valid number twice in range [A,B])
		lo = A;
		mod = A%LCM;
		if (mod!=0) lo+=LCM-mod;
		if (lo<=B) { //If lower bound is within [A,B]
			long hi = B;  //A=5,B=20,C=6 --> hi = 20-20%6 = 18 
			hi-=(B%LCM);
			long range = hi-lo;
			ans+=range/LCM;
			ans++; //If range = [24,24] answer is 1 still (inclusion technique)
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