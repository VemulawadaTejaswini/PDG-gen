import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.call(in , out);
        out.close();
    }

    static class TaskA {
        public void call(InputReader in ,PrintWriter out ) {
            int n ;
            n=in.nextInt();
            int[][] arr = new int[n][3];
            for(int i=0;i<n;i++){
                for(int j =0;j<3;j++){
                    arr[i][j] = in.nextInt();
                }
            }
            int[][] dp = new int[n][3];
            for(int j =0;j<3;j++){
                dp[n-1][j]=arr[n-1][j];
            }
            for(int i=n-2;i>=0;i--){
                for(int j =0;j<3;j++){
                    if(j==0)
                        dp[i][j] =arr[i][j] + Math.max(dp[i+1][j+1] , dp[i+1][j+2]);
                    else if(j==1)
                        dp[i][j] =arr[i][j] + Math.max(dp[i+1][j-1] , dp[i+1][j+1]);
                    else
                        dp[i][j] =arr[i][j] + Math.max(dp[i+1][j-1] , dp[i+1][j-2]);
                }
            }
            out.println(Math.max(dp[0][0] ,Math.max(dp[0][1] ,dp[0][2])));


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
        public long nextLong() {
            return Long.parseLong(next());
        }


    }
}
