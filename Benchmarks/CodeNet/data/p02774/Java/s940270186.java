import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
	static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
	public static long mod = (long) (1e9+7);
	public static long[] fac,inv;
	
	  private static int n;
	  private static long K;
	  private static int[] a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc = new FastReader();
		n = sc.nextInt();
	    K = sc.nextLong();
	    a = new int[n];
	    for (int i = 0; i < n; i++) {
	      a[i] = Integer.parseInt(sc.next());
	    }
	    Arrays.sort(a);
	    
	    long low = Long.MIN_VALUE;
	    long high = Long.MAX_VALUE;
	    while (low+1 < high) {
	      long m = (low+high)/2;
	      if (check(m)) {
	        low = m;
	      } else {
	        high = m;
	      }
	    }
	    out.println(low);
	    out.close();
	  }
	  private static boolean check(long x) {
	    long count = 0;
	    for (int i = 0; i < n; i++) {
	      count += calcCount(i, x);
	      if (count >= 2*K) return false;
	    }
	    return count/2 < K;
	  }
	  private static int calcCount(int idx, long x) {
	    int low;
	    int high;
	    if (a[idx] >= 0) {
	      long max = (long)a[idx]*a[n-1];
	      long min = (long)a[idx]*a[0];
	      if (max < x) {
	        return n-1;
	      }
	      if (x <= min) {
	        return 0;
	      }
	      low = 0;
	      high = n-1;
	    } else {
	      long max = (long)a[idx]*a[0];
	      long min = (long)a[idx]*a[n-1];
	      if (max < x) {
	        return n-1;
	      }
	      if (x <= min) {
	        return 0;
	      }
	      low = n-1;
	      high = 0;
	    }
	    while ((a[idx] >= 0 && low+1 < high)
	          || (a[idx] < 0 && high+1 < low)) {
	      int m = (low+high)/2;
	      if ((long)a[idx]*a[m] < x) {
	        low = m;
	      } else {
	        high = m;
	      }
	    }
	    if (a[idx] >= 0) {
	      return idx <= low ? low : low+1;
	    } else {
	      return idx >= low ? n-low-1 : n-low;
	    }
	  }
	}