import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }
    
    static class Task {

        void solve(InputReader in, PrintWriter out) {
            int minB = Integer.MAX_VALUE;
            
            int H = in.nextInt();
            int N = in.nextInt();
            
            int[] A = new int[N];
            int[] B = new int[N];
            for (int i = 0; i < N; ++i) {
                A[i] = in.nextInt();
                B[i] = in.nextInt();
            }
            
            int[] dp = new int[H + 1];
            for (int i = 0; i <= H; ++i) {
                dp[i] = -1;
            }
            dp[0] = 0;
            
            for (int i = 0; i < N; ++i) {
                for (int j = 0; j <= H; ++j) {
                    if (dp[j] >= 0) {
                        if (j + A[i] >= H) {
                            minB = Math.min(minB, dp[j] + B[i]);
                        } else {
                            dp[j + A[i]] = dp[j + A[i]] >= 0 ? Math.min(dp[j + A[i]], dp[j] + B[i]) : dp[j] + B[i];
                        }
                    }
                }
            }
            
            out.println(minB);
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int size) {
            long[] arr = new long[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }
    }
}
    