import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
	
		MyScanner sc = new MyScanner();
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			c[i]=sc.nextInt();
		}
		int hp[][]=new int[n][3];
		hp[0][0]=a[0];
		hp[0][1]=b[0];
		hp[0][2]=c[0];
		for(int j=1;j<n;j++) {
			hp[j][0]=Math.max(hp[j-1][1]+a[j],hp[j-1][2]+a[j]);
			hp[j][1]=Math.max(hp[j-1][0]+b[j],hp[j-1][2]+b[j]);
			hp[j][2]=Math.max(hp[j-1][0]+c[j],hp[j-1][1]+c[j]);
		}
		
		System.out.println(Math.max(Math.max(hp[n-1][0],hp[n-1][1]),hp[n-1][2]));
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



