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
        long Q, H, S, D, N, ans;
        long min1L;
        boolean use2L;

        void solve(InputReader in, PrintWriter out) {
            Q = in.nextLong();
            H = in.nextLong();
            S = in.nextLong();
            D = in.nextLong();
            N = in.nextLong();

            min1L = 4*Q > 2*H ? (2*H > S ? S : 2*H) : (4*Q > S ? S : 4*Q);
            use2L = D < 2*S;

            if (use2L) {
                ans += D*(N/2);
                if (N % 2 == 1) ans += min1L;
            } else {
                ans += min1L*N;
            }

            out.println(ans);
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

        int[] nextIntArray(int n) {
        	int[] arr = new int[n];
        	for (int i = 0; i < n; ++i) {
        		arr[i] = nextInt();
        	}
        	return arr;
        }

        long[] nextLongArray(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; ++i) {
                arr[i] = nextLong();
            }
            return arr;
        }
    }
}
