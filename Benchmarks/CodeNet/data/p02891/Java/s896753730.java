import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {  
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		String S = I.next();
		int N = S.length();
		long K = I.nextLong();
		long pref = 1;
		long suff = 1;
		long bet = 0; //In between connections (suffix meets prefix points)
		long ans = 0;
		for (int i = 1; i < N; i++) {
			if (S.charAt(i)!=S.charAt(i-1)) break;
			pref++;
		}
		for (int i = N-2; i >= 0; i--) {
			if (S.charAt(i)!=S.charAt(i+1)) break;
			suff++;
		} 
		if (S.charAt(0)==S.charAt(N-1)) bet=suff+pref;
		ArrayList<Long> cnts = new ArrayList<Long>(); //Lengths of substrings with same letter
		for (int i = 0; i < N-1; i++) {
			if (S.charAt(i)==S.charAt(i+1)) {
				long cnt = 2;
				for (int next = i+2; next<N; next++) {
					if (S.charAt(next)==S.charAt(next-1)) cnt++;
					else {
						i=next-1;
						break;
					} 
				}
				cnts.add(cnt);
			}else cnts.add((long)1);
		}
		if (bet<N) { //If prefix+suffix isn't the entire string
			if (bet==0) {
				for (int i = 0; i < cnts.size(); i++) {
					long cur = cnts.get(i);
					ans+=(cur/2)*K; //K copies of internal parts of S
				}
			}else {
				ans+=(bet/2)*(K-1); //K-1 connections if K repetitions
				long start = cnts.get(0);
				ans+=start/2; //Leftmost part of entire string 
				long end = cnts.get(cnts.size()-1);
				ans+=end/2; //Rightmost part of T
				for (int i = 1; i < cnts.size()-1; i++) {
					long cur = cnts.get(i);
					ans+=(cur/2)*K; //K copies of internal parts of S
				}
			}
			
		}else {
			long len = (long)N*K;
			ans=len/2;
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
