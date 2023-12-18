import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
	
		MyScanner sc = new MyScanner();
		int n=sc.nextInt();
		int t[]=new int[n];
		int time=0;
		for(int i=0;i<n;i++) {
			t[i]=sc.nextInt();
			time+=t[i];
		}
		int m=sc.nextInt();
		int p[]=new int[m];
		int x[]=new int[m];
		
		for(int i=0;i<m;i++) {
			p[i]=sc.nextInt();
			x[i]=sc.nextInt();
		}
		int ans[]=new int[m];
		for(int j=0;j<m;j++) {
			ans[j]=time+x[j]-t[p[j]-1];
			System.out.println(ans[j]);
		}
		
		
		
		
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



