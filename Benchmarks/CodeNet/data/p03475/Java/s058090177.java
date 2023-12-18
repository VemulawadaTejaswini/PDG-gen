import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;
public class Main { 
 
	public static void main(String[] args) { 
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int N = I.nextInt();
		long[][] sch = new long[N+1][3]; //[Speed,first departure, frequency after ceremony]
		for (int i = 1; i <= N-1; i++) {
			sch[i][0] = I.nextLong();
			sch[i][1] = I.nextLong();
			sch[i][2] = I.nextLong();
		}
		for (int start = 1; start <= N; start++) {
			int cur = start;
			long curans = 0;
			while (cur<N) {
				if (curans<sch[cur][1]) curans = sch[cur][1];
				else {
					long late = curans-sch[cur][1];
					long mod = late%sch[cur][2];
					long add = 0;
					if (mod>0) {
						add=sch[cur][2]-mod; //If late by 5 and frequency is 6, only 1 more 
						//minute is needed
					}
					curans+=add;
				}
				curans+=sch[cur][0]; //Speed of current train to reach station i+1 
				//from station i
				cur++;
			}
			O.pln(curans);
		}
	}
	public static void sort(long[] a) {Arrays.sort(a);}
	public static void sort(int[] a) {Arrays.sort(a);}
	public static void sort(String[] a) {Arrays.sort(a);}
	public static void sort(char[] a) {Arrays.sort(a);}
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
