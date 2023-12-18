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
        
        String S;
        long mul = 1L;
        long patA = 0, patB = 0, patC = 0;
        
        void solve(InputReader in, PrintWriter out) {
            S = in.next();
            
            for (int i = 0; i < S.length(); ++i) {
                char c = S.charAt(i);
                if (c == 'A') {
                    patA = (patA + mul) % MOD;
                } else if (c == 'B') {
                    patB = (patB + patA) % MOD;
                } else if (c == 'C') {
                    patC = (patC + patB) % MOD;
                } else {
                    patC = (3*patC + patB) % MOD;
                    patB = (3*patB + patA) % MOD;
                    patA = (3*patA + mul) % MOD;
                    mul = (mul*3) % MOD;
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
