
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	
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
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
    public static long mod = (long) (1e9+7);
	public static void main(String[] args) {
		
		FastReader sc = new FastReader();
	int n = sc.nextInt();
	long[] a = new long[n];
	for(int i=0;i<n;++i) {
		a[i] = sc.nextLong();
	    
	 }
	long[] b = a.clone();
    long temp = 0;
	for(int i=0;i<n;++i) {
		if(i%2==0) temp+=a[i];
		else temp-=a[i];
	}
	a[0] = temp;
	for(int i=1;i<n;++i) {
		a[i] = 2*b[i-1]-a[i-1];
	}
			for(long x : a) out.print(x+" ");
	out.close();
		
	}
	
}