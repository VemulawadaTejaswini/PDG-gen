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
            int N = in.nextInt(), K = in.nextInt();
            int[] arr = new int[N];
            for(int i = 0; i < N; i++) {
               arr[i] = in.nextInt();
            }

//            int[][] dp = new int[K + 1][2];
//            for(int[] row : dp)
//                Arrays.fill(row, -1);

            boolean res = false;
            for(int i = 0; i < N; i++) {
                if(isWinPossible(arr, K - arr[i], 1)) {
                    res = true;
                    break;
                }
            }

            out.println(res ? "First" : "Second");
        }

        public boolean isWinPossible(int[] arr, int K, int lastPlayer) {
            if(K == 0)
                return true;

            int currPlayer;
            if(lastPlayer == 1) currPlayer = 2;
            else currPlayer = 1;

//            if(dp[K][currPlayer] != -1)
//                return dp[K][currPlayer] == 1;

            for(int i = 0; i < arr.length; i++) {
                if(K - arr[i] >= 0 && isWinPossible(arr, K - arr[i], currPlayer)) {
                    return false;
                }
            }


            return true;
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

