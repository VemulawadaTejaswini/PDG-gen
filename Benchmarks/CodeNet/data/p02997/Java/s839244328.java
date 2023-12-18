 
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
		
		if(check(k)) {
			out.println(n-1);
			for(int i=2;i<=n;++i) {
				out.println(1+" "+i);
			}
		}else out.println(-1);
		
		 out.close();
		 
	}
	private static boolean check(long k) {
		double D = Math.sqrt(1+8*k);
		if(D-(int)D!=0.0) return false;
		
		if((-1-D)%2!=0 || (-1+D)%2!=0)
		return false;
		else return true;
	}
	
}		




