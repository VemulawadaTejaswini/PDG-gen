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
    	
    	int n = scan.nextInt();
    	int [] a = new int [4];
    			for(int i=0; i<n; i++) {
    		String str = scan.next();
    		if(str.equals("AC")) a[0]++;
    		else if(str.equals("WA")) a[1]++;
    		else if(str.equals("TLE")) a[2]++;
    		else a[3]++;
    	}
    	System.out.println("AC x " + a[0]);
    	System.out.println("WA x " + a[1]);
    	System.out.println("TLE x " + a[2]);
    	System.out.println("RE x " + a[3]);
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

