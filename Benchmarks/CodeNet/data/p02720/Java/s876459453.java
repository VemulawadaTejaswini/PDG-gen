import java.io.*;
import java.math.*;
import java.util.*;
public class Main {  
	public static void main(String[] args) { 
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int K = I.nextInt();
		long[] a = new long[11];
		Arrays.fill(a,-1);
		long ans = 0;
		while (K>0) {
			UPD(a,a.length-1);
			//for (int i = 0; i < a.length; i++) O.p(a[i]+" ");
			//O.p("\n");
			long mult = 1;
			ans = 0;
			for (int i = a.length-1; i >= 0; i--) {
				ans+=Math.max(a[i],0)*mult;
				mult*=10;
			} 
			K--;
		}
		O.pln(ans);
	}
	public static void UPD(long[] a, int in) {
		if (a[in]==-1) a[in]=1;
		else {
			a[in]++;
			a[in]%=10;
			if (a[in]==0) {
				UPD(a,in-1);
				a[in]=a[in-1]-1;
				a[in]=Math.max(a[in], 0); //Can't have negative digits now
			}
			if (a[in-1]!=-1&&Math.abs(a[in]-a[in-1])>1) {
				//-1 means those digit slots haven't been used yet
				UPD(a,in-1);
				a[in]=a[in-1]-1; //Reset and recurse left starting with lower-bound
				a[in]=Math.max(a[in], 0); //Can't have negative digits now
			}
		}
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
