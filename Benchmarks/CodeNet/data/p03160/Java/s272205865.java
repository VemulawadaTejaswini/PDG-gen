import java.io.*;
import java.util.*;

public class Main {
	
	private static int dp[];
	private static int util(int arr[],int start,int end) {
		
		if(start >= end-1) return 0;
		
		if(dp[start] != 0) return dp[start];
		if(start + 2 < end) {
			return dp[start] = Math.min(Math.abs(arr[start] - arr[start + 1]) + util(arr,start + 1,end) , Math.abs(arr[start] - arr[start + 2]) + util(arr,start + 2,end));
		}else {
			return dp[start] = Math.abs(arr[start] - arr[start + 1] ) + util(arr,start + 1,end);
		}
		
		
	}
	public static void main(String[] args) {
		
		FastReader sc = new FastReader();
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		dp = new int[n+1];
		System.out.println(util(arr,0,n));
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
