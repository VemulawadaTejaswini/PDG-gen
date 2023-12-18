import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n= in.nextInt();
            long sum = 0;
            int[] arr = new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i] = in.nextInt();
                sum+=arr[i];
            }
            long ans = -1;
            long v = 0;
            for (int i = 0; i <n && v+arr[i]<=sum/2 ; i++){
                v+=arr[i];
            }
            ans =(sum-2*v);
            v=0;
            for (int i = n-1; i >=0 &&v+arr[i]<=sum/2 ; i--) {
                v+=arr[i];
            }
            ans =Math.min(ans , sum-2*v);
            System.out.println(ans);



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
