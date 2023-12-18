/*
 *  author : Atul Anand   
 *  created on : Wed Apr 01 2020
 */

import java.io.*;
import java.util.*;

public class Main{
    static int p = 0;
    static double sum = 0;
    static double X[][];
  
    public static void main(String[] args) throws IOException {
        int N = in.nextInt();
        int nums[] = new int[N];
        X = new double[N][2];
        for(int i = 0; i < N; i++){
            X[i][0] = in.nextInt();
            X[i][1] = in.nextInt();
            nums[i] = i;
        }
        backtrack(nums, new ArrayList<Integer>(), new boolean[N]);
        println(sum/p);
        in.close();
        out.close();
    }

    static void backtrack(int[] nums, List<Integer> temp, boolean[] isUsed) {
        if(temp.size() == nums.length) {
            for(int i = 1; i < nums.length; i++){
                sum += Math.sqrt(Math.pow(X[temp.get(i)][0] - X[temp.get(i-1)][0], 2)  + Math.pow(X[temp.get(i)][1] - X[temp.get(i-1)][1], 2));
            }
            p++;
            return;
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(!isUsed[i]) {
                temp.add(nums[i]);
                isUsed[i] = true;
                backtrack(nums, temp, isUsed);
                temp.remove(temp.size() - 1);
                isUsed[i] = false;
            }
        }
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