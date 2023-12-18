import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.OutputStream;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    static int N;
    static int t;
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            N = in.nextInt();
            int[] a = new int[3*N];
            for(int i=0; i<3*N; i++){
                a[i] = in.nextInt();
            }
            long res= Long.MIN_VALUE;
            for(int k=0; k<=N; k++){
                long max=0;
                long min=0;
                int mae[] = new int[N+k];
                int ato[] = new int[2*N-k];
                for(int i=0; i<N+k; i++){
                    mae[i] = a[i];
                }
                for(int i=0; i<2*N-k; i++){
                    ato[i] = a[i+N+k];
                }
                Arrays.sort(mae);
                Arrays.sort(ato);
                for(int i=N+k-1; i>k-1; i--){
                    max+=mae[i];
                }
                for(int i=0; i<N; i++){
                    min+=ato[i];
                }
                res = Math.max(max-min,res);
            }
            out.println(res);
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