import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            if (n % 10 == 9 || n / 10 == 9)
                out.println("Yes");
            else
                out.println("No");
        }

    }

    static class InputReader {
        StringTokenizer st;
        BufferedReader br;

        public InputReader(InputStream is) {
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            this.br = br;
        }

        public String next() {
            if (st == null || !st.hasMoreTokens()) {
                String nextLine = null;
                try {
                    nextLine = br.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (nextLine == null)
                    return null;
                st = new StringTokenizer(nextLine);
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

