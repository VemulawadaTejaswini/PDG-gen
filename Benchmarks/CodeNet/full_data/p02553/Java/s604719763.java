import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		FastScanner fs = new FastScanner();
		long a = fs.nextInt() , b = fs.nextInt(), c = fs.nextInt(), d = fs.nextInt();
		long ans = Long.MAX_VALUE;
		long ans1 = a*c;
		long ans2 = a*d;
		long ans3 = b*c;
		long ans4 = b*d;
		long temp1 = Math.max(ans1, ans2);
		long temp2 = Math.max(ans3, ans4);
		ans = Math.max(temp1, temp2);
		System.out.println(ans);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
}
