
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
		int k = sc.nextInt();
		if(k%2==0) {
			System.out.println(-1);
			return;
		}
		long count=1;
		long t=7;
		while(t<Long.MAX_VALUE){
			if(t%k==0){
				System.out.println(count);
				break;
			}
		count++;
		String s = String.valueOf(t)+"7";
		t=Long.parseLong(s);  
		}	
    
	}

}
