
import java.util.*;
import java.io.*;

public class Main 

{ 

	 static FastReader sc=new FastReader(); 
	 
	  public static void main(String[] args) 
    {
//			int t = i(); 
//	        while (t-- > 0) 
//			{ 
		  long x=Math.abs(l());
		    long k=l();
		    long d=l();
		    long div=x/d;
		    if(k<div) {
		    	x-=k*d;
		    	System.out.println(x);
		    }
		    if(k>=div) {
		    x=x-d*div;
		    k-=div;
		    if(k%2==0){
		        System.out.println(x);
		        return;
		    }
		    long a1=Math.abs(x-d);
		    long a2=Math.abs(x+d);
		    long ans=Math.min(a1,a2);
		    System.out.println(ans);
		    }
		        	
	        	
	        	
	        	
	        	
	        	
	        	
			//}
    }





static void input(int A[]) {
	   for(int i=0;i<A.length;i++) {
		   A[i]=sc.nextInt();
	   }
   }
     static int i() {
    	 return sc.nextInt();
     }
     static String s() {
    	 return sc.next();
     }
     static long l() {
    	 return sc.nextLong();
     }  
        static void shuffleArray(int[] arr){
        int n = arr.length;
        Random rnd = new Random();
        for(int i=0; i<n; ++i){
            int tmp = arr[i];
            int randomPos = i + rnd.nextInt(n-i);
            arr[i] = arr[randomPos];
            arr[randomPos] = tmp;
        }   
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


