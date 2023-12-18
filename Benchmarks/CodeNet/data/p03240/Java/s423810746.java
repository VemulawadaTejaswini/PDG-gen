import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
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
        int[] x, y, h;

        void solve(InputReader in, PrintWriter out) {
            N = in.nextInt();
            x = new int[N];
            y = new int[N];
            h = new int[N];
            for (int i = 0; i < N; ++i) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
                h[i] = in.nextInt();
            }

            outer:
            for (int cx = 0; cx <= 100; ++cx) {
                for (int cy = 0; cy <= 100; ++cy) {
                    Set<Integer> hSet = new HashSet<>();
                    for (int i = 0; i < N; ++i) {
                        if (h[i] > 0) {
                            int H = h[i] + Math.abs(cx - x[i]) + Math.abs(cy - y[i]);
                            hSet.add(H);
                        }
                    }

                    if (hSet.size() == 1) {
                        out.println(String.format("%d %d %d", cx, cy, hSet.toArray()[0]));
                        break outer;
                    }
                }
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