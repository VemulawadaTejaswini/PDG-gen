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

class Test 
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
	
	public static void main(String argsp[]) throws Exception
	{
		FastReader f=new FastReader();
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		 
		int t;
		//Test ob=new Test();
		t=f.nextInt();
		while(t--!=0)
		{
			long a,b;
			a=f.nextLong();
			b=f.nextLong();
			System.out.println(a*b);
			
		}
	}
}
	

	
	
	
	
	
	
	
	
	
	
