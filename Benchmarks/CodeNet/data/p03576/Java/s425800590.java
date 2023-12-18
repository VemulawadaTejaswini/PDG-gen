import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
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
        int N, K;
        List<long[]> P = new ArrayList<>();
        long ans = Long.MAX_VALUE;

        long calcS(List<long[]> points) {
            long minX = Long.MAX_VALUE;
            long minY = Long.MAX_VALUE;
            long maxX = Long.MIN_VALUE;
            long maxY = Long.MIN_VALUE;
            for (long[] p : points) {
                long x = p[0];
                long y = p[1];
                minX = Math.min(x, minX);
                maxX = Math.max(x, maxX);
                minY = Math.min(y, minY);
                maxY = Math.max(y, maxY);
            }
            if (minX == maxX && minY == maxY) {
                return 1;
            } else if (minX == maxX) {
                return maxY - minY;
            } else if (minY == maxY) {
                return maxX - minX;
            } else {
                return (maxX - minX)*(maxY - minY);
            }
        }

        void search() {
            for (int i = 0; i + K - 1 < N; ++i) {
                List<long[]> partial = new ArrayList<>();
                for (int j = i; j < i + K; ++j) {
                    partial.add(P.get(j));
                }
                ans = Math.min(ans, calcS(partial));
            }
        }

        void solve(InputReader in, PrintWriter out) {
            N = in.nextInt();
            K = in.nextInt();

            for (int i = 0; i < N; ++i) {
                P.add(new long[] {in.nextLong(), in.nextLong()});
            }

            Collections.sort(P, (a, b) -> Long.signum(a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]));
            search();

            Collections.sort(P, (a, b) -> Long.signum(a[1] != b[1] ? a[1] - b[1] : a[0] - b[0]));
            search();

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