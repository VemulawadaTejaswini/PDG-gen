
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;


public class Main {// Main

	public static void main(String[] args) throws Exception {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		sc = new FastScanner(in);
		
		int n = sc.nextInt();
		sum = new long[1<<n];
		long[][] ar = input(n ,n);
		td = new long[(int) (Math.pow(2, n)+1)];
		Arrays.fill(td, Long.MAX_VALUE);
	
		fill( n ,ar);
		
			
		long ans = find(ar , n , 0 );
		out.println(ans);
		out.flush();
	}
	static long[] td ; 
	static long[] sum;
	private static long find(long[][] ar, int n, int used) {
		if(n==0)return 0 ;
		if(td[used]!=Long.MAX_VALUE)return td[used];
		long max = 0 ;
		for(int i = 1 ; i<  (1<<n) ; i++) {
			if((used&i)!=0)continue;
			
			int t = i;
			int count = 0 ;
			while(t>0) {
				if((t&1)==1)count++;
				t = t>>1;
			}
			long temp =sum[i];
			long rr = find(ar , n  , (used+i ));
			max = Math.max(max , temp +rr );
		}
		td[used] = max;
		return max;
	}
	public static void fill(int n , long[][] arr) {
		for(int i = 1 ; i < (1<<n) ;i++) {
			sum[i] = cur(arr , i);
		}
	}

	private static long cur(long[][] arr, int i) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int t = i ;
		int ind =0 ;
		while(t>0) {
			if((t&1)==1)ar.add(ind);
			t = t>>1;
			ind++;
		}
		
		
		long ans = 0 ;
		for(int in : ar) {
			for(int j : ar) {
				ans =ans+ arr[in][j]; 
			}
		}
		return ans/2;
	}


	static long mod = 1000000007;
	public static long[][] input(int n, int m) throws Exception {

		long[][] arr = new long[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}
	
	
	
	static BufferedReader in;
	static FastScanner sc;
	static PrintWriter out;

	static class FastScanner {
		BufferedReader in;
		StringTokenizer st;

		public FastScanner(BufferedReader in) {
			this.in = in;
		}

		public String nextToken() throws Exception {
			while (st == null || !st.hasMoreTokens()) {
				st = new StringTokenizer(in.readLine());
			}
			return st.nextToken();
		}

		public int nextInt() throws Exception {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() throws Exception {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() throws Exception {
			return Double.parseDouble(nextToken());
		}
	}
	
}
