//package practice; 
import java.io.*;
import java.util.*;
import java.util.Stack;
import java.util.regex.Pattern;


public class Main {

	
	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;
		//it reads the data about the specified point and divide the data about it ,it is quite fast
		//than using direct 

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());//converts string to integer
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception r) {
				r.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	static long mod = (long)(1e9+7);
	public static void main(String[] args) {
		 FastReader sc = new FastReader();
		 
		long n = sc.nextLong();
		long k = sc.nextLong();
		long max = ((n-1)*(n-2))/2;
		List<Pair> ans = new ArrayList<>();
		if(k>max) out.println(-1);
		else {
			for(int i=2;i<=n;++i) ans.add(new Pair(1,i));
			long need = max-k;
			for(int i=2;i<=n && need>0;++i) {
				for(int j=i+1;j<=n && need>0;++j) {
					ans.add(new Pair(i,j));
					--need;
				}
			}
			
			out.println(ans.size());
			for(Pair p : ans) out.println(p.u+" "+p.v);
		}
		
		 out.close();
		 
	}
	static class Pair{
		int u;
		int v;
		Pair(int u,int v){
			this.u = u;
			this.v = v;
		}
	}
	
}		




