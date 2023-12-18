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
        int ans = Integer.MAX_VALUE;
        int banboo[] = new int[8];
        int A, B, C;

        void allocate(int a, int b, int c, Queue<Integer> unused, int mp) {
            if (unused.size() > 0){
                Queue<Integer> removed = new ArrayDeque<>(unused);
                int item = removed.poll();
                allocate(a + banboo[item], b, c, removed, mp + 10);
                allocate(a, b + banboo[item], c, removed, mp + 10);
                allocate(a, b, c + banboo[item], removed, mp + 10);
                allocate(a, b, c, removed, mp);
            } else if (a > 0 && b > 0 && c > 0) {
                ans = Math.min(ans, mp + Math.abs(a - A) + Math.abs(b - B) + Math.abs(c - C));
            }
        }

        void solve(InputReader in, PrintWriter out) {
            int N = in.nextInt();
            A = in.nextInt();
            B = in.nextInt();
            C = in.nextInt();

            Queue<Integer> unused = new ArrayDeque<>();
            for (int i = 0; i < N; ++i) {
                banboo[i] = in.nextInt();
                unused.offer(i);
            }
            allocate(0,0,0,unused,-30);

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

        int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; ++i) arr[i] = this.nextInt();
            return arr;
        }
    }
}
