import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;


public class Solution {
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
					} catch (Exception addd) {
						addd.printStackTrace();
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
				} catch (Exception addd) {
					addd.printStackTrace();
				}
				return str;
			}
		}
	 
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	public static FastReader sc = new FastReader();
 
	static long mod = (int) (1000000000),MAX=(int)(1e5+10);
	
	public static void main(String[] args) throws IOException{
		
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i=0;i<n;++i) a[i] = sc.nextLong();
		sort(a);
		long ans = a[0];
		int k = n-2;
		for(int i=1;i<n && k > 0;++i) {
			ans+=a[i]; --k;
			if(k > 0) {
				ans+=a[i];
				--k;
			}
			
		}
		out.print(ans);
	out.close();
	}
	
	static void sort(long[] A) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        int i = 0;
        for (i = 0; i < A.length; i++)
            pq.add(-1*A[i]);
        for (i = 0; i < A.length; i++)
            A[i] = -1*pq.poll();
    }
	
}



