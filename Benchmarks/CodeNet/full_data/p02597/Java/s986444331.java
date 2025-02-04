//ABC 174 --> Put in review package later
/*Author: Aayush Khazanchi                                   Date: 02/08/20
 * 
 * 
 * */
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {  //Ball out dawg
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int ans = 10001010;
		int N = I.nextInt();
		String S = I.next();
		int[] R = new int[N+1];
		int[] W = new int[N+1];
		for (int i = 0; i < N; i++) {
			R[i+1]=R[i];
			W[i+1]=W[i];
			if (S.charAt(i)=='R') R[i+1]++;
			else W[i+1]++;
		}
		ans=min(R[N],W[N]); //All white or all red
		for (int i = 0; i < N; i++) { //All red up to i, white after
			int curW = W[i]; //Number of whites in left
			int curR = R[N]-R[i];
			int curans=min(curR,curW); //Swap these bad stones
			curR-=curans;
			curW-=curans;
			curans+=max(curR,curW); //For left over, just change color
			ans=min(curans,ans);
		}
		O.pln(ans);
	}
	public static long min(long a, long b) {return Math.min(a,b);}
	public static int min(int a, int b) {return Math.min(a,b);}
	public static long max(long a, long b) {return Math.max(a,b);}
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
