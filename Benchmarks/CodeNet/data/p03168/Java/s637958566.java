import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Problem solver = new Problem();
        solver.solve(0, in, out);
        out.close();
    }

    static class Problem {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int H = (N / 2) + 1;
            float[] arr = new float[N];
            for(int i = 0; i < N; i++)
                arr[i] = in.nextFloat();

            float[][] dp = new float[N][(N/2) + 1];
            for(float[] row : dp)
                Arrays.fill(row, -1.0f);
            float res = probability(arr, 0, 0, dp);
            out.println(res);
        }

        public float probability(float[] arr, int numTails, int index, float[][] dp) {
            if(numTails > arr.length / 2)
                return 0.0f;

            if(index == arr.length)
                return 1.0f;

            if(dp[index][numTails] != -1.0f)
                return dp[index][numTails];

            float heads = arr[index] * probability(arr, numTails, index + 1, dp);
            float tails = (1 - arr[index]) * probability(arr, numTails + 1, index + 1, dp);

            dp[index][numTails] = heads + tails;
            return dp[index][numTails];
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

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public float nextFloat() {
            return Float.parseFloat(next());
        }


    }
}

