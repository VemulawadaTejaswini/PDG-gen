import java.io.*;
import java.util.*;

public class Main{
	public static class FastReader {
		BufferedReader br;
		StringTokenizer root;
		
 
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		String next() {
			while (root == null || !root.hasMoreTokens()) {
				try {
					root = new StringTokenizer(br.readLine());
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return root.nextToken();
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
 
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception r) {
				r.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	static long mod = (long) (1e9+7);
	static long cf = 998244353;
    static final long MAX = (long) 1e15;
   // public static List<Integer>[] edges;
	public static void main(String[] args) {
		FastReader sc = new FastReader();
	         int n = sc.nextInt();
	        long k = sc.nextLong();
	        long[] a = new long[n];
	        long[] f = new long[n];
	 
	        for (int i=0; i<n; i++) a[i] = sc.nextInt();
	        for (int i=0; i<n; i++) f[i] = sc.nextInt();
	 
	        Arrays.sort(a);
	        Arrays.sort(f);
	 
	        long max = 0;
	        for (int i=0; i<n; i++){
	            max = Math.max(max, a[i]*f[n-1-i]);
	        }
	 
	        long l = 0;
	        long r = max;
	 
	        while (l<r){
	            long mid = (l+r)/2;
	            long cnt = 0;
	            for (int i=0; i<n; i++){
	                if (a[i]*f[n-1-i]>mid){
	                    cnt += a[i] - mid/f[n-1-i];
	                }
	            }
	            if (cnt<=k){
	                r = mid;
	            }else {
	                l = mid+1;
	            }
	        }
	       out.println(r);
		out.close();
	}
	
	static class Pair{
		int a;
		int b;
		Pair(int a,int b){
			this.a = a;
			this.b = b;
		}
	}
}
