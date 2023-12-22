
import java.util.*;
import java.io.*;

public class Main 

{ 

	 static FastReader sc=new FastReader(); 
	 
	  public static void main(String[] args) 
    {
    	int n = i();
    	int result=Integer.MAX_VALUE;
        StringBuffer s=new StringBuffer(sc.next().toLowerCase());
          int w=0,r=0;
        for(int i=0;i<n;i++) {
        	if(s.charAt(i)=='w')
        		w++;
        	else
        		r++;
        }
        int c=0;
        for(int i=0;i<n;i++) {
        	if(s.charAt(i)=='w')
        		c++;
        	else
        		break;
        }
        if(c>=r) {
        	result=r;
        	//System.out.println(r);
        	
        }
        int f=0;
        for(int i=c;i<n;i++) {
        	if(s.charAt(i)=='w')
        		break;
        		else
        			f++;
        }
        int res=r-f;
        if(res==0&&c>0)
        {
        	result=c;
        	//System.out.println(c);
        }
        else
        	result=res;
        	System.out.println(Math.min(w, Math.min(result, r)));
        //System.out.println(c);
		
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

