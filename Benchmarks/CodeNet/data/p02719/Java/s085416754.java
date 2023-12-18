import java.util.*;
import java.io.*;

public class Main {	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
        long N = fs.nextLong();
		long K = fs.nextLong();
		long ans = 0;

		if(N%K==0){
		System.out.println(0);
		return;
		}

		int i=1;
		while(N-i*K>0){
			ans = N-i*K;
			i++;
		}

		if(ans>Math.abs(ans-K))
		System.out.println(Math.abs(ans-K));
		else
		System.out.println(ans);



		

	}

	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");

		public String next() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) {
				a[i]=nextInt();
			}
			return a;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

	}
}
