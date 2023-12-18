/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
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
  
    static boolean is_palindrome(String s){
        for (int i=0;i<=s.length()/2 ;i++ ) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
	public static void main (String[] args) {
	    FastReader ob = new FastReader();
	    int n = ob.nextInt();
	    int arr[] = new int[n];
	    for (int i=0;i<arr.length ;i++ ) {
	        arr[i]=ob.nextInt();
	    }
	    long dp[] = new long[n];
	    dp[0]=0;
	    dp[1]=Math.abs(arr[1]-arr[0]);
	    dp[2]=Math.min(dp[1]+Math.abs(arr[1]-arr[2]),Math.abs(arr[2]-arr[0]));
	    for(int i=3;i<n;i++){
	        dp[i]=Math.min(dp[i-1]+Math.abs(arr[i]-arr[i-1]),dp[i-2]+Math.abs(arr[i-2]-arr[i]));
	    }
	    System.out.println(dp[n-1]);
	}
}