import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
        int N, D;
        List<int[]> points = new ArrayList<>();

        void solve(InputReader in, PrintWriter out) {
            N = in.nextInt();
            D = in.nextInt();
            for (int i = 0; i < N; ++i) {
                int[] p = new int[D];
                for (int j = 0; j < D; ++j) {
                    p[j] = in.nextInt();
                }
                points.add(p);
            }

            int ans = 0;
            int len = points.size();
            for (int i = 0; i < len; ++i) {
                for (int j = i + 1; j < len; ++j) {
                    int[] p1 = points.get(i);
                    int[] p2 = points.get(j);
                    double d = 0;
                    for (int k = 0; k < D; ++k) {
                        d += Math.pow(p1[k] - p2[k], 2);
                    }
                    d = Math.sqrt(d);
                    if (d == Math.ceil(d)) ans++;
                }
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