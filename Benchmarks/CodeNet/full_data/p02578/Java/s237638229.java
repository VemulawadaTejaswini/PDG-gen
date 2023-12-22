import java.io.*;
import java.util.*;

public class Main {
    static class FastReader { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() { 
            while (st == null || !st.hasMoreElements()) { 
                try { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() { 
            String str = ""; 
            try { 
                str = br.readLine(); 
            } 
            catch (IOException e) { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
    
	public static void main (String[] args) throws IOException {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		long count = 0;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < n; i++) {
		    int val = sc.nextInt();
		    max = Math.max(max, val);
		    
		    if (val < max) 
		        count += (max - val);
		}
		
		System.out.println(count);
	}
}