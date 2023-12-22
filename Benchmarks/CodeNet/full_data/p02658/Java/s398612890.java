//package MyJavaProject;
 
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException; 
import java.io.InputStreamReader;
import java.lang.Math;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigInteger; 
import java.io.PrintWriter;  

public class Main 
{
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
	
	
	static void print(String s)
	{
		System.out.print(s);
	}
	static void print(boolean s)
	{
		System.out.print(s);
	}
	static Boolean isOverflow( long a, long b) 
    { 
        // Check if either of them is zero 
        if (a == 0 || b == 0)  
            return false; 
      
        long result = a * b; 
        if (a == result / b) 
            return false; 
        else
            return true; 
    } 
	public static void main(String args[]) throws Exception
	{
		FastReader f=new FastReader();
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		 
		
		
			int n;
			n=f.nextInt();
			long a[]=new long[n];
			for(int i=0;i<n;i++)
				a[i]=f.nextLong();
			long p=1;
			int c=0;
      		Arrays.sort(a);
      		if(a[0]==0)
            {
              System.out.println(0);
              System.exit(0);
            }
			//BigInteger p=new BigInteger("1");
			//BigInteger big=new BigInteger("1000000000000000000");
			for(int i=0;i<n;i++)
			{
				if(isOverflow(p,a[i]))
				{
					System.out.println(-1);
					System.exit(0);
				}
				p*=a[i];
				
					
			}
			
			if(p>(long)(Math.pow(100, 9)))
			{	System.out.println(-1);
			
			}
			else
				
			System.out.println(p);
			
		
	}
}
	

	
	

	
	
	
	
	
	
	
	
