import java.io.*;
import java.math.*;
import java.util.*;
public class Main{ 
 
	public static void main(String[] args) { 
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		String S = I.next();
		boolean good=false;
		if (S.charAt(0)==S.charAt(1)&&S.charAt(1)==S.charAt(2)) good=true;
		else if (S.charAt(1)==S.charAt(2)&&S.charAt(2)==S.charAt(3)) good=true;
		O.pln(good?"Yes":"No");
	}
	public static ArrayList<String> perms(int N,int limit){
		if (N==1) {
			ArrayList<String> ret = new ArrayList<String>();
			for (int i = 0; i < limit; i++) {
				 ret.add(Integer.toString(i));
			}
			return ret;
		}
		ArrayList<String> prev = perms(N-1,limit);
		ArrayList<String> ret = new ArrayList<String>();
		for (int i = 0; i < prev.size(); i++) {
			String cur = prev.get(i);
			boolean[] vis = new boolean[10];
			for (int j = 0; j < cur.length(); j++) {
				int dig = Integer.parseInt(cur.substring(j,j+1));
				vis[dig]=true;
			}
			if (!vis[1]) {
				for (int next = 0; next < limit; next++) {
					if (!vis[next]) {
						String add = cur;
						add+=Integer.toString(next);
						ret.add(add);
					}
				}
			}else ret.add(cur); //Just use previous end on 1 sequence	
		}
		return ret;
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
		void pln(double x) {w.println(x);w.flush();}
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
