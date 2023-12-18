import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author EDGE
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ARegistration solver = new ARegistration();
        solver.solve(1, in, out);
        out.close();
    }

    static class ARegistration {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            char[] s = in.nextLine().toCharArray();
            char[] t = in.nextLine().toCharArray();
            for (int i = 0; i < s.length; i++) {
                if (s[i] != t[i]) {
                    out.println("No");
                    return;
                }
            }

            out.println("Yes");
        }

    }

    static class FastReader {
        BufferedReader br;

        public FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}

