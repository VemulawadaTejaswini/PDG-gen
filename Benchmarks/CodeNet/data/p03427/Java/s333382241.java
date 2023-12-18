import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        new Main().solve();

    }

    private void solve() {
        InputReader sc = new InputReader();
        String n = sc.next();
        int v = (n.length() - 1) * 9 + (n.charAt(0) - '0' - 1);

        System.out.println(v);
    }

    static class InputReader extends BufferedReader {
        StringTokenizer st = new StringTokenizer("");

        public InputReader() {
            super(new InputStreamReader(System.in));
        }

        public InputReader(String s) {
            super(new StringReader(s));
        }

        String next() {
            try {
                while (!st.hasMoreTokens())
                    st = new StringTokenizer(readLine());
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
