import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

// 1 2 3 2 3 3
// 3 3 3 1 2 2

public class Main {
	

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		
			int n=sc.nextInt(),k=sc.nextInt();
			int a[]=sc.readArray(n);
			int min=1,max=(int)1e9+100;
			while(min!=max) {
				int mid=(min+max)/2;
				if(isPossible(mid, k, a)) {
					max=mid;
				}
				else min=mid+1;
				
			}
			System.out.println(min);
		

	}
	public static boolean isPossible(int ans,int k,int a[]) {
		for(int i:a) {
			
			k-=(i+ans-1)/ans -1;
		}
		return k>=0;
	}

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