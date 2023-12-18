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
        static int X, Y, Z, K;
        static Long[] A, B, C;

        void solve(InputReader in, PrintWriter out) {
            X = in.nextInt();
            Y = in.nextInt();
            Z = in.nextInt();
            K = in.nextInt();
            
            A = in.nextLongArray(X);
            B = in.nextLongArray(Y);
            C = in.nextLongArray(Z);

            Arrays.sort(A, Comparator.reverseOrder());
            Arrays.sort(B, Comparator.reverseOrder());
            Arrays.sort(C, Comparator.reverseOrder());

            List<Long> ans = new ArrayList<>();
            for (int i = 0; i < X; i++) {
                for (int j = 0; j < Y; j++) {
                    for (int k = 0; k < Z; k++) {
                        if ((i + 1) * (j + 1) * (k + 1) <= K) {
                            ans.add(A[i] + B[j] + C[k]);
                        }
                    }
                }
            }
            Collections.sort(ans, Collections.reverseOrder());

            for (int i = 0; i < K; i++) {
                out.println(ans.get(i));
            }
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

        Long[] nextLongArray(int n) {
        	Long[] arr = new Long[n];
        	for (int i = 0; i < n; ++i) {
        		arr[i] = nextLong();
        	}
        	return arr;
        }
    }
}
