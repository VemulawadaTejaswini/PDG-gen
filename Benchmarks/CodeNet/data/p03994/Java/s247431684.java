import java.io.*;
import java.math.*;
import java.util.*;
public class Main{  
	public static void main(String[] args) { 
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		String S = I.next();
		int K = I.nextInt();
		int N = S.length();
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < N-1; i++) { //Always stop at A (operation is only useful when you
			//cycle back to small letters (A being the best)
			//Leftover can be spent on last letter as it weighs the least (optimize important 
			//slots first)
			char cur = S.charAt(i);
			int diff = cur-'a';
			int numBoost = 26-diff; //B takes 25 attempts
			numBoost%=26; //a does not require any operations dummy
			if (numBoost<=K) {
				ans.append('a');
				K-=numBoost;
			}else ans.append(cur); //Keep original
		}
		K%=26; //Taking relevant part if leftover
		int last = S.charAt(N-1)-'a'; //Have to use even if it means worse
		char add = (char)((last+K)%26+'a');
		ans.append(add);
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
