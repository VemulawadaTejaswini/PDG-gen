/******************************************
 *  Author : Atul Anand   
 *  Created On : Sat Feb 08 2020
 *******************************************/

import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] args) throws IOException {
        int N=in.nextInt();
        int a[]=new int[N];
        int b[]=new int[N];
        int c[]=new int[N];

        for(int i=0;i<N;i++){
            a[i]=in.nextInt();
            b[i]=in.nextInt();
            c[i]=in.nextInt();
        }
        
        // Max points collected till i-th day by playing a, b, c on i-th day
        int dp[][]=new int[N][3];
        dp[0][0]=a[0];
        dp[0][1]=b[0];
        dp[0][2]=c[0];

        for(int i=1;i<N;i++){
            dp[i][0]=a[i]+Math.max(dp[i-1][1], dp[i-1][2]);
            dp[i][1]=b[i]+Math.max(dp[i-1][0], dp[i-1][2]);
            dp[i][2]=c[i]+Math.max(dp[i-1][0], dp[i-1][1]);
        }
        println(Math.max(dp[N-1][0], Math.max(dp[N-1][1], dp[N-1][2])));
        in.close();
        out.close();
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