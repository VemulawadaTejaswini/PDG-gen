import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	public static void main(String[] args) { 
		/**/
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int N = I.nextInt();
		long K = I.nextLong();
		long[] a = new long[N];
		for (int i = 0; i < N; i++) a[i] = I.nextLong();
		long pow_2 = 1;
		int cnt = 1; //How many bits does maximum value of K hold
		while (pow_2<K) {
			pow_2*=2;
			cnt++;
		}
		cnt--; //While loop counts power of 2 strictly greater than K
		int[] numbits = new int[cnt]; //numsbits[i] = how many numbers in array have ith bit
		int in = 0;
		int[] KBits = new int[cnt];
		while (K>0) {
			KBits[in]=(int)K%2;
			in++;
			K/=2;
		}
		for (int i = 0; i < N; i++) { //If K has 0 in a certain bit, you can only take 0
			//unless you took 0 when K had 1 in a previous bit before...
			long cur = a[i];
			int pow = 0;
			while (cur>0&&pow<cnt) {
				numbits[pow]+=cur%2; //If odd, bit exists, otherwise binary representation is 0
				cur/=2;
				pow++;
			}
		}
		long best = 0; //Best number to XOR with
		long add = 1; 
		boolean lower = false;
		for (int bit = 0; bit<cnt; bit++) {
			int have = numbits[bit];
			int left = N-have;
			if (have>=left&&KBits[bit]==1) {
				lower=true; //Took 0 instead of 1 when we COULD have taken 1
			}
			if (left>have&&(KBits[bit]==1||lower)) best+=add;
			add*=2;
		}
		long ans = 0;
		for (int i = 0; i < N; i++) ans+=a[i]^best;
		O.pln(ans);
	}
	public static double max(double a, double b) {return Math.max(a, b);}
	public static double min(double a, double b) {return Math.min(a, b);}
	public static long min(long a, long b) {return Math.min(a,b);}
	public static long max(long a, long b) {return Math.max(a,b);}
	public static int min(int a, int b) {return Math.min(a,b);}
	public static int max(int a, int b) {return Math.max(a,b);}
	public static long abs(long x) {return Math.abs(x);}
	public static long ceil(long num, long den) {long ans = num/den; if (num%den!=0) 
	ans++; return ans;}
	public static long GCD(long a, long b) {
		if (a==0||b==0) return max(a,b);
		return GCD(min(a,b),max(a,b)%min(a,b));
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
