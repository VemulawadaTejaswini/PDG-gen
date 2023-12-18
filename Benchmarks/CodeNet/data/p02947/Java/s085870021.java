import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Washoum
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CGreenBin solver = new CGreenBin();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGreenBin {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            String[] s = new String[n];
            for (int i = 0; i < n; i++) {
                char[] line = sc.nextLine().toCharArray();
                Arrays.sort(line);
                s[i] = String.valueOf(line);
            }
            Arrays.sort(s);
            long nb = 1;
            long ans = 0;
            for (int i = 1; i < n; i++) {
                if (s[i].equals(s[i - 1])) {
                    nb++;
                } else {
                    ans += (nb * (nb - 1)) / 2;
                    nb = 1;
                }
            }
            if (nb > 1) {
                ans += (nb * (nb - 1)) / 2;
            }
            out.println(ans);
        }

    }

    static class inputClass {
        BufferedReader br;
        StringTokenizer st;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
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

