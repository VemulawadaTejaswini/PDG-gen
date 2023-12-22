import java.util.*;
import java.io.*;

public class Main {
	static FastReader f = new FastReader();
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		solve();
		out.close();
	}

	static void solve() {
		int n = f.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = f.nextInt();
		}

		ArrayList<Integer> primes = new ArrayList<>();
 		boolean[] bol = new boolean[1000];
 		for(int i=2;i<1000;i++) {
 			if(!bol[i]) {
 				for(int j=i+i;j<1000;j+=i) {
 					bol[j] = true;
 				}
 			}
 		}

 		for(int i=2;i<1000;i++) {
 			if(!bol[i]) {
 				primes.add(i);
 			}
 		}

 		boolean[] vis = new boolean[1000001];
 		long gcd = arr[0];
 		vis[arr[0]] = true;
 		boolean  pair = true;

 		for(int i=1;i<n;i++) {
 			gcd = calc_gcd(gcd, arr[i]);
 			if(pair) {
 				for(int j : primes) {
	 				if(arr[i] % j == 0) {
	 					if(vis[j]) {
	 						pair = false;
	 					}
	 					vis[j] = true;
	 					while(arr[i] % j == 0) {
	 						arr[i] /= j;
	 					}	
	 				}
	 				if(arr[i] == 1) {
	 					break;
	 				}
 				}
 				if(arr[i] != 1) {
 					vis[arr[i]] = true;
 				}
 			}
 		}

 		//out.println(gcd);
 		if(gcd == 1) {
 			if(pair) {
 				out.println("pairwise coprime");
 			} else {
 				out.println("setwise coprime");
 			}
 		} else {
 			out.println("not coprime");
 		}

 	}

 	static long calc_gcd(long a, long b) {
 		if(b == 0) {
 			return a;
 		}
 		return calc_gcd(b, a % b);
 	}
 

	static class FastReader {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String next() {
			while(st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		String nextLine() {
			String str = "";

			try {
				str = br.readLine();
			} catch(IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}
}