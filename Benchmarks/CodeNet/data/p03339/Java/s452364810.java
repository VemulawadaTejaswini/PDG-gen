import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

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
            int N = in.nextInt();
            String S = in.next();

            int east_outers = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == 'E') east_outers++;
            }

            int ans = Integer.MAX_VALUE;
            int west_outers = 0;
            for (int i = 0; i < N; i++) {
                int opposits;
                if (S.charAt(i) == 'E') {
                    east_outers--;
                    opposits = east_outers + west_outers;
                } else {
                    opposits = east_outers + west_outers;
                    west_outers++;
                }
                ans = Math.min(ans, opposits);
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
    }
}