import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		
		int n =sc.nextInt();
		int a[]=new int[n];
		boolean ans=false;
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			if(a[i]%2==1) {
				ans=true;
			}
		}
		System.out.println(ans?"first":"second");
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



