import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {  
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int N = I.nextInt();
		int[] ZERO = new int[6];
		Arrays.fill(ZERO, -1);
		/*for (int i = 0; i < 140; i++) {
			UPD(ZERO,5);
			for (int j = 0; j < 6; j++) O.p(ZERO[j]+" ");
			O.p("\n");
		}*/
		long ans = 0;
		for (int a = 1; a < 10; a++) { //Start with a, end with b
			for (int b = 1; b < 10; b++) {
				int start = b;
				int end = a; //FLIP
				if (a!=b) {
					long flip = 0;
					long norm = 0;
					if (start*10+end<=N) flip++; //Bound to be different (ab,ba)
					int[] bet = new int[6];
					Arrays.fill(bet, -1);//-1 means digits not reached before
					UPD(bet,5); //Update before
					while (true) {
						String cur = Integer.toString(start);
						for (int i = 0; i < 6; i++) if (bet[i]>-1) cur+=Integer.toString(bet[i]);
						cur+=Integer.toString(end);
						int chk = Integer.parseInt(cur);
						//O.pln(chk);
						if (chk>N) break;
						flip++;
						UPD(bet,5);
					}
					bet = new int[6];
					Arrays.fill(bet, -1);//-1 means digits not reached before
					UPD(bet,5);
					if (a*10+b<=N) norm++;
					while (true) {
						String cur = Integer.toString(a);
						for (int i = 0; i < 6; i++) if (bet[i]>-1) cur+=Integer.toString(bet[i]);
						cur+=Integer.toString(b);
						int chk = Integer.parseInt(cur);
						if (chk>N) break;
						norm++;
						UPD(bet,5);
					}
					ans+=flip*norm;
				}else if (a==b) {
					long cnt = 0; //Order doesn't matter when start and end are same
					if (start<=N) cnt++; //(ONE,TWO) --> (TWO,ONE)
					if (start*10+start<=N) cnt++;
					//curcnt+=2; //One ONE digit number and one TWO digit number
					int[] bet = new int[6];
					Arrays.fill(bet, -1);//-1 means digits not reached before 
					//Middle digit can be 0...
					UPD(bet,5);
					while (true) {
						String cur = Integer.toString(start);
						for (int i = 0; i < 6; i++) if (bet[i]>-1) cur+=Integer.toString(bet[i]);
						cur+=Integer.toString(end);
						int chk = Integer.parseInt(cur);
						if (chk>N) break;
						cnt++;
						UPD(bet,5);
					}
					ans+=cnt*cnt; 
					//O.pln(cnt);
				}
				//ans+=curcnt; //Pick anyone possibility
			}
		}
		O.pln(ans);
	}
	public static void UPD(int[] bet, int in) {
		if (bet[in]==-1) bet[in]=0; //Assigning new digit
		else {
			bet[in]++;
			bet[in]%=10;
			if (bet[in]==0) UPD(bet,in-1); //Recurse backwards
		}
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
