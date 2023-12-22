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
    //boolean[] dp = new boolean[100001];
    Long[][][] dp;
    int[][] arr;
    public void solve(int testNumber, InputReader in, PrintWriter out) {
      int r = in.nextInt();
      int c = in.nextInt();
      int k = in.nextInt();
      arr = new int[r+1][c+1];
      for(int i=0;i<k;i++){
          int r1 = in.nextInt();
          int c1 = in.nextInt();
          arr[r1][c1] = in.nextInt();
          //out.println(arr[r1][c1]);
      }
      dp = new Long[r+1][c+1][4];
      long max = 0;
      for(int i=0;i<=3;i++){
          max =  Math.max(max,dfs(r,c,i));
      }
      out.println(max);
    }
    long dfs(int i,int j, int k){
        if(i<0||j<0) return 0;
        //System.out.println("i:"+i+" j:"+j+" k:"+k+" val:"+arr[i][j]);
        if(i==0&&j==0){
            if(k>0) return arr[i][j];
            return 0;
        }
        if(dp[i][j][k]!=null) return  dp[i][j][k];
        if(k==0){
            long max = 0;
            for(int p=0;p<=3;p++){
                max = Math.max(dfs(i-1,j,p),max);
            }
            dp[i][j][k] = Math.max(dfs(i,j-1,0),max);
        }else if(k==1){
            long get = dfs(i, j - 1, k);
            long max = 0;
            for(int p=0;p<=3;p++){
                max = Math.max(dfs(i-1,j,p),max);
            }
            dp[i][j][k] = Math.max(max + arr[i][j], Math.max(dfs(i,j-1,k-1) + arr[i][j], get));
        }else{
            long get = dfs(i, j - 1, k);
            dp[i][j][k] = Math.max(dfs(i , j-1, k - 1) + arr[i][j], get);
        }
        return dp[i][j][k];
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