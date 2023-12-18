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
        void solve(InputReader in, PrintWriter out) {
            int N = in.nextInt(), Q = in.nextInt();
            String S = in.next();

            int ac[] = new int[N];

            int cnt = 0;
            char prev = 'Q';
            for (int i = 0; i < N; ++i) {
                if (prev == 'A' && S.charAt(i) == 'C') ++cnt;
                ac[i] = cnt;
                prev = S.charAt(i);
            }

            for (int i = 0; i < Q; ++i) {
                int l = in.nextInt() - 1, r = in.nextInt() - 1;
                int ans = ac[r];
                if (l > 0) {
                    ans -= ac[l - 1];
                    if (S.charAt(l - 1) == 'A' && S.charAt(l) == 'C') --ans;
                }
                out.println(ans);
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

        int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; ++i) arr[i] = this.nextInt();
            return arr;
        }
    }
}
