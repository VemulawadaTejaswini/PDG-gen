/*
 *  author : Atul Anand   
 *  created on : Tue Mar 31 2020
 */

import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {
        long n = in.nextLong();
        long a = in.nextLong();
        long b = in.nextLong();
        int mod = (int) 1e9 + 7;

        // Apply mod as many times as subtraction
        // find all ways to make bonquet
        long ans = (fastpower(2, n, mod) + mod- 1) % mod;

        // subtract nCa ways
        ans = (ans + mod - combination(n, a, mod)) % mod;
        
        // subtrack nCb ways
        ans = (ans + mod - combination(n, b, mod)) % mod;
        println(ans);

        in.close();
        out.close();
    }

    // O(log(b))
    static long fastpower(long a, long b, long mod) {
	    a %= mod;
	    long res = 1;
	    while (b > 0) {
	        if ((b & 1) == 1) {
	            res = res * a % mod;
	        }
	        a = a * a % mod;
	        b >>= 1;
	    }

	    return res;
    }

    // O(a)
    static long combination(long n, long r, int mod) {
        long res = 1;
        long temp = 1;
		for (int i = 0; i < r; i++) {
			res *= (n - i);
			res %= mod;
			temp *= (i + 1);
			temp %= mod;
		}
		temp = fastpower(temp, mod-2, mod);
		res = res * temp % mod;
		return res;
    }
    
    static long combination2(long n, long r, int mod) {
        r = Math.min(r, n - r);
        long x = 1, y = 1;
        for (long i = 1; i <= r; i++) {
            x = x * (n - r + i) % mod;
            y = y * i % mod;
        }
        return x * fastpower(y, mod - 2, mod) % mod;
    }
    

    static long combination3(int N, int K, long MOD) {
        K = Math.min(K, N - K);
 
        long up = 1;
        long down = 1;
        for (int i = 0; i < K; i++) {
            up = up * (N - i) % MOD;
            down = down * (K - i) % MOD;
        }
 
        return up * fastpower(down, MOD - 2, MOD) % MOD;
    }


    static int MIN = Integer.MIN_VALUE;
    static int MAX = Integer.MAX_VALUE;
    static Reader in = new Reader();
    static PrintWriter out = new PrintWriter(System.out);

    static void read(int arr[], int N) throws IOException { 
    	for(int i = 0; i < N; i++){ 
    		arr[i] = in.nextInt(); 
    	} 
    }
    
    static void read(long arr[], int N) throws IOException { 
    	for(int i = 0; i < N; i++){ 
    		arr[i] = in.nextLong(); 
    	} 
    }
    
    static void read(String arr[], int N) throws IOException { 
    	for(int i = 0; i < N; i++){ 
    		arr[i] = in.next(); 
    	} 
    }
    
    static void print(Object O) {  
    	out.print(O); 
    }
    
    static void println(Object O) { 
    	out.println(O); 
    }
    
    static void println(int arr[]) { 
    	for(int i = 0; i < arr.length; i++){ 
    		print(arr[i]+" "); 
    	} 
    	println(""); 
    }

    static void println(int arr[][]) { 
    	for(int i = 0; i < arr.length; i++){ 
    		println(arr[i]); 
    	}
    }
    
    static void debug(Object O) { 
    	System.out.println(O); 
    }
}

class Reader {
    BufferedReader reader;
    StringTokenizer tokenizer;

    Reader() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
    }

    String next() throws IOException {
        while (!tokenizer.hasMoreTokens() ) { 
            tokenizer = new StringTokenizer(reader.readLine()); 
        }
        return tokenizer.nextToken();
    }

    int nextInt() throws IOException { 
        return Integer.parseInt(next()); 
    }
    
    double nextDouble() throws IOException { 
        return Double.parseDouble(next());
    }
    
    long nextLong() throws IOException { 
        return Long.parseLong(next()); 
    }
    
    String nextLine() throws IOException { 
        return reader.readLine(); 
    }
    
    void close() throws IOException { 
        reader.close(); 
    }
}