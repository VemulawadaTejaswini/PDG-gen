/******************************************
 *  Author : Atul Anand   
 *  Created On : Sat Feb 08 2020
 *******************************************/

import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] args) throws IOException {
        String s=in.next();
        String t=in.next();

        int n1=s.length();
        int n2=t.length();
        String S[][]=new String[n1+1][n2+1];
        for(int i=0;i<=n1;i++){
            S[i][0]="";
        }
        for(int i=0;i<=n2;i++){
            S[0][i]="";
        }
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    S[i][j]=S[i-1][j-1]+s.charAt(i-1);
                }
                else{
                    S[i][j]= S[i-1][j].length()>=S[i][j-1].length() ? new String(S[i-1][j]) : new String(S[i][j-1]);
                }
            }
        }
        println(S[n1][n2]);
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