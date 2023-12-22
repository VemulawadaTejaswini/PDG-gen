import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
        FastScanner in = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt(), m = in.nextInt() , x = in.nextInt();
        int r[] = new int[n+1];
        int c[] = new int[m+1];
        long maxr = 0, maxc = 0;int mr = 0, mc = 0;
        int arr[][] = new int[n][m];
        for(int i=0;i<x;i++) {
        	int a = in.nextInt(), b = in.nextInt();
        	arr[a-1][b-1] = 1;
        	r[a]++;c[b]++;
        	if(maxr<r[a]) {
        		maxr = r[a];
        		mr = a-1;
        	}
        	if(maxc<c[b]) {
        		maxc = c[b];
        		mc = b-1;
        	}
        }
        long ans = maxr + maxc;
        if(arr[mr][mc]==1) ans--;
        out.println(ans);
        out.flush();
	}
	
	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		
		String next() {
			while(!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				}catch(IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
		
		int[] readArray(int n) {
			int a[] = new int[n];
			for(int i=0;i<n;i++) a[i] = nextInt();
			return a;
		}
		
		long[] readArray(int n,long x) {
			long a[] = new long[n];
			for(int i=0;i<n;i++) a[i] = nextLong();
			return a;
		}
		
	}
}









