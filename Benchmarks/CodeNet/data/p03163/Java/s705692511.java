import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Built using CHelper plug-in Actual solution is at the top
 */
public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n=in.nextInt();
            int w=in.nextInt();
            int[][] input=new int[n][2];
            for(int i=0;i<n;i++){
                input[i][0]=in.nextInt();
                input[i][1]=in.nextInt();
            }
            int[][] dp=new int[n+1][w+1];
            for(int i=1;i<n+1;i++){
                for(int j=1;j<w+1;j++){
                    if(j>=input[i-1][0]){
                        dp[i][j]=Math.max(dp[i-1][j-input[i-1][0]]+input[i-1][1], dp[i-1][j]);
                    }
                    else{
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
            out.println(dp[n][w]);
        }
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