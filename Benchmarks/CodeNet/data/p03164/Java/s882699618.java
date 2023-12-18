/******************************************
 *  Author : Atul Anand   
 *  Created On : Sat Feb 08 2020
 *******************************************/

import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] args) throws IOException {
        int N=in.nextInt();
        int W=in.nextInt();
        int w[]=new int[N];
        int v[]=new int[N];
        int v_sum=0;
        for(int i=0;i<N;i++){
            w[i]=in.nextInt();
            v[i]=in.nextInt();
            v_sum+=v[i];
        }
        
        long dp[]=new long[v_sum+1];
        Arrays.fill(dp, MAX);
        dp[0]=0;
        for(int item=0;item<N;item++){
            for(int val=v_sum;val>=0;val--){
                if(v[item]<=val){
                    dp[val]=Math.min(dp[val], dp[val-v[item]]+w[item]);
                }
            }
        }

        int res=0;
        for(int val=v_sum;val>=0;val--){
            if(dp[val]<=W){
                res=val;
                break;
            }
        }
        println(res);
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


/* 
2D - DP
class E_Knapsack_2 {
    public void solve() {
        int n = in.nextInt();
        int W = in.nextInt();
        long sumw = 0;
        int sumv = 0;
        int v[] = new int[n + 1];
        int wi[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            sumw += wi[i] = in.nextInt();
            sumv += v[i] = in.nextInt();
        }

        long[][] dp = new long[n + 1][sumv + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], sumw);
            dp[i][0] = 0;
        }
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sumv; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j - v[i] < 0){ 
                    continue;
                }
                dp[i][j] = Math.min(dp[i - 1][j - v[i]] + wi[i], dp[i][j]);
            }
        }
        int ans = 0;
        for (int i = 1; i <= sumv; i++){ 
            if (dp[n][i] <= W){ 
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
*/