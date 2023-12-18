import java.util.*;
import java.io.*;

public class Main {	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
        long N = fs.nextLong();
		long K = fs.nextLong();
		long a = N;
		
		if(N%K==0){
		System.out.println(0);
		return;
		}
		for(int i=1; i<1000000000; i++){
			if(N >Math.abs(N-i*K)){
			 N = Math.abs(N-i*K);
			  if(N<N-(i+1)+K){
			  System.out.println(N);
			  return;
			  }
			}
		}




		

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
