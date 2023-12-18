import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
	
		MyScanner sc = new MyScanner();
		int n=sc.nextInt();
		int m=sc.nextInt();
		int x[]=new int[m];
		for(int i=0;i<m;i++) {
			x[i]=sc.nextInt();
		}
		int ans=0;
		if(n<m) {
			Arrays.sort(x);
			int dx[]=new int[m-1];
			for (int j=0;j<m-1;j++) {
				dx[j]=x[j+1]-x[j];
			}
			Arrays.sort(dx);
			for(int l=0;l<m-n;l++) {
				
				ans+=dx[l];
			}
		}
		System.out.println(ans);
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



