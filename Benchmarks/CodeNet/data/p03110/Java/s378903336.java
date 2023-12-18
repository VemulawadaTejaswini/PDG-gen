import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {
	
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		int n=sc.nextInt();
		double x[]=new double[n];
		String u[]=new String[n];
		double ans=0;
		for (int i = 0; i < n; i++) {
			x[i]=sc.nextDouble();
			u[i]=sc.next();
			if(u[i].equals("JPY")) {
				ans+=x[i];
			}else {
				ans+=x[i]*380000;
			}
			
		}
		System.out.println(ans);
		
	}
	
	
	
//----------------------------------------------------------
	static int l_min(int[] a) {
		Arrays.sort(a);
		return a[0];
	}
	static int l_max(int[] a) {
		int l=a.length;
		Arrays.sort(a);
		return a[l-1];
	}
	
	public static PrintWriter out;

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

	}
	

}
