



import java.util.*;
import java.io.*;

public class Main {
	 static int[] w;
	 static long []v;
	static int n;
	static int s;
	static long [][]mydpArr ;
	public static long dp(int indx, int remw) {
		if (remw<0)
			return (long) - 1e9;
	
	if (indx == n)
		return 0;
	if(mydpArr[indx][remw]!=-1)
		return mydpArr[indx][remw];
	long take = v[indx] + dp(indx+1,remw-w[indx]);
	long leave = dp(indx+1,remw);
	return mydpArr[indx][remw] = Math.max(take, leave);	
	}
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        n = sc.nextInt();
        s = sc.nextInt();
        w =new int[n];
        v =new long[n];
        mydpArr =new long[n+1][ (s+1)];
        for(int i=0;i<n;i++) {
        	w[i]=sc.nextInt();
        	v[i]=sc.nextLong();
        }
        for(long[] x :mydpArr) {
        	Arrays.fill(x,-1);
        }
        pw.print(dp(0,s));
        pw.close();
        }
	  static class Scanner {
	         BufferedReader br;
	         StringTokenizer st;
	 
	         public Scanner(InputStream s) {
	             br = new BufferedReader(new InputStreamReader(s));
	         }
	 
	         public String next() throws IOException {
	             while (st == null || !st.hasMoreTokens())
	                 st = new StringTokenizer(br.readLine());
	             return st.nextToken();
	         }
	 
	         public int nextInt() throws IOException {
	             return Integer.parseInt(next());
	         }
	 
	         public long nextLong() throws IOException {
	             return Long.parseLong(next());
	         }
	 
	         public double nextDouble() throws IOException {
	             return Double.parseDouble(next());
	         }
	 
	         public int[] nextIntArr(int n) throws IOException {
	             int[] arr = new int[n];
	             for (int i = 0; i < n; i++) {
	                 arr[i] = Integer.parseInt(next());
	             }
	             return arr;
	         }
	 
	     }
}