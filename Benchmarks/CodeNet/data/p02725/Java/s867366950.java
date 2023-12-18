import java.util.*;
import java.io.*;

public class Main {	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		int K = fs.nextInt();
		int N = fs.nextInt();
		int A[] = new int[K];
		int B[] = new int[K];
		int ans = 0;

		for(int i=0; i<N; i++){
			A[i] = fs.nextInt();
		}

		for(int i=0; i<N; i++){
			if(i+1<N){
			B[i]=Math.abs(A[i]-A[i+1]);
			}else{
				if(A[0]==0){
				B[i] = K-A[i];
				}else{
			B[i]=Math.abs(A[0]-A[i]);
				}
			}
			ans += B[i]; 
		}

		int x = 0;
		for(int i=0; i<N-1; i++){
			x =Math.max(B[i],B[i+1]);
		}

		System.out.println(ans-x);		
		
 
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
