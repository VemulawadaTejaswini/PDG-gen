import java.util.*;
import java.io.*;
public class Main {
	static long findSumofProduct(int[] arr, int n){ 
		long mod=1000000007;
		long suffix_sum = (long)arr[n - 1]; 
		long res = 0; 
		for (int i = n - 2; i >= 0; i--) { 
			res += (suffix_sum * arr[i])%mod; 
			suffix_sum += arr[i]%mod; 
		} 
		return res; 
	} 
	public static void main(String args[]) {
		FastScanner in = new FastScanner();
		int n=in.nextInt();
		int a[]=in.readArray(n);
		System.out.println(findSumofProduct(a, n)%1000000007);
	}

	///////////////////////////
	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}
}
