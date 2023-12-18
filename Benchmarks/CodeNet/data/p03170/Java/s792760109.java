import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class Main{
    //WRWWRWRR     wwwrrrrwwwwrrr
    PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(a[0]-b[0]));
    boolean[] dp = new boolean[100001];
    public void solve(int testNumber, InputReader in, PrintWriter out) {
       int n = in.nextInt();
       int k = in.nextInt();
       int[] arr = new int[n];
       for(int i=0;i<n;i++){
           arr[i] = in.nextInt();
       }
//       dfs(arr,k,0);
        dp[0] = false;
        for(int i=1;i<=k;i++){
            boolean find = false;
            for(int j=0;j<n;j++){
                if(i>=arr[j]){
                    find|=!(dp[i-arr[j]]);
                }
            }
            dp[i] = find;
        }
       if(dp[k]){
           out.println("First");
       }else{
           out.println("Second");
       }
    }

//    Boolean[][] dp = new Boolean[100001][2];
//    boolean dfs(int[] arr,int rem,int w){
//        if(rem<0) return true;
//        if(rem==0) return false;
//        boolean fina = false;
//        if(dp[rem][w]!=null) return dp[rem][w];
//        for(int i=0;i<arr.length;i++){
//            fina|=!dfs(arr,rem-arr[i],1-w);
//        }
//        return dp[rem][w] = fina;
//    }


    public static void main(String[] args){
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Main solver = new Main();
//        int num = in.nextInt();
//        while(num-->0){
//            solver.solve(1, in, out);
//        }
        solver.solve(1, in, out);
        out.close();
    }
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}