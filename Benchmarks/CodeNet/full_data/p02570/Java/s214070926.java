import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Main {


    public static void main(String[] args) {
    
    FastScanner scan = new FastScanner();
   
    int d = scan.nextInt(); 
    int t = scan.nextInt(); 
    int s = scan.nextInt();
    
    if(d/s <= t) {
    	System.out.println("Yes");
    } else {
    	System.out.println("No");
    }
    
    
    }  
    
    
    static class FastScanner{
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer("");
    	String next() {
    		while(!st.hasMoreTokens())
    			try {
    				st = new StringTokenizer(br.readLine());
    			} catch (IOException e){
    				e.printStackTrace();
    			}
    		return st.nextToken();
    	}
    	
    	int nextInt() {
    		return Integer.parseInt(next());
    	}
    	
    	int [] readArray(int n) {
    		int [] a = new int[n];
    		for(int i=0; i<n ; i++) a[i] = nextInt();
    		return a;
    	}
    	
    	long nextLong() {
    		return Long.parseLong(next());
    	}
    	
    	
    }
    
   
}

