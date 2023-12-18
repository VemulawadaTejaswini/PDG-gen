/*
 *  author : Atul Anand   
 *  created on : Sat Mar 14 2020
 */

import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] args) throws IOException {
        int seq[] = {1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51};
        int k = in.nextInt() - 1;
        println(seq[k]);
        
        in.close();
        out.close();
    }

    static int MIN = Integer.MIN_VALUE;
    static int MAX = Integer.MAX_VALUE;
    static Reader in = new Reader();
    static PrintWriter out = new PrintWriter(System.out);
    static void read(int arr[], int N) throws IOException{ for(int i = 0; i < N; i++){ arr[i] = in.nextInt(); } }
    static void read(long arr[], int N) throws IOException{ for(int i = 0; i < N; i++){ arr[i] = in.nextLong(); } }
    static void read(String arr[], int N) throws IOException{ for(int i = 0; i < N; i++){ arr[i] = in.next(); } }
    static void print(Object O){ out.print(O); }
    static void println(Object O){ out.println(O); }
    static void print(int arr[]){ for(int i = 0; i < arr.length; i++){ print(arr[i]+" "); } println(""); }
    static void print(int arr[][]){ for(int i = 0; i < arr.length; i++){ print(arr[i]); } }
    static void debug(Object O){ System.out.println(O); }
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