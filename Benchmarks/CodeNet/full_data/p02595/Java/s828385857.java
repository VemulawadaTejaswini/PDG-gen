/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


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
	public static void main (String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		double d = sc.nextInt();
		
		int[] x = new int[n];
			int[] y = new int[n];
		int count=0;
		for(int i=0;i<n;i++){
			x[i]=sc.nextInt();
				y[i]=sc.nextInt();
				double dis = Math.sqrt(Math.pow(x[i],2)+Math.pow(y[i],2));
				if(dis<=d) count++;
		}
		System.out.println(count);
    }
}
