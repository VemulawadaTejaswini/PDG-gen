import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.Stack;

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
	static int mod = (int) (1e9+7),n;
	static long cf = 998244353;
    static final int MAX = (int) 1e6;
    public static List<Integer>[] edges;
    public static int[][] parent;
    public static int col = 20;
    public static long[] Bit;
    public static long[] fact,inv;
    public  static int[] prime; 
    public static long[] dp;
	public static FastReader sc = new FastReader();
	public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		long m = sc.nextLong();
		long[] a = new long[n];
		for(int i=0;i<n;++i) a[i] = sc.nextLong();
		sort(a);
		// finding mth greatest pair value 
		    long low = 0,high = MAX;
		    while(high - low > 1){
		       long mid = (low + high) / 2;
		        if(check(mid, n, a, m)) low = mid;
		        else high = mid;
		    }
		   
		    long ans = 0,sum=0,cnt=0;
		    int j = 0;
		    for(int i =0; i<n; i++){
		        while(j < n && cnt < m && a[i] + a[n-1-j] >= low){
		            sum += a[n-1-j];
		            j++;
		        }
		        cnt += j;
		        ans += sum + a[i]*j;
		    }
		   
		    if(cnt > m) ans -= low*(cnt-m);
		    out.print(ans);
		
		out.close();
	}
	private static boolean check(long mid, int n, long[] a, long m) {
		long sum = 0;
	    int j = 0;
	    for(int i =0; i<n; i++){
	        while(j < n && a[i] + a[n-1-j] >= mid) j++;
	        sum += j;
	    }
		return sum >= m;
	}
	
	 static void sort(long[] A) {
         PriorityQueue<Long> pq = new PriorityQueue<>();
         int i = 0;
         for (i = 0; i < A.length; i++)
             pq.add(A[i]);
         for (i = 0; i < A.length; i++)
             A[i] = pq.poll();
     }
	 
	
}