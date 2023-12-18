/*
 *  author : Atul Anand   
 *  created on : Thu Apr 02 2020
 */

import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {
        int N = in.nextInt();
        int D = in.nextInt();
        double X[][] = new double[N][D];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < D; j++){
                X[i][j] = in.nextDouble();
            }
        }
        int ans = 0;
        for(int i = 0; i < N; i++){
            for(int j = i + 1; j < N; j++){
                if(IntegerDistance(X[i], X[j], D)){
                    ans++;
                }
            }
        }
        println(ans);
        in.close();
        out.close();
    }

    static boolean IntegerDistance(double a[], double b[], int D){
        double dist = 0;
        for(int i = 0; i < D; i++){
            dist += (a[i] - b[i]) * (a[i] - b[i]);
        }
        dist = Math.sqrt(dist);

        if(Math.floor(dist) == dist){
            return true;
        }

        return false;
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