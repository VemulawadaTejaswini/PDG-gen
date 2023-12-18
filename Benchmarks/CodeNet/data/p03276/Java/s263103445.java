//package june2020;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main {
	static FastReader scn = new FastReader();
	static OutputStream out = new BufferedOutputStream(System.out);
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n =scn.nextInt(),k= scn.nextInt();
		
		int[] x = new int[n];
		for(int i=0;i<n;i++) {
			x[i] = scn.nextInt();
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<=n-k;i++) {
			int a = Math.abs(x[i])+Math.abs(x[i+k-1]-x[i]);
			int b = Math.abs(x[i+k-1])+Math.abs(x[i+k-1]-x[i]);
			a = Math.min(a, b);
			min = Math.min(a, min);
		}
		out.write((min+"\n").getBytes());
		out.close();
	}
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
}
