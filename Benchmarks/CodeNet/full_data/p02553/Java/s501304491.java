import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.*;
public class Main {
	
	
	public static void main(String[] args) {
		
		FastScanner fs = new FastScanner();
		int a=fs.nextInt(), b=fs.nextInt(), c=fs.nextInt(), d=fs.nextInt();
		long product=0l;
		if(b<=0 && d<=0)
		{
			product = (long)a*c;
			System.out.println(product);
			return;
		}
		if(b>=0 && d>=0)
		{
			product = Math.max((long)a*c, (long)b*d);
			System.out.println(product);
			return;
		}
		if(b>=0 && c<=0)
		{
			product = Math.max((long)d*a,(long)c*a);
			System.out.println(product);
			return;
		}
		if(a<=0 && d>=0)
		{
			product = Math.max((long)b*c,(long)a*c);
			System.out.println(product);
			return;
		}
		
	}
	
	
	
	static class FastScanner 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastScanner() 
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
