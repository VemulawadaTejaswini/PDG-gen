import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	public static void main(String[] args) { 
		/*Go over all substrings length <= K
		 * Maximum length of lexicographically smallest is when you encounter aaa...
		 * Maximum length will be K
		 * Find 5 smallest length 1 (not duplicates)
		 * "" length 2
		 * .
		 * .
		 * .
		 * "" length 5
		 * */
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		String S = I.next();
		int N = S.length();
		int K = I.nextInt();
		ArrayList<String>[] sub = new ArrayList[6];
		for (int i = 1; i <= 5; i++) sub[i] = new ArrayList<String>();
		int len = 1;
		while (len<=5) {
			for (int i = 0; i+len <= N; i++) {
				sub[len].add(S.substring(i,i+len));
			}
			Collections.sort(sub[len]);
			len++;
		}
		TreeSet<String>[] set = new TreeSet[6]; //best 5 of length [1-5]
		for (int i = 1; i <= 5; i++) set[i] = new TreeSet<String>();
		int size = 1;
		while (size<=5) {
			for (int i = 0; i < sub[size].size(); i++) {
				set[size].add(sub[size].get(i));
				if (set[size].size()==5) break;
			}
			size++;
		}
		ArrayList<String> all = new ArrayList<String>();
		for (int i = 1; i <= 5; i++) {
			while (set[i].size()>0) {
				all.add(set[i].pollFirst());
			}
		}
		Collections.sort(all);
		O.pln(all.get(K-1));
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
