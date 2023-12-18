import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        int N = in.nextInt();         // number of items
        int W = in.nextInt();         // capacity
        int[] weight = new int[N];    // weights
        int[] value = new int[N];     // values
        
        for(int i = 0; i < N; i++){
            weight[i] = in.nextInt();
            value[i] = in.nextInt();
        }

        long[][] dp = new long[N + 1][W + 1];
        
        // without repetition - each item can be taken only once
        for(int n = 1; n <= N; n++){
            for(int w = 1; w <= W; w++){
                if(weight[n - 1] <= w){
                    // pick the best option among choosing the current item and skipping it
                    dp[n][w] = Math.max(dp[n - 1][w - weight[n - 1]] + value[n - 1], dp[n - 1][w]);
                }
                else{
                    // fill with how much we can get without this item and with capacity of w
                    dp[n][w] = dp[n - 1][w];
                }
            }
        }

        println(dp[N][W]);
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
