import java.util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static int[] convertIntSetToStringSet( 
            Set<Integer> setOfInteger) 
      { 
       return setOfInteger.stream() 
        .mapToInt(Integer::intValue) 
         .toArray(); 
       } 
	 static int countWays(int N,int arr[]) 
	    { 
	        int count[] = new int[N + 1]; 
	        count[0] = 1; 
	        for (int i = 1; i <= N; i++) 
	            for (int j = 0; j < arr.length; j++) 
	                if (i >= arr[j]) 
	                    count[i] += count[i - arr[j]]; 
	        return count[N];  
	          
	    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          FastReader fs=new FastReader();
          int x=fs.nextInt();
          int n=fs.nextInt();
          TreeSet<Integer> s1=new TreeSet<Integer>();
          for(int i=0;i<n;i++)
          {
        	  int l=fs.nextInt();
        	  int r=fs.nextInt();
        	  for(int j=l;j<=r;j++)
        		  s1.add(j);
          }
          int[] arr = convertIntSetToStringSet(s1); 
          int out=countWays(x-1,arr);
          
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
