import java.io.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 
import java.util.*;


public  class Main
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
	            while (st == null || !st.hasMoreTokens()) 
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

			public Character charAt(int i) {
				// TODO Auto-generated method stub
				return null;
			} 
	    } 

  

	  // Complete the hurdleRace function below.
//    public static void solve() {
//    	FastReader s=new FastReader();

   
    public static void main(String[] args) throws IOException {
    	FastReader s=new FastReader();
    	int a1 = s.nextInt();
    	int b1 = s.nextInt();
    	long t =s.nextLong();
    	
    	Long[] a = new Long[a1];
    	Long[] b = new Long[b1];
    	for(int i=0;i<a1;i++) {
    		a[i] = s.nextLong();
    	}
    	for(int i=0;i<b1;i++) {
    		b[i] = s.nextLong();
    	}
    	
    	int k1=0,k2=0;
    	long c=0,g=0;
    	while(c<t && k1<a1 && k2<b1) {
    		c+=a[k1++];
    		if(c<=t)g++;
    		
    		if(c<t) {
    			c+=b[k2++];
    			if(c<=t)g++;
    		}
    	}
    	if(k1<a1 && c<t) {
    		while(c<t) {
    			c+=a[k1++];
    			if(c<=t)g++;
    		}
    	}
    	else if(k2<b1 && c<t) {
    		while(c<t) {
    			c+=b[k2++];
    			if(c<=t)g++;
    			
    		}
    	}
    	System.out.println(g);
    	
    }	
}
