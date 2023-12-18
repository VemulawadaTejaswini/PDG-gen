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
            int[][] arr=new int[n][3];
            int[][] dp=new int[n][3];
            for(int i=0;i<n;i++){
                arr[i][0]=in.nextInt();
                arr[i][1]=in.nextInt();
                arr[i][2]=in.nextInt();
            }
            dp[0]=arr[0].clone();
            for(int i=1;i<n;i++){
                for(int j=0;j<3;j++){
                    for(int k=0;k<3;k++){
                        if(k!=j){
                            dp[i][j]=Math.max(arr[i][j]+dp[i-1][k],dp[i][j]);
                        }
                    }
                }
            }
            int[] lastRow=dp[n-1].clone();
            Arrays.sort(lastRow);
            out.println(lastRow[2]);
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