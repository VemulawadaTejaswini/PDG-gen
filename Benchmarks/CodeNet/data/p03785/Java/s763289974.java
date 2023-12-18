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
        int N, C, K, ans = 0;
        Integer[] T;

        void solve(InputReader in, PrintWriter out) {
            N = in.nextInt();
            C = in.nextInt();
            K = in.nextInt();
            T = new Integer[N];
            for (int i = 0; i < N; ++i) {
                T[i] = in.nextInt();
            }
            Arrays.sort(T);

            int arrivedAt = T[0] + K, capacity = C;
            for (int i = 0; i < N; ++i) {
                if (T[i] > arrivedAt || capacity <= 0) {
                    ans++;
                    arrivedAt = T[i] + K;
                    capacity = C;
                } else {
                    capacity--;
                }
                if (i == N - 1) ans++;
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
