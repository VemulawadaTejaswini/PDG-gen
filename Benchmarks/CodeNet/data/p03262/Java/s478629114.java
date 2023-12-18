import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {
	
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		
		int n=sc.nextInt();
		
		int x[]=new int[n+1];
		x[0]=sc.nextInt();
		for (int i = 1; i < n+1; i++) {
			x[i]=sc.nextInt();
		}
		
		int d[]=new int[n];
		for (int i = 0; i < n; i++) {
			d[i]=Math.abs(x[i+1]-x[i]);
		}
		for (int i = 0; i <= n-2; i++) {
			while(d[i]!=d[i+1]) {
			
				if(d[i]>d[i+1]) {
					if(d[i]%d[i+1]==0) {
						d[i]=d[i+1];
					}else {
				
					d[i]%=d[i+1];
					}
				}else {
					if(d[i+1]%d[i]==0) {
						d[i+1]=d[i];
					}else {
					
					d[i+1]%=d[i];
					}
				}
				
			}
		}
		System.out.println(d[n-1]);
			
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
