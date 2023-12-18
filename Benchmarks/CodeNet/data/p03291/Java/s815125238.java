import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

class Main {
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
        static int MOD = (int)1e9 + 7;
        void solve(InputReader in, PrintWriter out) {
            String S = in.next();

            long patA = 0, patB = 0, patC = 0;
            for (int i = 0; i < S.length(); ++i) {
                char c = S.charAt(i);
                if (c == 'A') {
                    patA++;
                    patA %= MOD;
                } else if (c == 'B') {
                    patB += patA;
                    patB %= MOD;
                } else if (c == 'C') {
                    patC += patB;
                    patC %= MOD;
                } else if (c == '?') {
                    patC = 3*patC + patB;
                    patC %= MOD;
                    patB = 3*patB + patA;
                    patB %= MOD;
                    patA = 3*patA + 1;
                    patA %= MOD;
                }
            }

            out.println(patC);
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

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        long[] nextLongArray(int n) {
        	long[] arr = new long[n];
        	for (int i = 0; i < n; ++i) {
        		arr[i] = nextLong();
        	}
        	return arr;
        }
    }
}
