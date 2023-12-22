import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	static int[] str; //Segment tree of rows
	static int[] stc; //Segment tree of columns
	static int[] rows;
	static int[] cols;
	public static void main(String[] args) { 
		/*
		 * */
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int N = I.nextInt();
		int Q = I.nextInt();
		long ans = N-2;
		ans*=ans;
		str = new int[4*N];
		stc = new int[4*N];
		rows = new int[N];
		cols = new int[N];
		while (Q-->0) {
			int op = I.nextInt();
			if (op==1) {
				int col = I.nextInt()-1;
				int lo = 0;
				int hi = N-2;
				int sub = 0;
				while (lo<=hi) { //Extending white stones downward
					int mid = (lo+hi)/2;
					int max = getMax(1,0,N-1,0,mid,stc);
					if (max<col) {
						sub=max(sub,mid);
						lo=mid+1;
					}else hi=mid-1;
				}
				cols[col]=max(cols[col],sub);
				UPD(1,0,N-1,col,sub,str);
				ans-=sub;
				//O.pln(sub);
			}else { //Horizontal extension of white stones
				int row = I.nextInt()-1;
				int lo = 0;
				int hi = N-2;
				int sub = 0;
				while (lo<=hi) {
					int mid = (lo+hi)/2;
					int max = getMax(1,0,N-1,0,mid,str);
					if (max<row) {
						sub=max(sub,mid);
						lo=mid+1;
					}else hi=mid-1;
				}
				rows[row]=max(rows[row],sub);
				UPD(1,0,N-1,row,sub,stc);
				ans-=sub;
				//O.pln(sub);
			}
		}
		O.pln(ans);
	}
	public static void UPD(int node, int start, int end, int in, int val, int[] st) {
		if (start==end) st[node]=val;
		else {
			int mid = (start+end)/2;
			if (in>=start&&in<=mid) {
				UPD(2*node,start,mid,in,val,st);
			}else {
				UPD(2*node+1,mid+1,end,in,val,st);
			}
			st[node]=max(st[2*node],st[2*node+1]);
		}
	}
	public static int getMax(int node, int start, int end,int L, int R, int[] st) {
		if (start>R||end<L) return 0;
		if (L<=start&&R>=end) return st[node];
		int mid = (start+end)/2;
		int left = getMax(2*node,start,mid,L,R,st);
		int right = getMax(2*node+1,mid+1,end,L,R,st);
		return max(left,right);
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