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
    public void solve(int testNumber, InputReader in, PrintWriter out) {
       int n = in.nextInt();
       int[][] arr = new int[n][3];
       for(int i=0;i<n;i++){
           arr[i] = new int[]{in.nextInt(),in.nextInt(),in.nextInt()};
       }
       int[][] ans = new int[n+1][3];
       for(int i=0;i<n;i++){
           ans[i+1][0] = Math.max(ans[i][1],ans[i][2])+arr[i][0];
           ans[i+1][1] = Math.max(ans[i][0],ans[i][2])+arr[i][1];
           ans[i+1][2] = Math.max(ans[i][1],ans[i][0])+arr[i][2];
       }

        out.println(Math.max(ans[n][0],Math.max(ans[n][1],ans[n][2])));
    }

    //int mod = (int)(1e9+7);


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