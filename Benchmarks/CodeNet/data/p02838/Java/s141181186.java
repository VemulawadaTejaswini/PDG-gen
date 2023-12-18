import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {  
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int N = I.nextInt();
		long[] a = new long[N+1];
		long[] bits = new long[61]; //bits[i] = Total number of numbers 
		//that have bit i in binary
		long mod = (long)(1e9)+7;
		long ans = 0;
		long[] pow_2 = new long[61];
		pow_2[0]=1;
		for (int i = 1; i <= 60; i++) {
			pow_2[i]=pow_2[i-1]*2;
			pow_2[i]%=mod;
		}
		for (int i = 1; i <= N; i++) a[i] = I.nextLong();
		for (int i = 1; i <= N; i++) {
			long cur = a[i];
			int bit = 0; //2^N requires N+1 slots of binary silly
			while (cur>0) {
				if (cur%2==1) bits[bit]++;
				cur/=2; //Shifting over one bit to the left now (111--> 11) (similar to base 10)
				bit++;
			}
		}
		//for (int i = 0; i <= 60; i++) O.p(bits[i]+" ");
		//O.p("\n");
		for (int i = 1; i <= N; i++) {
			boolean[] has = new boolean[61]; //Which bits the current number has
			//This way, opposites with be easier to match up (1-->0,0-->1)
			long cur = a[i];
			int curbit = 0;
			while (cur>0) {
				if (cur%2==1) {
					has[curbit]=true;
					bits[curbit]--; //Can't use current number's bits for ordered XOR pairs
				}
				cur/=2;
				curbit++;
			}
			for (int bit = 0; bit<=60; bit++) {
				if (has[bit]) { //Look for future 0s in this bit slot then
					long left = N-i; //Numbers you can pair with
					long have = bits[bit];
					long pair = left-have; //if this is a 1 bit, look for 0s
					long curans=pow_2[bit];
					curans*=pair; //Each pair contributes power of 2 to sum
					curans%=mod;
					ans+=curans;
				}else {
					long have = bits[bit];
					long curans = pow_2[bit];
					curans*=have; //If 0 right now, take all 1s available in later numbers
					curans%=mod;
					ans+=curans;
				}
				ans%=mod;
			}
		}
		O.pln(ans);
	}
	public static long min(long a, long b) {return Math.min(a,b);}
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
