/******************************************
 *  Author : Atul Anand   
 *  Created On : Sat Feb 08 2020
 *******************************************/

import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] args) throws IOException {
        int N=in.nextInt();
        int K=in.nextInt();
        int h[]=new int[N];
        read(h, N);
        int cost[]=new int[N];
        Arrays.fill(cost, -1);
        cost[0]=0;
        println(minCost(h, cost, N-1, K));
        in.close();
        out.close();
    }

    // first memoization code
    public static int minCost(int h[], int cost[], int j, int K){
        if(cost[j]!=-1){
            return cost[j];
        }
        int totalCost=MAX;
        for(int i=1;i<=K;i++){
            if(j-i>=0){
                totalCost=Math.min(totalCost, minCost(h, cost, j-i, K)+Math.abs(h[j-i]-h[j]));
            }
        }
        cost[j]=totalCost;
        return totalCost; 
    }

    static int MIN = Integer.MIN_VALUE;
    static int MAX = Integer.MAX_VALUE;
    static Reader in = new Reader();
    static PrintWriter out = new PrintWriter(System.out);
    static void read(int arr[], int N) throws IOException{ for(int i=0;i<N;i++){ arr[i]=in.nextInt(); } }
    static void read(long arr[], int N) throws IOException{ for(int i=0;i<N;i++){ arr[i]=in.nextLong(); } }
    static void read(String arr[], int N) throws IOException{ for(int i=0;i<N;i++){ arr[i]=in.next(); } }
    static void print(Object O){ out.print(O); }
    static void println(Object O){ out.println(O); }
    static void print(int arr[]){ for(int i=0;i<arr.length;i++){ print(arr[i]+" "); } println(""); }
    static void print(int arr[][]){ for(int i=0;i<arr.length;i++){ print(arr[i]); } }
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
        while (!tokenizer.hasMoreTokens() ) { tokenizer=new StringTokenizer(reader.readLine()); }
        return tokenizer.nextToken();
    }

    int nextInt() throws IOException { return Integer.parseInt(next()); }
    double nextDouble() throws IOException { return Double.parseDouble(next()); }
    long nextLong() throws IOException { return Long.parseLong(next()); }
    String nextLine() throws IOException { return reader.readLine(); }
    void close() throws IOException { reader.close(); }
}