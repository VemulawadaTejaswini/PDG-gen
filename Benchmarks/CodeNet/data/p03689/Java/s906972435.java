import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Pavel Mavrin
 */
public class Main {

    private void solve() throws IOException {
        int H = nextInt();
        int W = nextInt();
        int h = nextInt();
        int w = nextInt();
        if (H % h == 0 && W % w == 0) {
            out.println("No");
        } else {
            out.println("Yes");
            int s = 0;
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    int c = 1000;
                    if (i % h == h - 1 && j % w == w - 1) {
                        c = -1000 * (h * w - 1) - 1;
                    }
                    s += c;
                    out.print(c + " ");
                }
                out.println();
            }
            System.err.println(s);
        }

    }

    // ------------------

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    PrintWriter out = new PrintWriter(System.out);

    String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    private void run() throws IOException {
        solve();
        out.close();
    }

}
