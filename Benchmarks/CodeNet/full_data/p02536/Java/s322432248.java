import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Main {

    public static void main(String[] args) {
    
    	FastScanner scan = new FastScanner();
    	
    	int n = scan.nextInt(), m = scan.nextInt();
    	int [] arr = new int [n];
    	
    	for(int i=0; i<m; i++) {
    		int a = scan.nextInt(), b = scan.nextInt();
    		a--; b--;
    		arr[a] ++; arr[b]++;
    	}
    	
    	int max_roads = n + 2;
    	int count = 0;
    	for(int i=0; i<n; i++) count+= arr[i];

    	if(n - 1 < count) System.out.println(n-1-m);
    	else System.out.println(count-m);
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

