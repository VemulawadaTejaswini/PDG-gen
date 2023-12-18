import java.io.*;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

public class Main {

    public static void main (String [] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = in.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            int ans = 0;
            int tmp = 0;
            for (int j = 0; j < N; j++) {
                if (j == i) {
                    continue;
                }
                ans += Math.abs(tmp - A[j]);
                tmp = A[j];
            }
            ans += Math.abs(tmp);
            out.println(ans);
        }
    }
        static class InputReader {
            BufferedReader in;
            StringTokenizer tok;

            public String nextString() {
                while (!tok.hasMoreTokens()) {
                    try {
                        tok = new StringTokenizer(in.readLine(), " ");
                    } catch (IOException e) {
                        throw new InputMismatchException();
                    }
                }
                return tok.nextToken();
            }

            public int nextInt() {
                return Integer.parseInt(nextString());
            }

            public int[] nextIntArray0indexed(int n) {
                int[] res = new int[n];
                for (int i = 0; i < n; i++) {
                    res[i] = nextInt() - 1;
                }
                return res;
            }

            public InputReader(InputStream inputStream) {
                in = new BufferedReader(new InputStreamReader(inputStream));
                tok = new StringTokenizer("");
            }

        }
}
