import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        int N;
        int[] a;
        int[] put;

        int M = 0;
        StringBuilder ans = new StringBuilder();

        void solve(InputReader in, PrintWriter out) {
            N = in.nextInt();
            a = in.nextIntArray(N);
            put = new int[N];
            Arrays.fill(put, 0);

            for (int i = N; i >= 1; --i) {
                int xor = 0;
                for (int j = i*2; j <= N; j += i) {
                    xor ^= put[j - 1];
                }
                if ((xor ^ a[i - 1]) == 1) {
                    put[i - 1] = 1;
                    M++;
                    ans.append(i).append(' ');
                }
            }

            out.println(M);
            if (M > 0) out.println(ans.toString().trim());
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