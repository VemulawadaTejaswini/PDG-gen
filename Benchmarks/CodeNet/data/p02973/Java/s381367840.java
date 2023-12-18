import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	public static void main(String[] args) { 
		/*Don't always sort previous minimums array
		 * Insert using binary search on the already sorted array
		 * */
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int N = I.nextInt();
		int used=0;
		ArrayList<Integer> prev = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			int x = I.nextInt();
			int lo = 0;
			int hi = prev.size()-1;
			boolean exists = false; //Is there a previous minimum that is < x?
			int best = -1;
			while (lo<=hi) {
				int mid = (lo+hi)/2;
				if (prev.get(mid)>=x) {
					hi=mid-1;
				}else {
					exists=true;
					best=max(best,mid);
					lo=mid+1;
				}		
			}
			if (!exists) {
				used++; 
				if (prev.size()==0) {
					prev.add(x);
				}else {
					lo=0;
					hi=prev.size()-1;
					best = 0;
					while (lo<=hi) {
						int mid = (lo+hi)/2;
						if (prev.get(mid)>=x) {
							hi=mid-1;
						}else {
							lo=mid+1;
							best=max(best,mid);
						}
					}
					prev.add(best,x);
				}
			}else {
				prev.remove(best); //Insert x (new element) in place of biggest 
				//previous minimum 
				lo=0;
				hi=prev.size()-1;
				best = 0;
				while (lo<=hi) {
					int mid = (lo+hi)/2;
					if (prev.get(mid)>x) {
						hi=mid-1;
					}else {
						lo=mid+1;
						best=max(best,mid);
					}
				}
				if (prev.size()==0||x>=prev.get(prev.size()-1)) prev.add(x);
				else if (x<=prev.get(0)) prev.add(0,x);
				else prev.add(best, x);
			}
			//for (int j = 0; j < prev.size(); j++) O.p(prev.get(j)+" ");
			//O.p("\n");
		}
		O.pln(used);
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