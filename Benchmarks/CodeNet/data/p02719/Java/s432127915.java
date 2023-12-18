import java.util.*;
import java.io.*;

public class Main {	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
        long N = fs.nextLong();
		long K = fs.nextLong();

		if(N%K==0){
		System.out.println(0);	
		} else if(N%K==1||N%K==4||N%K==5||N%K==6||N%K==7||N%K==8){
			System.out.println(1);
		} else if(N%K==2){
			System.out.println(2);
		} else if(N%K==3){
			System.out.println(3);
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
