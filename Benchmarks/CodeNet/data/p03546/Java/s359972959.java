import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int ans = 0;
		int R = I.nextInt();
		int C = I.nextInt();
		int[][] cost = new int[10][10];
		int[][] shortest = new int[10][10]; //shortest[i][j] = smallest path from 
		//vertex i to vertex j
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				cost[i][j] = I.nextInt();
				shortest[i][j] = cost[i][j]; //Assuming initial,default edge is shortest
			}
		}
		for (int start = 0; start < 10; start++) {
			for (int end = 0; end<10;end++) { //Fixating start and end path we want to optimize
				for (int bet = 0; bet<10; bet++) {
					//In between edge which might have a distance sum less than shortest[i][j]
					shortest[start][end]=Math.min(shortest[start][end],
					shortest[start][bet]+shortest[bet][end]);
				}
			}
		}
		for (int r = 0; r < R; r++) {
			for (int c = 0; c < C; c++) {
				int x = I.nextInt();
				if (x!=-1) {
					ans+=shortest[x][1]; //Shortest path from digit x to digit 1
				}
			}
		}
		O.pln(ans);
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
