import java.util.*;
import java.io.*;
import java.math.*;
class Main{
	static int mod = 998244353;
public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	public static void main(String sp[])throws IOException{
		FastReader sc = new FastReader();
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		long diff = Math.abs(a-b);
		long min  = Long.MAX_VALUE;
		if(diff%2!=0){
			if(a==1 || b==1 || a==n || b==n){
				System.out.println((diff-1)/2);
			}else{
			System.out.println(Math.min(Math.max(a,b)-1 , n - Math.min(a,b)));
			}	
		}
		else if(diff%2==0){
			System.out.println(diff/2);
		}
	}
	
	
	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;


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

}