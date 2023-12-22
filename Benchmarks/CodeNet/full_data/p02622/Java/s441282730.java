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
 *
 * @author HussienMoustafa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BMinorChange solver = new BMinorChange();
        solver.solve(1, in, out);
        out.close();
    }

    static class BMinorChange {
        public void solve(int testNumber, Scanner s, PrintWriter sout) {
            String word1 = s.next(), word2 = s.next();
            int cnt = 0;
            for (int i = 0; i < word1.length(); i++) {
                if (i < word2.length()) {
                    if (word1.charAt(i) != word2.charAt(i)) cnt++;
                } else cnt++;
            }
            sout.println(cnt);
        }

    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

    }
}

