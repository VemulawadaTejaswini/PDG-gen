import java.util.*;
import java.io.*;

public class Main {	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
        int N = fs.nextInt();
		int M = fs.nextInt();
		int A[] = new int[N];
		int ans = 0;
		int x = 0;
		for(int i=0; i<N; i++){
			A[i] = fs.nextInt();
			x += A[i];
		}
		Arrays.sort(A);


		for(int i=0; i<M; i++){
		if(A[N-1-i]<x/(4*M)){
		System.out.println("No");
		return;
		}else{ 
		continue;
		}
	    }
	System.out.println("Yes");
		

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
